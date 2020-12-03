package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.VacancyDAO;
import net.cew.model.to.VacancyTO;

public class ViewVacancyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside view vacancy servlet");
		HttpSession session=request.getSession();
		VacancyDAO v=new VacancyDAO();
		ArrayList<VacancyTO> vacancy=v.ViewVacancyThroughVacancyDAO();
		session.setAttribute("viewvacancyatt",vacancy);
		request.getRequestDispatcher("ViewIndexVacancy.jsp").forward(request,response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside view vacancy servlet");
		HttpSession session=request.getSession();
		VacancyDAO v=new VacancyDAO();
		ArrayList<VacancyTO> vacancy=v.ViewVacancyThroughVacancyDAO();
		session.setAttribute("viewvacancyatt",vacancy);
		request.getRequestDispatcher("ViewVacancy.jsp").forward(request,response);
	}

}
