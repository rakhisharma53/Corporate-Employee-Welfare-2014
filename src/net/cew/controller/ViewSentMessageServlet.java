package net.cew.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.MessageDAO;
import net.cew.model.to.MessageTO;

public class ViewSentMessageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int msgid=Integer.parseInt(request.getParameter("msgid"));
		  System.out.println("inside view msg description sservlet"+msgid);
			 
		  MessageTO mto=new MessageTO();
		  mto.setMsgid(msgid);
		  MessageDAO mdao=new MessageDAO();
		  mto=mdao.fetchSentMessageDescription(mto);

		  HttpSession session=request.getSession();
		  session.setAttribute("msgdescriptionatt",mto);
		  request.getRequestDispatcher("SentItemDescription.jsp").forward(request, response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 	}

}
