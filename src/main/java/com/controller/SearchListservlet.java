package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchListservlet")
public class SearchListservlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productName = request.getParameter("ctg");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/24advjava","root","root");
			
			PreparedStatement psmt = connection.prepareStatement("select * from products where productName = ?");
			psmt.setString(1, productName);
			ResultSet rs = psmt.executeQuery();
			
			request.setAttribute("rs", rs);
			
			request.getRequestDispatcher("Searchlist.jsp").forward(request, response);
			
	        
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
