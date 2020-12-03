package net.cew.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.EmployeeDAO;
import net.cew.model.dao.ManagerDAO;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;

public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession();

		int returnflag=0;
		System.out.println("Login Servlet");
		String ut=request.getParameter("ut");
		String un=request.getParameter("un");
		String up=request.getParameter("up");
		ServletConfig config=getServletConfig();
		String xmlun=config.getInitParameter("username");
		 session.setAttribute("adminusernameatt",xmlun);  
     	session.setAttribute("usertype", ut);

		if(ut.equals("admin"))
		{
		    String xmlup=config.getInitParameter("password");
		    String xmlname=config.getInitParameter("name");
			AdminTO ato=new AdminTO(xmlun,xmlname,xmlup,ut);
						
		    System.out.println("User DAO"+xmlun+" "+xmlup+" "+un+" "+up);
		    if((un.equals(xmlun)) && (up.equals(xmlup)))
		    {
//				session.setAttribute("adminatt",xmlun);
				session.setAttribute("adminatt", ato);
		        response.getWriter().print("1");	
		    }
		    else
		    {
		    	response.getWriter().print("0");
		    }
	}
	
	else if(ut.equals("manager"))
	{
		ManagerTO m=new ManagerTO();
		m.setUsername(un);
		m.setPassword(up);
		m.setUsertype(ut);
		
		ManagerDAO manager=new ManagerDAO();
		returnflag=manager.checkManagerLogin(m);
			if(returnflag==1)
			{
							//	session.setAttribute("manageratt",m);

				ManagerTO mgrobj=manager.viewManagerProfileViaManagerDAO(un,ut);
				session.setAttribute("mgrprofileatt",mgrobj); 
				response.getWriter().print("2");
			}
			else
		    {
		    	response.getWriter().print("0");
		    }
	}
		else if(ut.equals("employee"))
		{  
			
			EmployeeTO e=new EmployeeTO();	
			e.setUsername(un);
			e.setPassword(up);
			e.setUsertype(ut);
			
			System.out.print("name"+un);
			EmployeeDAO employee=new EmployeeDAO();
			returnflag=employee.checkEmployeeLogin(e);
			if(returnflag==1)
			{
				e=employee.viewEmployeeProfileViaEmployeeDao(un);
				e.setUsertype(ut);
				session.setAttribute("employeeatt",e);
				response.getWriter().print("3");
			}
			
		else
		{
			response.getWriter().print("0");
		}
		}
		session.setAttribute("checkatt",0);
	}
}
	


