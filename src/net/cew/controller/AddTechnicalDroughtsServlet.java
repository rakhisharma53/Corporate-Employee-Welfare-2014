package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.business.SystemDate;
import net.cew.model.dao.TechnicalDroughtsDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;
import net.cew.model.to.TechnicalDroughtsTO;


public class AddTechnicalDroughtsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		HttpSession s=request.getSession();
		  
		System.out.println("add techinal servlet");
		  String comment=request.getParameter("comment");
		  String ut=(String)s.getAttribute("usertype");
		  
		  //System.out.println("**"+comment+" "+ato.getName()+" "+ato.getPassword()+" "+ato.getUsername()+" "+ato.getUsertype());
		  
		  
		  if(ut.equals("admin"))
		  {
			  System.out.println(" "+ut);
			  AdminTO ato=(AdminTO)s.getAttribute("adminatt");
			   SystemDate sd=new SystemDate();
			   Date d=sd.getSystemDate();
			 
			   TechnicalDroughtsTO tdto=new TechnicalDroughtsTO(); 
			   tdto.setComment(comment);
			   tdto.setName(ato.getName());
			   tdto.setType(ato.getUsertype());
			   tdto.setUsername(ato.getUsername());
			   tdto.setDate(d);
			   TechnicalDroughtsDAO tddao=new TechnicalDroughtsDAO();
			    int flag= tddao.addTechnicalDroughts(tdto);
			    System.out.print("flag"+flag);
			    if(flag==1)
				  {
					  ArrayList<TechnicalDroughtsTO>droughtslist=tddao.fetchTechnicalDrought();
				      request.setAttribute("droughtslistatt", droughtslist);
				      request.getRequestDispatcher("ViewTechnicalDroughts.jsp").forward(request, response);
				  }
		  }
		  else if(ut.equals("manager"))
		  {
			  System.out.println(ut);
			  ManagerTO mgrobj=(ManagerTO)s.getAttribute("mgrprofileatt");
			  
			   SystemDate sd=new SystemDate();
			   Date d=sd.getSystemDate();
			 
			   TechnicalDroughtsTO tdto=new TechnicalDroughtsTO(); 
			   
			   tdto.setComment(comment);
			   tdto.setName(mgrobj.getName());
			   tdto.setType(ut);
			   tdto.setUsername(mgrobj.getUsername());
			   tdto.setDate(d);
			   TechnicalDroughtsDAO tddao=new TechnicalDroughtsDAO();
			    int flag= tddao.addTechnicalDroughts(tdto);
			    System.out.print("flag"+flag);
			  if(flag==1)
			  {
				  ArrayList<TechnicalDroughtsTO>droughtslist=tddao.fetchTechnicalDrought();
			      request.setAttribute("droughtslistatt", droughtslist);
			      request.getRequestDispatcher("ViewTechnicalDroughts.jsp").forward(request, response);
				  
			  }
		  }
		  else
		  {
			  EmployeeTO mgrobj=(EmployeeTO)s.getAttribute("employeeatt");
			  
			   SystemDate sd=new SystemDate();
			   Date d=sd.getSystemDate();
			 
			   TechnicalDroughtsTO tdto=new TechnicalDroughtsTO(); 
			   
			   tdto.setComment(comment);
			   tdto.setName(mgrobj.getName());
			   tdto.setType(mgrobj.getUsertype());
			   tdto.setUsername(mgrobj.getUsername());
			   tdto.setDate(d);
			   TechnicalDroughtsDAO tddao=new TechnicalDroughtsDAO();
			    int flag= tddao.addTechnicalDroughts(tdto);
			    System.out.print("flag"+flag);
			  if(flag==1)
			  {
				  ArrayList<TechnicalDroughtsTO>droughtslist=tddao.fetchTechnicalDrought();
			      request.setAttribute("droughtslistatt", droughtslist);
			      request.getRequestDispatcher("ViewTechnicalDroughts.jsp").forward(request, response);
			   }
		  
		  }
	}
}

