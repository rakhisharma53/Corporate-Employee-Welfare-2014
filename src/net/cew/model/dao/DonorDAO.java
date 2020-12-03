package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.DonorTO;
import net.cew.model.to.ManagerTO;

public class DonorDAO {
	PreparedStatement pstmt;
	Connection con;
	String query;
	String  flag;
	public ArrayList<DonorTO> viewDonor(String donor)
	{
		ResultSet rst;
		ArrayList<DonorTO> al=new ArrayList<DonorTO>();
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
        DonorTO dto=new DonorTO();
        query="select m_id,name,mobileno from manager_tab where bloodgroup=?";
		try 
		{
			pstmt=con.prepareStatement(query);
			
			pstmt.setString(1,donor);
			rst=pstmt.executeQuery();
			while(rst.next())
			{
			  dto=new DonorTO(rst.getString(1),rst.getString(2),rst.getLong(3),donor,"Manager");
			  al.add(dto);
			}
		}
		catch(Exception e){System.out.println("Sql Panga while viewing  manager donor"+e);}
		 query="select employeeid,name,mobileno from employee_tab where bloodgroup=?";
			try 
			{
				pstmt=con.prepareStatement(query);
				
				pstmt.setString(1,donor);
				rst=pstmt.executeQuery();
				while(rst.next())
				{
				  dto=new DonorTO(rst.getString(1),rst.getString(2),rst.getLong(3),donor,"Employee");
				  al.add(dto);
				}
			}
			catch(Exception e){System.out.println("Sql Panga while viewing Employee donor "+e);}
			
		finally{c.freeConnection(con);}
		return al;
	
	}
	
}

