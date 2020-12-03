package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.LeaveTO;

public class LeaveDAO
{
	PreparedStatement pstmt;
	Connection con;
	String query;
	ResultSet rs;
	public int applyForLeave(LeaveTO leave)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int flag=0;
		
     query="insert into empleave_tab(uid,fromdate,todate,days,reason,usertype) values(?,?,?,?,?,?)";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		  pstmt.setString(1,leave.getUsername());
		  pstmt.setDate(2,new java.sql.Date(leave.getFrom().getTime()));
		  pstmt.setDate(3,new java.sql.Date(leave.getTo().getTime()));
          pstmt.setInt(4,leave.getDays());
          pstmt.setString(5,leave.getReason());
          pstmt.setString(6,leave.getUsertype());
          //pstmt.setString(7,leave.getName());
          flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println("apply for leave Sql panga"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
	
		
   public ArrayList<LeaveTO> ViewLeaveByManagerThroughLeaveDAO(String usertype)
	{
		ResultSet rst;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			ArrayList<LeaveTO> leave=new ArrayList<LeaveTO>();
           LeaveTO l=null;
           if(usertype.equals("admin"))
           {
			query="select* from empleave_tab where status='pending' and usertype='manager'";
           }
           else if(usertype.equals("manager"))
           {		
        	   query="select* from empleave_tab where status='pending' and usertype='employee'";     
           }
           else
           {
        	   
           }
			try
			{
				pstmt=con.prepareStatement(query);
				rst=pstmt.executeQuery();
				while(rst.next())
				{
					l=new LeaveTO(rst.getInt(1),rst.getString(2),rst.getDate(3),rst.getDate(4),rst.getInt(5),rst.getString(6),rst.getString(7));
					leave.add(l);
				}
			}
			catch(SQLException e)
			{
				System.out.println("panga in eventdao"+e);
			}
			finally{c.freeConnection(con);}
			return leave;
}
	public LeaveTO ViewLeaveByManagerWithFormatViaEventDAO(int leaveid)
	{
		ResultSet rst;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
	
		LeaveTO l=null;
		query="select* from empleave_tab where empleaveid=?";
		try
		{
			pstmt=con.prepareStatement(query);
			 pstmt.setInt(1,leaveid);
			rst=pstmt.executeQuery();
			if(rst.next())
			{
			    l=new LeaveTO(rst.getInt(1),rst.getString(2),rst.getDate(3),rst.getDate(4),rst.getInt(5),rst.getString(6),rst.getString(7));
			}
		}
		catch(SQLException e)
		{
			System.out.println("panga in leavedao while view leaves "+e);
		}
		finally{c.freeConnection(con);}
		return l;
	}
	
	
	public int AcceptOrRejectByManager(int leaveid,String status)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
				int flag=0;
		query="update empleave_tab set status=? where empleaveid=?";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		 
          pstmt.setString(1,status);
          pstmt.setInt(2,leaveid);
          flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println(" Sql panga in leavedao while rejecting leave"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
	
	public ArrayList<LeaveTO> ViewLeaveByEmpThroughLeaveDAO(String username)
	{
		ResultSet rst;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			ArrayList<LeaveTO> leave=new ArrayList<LeaveTO>();
			LeaveTO l=null;
			query="select* from empleave_tab where uid=?";
			try
			{
				pstmt=con.prepareStatement(query);
				pstmt.setString(1,username);
				rst=pstmt.executeQuery();
				while(rst.next())
				{
					l=new LeaveTO(rst.getInt(1),rst.getString(2),rst.getDate(3),rst.getDate(4),rst.getInt(5),rst.getString(6),rst.getString(7));
					leave.add(l);
				}
			}
			catch(SQLException e)
			{
				System.out.println("panga in leavedao"+e);
			}
			finally{c.freeConnection(con);}
			return leave;
	}
	public int updateMaximumLeave(int maxleave)
	{
         System.out.println("Max Leave DAO");
		ConnectionPool c=new ConnectionPool();
		int flag=0;
		con=c.getConnection1();
			query="update maxleave_tab set max_leave=?";
			try
			{
				pstmt=con.prepareStatement(query);
				pstmt.setInt(1,maxleave);
				flag=pstmt.executeUpdate();
			}
			catch(SQLException e)
			{
				System.out.println("panga in leavedao"+e);
			}
			finally{c.freeConnection(con);}
			return flag;
	}
	public int pendingLeaves(String username)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int leavetaken=0;
		int maxleave=0;
		int pendingleave=0;
		query="select sum(days) from empleave_tab where uid=? and status='Accepted'";
		try
		{
			pstmt=con.prepareStatement(query);
			pstmt.setString(1,username);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				leavetaken=rs.getInt(1);
			}
			
			query="select * from maxleave_tab";
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				maxleave=rs.getInt(1);
			}
			pendingleave=maxleave-leavetaken;		
			System.out.println(leavetaken+"   "+maxleave+"     "+pendingleave);
		}
		catch(Exception e)
		{
			System.out.println("checking pending leaves Exception");
		}
		return pendingleave; 
	}
}

