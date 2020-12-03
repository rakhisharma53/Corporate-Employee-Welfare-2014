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

import net.cew.model.dao.LeaveDAO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.LeaveTO;
import net.cew.model.to.ManagerTO;
public class ApplyForLeaveServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int returnflag=0;
		HttpSession session=request.getSession();
		String usertype=(String)session.getAttribute("usertype");
		String username=null;
		String name=null;
		if(usertype.equals("employee"))
		{
			EmployeeTO obj=(EmployeeTO)session.getAttribute("employeeatt");
			username=obj.getUsername();
			name=obj.getName();
		}
		else if(usertype.equals("manager"))
		{
			ManagerTO obj=(ManagerTO)session.getAttribute("mgrprofileatt");
			username=obj.getUsername();	
			name=obj.getName();
		}
		System.out.println("Apply for leave by emp servelt");
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date from=null;Date to=null;
		try{
		from=sdf.parse(request.getParameter("f"));
		 to=sdf.parse(request.getParameter("t"));
		}
		catch(ParseException e){System.out.println("panga while casting date in apply fo leave by emp servlet"+e);}
		int days=Integer.parseInt(request.getParameter("d"));
		String reason=request.getParameter("r");
		System.out.println("username"+username);
		
		LeaveTO leave=new LeaveTO();
		leave.setFrom(from);
		leave.setTo(to);
		leave.setDays(days);
		leave.setReason(reason);
		leave.setUsername(username);
		leave.setUsertype(usertype);
	    leave.setName(name);
	    
		LeaveDAO ldao=new LeaveDAO();
		int pendingleaves=ldao.pendingLeaves(username);
	  if(pendingleaves>0)
	  {
		    returnflag=ldao.applyForLeave(leave);
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
	  else
	  {
            response.getWriter().print("2");		  
	  }
	  }
}


