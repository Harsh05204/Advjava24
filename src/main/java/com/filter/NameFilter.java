package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/NameServlet")
public class NameFilter implements Filter{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String Username = request.getParameter("name");
		
		if(Username == null ||  Username.trim().length()==0) {
			request.setAttribute("NameError","please Enter Name");
			
			RequestDispatcher rd = request.getRequestDispatcher("Name.jsp");
			rd.forward(request, response);
		}else
		{
			chain.doFilter(request, response);
		}
		
	}

}
