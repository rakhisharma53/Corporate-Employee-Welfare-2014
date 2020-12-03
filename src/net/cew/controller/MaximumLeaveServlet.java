package net.cew.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.model.dao.LeaveDAO;
public class MaximumLeaveServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.print("Max Leave SErvlet");
		int flag=0;
       int maxleave=Integer.parseInt(request.getParameter("maxleave"));
       LeaveDAO l=new LeaveDAO();
       flag=l.updateMaximumLeave(maxleave);
       System.out.println(flag);
       if(flag>0)
       {
    	   response.getWriter().print(1);
       }
       else
       {
    	   response.getWriter().print(0);
    	         
       }
	}

}
