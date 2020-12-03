package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.EventTO;



public class EventDAO {
	PreparedStatement pstmt;
	Connection con;
	String query;
	ResultSet rs;
	public int addEvent(EventTO e)
    {
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int flag=0;
		query="insert into event_tab (date,title,venue,time,duration,description,shownto,addedby) values(?,?,?,?,?,?,?,?)";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		  pstmt.setDate(1,new java.sql.Date(e.getDate().getTime()));
          pstmt.setString(2,e.getTitle());
          pstmt.setString(3,e.getVenue());
          pstmt.setString(4,e.getTime());
          pstmt.setString(5,e.getDuration());
          pstmt.setString(6,e.getDescription());
          pstmt.setString(7,e.getShownto());
          pstmt.setString(8,e.getAddedby());
          flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println("add events  Sql panga"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
	public  ArrayList<EventTO>ViewEventThroughEventDAO(String ut)
	{
		ResultSet rst;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			ArrayList<EventTO> event=new ArrayList<EventTO>();
			EventTO t=null;
			
			query="select * from event_tab";
			try
			{
				pstmt=con.prepareStatement(query);
				rst=pstmt.executeQuery();
				while(rst.next())
				{
					String temp=rst.getString(8);
					String shownto[]=temp.split(" ");
					for(String i:shownto)
					{
						System.out.println("****"+i);
				        if(i.equals(ut))
				        {
						 t=new EventTO(rst.getInt(1),rst.getDate(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9));
	 				  	 event.add(t);
				        }
				   }
				
		
				}
			}
			catch(SQLException e)
			{
				System.out.println("panga in eventdao"+e);
			}
			finally{c.freeConnection(con);}
			return event;
	}
public  ArrayList<EventTO> ViewModiyToEventThroughEventDAO(String un)
{
		ResultSet rst;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			ArrayList<EventTO> event=new ArrayList<EventTO>();
			EventTO t=null;
			
			query="select * from event_tab where addedby=?";
			try
			{
				pstmt=con.prepareStatement(query);
				pstmt.setString(1,un);
				rst=pstmt.executeQuery();
				while(rst.next())
				{
						t=new EventTO(rst.getInt(1),rst.getDate(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9));
						event.add(t);
				}
			}
			catch(SQLException e)
			{
				System.out.println("panga in eventdao"+e);
			}
			finally{c.freeConnection(con);}
			return event;
}
    public EventTO viewEventDescription(int eventid)
    {
    	EventTO eto=null;
    	ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
	    query="";
    	
    	return eto;
    }
	public EventTO ModifyEventThroughEventDAO(int evtid)
	{
		ResultSet rst;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
	
		EventTO t=null;
		query="select * from event_tab where eventid=?";
		try
		{
			pstmt=con.prepareStatement(query);
			 pstmt.setInt(1,evtid);
			rst=pstmt.executeQuery();
			if(rst.next())
			{
			    t=new EventTO(rst.getInt(1),rst.getDate(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9));
	
			}
		}
		catch(SQLException e)
		{
			System.out.println("panga in eventdao while modifying events "+e);
		}
		finally{c.freeConnection(con);}
		return t;
	}
	public int updateEventInEventDAO(EventTO e)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int flag=0;
		query="update event_tab set date=?,title=?,venue=?,time=?,duration=?,description=? where eventid=?";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		  
		  pstmt.setDate(1,new java.sql.Date(e.getDate().getTime()));
          pstmt.setString(2,e.getTitle());
          pstmt.setString(3,e.getVenue());
          pstmt.setString(4,e.getTime());
          pstmt.setString(5,e.getDuration());
          pstmt.setString(6,e.getDescription());
          pstmt.setInt(7,e.getEventid());
          flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println(" Sql panga in update events"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
}

