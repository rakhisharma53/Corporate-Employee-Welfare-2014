package net.cew.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.to.EventTO;


public class EventDescriptionServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int eventid=Integer.parseInt(request.getParameter("eventid"));
		String description=request.getParameter("description");
		String venue=request.getParameter("venue");
		String time=request.getParameter("time");
		String duration=request.getParameter("duration");
		String title=request.getParameter("title");
		Date date=null;
		SimpleDateFormat sdf=new SimpleDateFormat();
		try
		{
		 date=sdf.parse(request.getParameter("date"));
		}
		catch(ParseException e)
		{
			System.out.println("parse exception");
		}
		        EventTO eto=new EventTO(eventid,date,title,venue,time,duration,description);
		        HttpSession session=request.getSession();
		        session.setAttribute("eventatt",eto);
				request.getRequestDispatcher("EventDescription.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

}
