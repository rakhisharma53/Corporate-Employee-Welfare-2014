package net.cew.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.business.NoOfDays;


public class CalculateNoOfDaysServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date from=null;Date to=null;
	try
	{
	   from=sdf.parse(request.getParameter("f"));
	   to=sdf.parse(request.getParameter("t"));
	}
	 catch(ParseException e){System.out.println("panga while casting date in calculate no of days  servlet"+e);}
     System.out.println("date1:"+from+"date2:"+to);
     NoOfDays n=new NoOfDays();
     long days=n.calculateNoOfDays(from,to);
     System.out.println("days"+days);
     response.getWriter().println(days);
	
	}
}
