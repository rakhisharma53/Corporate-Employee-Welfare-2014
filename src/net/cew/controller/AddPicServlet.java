package net.cew.controller;


import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.ImageDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.FileItem;
public class AddPicServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		  byte[] pic=null;
				DiskFileItemFactory factory=new DiskFileItemFactory();
		        ServletFileUpload upload=new ServletFileUpload(factory);
		        HttpSession session=request.getSession();
		        String ut=(String)session.getAttribute("usertype");
		        String un="";
		    	if(ut.equals("admin"))
		    	{
		    		AdminTO a=(AdminTO)session.getAttribute("adminatt");
		    	    un=a.getUsername();
		    	}
		    	if(ut.equals("manager"))
		    	{
		    		ManagerTO a=(ManagerTO)session.getAttribute("mgrprofileatt");
		    	    un=a.getUsername();
		    	}
		    	if(ut.equals("employee"))
		    	{
		    		EmployeeTO a=(EmployeeTO)session.getAttribute("employeeatt");
		    	    un=a.getUsername();
		    	}
	try
        {
        	List<FileItem> i=upload.parseRequest(request);
        	for(FileItem item:i)
        	{
        		if(!item.isFormField())
        			 pic=item.get();
        	}
        }
       catch(Exception e)
       {
    	   System.out.println("Pic loader error "+e);
       }
        ImageDAO id=new ImageDAO();
		id.savePic(pic,un,ut);
		//response.setContentType("image/jpg");
		//response.getOutputStream().write(pic);
		request.setAttribute("checkatt",0);
		if(ut.equals("admin"))
		{
		    request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
		}
		else if(ut.equals("manager"))
		{
		    request.getRequestDispatcher("ManagerHome.jsp").forward(request, response);
		}
		else
		{
		    request.getRequestDispatcher("EmployeeHome.jsp").forward(request, response);
		}
	}
}
