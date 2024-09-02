package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcAge")

public class calcAge extends HttpServlet{
   protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		String Byear = (req.getParameter("BYear"));
		boolean iserror = false;
		String error = "";
		
		if (Byear == null || Byear.trim().length() == 0) {
			iserror = true;
			error = "<h2>Please Enter Correct BirthYear</h2><br/>";
		
	    if( iserror ) {
	    	
	    	PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			out.println(error);	
		}	
	    }else {
			if(Byear.matches("[0-9]{4}")) {
				Integer byear = Integer.parseInt(Byear);
				if(byear >= 1975 && byear <=2023) {
					int currentYear = Calendar.getInstance().get(Calendar.YEAR);
					PrintWriter out = res.getWriter();
					res.setContentType("text/html");
                    int Age = currentYear - byear;
                    out.println(Age);
				}
				else {
				PrintWriter out = res.getWriter();
				res.setContentType("text/html");
				out.println("<h3>Please Enter Correct BYear !</h3>");
				}
			}
			else {
				PrintWriter out = res.getWriter();
				res.setContentType("text/html");
				out.println("<h3>Please Enter Correct BYear !!</h3>");
			}
		}
		
}
}
