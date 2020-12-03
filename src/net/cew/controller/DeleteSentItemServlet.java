package net.cew.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.MessageDAO;

public class DeleteSentItemServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
        String ut=(String)session.getAttribute("usertype");

		int returnflag=0;
		String msgs[]=request.getParameterValues("msg");
		int messages[]=new int[msgs.length];
		int index=0;
		for(String i:msgs)
			messages[index++]=Integer.parseInt(i);
		MessageDAO m=new MessageDAO();
		returnflag=m.deleteSentMessages(messages);
		if(returnflag>0)
		{
			System.out.println(returnflag);
			if(ut.equals("admin"))
			{
				request.getRequestDispatcher("AdminSentItems.jsp").forward(request, response);			
			}
			else if(ut.equals("manager"))
			{
				request.getRequestDispatcher("ManagerSentItems.jsp").forward(request, response);	
			}
			else
			{
				request.getRequestDispatcher("EmployeeSentItems.jsp").forward(request, response);
			}

     	}
	}

}
