package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.model.dao.CareerDAO;
import net.cew.model.to.CareerTO;
public class ShowCareerFileServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("career downloads");
		CareerDAO cdao=new CareerDAO();
		ArrayList<CareerTO> alist=cdao.showCareerFile();
		request.setAttribute("careeratt",alist);
		if(alist.isEmpty())
		{
			System.out.println("career downloads:0");
				
		 request.setAttribute("att",0);
		}
		else
		{
			System.out.println("career downloads 1");
			
			request.setAttribute("att",1);
		}
		request.getRequestDispatcher("CareerResponse.jsp").forward(request, response);
	}
}
