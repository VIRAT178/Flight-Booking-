package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dbservice.DBservice;
import com.web.dto.Flight;

@WebServlet("/listofflightservlet")
public class listofflightservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	DBservice db = new DBservice();
	ArrayList<Flight> lst = db.getall();
	request.setAttribute("allflights", lst);
	RequestDispatcher rd  = getServletContext().getRequestDispatcher("/listofflight.jsp");
	rd.forward(request, response);
	}

}
