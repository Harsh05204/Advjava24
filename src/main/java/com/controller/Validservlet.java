package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validservlet")
public class Validservlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
		
		String Firstname = reqest.getParameter("firstName");
		String BirthYear = reqest.getParameter("BYear");
		String Email = reqest.getParameter("email");
		String Password = reqest.getParameter("pas");
		String Gender = reqest.getParameter("gender");
		String city = reqest.getParameter("city");
		String textarea = reqest.getParameter("textarea");
		String hobby[] = reqest.getParameterValues("hoby");
		
		if(Firstname != null) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("firstName: "+Firstname+"<br>");
		}else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Please enter Firstname" + "<br>");
		} 
		
		if(BirthYear != null) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("BirthYear: "+BirthYear+"<br>");
		}else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Please enter BirthYear" + "<br>");
		} 
		
		if(Email != null) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Email: "+Email+"<br>");
		}else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Please enter email" + "<br>");
		} 
		
		if(Password != null) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Password: "+Password+"<br>");
		}else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Please enter password" + "<br>");
		}
		
		if(Gender != null) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Gender: "+Gender+"<br>");
		}else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Please enter Gender" + "<br>");
		}
		
		if(city != null) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("city: "+city+"<br>");
		}else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Please enter city" + "<br>");
		}
		
		if(textarea != null) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("textarea: "+ textarea +"<br>");
		}else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("Please enter teaxt you want" + "<br>");
		}
		
		
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("hobby:");
		     for(int i = 0; i<hobby.length;i++){
		    	 if(hobby.length==0) {
		           out.print(" "+ hobby[i] +" ");
		    	 }else {
		    		 out.print("please enter hobby");
		    	 }
		    	}
		
	}

}
