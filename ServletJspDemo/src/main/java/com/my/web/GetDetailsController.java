package com.my.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.my.web.dao.DetailsDao;
import com.my.web.model.details;

public class GetDetailsController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		DetailsDao dao = new DetailsDao();
		details d1 = dao.getDetails(aid);
		
		//request.setAttribute("details", d1);
		//RequestDispatcher rd = request.getRequestDispatcher("showDetails.jsp");
		//rd.forward(request, response);
		
		HttpSession session = request.getSession();
		session.setAttribute("detail", d1);
		
		response.sendRedirect("showDetails.jsp");
	}

}
