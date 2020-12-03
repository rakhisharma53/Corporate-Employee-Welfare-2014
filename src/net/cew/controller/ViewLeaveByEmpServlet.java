package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.LeaveDAO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.LeaveTO;
import net.cew.model.to.ManagerTO;

public class ViewLeaveByEmpServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("inside do post of view leaves by emp");
		HttpSession session=request.getSession();
		String ut=(String)session.getAttribute("usertype");
		String username="";
		if(ut.equals("manager"))
		{
			ManagerTO empobj=(ManagerTO)session.getAttribute("mgrprofileatt");
			username=empobj.getUsername();
		}
		else
		{
		       EmployeeTO empobj=(EmployeeTO)session.getAttribute("employeeatt");
		       username=empobj.getUsername();
		}
		System.out.println("username"+username);
		LeaveDAO v=new LeaveDAO();
		ArrayList<LeaveTO> leave=v.ViewLeaveByEmpThroughLeaveDAO(username);
		session.setAttribute("viewleaveatt",leave);
		if(leave.isEmpty())
		{
			request.getRequestDispatcher("NoLeave.jsp").forward(request,response);
					
		}
		else
		{
		request.getRequestDispatcher("ViewLeaveByEmp.jsp").forward(request,response);
		}
	}
}


