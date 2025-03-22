package com.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dbservice.DBservice;
import com.web.dto.Flight;

@WebServlet("/amdflightservlet")
public class amdflightservlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Flight f = new Flight();
		f.setDepart(request.getParameter("departure"));
		f.setDest(request.getParameter("destination"));
		f.setDdate(request.getParameter("date"));
		f.setDtime(request.getParameter("time"));
		f.setSeattype(Integer.parseInt(request.getParameter("seat")));
		String a1 = request.getParameter("a1");
		DBservice db = new DBservice();
		db.getall();
		if(a1.equals("Add Flight")) {
			if(db.addFlight(f)) {
				request.setAttribute("msg", "Flight Detail Added Successfully");
			}
			else {
				request.setAttribute("msg","Flight Detail Could not be Added");
			}
		}
		if(a1.equals("Update Flight")) {
			f.setFid(Integer.parseInt(request.getParameter("fid")));
			if(db.updateflight(f)) {
				request.setAttribute("msg", "Flight Detail Updated Successfully");
			}
			else {
				request.setAttribute("msg", "Flight Detail Could not be Updated");
			}
		}
		if(a1.equals("Delete Flight")) {
			f.setFid(Integer.parseInt(request.getParameter("fid")));
			if(db.deleteflight(f)) {
				request.setAttribute("msg", "Flight Detail Deleted Successfully");
			}
			else {
				request.setAttribute("msg", "Flight Detail Could not be Deleted");
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("/amdflght.jsp");
		rd.forward(request, response);
	}

}
