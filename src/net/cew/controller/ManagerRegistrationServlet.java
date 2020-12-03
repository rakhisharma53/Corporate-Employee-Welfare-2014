package net.cew.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.business.Email;
import net.cew.model.dao.AdminDAO;
import net.cew.model.to.ManagerTO;
public class ManagerRegistrationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int returnflag=0;
		System.out.println("Manger Regiisteration Servlet");
		String mn=request.getParameter("mn");
		String meid=request.getParameter("meid");
		String department=request.getParameter("department");
		HttpSession session=request.getSession();
		session.setAttribute("managernameatt", mn);
		
		ManagerTO m=new ManagerTO();
		m.setEmailid(meid);
		m.setDepartment(department);
		m.setName(mn);
		AdminDAO adao=new AdminDAO();
		returnflag=adao.registerManager(m);
		
		if(returnflag==1)
		{
			System.out.print("return : "+returnflag);
	        Email e=new Email();
	        e.sendEmail(meid,m.getPassword(),m.getUsername(),mn);
			response.getWriter().print("1");
		}
		else
		{
			System.out.print("return"+returnflag);
			response.getWriter().print("0");
					
		}
		
		
		
	}

}
