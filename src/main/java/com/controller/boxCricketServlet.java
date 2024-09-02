package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/boxCricketServlet")
public class boxCricketServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		String PlayerName = request.getParameter("pname");
		String Skill = request.getParameter("skill");
		boolean error = false;
		
		if(PlayerName == null || PlayerName.trim().length()==0){
			request.setAttribute("PlayerNameError", "please Enter player name");
			error = true;
		}else {
			String alpharegex = "[a-zA-Z]{2,}";
		    
			if(PlayerName.matches(alpharegex) == false) {
				request.setAttribute("PlayerNameError", "please Enter Valid player name");
				error = true;
			}
		}
		
		
		request.setAttribute("PlayerNamevalue", PlayerName );
	
		
		if(Skill == null ||  Skill.trim().length() == 0){
			request.setAttribute("SkillError", "please Enter player Skill");
			error = true;
		}
		
	
		request.setAttribute("PlayerSkillvalue", Skill );
		
		
		
		
		if(error == true){
			RequestDispatcher rd = request.getRequestDispatcher("boxCricket.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("boxCricketSuccsess.jsp");
			rd.forward(request, response);
		}
		
		
	}

}
