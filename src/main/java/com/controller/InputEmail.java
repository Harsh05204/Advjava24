package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InputEmail")
public class InputEmail extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   String email = request.getParameter("email"); 
		   
		   if(email == null && email.trim().length() == 0){
			  
			   request.setAttribute("email", email);
			   
			   RequestDispatcher rd = request.getRequestDispatcher("InputEmail");
			   rd.forward(request, response);
		   }
		   else {
			   PrintWriter out = response.getWriter();
			   response.setContentType("text/html");
			   out.println(email);
		   }
	}
}
