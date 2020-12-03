package net.cew.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.business.SystemDate;
import net.cew.model.dao.BulletinDAO;
import net.cew.model.to.BulletinTO;

public class AddBulletinServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int returnflag=0;

		String bul=request.getParameter("bulletin");
		   SystemDate sd=new SystemDate();
		   Date d=sd.getSystemDate();
			System.out.println(bul+"  "+d);	
		
		BulletinTO bulletin=new BulletinTO();
		bulletin.setDate(d);
		bulletin.setBulletin(bul);
	
		BulletinDAO bdao=new BulletinDAO();
		returnflag=bdao.addBulletinViaBulletinDAO(bulletin);
		
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

