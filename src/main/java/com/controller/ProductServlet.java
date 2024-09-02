package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productName = request.getParameter("product");
		String category = request.getParameter("ctg");
		Integer price = Integer.parseInt(request.getParameter("price"));
		Integer qty = Integer.parseInt(request.getParameter("qnt"));
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/24advjava","root","root");
			
			PreparedStatement psmt = connection.prepareStatement("insert into products (productName,price,category,qty) values (?,?,?,?)");
			psmt.setString(1, productName);
			psmt.setInt(2, price);
			psmt.setString(3, category);
			psmt.setInt(4, qty);
			
			psmt.executeUpdate();
			
			request.getRequestDispatcher("Listservlet").forward(request, response);
	        
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
