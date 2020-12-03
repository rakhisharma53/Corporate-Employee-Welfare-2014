package net.cew.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.ImageDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadPicsServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 byte[] pic=null;
			DiskFileItemFactory factory=new DiskFileItemFactory();
	        ServletFileUpload upload=new ServletFileUpload(factory);
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
          int flag=id.uploadPic(pic);
          String uploaded="Image is Uploaded....";
          String notuploaded="Image should be 1024 by 950 pixels.....";
          if(flag>0)
          {
        	  request.setAttribute("checkatt",1);
              request.setAttribute("dataatt",uploaded);
          }
          else
          { 
        	  request.setAttribute("checkatt",0);
              request.setAttribute("dataatt",notuploaded);
          }
          request.getRequestDispatcher("UploadImages.jsp").forward(request, response);    
	}
}
