package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.EventDAO;
import net.cew.model.to.EventTO;

public class ModifyEventServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("inside modify servlet");
		int eventid=Integer.parseInt(request.getParameter("evtid"));
		System.out.println("id:"+eventid);
		EventDAO e=new EventDAO();
		EventTO event=e.ModifyEventThroughEventDAO(eventid);
		HttpSession session=request.getSession();
		session.setAttribute("eventformodifytatt",event);
		request.getRequestDispatcher("ModifyEvent.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	}

}
