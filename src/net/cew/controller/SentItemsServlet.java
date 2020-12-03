package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.MessageDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;
import net.cew.model.to.MessageTO;
public class SentItemsServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname;
		System.out.println("inside dopost in view servlet");
		HttpSession session=request.getSession();
		MessageDAO m=new MessageDAO();
		String ut=(String)session.getAttribute("usertype");
		if(ut.equals("admin"))
		{
			AdminTO mobj=(AdminTO)session.getAttribute("adminatt");
		    uname=mobj.getUsername();
		}
		else if(ut.equals("manager"))
		{
			ManagerTO mobj=(ManagerTO)session.getAttribute("mgrprofileatt");
		    uname=mobj.getUsername();
		}
		else
		{
			EmployeeTO mobj=(EmployeeTO)session.getAttribute("employeeatt");
		    uname=mobj.getUsername();
		}
		System.out.println(uname);
			ArrayList<MessageTO> returnsentitems=m.viewSentItems(uname);
			if(!returnsentitems.isEmpty())
			{
				session.setAttribute("sentitematt",returnsentitems);
				request.getRequestDispatcher("SentItemResponse.jsp").forward(request,response);
			}
			else
			{
				request.getRequestDispatcher("InboxNoResponse.jsp").forward(request,response);				
			}

	}

}
