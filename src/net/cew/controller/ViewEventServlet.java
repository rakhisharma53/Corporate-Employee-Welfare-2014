package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.EventDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EventTO;
public class ViewEventServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside view event servlet in dpost");
		HttpSession session=request.getSession();
		String ut=(String)session.getAttribute("usertype");
		EventDAO e=new EventDAO();
		ArrayList<EventTO> event=e.ViewEventThroughEventDAO(ut);
		session.setAttribute("eventatt",event);
		request.getRequestDispatcher("ViewEvents.jsp").forward(request,response);
		
	}

}
