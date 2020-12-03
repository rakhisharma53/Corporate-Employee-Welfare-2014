package net.cew.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.model.dao.CareerDAO;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadCareerServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String description="",filename="",filepath="",fieldname="",dbpath="",root="";
		DiskFileItemFactory factory=new DiskFileItemFactory();
		ServletFileUpload upload=new ServletFileUpload(factory);
		try
		{
			List<FileItem> items=upload.parseRequest(request);
			for(FileItem item:items)
			{
				if(item.isFormField())
				{
					description=item.getString();
				}
				else if(!item.isFormField())
				{
						
					filename=item.getName();
					root=getServletContext().getRealPath("/");
					System.out.println("fieldname : "+fieldname);
					System.out.println("filename : "+filename);
					System.out.println("root : "+root);
					File f=new File(root+"/uploads");
					if(!f.exists())
					{
						f.mkdir();
					}
					File f2=new File(root+"/uploads"+"/"+filename);
					dbpath=f2.getAbsolutePath();
					System.out.println("dbpath : "+dbpath);
					item.write(new File(dbpath));
					
				}
			}
		}
		catch(Exception e){}
		CareerDAO md=new CareerDAO();
		int k=md.saveCareerInformationInDB(dbpath,description,filename);
		String text="";
		if(k>0)
		{
	     text="File Uploaded";
		}
		else
		{
			text="File not Uploaded";
		}
		request.setAttribute("responsetext",text);
		
		request.getRequestDispatcher("UploadCareer.jsp").forward(request,response);
		}

}
