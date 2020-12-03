package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.EventDAO;
import net.cew.model.dao.LeaveDAO;
import net.cew.model.to.EventTO;
import net.cew.model.to.LeaveTO;

public class ViewLeaveByManagerWithFormatServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside do post in view with format servlet");
		int leaveid=Integer.parseInt(request.getParameter("leaveid"));
		System.out.println("id:"+leaveid);
		LeaveDAO l=new LeaveDAO();
		LeaveTO leave=l.ViewLeaveByManagerWithFormatViaEventDAO(leaveid);
		HttpSession session=request.getSession();
		session.setAttribute("viewleavebymanagerwithformatatt",leave);
		request.getRequestDispatcher("ViewLeaveByManagerWithFormat.jsp").forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

}
