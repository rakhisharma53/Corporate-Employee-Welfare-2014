package net.cew.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.VacancyDAO;
import net.cew.model.to.VacancyTO;
public class ModifyVacancyServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.print("view Modifying Vacancy data ");
		int vid=Integer.parseInt(request.getParameter("vid"));
		VacancyDAO v=new VacancyDAO();
		VacancyTO vto=v.ViewVacancyUsingVacancyId(vid);
		HttpSession session=request.getSession();
		session.setAttribute("vacancyatt", vto);
		request.getRequestDispatcher("ModifyVacancy.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside Modify vacancy  Servlet");
		int returnflag=0;
		int vid=Integer.parseInt(request.getParameter("vid"));
		
		String jt=request.getParameter("jt");
		String q=request.getParameter("qual");
		String e=request.getParameter("exp");
		int noofvac=Integer.parseInt(request.getParameter("noofvac"));
		float p=Float.parseFloat(request.getParameter("pkg"));
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
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
		vacancy.setVacancyid(vid);
		vacancy.setJobtitle(jt);
		vacancy.setQualification(q);
		vacancy.setExperience(e);
		vacancy.setNoofvacancy(noofvac);
		vacancy.setPackage1(p);
		vacancy.setDate(d);
		
		
		VacancyDAO edao=new VacancyDAO();
		returnflag=edao.modifyVacancy(vacancy);
		
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
