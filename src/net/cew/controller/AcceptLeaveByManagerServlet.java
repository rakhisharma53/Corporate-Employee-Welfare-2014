package net.cew.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.model.dao.LeaveDAO;
import net.cew.model.to.LeaveTO;

public class AcceptLeaveByManagerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("inside doget in accept or reject leave servlet");
		int leaveid=Integer.parseInt(request.getParameter("leaveid"));
		String status=request.getParameter("status");
		System.out.println("id:"+leaveid+"status"+status);
			System.out.println("inside if of leave accepted");
		    LeaveDAO l=new LeaveDAO();
	        int returnflag=l.AcceptOrRejectByManager(leaveid,status);
	   	    if(returnflag>0)
			{
						request.getRequestDispatcher("ViewLeavesByManagerServlet").forward(request,response);
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

}
