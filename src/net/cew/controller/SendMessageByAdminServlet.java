package net.cew.controller;


import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.business.SystemDate;
import net.cew.model.dao.MessageDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;
import net.cew.model.to.MessageTO;

public class SendMessageByAdminServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int returnflag=0;
		System.out.println("inside Add msg  Servlet");
		
		Date d=SystemDate.getSystemDate();
		String sender;
		String msgtit=request.getParameter("msgtit");
		String msgdes=request.getParameter("msgdes");
		System.out.print(msgdes);
		String uname=request.getParameter("uname");
		HttpSession session=request.getSession();
		String ut=(String)session.getAttribute("usertype");
		if(ut.equals("admin"))
		{
		AdminTO adminobj= (AdminTO)session.getAttribute("adminatt");
		sender=adminobj.getUsername();				
		}
		else if(ut.equals("manager"))
		{
			ManagerTO adminobj= (ManagerTO)session.getAttribute("mgrprofileatt");
			sender=adminobj.getUsername();					
		}
		else
		{
			EmployeeTO adminobj= (EmployeeTO)session.getAttribute("employeeatt");
		    sender=adminobj.getUsername();		
		}	
		MessageTO message=new MessageTO();
		message.setDate(d);
		message.setMessagetitle(msgtit);
		message.setMessagedescription(msgdes);
		message.setReciever(uname);
		message.setSender(sender);
		message.setMsgstatus(true);

		MessageDAO mdao=new MessageDAO();
		returnflag=mdao.checkValidUser(message);
		String adminusername=(String)session.getAttribute("adminusernameatt");
		System.out.println(adminusername);
		System.out.print("return check validity: "+returnflag);
		if((returnflag>0) || (uname.equals(adminusername)))
		{
		int returnflag1=mdao.sendMessage(message);
    		if(returnflag1==1)
	    	{
		    	System.out.print("return : "+returnflag1);
	            response.getWriter().print("1");
	    	}
		   else
		    {
			   System.out.print("return"+returnflag1);
			   response.getWriter().print("0");
			}
		}
		else
		{
			   response.getWriter().print("0");
		}
	}
}

