package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dbservice.DBservice;
import com.web.dto.Flight;


@WebServlet("/deleteservlet")
public class deleteservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBservice db = new DBservice();
		ArrayList<Flight> lst = db.getall();
		request.setAttribute("allflights", lst);
		RequestDispatcher rd = request.getRequestDispatcher("/deleteflight.jsp");
		rd.forward(request, response);
	}

}
