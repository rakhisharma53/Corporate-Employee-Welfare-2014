package net.cew.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.model.dao.VacancyDAO;
import net.cew.model.to.VacancyTO;

public class AddVacancyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("inside Add vacancy  Servlet");
		int returnflag=0;
		String jt=request.getParameter("jt");
		String q=request.getParameter("qual");
		String e=request.getParameter("exp");
		int noofvac=Integer.parseInt(request.getParameter("noofvac"));
		float p=Float.parseFloat(request.getParameter("pkg"));
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date d=null;
		try
		{
		  d=sdf.parse(request.getParameter("date"));
		}
		catch(Exception ex)
		{
			System.out.print("parse Exception "+ex);
		}
		
		System.out.println(d);
			
		
		VacancyTO vacancy=new VacancyTO();
		vacancy.setJobtitle(jt);
		vacancy.setQualification(q);
		vacancy.setExperience(e);
		vacancy.setNoofvacancy(noofvac);
		vacancy.setPackage1(p);
		vacancy.setDate(d);
		
		
		VacancyDAO edao=new VacancyDAO();
		returnflag=edao.addVacancy(vacancy);
		
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
