package net.cew.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.model.dao.ImageDAO;

public class GetTechnicalDroughtsPicServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("in get technicaldrought pic servlet");
		String ut=(String)request.getParameter("usertype");
		String un=(String)request.getParameter("username");
		
		byte b[]=new ImageDAO().getImageByUsername(un,ut);
		
		System.out.println("pic="+b);
		if(b!=null)
		{
			
		response.setContentType("image/jpg");
		response.getOutputStream().write(b);
	    }
		else
		{
			System.out.println("not met pic");
			
		}
	    
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

}
