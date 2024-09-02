package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NameServlet")

public class NameServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Username = request.getParameter("name");
	       Username = Username.toUpperCase();
	       
	       request.setAttribute("un", Username);
		       
		   RequestDispatcher rd = request.getRequestDispatcher("Nameupper.jsp");
		   rd.forward(request, response);
		
	}

}
