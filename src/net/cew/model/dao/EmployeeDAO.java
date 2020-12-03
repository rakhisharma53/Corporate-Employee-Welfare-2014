package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.cew.business.PasswordEncryption;
import net.cew.factory.ConnectionPool;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;

public class EmployeeDAO {
	Connection con;
	ResultSet rs;
	PreparedStatement pstmt;
	int flag=0;
	public int checkEmployeeLogin(EmployeeTO e)
	{
	   ConnectionPool c=new ConnectionPool();
	   con=c.getConnection1();
	   String un=e.getUsername();
	   String up=PasswordEncryption.getEncryptedPassword(e.getPassword());
	   String query="select password from employee_tab where username=?";
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
	  catch(SQLException e1){System.out.println("check  employee login Sql panga"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
     }
	
	public EmployeeTO viewEmployeeProfileViaEmployeeDao(String username)
	{
		ResultSet rst;
		EmployeeTO eto=null;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
        String query=null;
        query="select *from employee_tab where username=?";
		try 
		{
			pstmt=con.prepareStatement(query);
			System.out.println("username in dao: "+username);
			pstmt.setString(1,username);
			rst=pstmt.executeQuery();
	    	if(rst.next())
			{
			  eto=new EmployeeTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getDate(4),rst.getLong(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10),rst.getInt(11),rst.getString(12),rst.getString(13),rst.getString(14),rst.getBytes(15),rst.getString(16));
			}
			
		}
		catch(Exception e){System.out.println("Sql Panga in managerdao while viewing manager profie "+e);}
		finally{c.freeConnection(con);}
		return eto;
	}


public int modifyProfile(EmployeeTO m)
{
	ConnectionPool c=new ConnectionPool();
	con=c.getConnection1();
	int flag=0;
	
	String query="update employee_tab set name=?,f_name=?,dob=?,mobileno=?,emailid=?,line1=?,line2=?,city=?,state=?,pincode=?,bloodgroup=? where username=?";
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

