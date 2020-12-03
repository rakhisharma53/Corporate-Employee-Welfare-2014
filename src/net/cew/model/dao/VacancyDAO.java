package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.cew.factory.ConnectionPool;
import net.cew.model.to.VacancyTO;

public class VacancyDAO {
	PreparedStatement pstmt;
	Connection con;
	String query;
	public int addVacancy(VacancyTO v)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int flag=0;
		query="insert into vacancy_tab (jobtitle,qualification,experience,noofvacancy,package,date) values(?,?,?,?,?,?)";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		  pstmt.setString(1,v.getJobtitle());
          pstmt.setString(2,v.getQualification());
          pstmt.setString(3,v.getExperience());
          pstmt.setInt(4,v.getNoofvacancy());
          pstmt.setFloat(5,v.getPackage1());
          pstmt.setDate(6,new java.sql.Date(v.getDate().getTime()));
        
          flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println("Sql panga in adding  vacancy"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
	public ArrayList<VacancyTO> ViewVacancyThroughVacancyDAO()
	{
		ResultSet rst;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			ArrayList<VacancyTO> vacancy=new ArrayList<VacancyTO>();
			VacancyTO v=null;
			query="select* from vacancy_tab order by date desc";
			try
			{
				pstmt=con.prepareStatement(query);
				rst=pstmt.executeQuery();
				while(rst.next())
				{
					v=new VacancyTO(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getFloat(6),rst.getDate(7));
					vacancy.add(v);
				}
			}
			catch(SQLException e)
			{
				System.out.println("panga in vacanvydao"+e);
			}
			finally{c.freeConnection(con);}
			return vacancy;
	}
	public VacancyTO ViewVacancyUsingVacancyId(int vid)
	{
		ResultSet rst;
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
			ArrayList<VacancyTO> vacancy=new ArrayList<VacancyTO>();
			VacancyTO v=null;
			query="select * from vacancy_tab where vacancyid=? order by vacancyid desc";
			try
			{
				pstmt=con.prepareStatement(query);
				pstmt.setInt(1,vid);
				rst=pstmt.executeQuery();
				while(rst.next())
				{
					v=new VacancyTO(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getInt(5),rst.getFloat(6),rst.getDate(7));
				}
			}
			catch(SQLException e)
			{
				System.out.println("panga in vacanvydao"+e);
			}
			finally{c.freeConnection(con);}
			return v;
	}
	public int modifyVacancy(VacancyTO v)
	{
		ConnectionPool c=new ConnectionPool();
		con=c.getConnection1();
		int flag=0;
		query="update vacancy_tab set jobtitle=?,qualification=?,experience=?,noofvacancy=?,package=?,date=? where vacancyid=?";
	  try
	  {
		  pstmt=con.prepareStatement(query);
		  pstmt.setString(1,v.getJobtitle());
          pstmt.setString(2,v.getQualification());
          pstmt.setString(3,v.getExperience());
          pstmt.setInt(4,v.getNoofvacancy());
          pstmt.setFloat(5,v.getPackage1());
          pstmt.setDate(6,new java.sql.Date(v.getDate().getTime()));
          pstmt.setInt(7,v.getVacancyid());
        
          flag=pstmt.executeUpdate();
	  }
	  catch(SQLException e1){System.out.println("Sql panga in adding  vacancy"+e1);} 
	  finally{c.freeConnection(con);}
	  return flag;
	}
	
}
