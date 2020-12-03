package net.cew.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class BasicServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String id=request.getParameter("id");
		if(id.equals("home"))
		{
			response.sendRedirect("index.jsp");
		}
		
		else if(id.equals("login"))
		{
			response.sendRedirect("login.jsp");
		}
		else if(id.equals("gallery"))
		{
			response.sendRedirect("Gallery.jsp");
		}
		else if(id.equals("career"))
		{
			response.sendRedirect("DownloadCareer.jsp");
		}
		else if(id.equals("contact"))
		{
			response.sendRedirect("ContactUs.jsp");
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

}
