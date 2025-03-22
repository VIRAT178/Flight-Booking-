package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.dbservice.DBservice;
import com.web.dto.customerinfo;
import com.web.dto.userinfo;

@WebServlet("/processCustomerservlet")
public class processCustomerservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userinfo ui = new userinfo();
		ui.setRole(request.getParameter("typeuser"));
		ui.setUsername(request.getParameter("customerName"));
		ui.setPassword(request.getParameter("customerPassword"));
		customerinfo ci = new customerinfo();
		ci.setCustomerName(request.getParameter("customerName"));
		ci.setCustomerPassword(request.getParameter("customerPassword"));
	    ci.setCustomerPhone(request.getParameter("customerPhone"));
		ci.setCustomerAddress(request.getParameter("customerAddress"));
		PrintWriter out = response.getWriter();
		DBservice db = new DBservice();
		String target ="";
		ui = db.adduserinfo(ui);
		ci = db.addcustomerinfo(ci);
		if(ci!=null) {
			HttpSession session = request.getSession(false);
			if(session!=null) {
				session.invalidate();
			}
			session = request.getSession(true);
			target ="/login.jsp";
			session.setAttribute("ai", ci.getCustomerName());
		}
		else {
			target ="/Signup.jsp";
			request.setAttribute("msg", "Can't Rigstered");
		}
		out = response.getWriter();
		RequestDispatcher rd = getServletContext().getRequestDispatcher(target);
		rd.forward(request, response);
	}
	}


