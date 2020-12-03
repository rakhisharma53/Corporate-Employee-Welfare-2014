package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.BulletinTO;

public class BulletinDAO {
	PreparedStatement pstmt;
	Connection con;
	String query;
	ResultSet rs;
	
	public int addBulletinViaBulletinDAO(BulletinTO b)
    {
		System.out.println("add bulletin dao");
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int flag=0;
		query="insert into bulletin_tab (date,bulletin) values(?,?)";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		  pstmt.setDate(1,new java.sql.Date(b.getDate().getTime()));
          pstmt.setString(2,b.getBulletin());
           flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println("Sql panga in adding buletin "+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
	
	public ArrayList<BulletinTO> viewBulletinViaBulletinDAO()
	{
		
		System.out.println("in view bulletin Dao ");
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		ArrayList<BulletinTO> bulletlist=new ArrayList<BulletinTO>();
		query="select * from bulletin_tab";
		try
		{
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getDate(2)+" "+rs.getString(3));
			    bulletlist.add(new BulletinTO(rs.getInt(1),rs.getDate(2),rs.getString(3)));
			}	
			System.out.println("after making list");
		}
		catch(SQLException e)
		{
			System.out.println("view Bulltein SQL panga");
		}
		return bulletlist;
	}
}
