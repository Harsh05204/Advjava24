package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputTwonumServlet extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		 Integer num1 = Integer.parseInt(request.getParameter("n1")); 
		 Integer num2 = Integer.parseInt(request.getParameter("n2"));
		 
		 if(num1>num2) {
			 PrintWriter out = response.getWriter();
			 response.setContentType("text/html");
			 out.println(num1 + ">" + num2);
		 }
		 else {
			 PrintWriter out = response.getWriter();
			 response.setContentType("text/html");
			 out.println(num1 + "<" + num2);
		 }
	 }
}
