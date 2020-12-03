package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.AdminTO;
import net.cew.model.to.EmployeeTO;
import net.cew.model.to.ManagerTO;

public class ImageDAO 
{
	Connection con;
	ResultSet rs;
	String query;
	PreparedStatement pstmt;
	int k;
	
	public void savePic(byte[] pic,String un,String ut)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		if(ut.equals("admin"))
    	{
			query="update admin_tab set pic=? where aid=1";
    		try
    	    {
    	     pstmt=con.prepareStatement(query);
    	     pstmt.setBytes(1,pic);
    	     k=pstmt.executeUpdate();
    	    }
    		catch(Exception e)
    		{
    			System.out.println("Sql panaga while image uploading"+e);
    		}
    		
    	}
		else if(ut.equals("manager"))
    	{
    		query="update manager_tab set pic=? where username=?";
    		try
    	    {
    	     pstmt=con.prepareStatement(query);
    	     pstmt.setBytes(1,pic);
    	     pstmt.setString(2,un);
    	     k=pstmt.executeUpdate();
    	    }
    		catch(Exception e)
    		{
    			System.out.println("Sql panaga while image uploading"+e);
    		}
    	}
		else 
    	{
    		query="update employee_tab set pic=? where username=?";
    		try
    	    {
    	     pstmt=con.prepareStatement(query);
    	     pstmt.setBytes(1,pic);
    	     pstmt.setString(2,un);
    	     k=pstmt.executeUpdate();
    	    }
    		catch(Exception e)
    		{
    			System.out.println("Sql panaga while image uploading"+e);
    		}
    	}
	}
	
	public byte[] getImageByUsername(String un,String ut)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		byte[] pic=null;
		System.out.println("username="+un+" "+ut);
		if(ut.equals("admin"))
    	{
			query="select pic from admin_tab where aid=1";
			try
		    {
		             pstmt=con.prepareStatement(query);
		             rs=pstmt.executeQuery();
		             if(rs.next())
		             {
		    	          pic=rs.getBytes(1);
		             }
		    }
			catch(Exception e)
			{
				System.out.println("Sql panaga while image uploading"+e);
			}
    	}
    	if(ut.equals("manager"))
    	{
    		query="select pic from manager_tab where username=?";
    		try
    	    {
    	             pstmt=con.prepareStatement(query);
    	             pstmt.setString(1,un);
    	             rs=pstmt.executeQuery();
    	             if(rs.next())
    	             {
    	    	          pic=rs.getBytes(1);
    	              }
    	    }
    		catch(Exception e)
    		{
    			System.out.println("Sql panaga while image uploading"+e);
    		}
    	}
    	if(ut.equals("employee"))
    	{
    		query="select pic from Employee_tab where username=?";
    		try
    	    {
    	             pstmt=con.prepareStatement(query);
    	             pstmt.setString(1,un);
    	             rs=pstmt.executeQuery();
    	             if(rs.next())
    	             {
    	    	          pic=rs.getBytes(1);
    	              }
    	     }
    		catch(Exception e)
    		{
    			System.out.println("Sql panaga while image uploading"+e);
    		}
    		}
    
		return pic;
    }
	public int uploadPic(byte[] pic)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			query="insert into imagestab values(?)";
    		try
    	    {
    	     pstmt=con.prepareStatement(query);
    	     pstmt.setBytes(1,pic);
    	     k=pstmt.executeUpdate();
    	    }
    		catch(Exception e)
    		{
    			System.out.println("Sql panaga while image uploading"+e);
    		}
    		return k;
     }
}