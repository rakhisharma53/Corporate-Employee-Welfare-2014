package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.cew.business.AdminLogics;
import net.cew.business.ManagerLogics;
import net.cew.business.PasswordEncryption;
import net.cew.factory.ConnectionPool;
import net.cew.model.to.DonorTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.LeaveTO;
import net.cew.model.to.ManagerTO;

public class ManagerDAO 
{ 
	Connection con;
	ResultSet rs;
	String query;
	PreparedStatement pstmt;
	int flag=0;
	public int checkManagerLogin(ManagerTO m)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		String un=m.getUsername();
		String up=PasswordEncryption.getEncryptedPassword(m.getPassword());
	   String query="select password from manager_tab where username=?";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		  pstmt.setString(1,un);
		  rs=pstmt.executeQuery();
		  	if(rs.next())
		  	{
		  			if(up.equals(rs.getString(1)))
		  				{
		  					flag=1;
		  				}
		  	}
	  }
	  catch(SQLException e){System.out.println("check Manager login Sql panga"+e);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
	public int registerEmployee(EmployeeTO e)
    {
        System.out.println("inside emp dao in register emp");
    	Connection con=null;
    	ResultSet rs=null;
    	String e_id=null;
    	PreparedStatement pstmt=null;
    	int code=0;
    	int flag=0;
       ConnectionPool p=new ConnectionPool();
       //System.out.println("Connection Established");
   	
       try
       {
           //generate password
    	   con=p.getConnection1();
           
    	   pstmt=con.prepareStatement("select * from generatepassword_tab");
           rs=pstmt.executeQuery();
           
           if(rs.last())
           {
        	   code=rs.getInt(1);
           }
           else
           {
        	   code=0;        	   
           }
           System.out.println("code="+code);
       	
         
           e.setPassword(PasswordEncryption.getEncryptedPassword(AdminLogics.generatePassword(e.getName(),e.getDepartment(),code)));
           
           //insert code
           pstmt=con.prepareStatement("insert into generatepassword_tab values(code)");
           pstmt.executeUpdate();
           
           //generate user Name
           pstmt=con.prepareStatement("select employeeid from employee_tab");
           rs=pstmt.executeQuery();
           if(rs.last())
           {
        	   e_id=rs.getString(1);
           }
           else
           {
        	   e_id="CEW2000";
           }
           e_id=AdminLogics.generateManagerId(e_id);
           System.out.println("id="+e_id);
           e.setE_id(e_id);
           e.setUsername(e_id);
           pstmt=con.prepareStatement("insert into employee_tab (employeeid,name,emailid,username,password,department) values(?,?,?,?,?,?)");
           pstmt.setString(1,e.getE_id());
           pstmt.setString(2,e.getName());
           pstmt.setString(3,e.getEmailid());
           pstmt.setString(4,e.getUsername());
           pstmt.setString(5,e.getPassword());
           pstmt.setString(6,e.getDepartment());
           flag=pstmt.executeUpdate();
       }
       catch(SQLException e1)
       {
           System.out.println("Admin Dao Sql Panga"+e1);

       }
       return flag;
    }
	
	public ManagerTO viewManagerProfileViaManagerDAO(String username,String ut)
	{
		ResultSet rst;
		ManagerTO mto=null;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
   
   query="select * from manager_tab where username=?";
		try 
		{
			pstmt=con.prepareStatement(query);
			System.out.println("username in dao: "+username);
			pstmt.setString(1,username);
			rst=pstmt.executeQuery();
	    	if(rst.next())
			{
			  mto=new ManagerTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getDate(4),rst.getLong(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10),rst.getInt(11),rst.getString(12),rst.getString(13),rst.getString(14),ut,rst.getBytes(15),rst.getString(16));
			}
			
		}
		catch(Exception e){System.out.println("Sql Panga in managerdao while viewing manager profie "+e);}
		finally{c.freeConnection(con);}
	
		return mto;
	}
	public int ModifyManagerProfileViaManagerDAO(ManagerTO m)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int flag=0;
		
    query="update manager_tab set name=?,f_name=?,dob=?,mobileno=?,emailid=?,line1=?,line2=?,city=?,state=?,pincode=?,bloodgroup=? where username=?";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		  System.out.println("fname inside dao:"+m.getF_name()+m.getCity()+m.getLine1());
	      pstmt.setString(1,m.getName());
          pstmt.setString(2,m.getF_name());
          pstmt.setDate(3,new java.sql.Date(m.getDob().getTime()));
  
          pstmt.setLong(4,m.getMobileno());
          pstmt.setString(5,m.getEmailid());
          pstmt.setString(6,m.getLine1());
          pstmt.setString(7,m.getLine2());
          pstmt.setString(8,m.getCity());
          pstmt.setString(9,m.getState());
          pstmt.setInt(10,m.getPincode());
          pstmt.setString(11,m.getBg());
          pstmt.setString(12,m.getUsername());
          
          flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println(" Sql panga in manager dao while updating profile"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
	
	}

