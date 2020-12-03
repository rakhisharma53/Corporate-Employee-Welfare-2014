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

import net.cew.model.dao.EventDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.EventTO;
import net.cew.model.to.ManagerTO;


public class AddEventServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	String un=null;
	int returnflag=0;
	System.out.println("Add event  Servlet");
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date d=null;
	try{
	d=sdf.parse(request.getParameter("date"));
	}
	catch(ParseException e){System.out.println("panga while casting date in event servlet"+e);}
	String title=request.getParameter("title");
	String v=request.getParameter("venue");
	String time=request.getParameter("time");
	String dura=request.getParameter("dur");
	String des=request.getParameter("des");
	String shownto=request.getParameter("k");
	HttpSession session=request.getSession();
	String ut=(String)session.getAttribute("usertype");
	System.out.println(ut);
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

	EventTO event=new EventTO();
	event.setDate(d);
	event.setTitle(title);
	event.setVenue(v);
	event.setTime(time);
	event.setDuration(dura);
	event.setDescription(des);
	event.setShownto(shownto);
	event.setAddedby(un);
	System.out.print("duration:"+dura);
	EventDAO edao=new EventDAO();
	returnflag=edao.addEvent(event);
	
	if(returnflag==1)
	{
		System.out.print("return : "+returnflag);
      response.getWriter().print("1");
	}
	else
	{
		System.out.print("return"+returnflag);
		response.getWriter().print("0");
				
	}
	}

}
