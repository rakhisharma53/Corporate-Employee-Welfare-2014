
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
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.EventTO;
import net.cew.model.to.ManagerTO;
public class ViewModifyEventsServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside servlet in dpost");
		HttpSession session=request.getSession();
		String un="";
		String ut=(String)session.getAttribute("usertype");
		if(ut.equals("admin"))
		{
			AdminTO a=(AdminTO)session.getAttribute("adminatt");
			un=a.getUsername();
		}
		else if(ut.equals("manager"))
		{
			ManagerTO a=(ManagerTO)session.getAttribute("mgrprofileatt");
			un=a.getUsername();
		}
		else if(ut.equals("employee"))
		{
			EmployeeTO a=(EmployeeTO)session.getAttribute("employeeatt");
			un=a.getUsername();
		}
		EventDAO e=new EventDAO();
		ArrayList<EventTO> event=e.ViewModiyToEventThroughEventDAO(un);
		session.setAttribute("eventatt",event);
		if(event.isEmpty())
		{
			request.getRequestDispatcher("NoModifyEvent.jsp").forward(request,response);	
		}
		else
		{
		request.getRequestDispatcher("ViewModifyEvent.jsp").forward(request,response);
		}
	}

}
