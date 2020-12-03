package net.cew.controller;
 	 	
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.model.dao.EventDAO;
import net.cew.model.to.EventTO;

public class UpdateEventServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		System.out.println("*************inside update event servlet....");
		int returnflag=0;
		System.out.println("inside update event servlet in dopost : "+request.getParameter("eid"));
		int eid=Integer.parseInt(request.getParameter("eid"));
		System.out.println("eventid in servlet:"+eid);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		Date d=null;
		try{
		d=sdf.parse(request.getParameter("date"));
		    }
		catch(ParseException e){System.out.println("panga while casting date in event servlet"+e);}
		String title=request.getParameter("title");
		String v=request.getParameter("venue");
		String time=request.getParameter("time");
		String dur=request.getParameter("dur");
		String des=request.getParameter("des");
	
		EventTO event=new EventTO();
		event.setEventid(eid);
		event.setDate(d);
		event.setTitle(title);
		event.setVenue(v);
		event.setTime(time);
		event.setDuration(dur);
		event.setDescription(des);

		EventDAO edao=new EventDAO();
		returnflag=edao.updateEventInEventDAO(event);
		
		if(returnflag==1)
		{

			System.out.print("return"+returnflag);
			response.getWriter().print("1");
		}
		else
		{

			System.out.print("return"+returnflag);
			response.getWriter().print("0");
		}
	}
}


