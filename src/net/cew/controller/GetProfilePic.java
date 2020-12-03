package net.cew.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.ImageDAO;
public class GetProfilePic extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	HttpSession session=request.getSession();
    String ut=(String)session.getAttribute("usertype");
	byte b[]=new ImageDAO().getImageByUsername(request.getParameter("username"),ut);
	
	System.out.println("pic="+b);
	if(b!=null)
	{
	response.setContentType("image/jpg");
	response.getOutputStream().write(b);
    }
	else
	{
		System.out.println("not met pic");
		response.getWriter().print("images/userpic.gif");	
	 }
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

}
