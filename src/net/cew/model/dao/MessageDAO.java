package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.MessageTO;

public class MessageDAO {
	PreparedStatement pstmt;
	Connection con;
	String query;
    
    ResultSet rs;
	
	public ArrayList<MessageTO> viewInbox(String uname)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			ArrayList<MessageTO> message=new ArrayList<MessageTO>();
			MessageTO m=null;
		//	query="select name from manager_tab where username=? or select name from"
			query="select* from message_tab where reciever=? order by msgid desc";
			try
			{
				pstmt=con.prepareStatement(query);
				pstmt.setString(1,uname);
				rs=pstmt.executeQuery();
				while(rs.next())
				{
					m=new MessageTO(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7));
					message.add(m);
				}
			}
			catch(SQLException e)
			{
				System.out.println("panga in inbox dao"+e);
			}
			finally{c.freeConnection(con);}
			return message;
	}
	public ArrayList<MessageTO> viewSentItems(String uname)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			ArrayList<MessageTO> message=new ArrayList<MessageTO>();
			MessageTO m=null;
		//	query="select name from manager_tab where username=? or select name from"
			query="select* from sentmessage_tab where sender=? order by msgid desc";
			try
			{
				pstmt=con.prepareStatement(query);
				pstmt.setString(1,uname);
				rs=pstmt.executeQuery();
				while(rs.next())
				{
					m=new MessageTO(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7));
					message.add(m);
				}
			}
			catch(SQLException e)
			{
				System.out.println("panga in sentitemdao"+e);
			}
			finally{c.freeConnection(con);}
			return message;
	}
	public int sendMessage(MessageTO m)
    {
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int flag=0;
		query="insert into message_tab (date,title,description,sender,reciever,msgstatus) values(?,?,?,?,?,?)";
	  try
	  {
		  System.out.println(m.getMessagedescription()+" "+m.getMessagetitle()+" "+m.getReciever()+" "+m.getSender());
		  pstmt=con.prepareStatement(query);
		  pstmt.setDate(1,new java.sql.Date(m.getDate().getTime()));
          pstmt.setString(2,m.getMessagetitle());
          pstmt.setString(3,m.getMessagedescription());
          pstmt.setString(4,m.getSender());
          pstmt.setString(5,m.getReciever());        
          pstmt.setBoolean(6,m.isMsgstatus());
        
          flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println("Sql panga while sndig msg by manager in msg dao"+e1);} 


		query="insert into sentmessage_tab (date,title,description,sender,reciever,msgstatus) values(?,?,?,?,?,?)";
		  try
		  {
			  System.out.println(m.getMessagedescription()+" "+m.getMessagetitle()+" "+m.getReciever()+" "+m.getSender());
			  pstmt=con.prepareStatement(query);
			  pstmt.setDate(1,new java.sql.Date(m.getDate().getTime()));
	          pstmt.setString(2,m.getMessagetitle());
	          pstmt.setString(3,m.getMessagedescription());
	          pstmt.setString(4,m.getSender());
	          pstmt.setString(5,m.getReciever());        
	          pstmt.setBoolean(6,m.isMsgstatus());
	        
	          flag=pstmt.executeUpdate();
		  }

	  catch(SQLException e1){System.out.println("Sql panga while sndig msg by manager in msg dao"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
}
public int checkValidUser(MessageTO m)
{
	ConnectionPool c=new ConnectionPool();
	con=c.getConnection1();
	int flag=0;
	query="select * from manager_tab where username=?";
    try
    {
    	pstmt=con.prepareStatement(query);
    	pstmt.setString(1,m.getReciever());
    			
    	rs=pstmt.executeQuery();
    	if(rs.next())
    	{
    		flag++;
    	}
    }
    catch(SQLException e)
    {
    	System.out.println("SQL panga while checking user validity");
    }
    query="select * from employee_tab where username=?";
    try
    {
    	pstmt=con.prepareStatement(query);
    	pstmt.setString(1,m.getReciever());
    	rs=pstmt.executeQuery();
    	if(rs.next())
    	{
    		flag++;
    	}
    }
    catch(SQLException e)
    {
    	System.out.println("SQL panga while checking user validity");    	
    }
  	return flag;
}
public MessageTO fetchMessageDescription(MessageTO mto)
{
	System.out.println("inside fetch description dao");
	ConnectionPool c=new ConnectionPool();
	con=c.getConnection1();
    query="select * from message_tab where msgid=?";
    try
    {
    	pstmt=con.prepareStatement(query);
    	pstmt.setInt(1,mto.getMsgid());
    	rs=pstmt.executeQuery();
    	while(rs.next())
    	{
    		mto=new MessageTO(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7));
	    }
    }
    catch(SQLException e)
    {
    	System.out.println("sql panga while fetching message description");
    }    
	return mto;
}
public MessageTO fetchSentMessageDescription(MessageTO mto)
{
	System.out.println("inside fetch description dao");
	ConnectionPool c=new ConnectionPool();
	con=c.getConnection1();
    query="select * from sentmessage_tab where msgid=?";
    try
    {
    	pstmt=con.prepareStatement(query);
    	pstmt.setInt(1,mto.getMsgid());
    	rs=pstmt.executeQuery();
    	while(rs.next())
    	{
    		mto=new MessageTO(rs.getInt(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBoolean(7));
	    }
    }
    catch(SQLException e)
    {
    	System.out.println("sql panga while fetching message description");
    }    
	return mto;
}

public void updateStatus(MessageTO mto)
{
	System.out.println("inside update status dao");
	ConnectionPool c=new ConnectionPool();
	con=c.getConnection1();
    try
    {
    	query="update message_tab set msgstatus=? where msgid=?";
    	pstmt=con.prepareStatement(query);
    	pstmt.setBoolean(1,false);
    	pstmt.setInt(2,mto.getMsgid());
    	pstmt.executeUpdate();
    }
    catch(SQLException e)
    {
    	System.out.println("sql panga while fetching message description");
    }
 }

 public int ReadMessageByManagerViaMessageDAO(int msgid,Boolean status)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		MessageTO l=new MessageTO();
		int flag=0;
		System.out.println("msgid in dao:"+msgid+"status in dao:"+status);
	 query="update message_tab set msgstatus=? where msgid=?";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		 
       pstmt.setBoolean(1,status);
      pstmt.setInt(2,msgid);
       flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println(" Sql panga in messagedao while read msg(change status)"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
 public int checkMessageCount(String m)
    {
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int newmessages=0;
	    query="select count(*) from message_tab where msgstatus=1 and reciever=?";
	    try
	    {
	    	pstmt=con.prepareStatement(query);
	    	pstmt.setString(1,m);
	    	rs=pstmt.executeQuery();
	    	if(rs.next())
	    	{	    
	    	   newmessages=rs.getInt(1);
	    	}
	    }
	    catch(SQLException e)
	    {
	    	System.out.println("panga in message count dao");
	    }
	    return newmessages;
    }
 public int deleteMessages(int[] messages)
 {
	 ConnectionPool c=new ConnectionPool();
	 con=c.getConnection1();
	 int flag=0;
	 try
	 {
	 pstmt=con.prepareStatement("Delete from message_tab where msgid=?");
		for(int i:messages)
			{
			System.out.println(":"+i);
				pstmt.setInt(1,i);
				flag=pstmt.executeUpdate();
			}
	 }
	 catch(Exception e)
	 {
		 System.out.println("Message Delete DAO Panga");
	 }
		return flag;
   }

 
public int deleteSentMessages(int[] messages)
 {
	 ConnectionPool c=new ConnectionPool();
	 con=c.getConnection1();
	 int flag=0;
	 try
	 {
	 pstmt=con.prepareStatement("Delete from sentmessage_tab where msgid=?");
		for(int i:messages)
			{
			System.out.println(":"+i);
				pstmt.setInt(1,i);
				flag=pstmt.executeUpdate();
			}
	 }
	 catch(Exception e)
	 {
		 System.out.println("Message Delete DAO Panga");
	 }
		return flag;
 }
}
