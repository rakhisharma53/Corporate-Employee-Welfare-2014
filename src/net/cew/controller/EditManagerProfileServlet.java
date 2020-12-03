package net.cew.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.cew.model.dao.EmployeeDAO;
import net.cew.model.dao.ManagerDAO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;

public class EditManagerProfileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		HttpSession session=request.getSession();
		String ut=(String)session.getAttribute("usertype");
		if(ut.equals("manager"))
		{
			ManagerTO mto=(ManagerTO)session.getAttribute("mgrprofileatt");
			String un=mto.getUsername();
			ManagerTO mgrobj=new ManagerDAO().viewManagerProfileViaManagerDAO(un,ut);
			session.setAttribute("mgrprofileatt",mgrobj); 
		}
		else if(ut.equals("employee"))
		{
			EmployeeTO mto=(EmployeeTO)session.getAttribute("employeeatt");
			String un=mto.getUsername();
			EmployeeTO mgrobj=new EmployeeDAO().viewEmployeeProfileViaEmployeeDao(un);
			session.setAttribute("employeeatt",mgrobj); 
		
		}
	        request.getRequestDispatcher("EditManagerProfile.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("inside  edit manager profile servlet in dopost");
		String n=request.getParameter("n");
		String e=request.getParameter("e");
		String f=request.getParameter("f");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date d=null;
		try{
		d=sdf.parse(request.getParameter("d"));
		}
		catch(ParseException e1){System.out.println("panga while casting date in modify profile"+e1);}
		
		Long mno=Long.parseLong(request.getParameter("m"));
		String l1=request.getParameter("l1");
		String l2=request.getParameter("l2");
		String c=request.getParameter("c");
		String state=request.getParameter("s");
		int p=Integer.parseInt(request.getParameter("p"));
		String bg=request.getParameter("bg");
        HttpSession s=request.getSession();
        String ut=(String)s.getAttribute("usertype");
        int returnflag=0;
        if(ut.equals("manager"))
        {
    		ManagerTO m=new ManagerTO();
    		m.setName(n);
    		m.setEmailid(e);
    		m.setF_name(f);
    		m.setDob(d);
    		m.setMobileno(mno);
    		m.setLine1(l1);
    		m.setLine2(l2);
    		m.setCity(c);
    		m.setState(state);
    		m.setPincode(p);
            m.setBg(bg);	  
	         ManagerTO mobj=(ManagerTO)s.getAttribute("mgrprofileatt");
        	    m.setUsername(mobj.getUsername());
		        ManagerDAO m1=new ManagerDAO();
		     returnflag=m1.ModifyManagerProfileViaManagerDAO(m);
        }
        else if(ut.equals("employee"))
        {
    		EmployeeTO m=new EmployeeTO();
    		m.setName(n);
    		m.setEmailid(e);
    		m.setF_name(f);
    		m.setDob(d);
    		m.setMobileno(mno);
    		m.setLine1(l1);
    		m.setLine2(l2);
    		m.setCity(c);
    		m.setState(state);
    		m.setPincode(p);
            m.setBg(bg);	  


            EmployeeTO mobj=(EmployeeTO)s.getAttribute("employeeatt");
    	    m.setUsername(mobj.getUsername());
	        EmployeeDAO m1=new EmployeeDAO();
	         returnflag=m1.modifyProfile(m);
   
        }
		System.out.println("returnflag"+returnflag);
		if(returnflag>0){
			
			response.getWriter().print("1");
		}
		else
		{
			response.getWriter().print("0");
		}
	}

}
