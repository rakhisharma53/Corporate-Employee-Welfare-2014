package net.cew.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.MessageDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;

public class CheckMessageServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Message count servlet");
		MessageDAO mdao=new MessageDAO();
		HttpSession session=request.getSession();
		String ut=(String)session.getAttribute("usertype");
		String un="";
		System.out.println(ut);
	    if(ut.equals("admin"))
	    {
		AdminTO a=(AdminTO)session.getAttribute("adminatt");
		un=a.getUsername();
	    }
	    else if(ut.equals("manager"))
	    {
	    	ManagerTO a=(ManagerTO)session.getAttribute("mgrprofileatt");
			un=a.getUsername();
		    System.out.println(un+" "+a);   	
	    }
	    else
	    {
	    	EmployeeTO a=(EmployeeTO)session.getAttribute("employeeatt");
			un=a.getUsername(); 
	    }
		int returnnewmessagecount = mdao.checkMessageCount(un);
		System.out.println(returnnewmessagecount);
		response.getWriter().print(returnnewmessagecount);
 	}

}
