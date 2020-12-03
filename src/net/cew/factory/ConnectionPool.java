package net.cew.factory;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionPool
{
	Connection con;
	DataSource ds;
	public ConnectionPool()
	{
     	try
	    {
	       InitialContext ic=new InitialContext();
	       ds=(DataSource) ic.lookup("java:comp/env/jdbc/mysql");
	     }
	    catch(Exception e)
	     {
	    	  System.out.println("Connection Pool Constructor Exception");
	      	
	      }
	}
	public Connection getConnection1()
	{
		try
		{
			con=ds.getConnection();
			
		}
		catch(Exception e)
		{
			  System.out.println("Connection Pool getConnection Exception");	
		}
		return con;
	}
	public void freeConnection(Connection con)
	{
		try
		{
			con.close();
		}
		catch(Exception e)
		{
			  System.out.println("Free connection Pool Exception");
		    	
		}	
	}
}
