package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.TechnicalDroughtsTO;

public class TechnicalDroughtsDAO {
	PreparedStatement pstmt;
	ResultSet rs;
	Connection con;
	String query;
	public int addTechnicalDroughts(TechnicalDroughtsTO tdto)
	{
		System.out.print("add droughts dao");
		int flag=0;
		 
		ConnectionPool c=new ConnectionPool();
		
		con=c.getConnection1();
		System.out.print("flag");
		query="insert into technicaldroughts_tab(username,name,type,comment,date) values(?,?,?,?,?)";
		System.out.print("flag1");
	    try
		{
		System.out.println("*****************"+tdto.getComment()+" "+tdto.getName()+" "+tdto.getType());
		pstmt=con.prepareStatement(query);
		
		
		pstmt.setString(1,tdto.getUsername());
		pstmt.setString(2,tdto.getName());
		//pstmt.setString(3,tdto.getDepartment());
		pstmt.setString(3,tdto.getType());
		pstmt.setString(4,tdto.getComment());
        pstmt.setDate(5,new java.sql.Date(tdto.getDate().getTime()));
        flag=pstmt.executeUpdate();
		}
		catch(SQLException e)
		{
			System.out.println("add technical drought pangaa" +e);
		}
	    catch(Exception e)
	    {
	    	 System.out.print("Another exceptio in dao");
	    }
	   
		return flag;
	}
	
	
	
	public ArrayList<TechnicalDroughtsTO> fetchTechnicalDrought()
	{
		
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		ArrayList<TechnicalDroughtsTO> alist=new ArrayList<TechnicalDroughtsTO>();
	    query="select * from technicaldroughts_tab order by technicaldrought_id desc limit 15";
		
		try
		{
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			System.out.println("fetching droughts");
			while(rs.next())
			{
			  pstmt=con.prepareStatement("select pic from manager_tab where username=?");
			  pstmt.setString(1,rs.getString(2));
			   ResultSet rst=pstmt.executeQuery();
			   byte b[]=null;
			   if(rst.next())
			   {
				   b=rst.getBytes(1);
		       }
			  alist.add(new TechnicalDroughtsTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(6),b));	
			}
		}
		catch(Exception e)
		{
		    System.out.println("panga while fetching technical droughts"+e);	
		}
		return alist;
    }
}