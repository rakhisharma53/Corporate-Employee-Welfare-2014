package net.cew.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.DonorDAO;
import net.cew.model.to.DonorTO;

public class ViewDonorServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String donor=request.getParameter("donor");
		DonorDAO d=new DonorDAO();
		ArrayList<DonorTO> donorlist =new ArrayList<DonorTO>();
		donorlist=d.viewDonor(donor);
		if(donorlist.isEmpty())
		{
			response.getWriter().print("No Donor of this group");
		}
		else
		{
			HttpSession session=request.getSession();
			session.setAttribute("donoratt",donorlist);
			request.getRequestDispatcher("ViewDonorResponse.jsp").forward(request, response);
		}
	}

}
