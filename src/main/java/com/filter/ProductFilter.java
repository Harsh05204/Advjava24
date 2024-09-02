package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/ProductServlet")
public class ProductFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        String productName = request.getParameter("product");
        String category = request.getParameter("ctg");
        String price = request.getParameter("price");
        String qty = request.getParameter("qnt");

        // Validate product name
        if (productName == null || productName.trim().isEmpty()) {
            request.setAttribute("productNameError", "Please enter a product name.");
            request.getRequestDispatcher("product.jsp").forward(request, response);
            
        }

        if (category == null || category.trim().isEmpty()) {
            request.setAttribute("categoryError", "Please enter a category.");
            request.getRequestDispatcher("product.jsp").forward(request, response);
            
        }

        if (price == null || price.trim().isEmpty()) {
            request.setAttribute("priceError", "Please enter a correct price.");
            request.getRequestDispatcher("product.jsp").forward(request, response);
            
        } else {
            try {
                Integer.parseInt(price); // Ensure it's a valid number
            } catch (NumberFormatException e) {
                request.setAttribute("priceError", "Please enter a valid numeric price.");
                request.getRequestDispatcher("product.jsp").forward(request, response);
                
            }
        }

        if (qty == null || qty.trim().isEmpty()) {
            request.setAttribute("qtyError", "Please enter a quantity.");
            request.getRequestDispatcher("product.jsp").forward(request, response);
            
        } else {
            try {
                Integer.parseInt(qty); 
            } catch (NumberFormatException e) {
                request.setAttribute("qtyError", "Please enter a valid numeric quantity.");
                request.getRequestDispatcher("product.jsp").forward(request, response);
                
            }
        }

        chain.doFilter(request, response);
    }

}
