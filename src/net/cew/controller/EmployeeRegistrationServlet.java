package net.cew.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.business.EmailToEmployee;
import net.cew.model.dao.ManagerDAO;
import net.cew.model.to.EmployeeTO;

public class EmployeeRegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int returnflag=0;
		System.out.println("inside employeeRegiisteration Servlet");
		String en=request.getParameter("ename");
		String eid=request.getParameter("empeid");
		String department=request.getParameter("department");
		EmployeeTO e=new EmployeeTO();
		e.setEmailid(eid);
		e.setName(en);
		e.setDepartment(department);	
		
		ManagerDAO adao=new ManagerDAO();
		returnflag=adao.registerEmployee(e);
		
		if(returnflag==1)
		{
			System.out.print("return : "+returnflag);
	        EmailToEmployee email=new EmailToEmployee();
	        email.sendEmail(eid,e.getPassword(),e.getUsername(),en);
			response.getWriter().print("1");
		}
		else
		{
			System.out.print("return"+returnflag);
			response.getWriter().print("0");
					
		}
	}

}
