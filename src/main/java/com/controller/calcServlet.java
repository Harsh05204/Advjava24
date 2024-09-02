package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.html.HTMLBRElement;

@WebServlet("/calcServlet")

public class calcServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		String n1 = req.getParameter("num1");
		String n2 = req.getParameter("num2");
		String operation = req.getParameter("operation");
		boolean iserror = false;
		String error = "";
		
		if (n1 == null || n1.trim().length() == 0) {
			iserror = true;
			error = "<h2>write correct Number1 <br/></h2>";
			
		}
		if (n2 == null || n2.trim().length() == 0) {
			iserror = true;
			error += "write correct Number2 <br/>";
		}
		if (operation == null || operation.trim().length() == 0) {
			iserror = true;
			error += "write correct operation <br/>";
		}
		
	    if( iserror ) {
	    	
	    	PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			out.println(error);	
			
	    }else 
	    {	
			Integer x = Integer.parseInt(n1);
			Integer y = Integer.parseInt(n2);
			int ans = 0;
			 
			if(operation.equals("+")) {
				ans = x+y;
			}
			else if(operation.equals("-")) {
				ans = x-y;
			}
			else if(operation.equals("*")) {
				ans = x*y;
			}
			else {
				ans = x/y;
			}
			
				PrintWriter out = res.getWriter();
				res.setContentType("text/html");
				out.println("your answere is "+ ans);
		   }
	
	}
}
