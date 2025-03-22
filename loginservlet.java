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
import com.web.dto.userinfo;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		userinfo ui = new userinfo();
		ui.setUsername(request.getParameter("username"));
		ui.setPassword(request.getParameter("password"));
		PrintWriter out = response.getWriter();
		DBservice db = new DBservice();
		String target ="";
		ui = db.checkuserrole(ui);
		if(ui!=null) {
			HttpSession session = request.getSession(false);
			if(session!=null) {
				session.invalidate();
			}
			session = request.getSession(true);
			if(ui.getRole().equals("Admin")) {
				target ="/adminsection.jsp";
			}
			else {
				target ="/custmersection.jsp";
			}
			session.setAttribute("ui", ui.getUsername());
		}
		else {
			target ="/login.jsp";
			request.setAttribute("msg", "Invalid username/password");
		}
		out = response.getWriter();
		RequestDispatcher rd = getServletContext().getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
