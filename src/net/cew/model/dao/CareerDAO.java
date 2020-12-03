package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.CareerTO;

public class CareerDAO
{
	Connection con;
	PreparedStatement pstmt;
	ResultSet rst;
	
	public int saveCareerInformationInDB(String dbpath,String description,String  filename)
	{
		int k=0;
		try
		{
			con=new ConnectionPool().getConnection1();
			pstmt=con.prepareStatement("insert into careeruploads (uploads,description,filename) values(?,?,?)");
			
			pstmt.setString(1,dbpath);
			pstmt.setString(2,description);
			pstmt.setString(3,filename);
			k=pstmt.executeUpdate();
			if(k>0)
				System.out.println("Career Detail Saved.....");
		}
		catch(Exception e)
		{
			System.out.println("SQL Panga While Career Uploaded : "+e);
		}

     return k;		
	}
	public ArrayList<CareerTO> showCareerFile()
	{
		System.out.println("career dao");
		ArrayList<CareerTO> alist=new ArrayList<CareerTO>();
	   con=new ConnectionPool().getConnection1();
	   try
	   {
	   pstmt=con.prepareStatement("select * from careeruploads");
	   rst=pstmt.executeQuery();
	   while(rst.next())
	   {
		     alist.add(new CareerTO(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4)));
	   }
	   }
	   catch(Exception e)
	   {
		   System.out.println("panga in show career dao");
	   }
	   return alist;
	
	}

}
