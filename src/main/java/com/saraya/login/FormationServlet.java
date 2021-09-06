package com.saraya.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.Formation;
import com.saraya.service.FormationService;

@WebServlet(urlPatterns = "/formation.do")
public class FormationServlet extends HttpServlet{
		
		FormationService fs = new FormationService();
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			request.setAttribute("user", request.getParameter("pass"));
			request.setAttribute("formats", fs.getAllFormation());
			request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServletException {
			String form = request.getParameter("add");
			
			fs.addFormation(new Formation(form));
				response.sendRedirect("/formation.do");
	}
}
