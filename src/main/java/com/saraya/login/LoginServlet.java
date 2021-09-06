package com.saraya.login ;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.FormationService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	UserValidation id = new UserValidation();
	FormationService fs = new FormationService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String pw = request.getParameter("pass");
		boolean valid = id.isValid(name, pw);
		if (valid) {
		
			request.getSession().setAttribute("user", name);
			request.getSession().setAttribute("pass", pw);
			
			response.sendRedirect("/formation.do");
		}else {
			request.setAttribute("errorMessage", "Sorry wrong credential");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}

}

