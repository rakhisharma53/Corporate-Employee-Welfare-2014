package net.cew.controller;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FileDownloadServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Welcome in Get() method of File Download Servlet");
		
		String filename = request.getParameter("filename");
		System.out.println("Filename received : "+filename);
		
				
			String filePath = getServletContext().getRealPath("")+ File.separator +"uploads"+ File.separator + filename;
	        File file = new File(filePath);
	        System.out.print(filePath);
	        int length   = 0;
	        ServletOutputStream outStream = response.getOutputStream();
	        ServletContext context  = getServletConfig().getServletContext();
	        String mimetype = context.getMimeType(filePath);
	        //sets response content type
	        if (mimetype == null) {
	            mimetype = "application/octet-stream";
	        }
		        response.setContentType(mimetype);
		        response.setContentLength((int)file.length());
		        
		        //sets HTTP header
		        response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");
		        
		        byte[] byteBuffer = new byte[4096];
		        DataInputStream in = new DataInputStream(new FileInputStream(file));
		        
		        // reads the file's bytes and writes them to the response stream
		        while ((in != null) && ((length = in.read(byteBuffer)) != -1))
		        {
		            outStream.write(byteBuffer,0,length);
		        }
		        
		        in.close();
		        outStream.close();
		  }  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

}
