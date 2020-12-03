package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.LeaveDAO;
import net.cew.model.to.LeaveTO;

public class ViewLeavesByManagerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("indise view leaves by manager servlet in doget");
		HttpSession session=request.getSession();
		String username=(String)session.getAttribute("usertype");
		
		LeaveDAO l=new LeaveDAO();
		ArrayList<LeaveTO> leave=l.ViewLeaveByManagerThroughLeaveDAO(username);
		session.setAttribute("viewleavebymanageratt",leave);
		if(leave.isEmpty())
		{
			session.setAttribute("flag",0);
		}
		else
		{
			session.setAttribute("flag",1);
		}
	
		request.getRequestDispatcher("ViewLeaveByManager.jsp").forward(request,response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	

	}

}
