package net.cew.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.cew.business.AdminLogics;
import net.cew.business.PasswordEncryption;
import net.cew.factory.ConnectionPool;
import net.cew.model.to.ManagerTO;

public class AdminDAO
{
    public int registerManager(ManagerTO m)
    {
        System.out.println("Admin Dao");
    	Connection con=null;
    	ResultSet rs=null;
    	String m_id=null;
    	PreparedStatement pstmt=null;
    	int code=0;
    	int flag=0;
       ConnectionPool p=new ConnectionPool();
       //System.out.println("Connection Established");
   	
       try
       {
           //generate password
    	   con=p.getConnection1();
           
    	   pstmt=con.prepareStatement("select * from generatepassword_tab");
           rs=pstmt.executeQuery();
           
           if(rs.last())
           {
        	   code=rs.getInt(1);
           }
           else
           {
        	   code=0;        	   
           }
           System.out.println("code="+code);
       	
           AdminLogics al=new AdminLogics();
           m.setPassword(PasswordEncryption.getEncryptedPassword(al.generatePassword(m.getName(),m.getDepartment(),code)));
           
           
           //insert code
           pstmt=con.prepareStatement("insert into generatepassword_tab values(code)");
           pstmt.executeUpdate();
           
           
           //generate user Name
           pstmt=con.prepareStatement("select m_id from manager_tab");
           rs=pstmt.executeQuery();
           if(rs.last())
           {
        	   m_id=rs.getString(1);
           }
           else
           {
        	   m_id="CEW1000";
           }
           m_id=al.generateManagerId(m_id);
           System.out.println("id="+m_id);
           m.setM_id(m_id);
           m.setUsername(m_id);
           pstmt=con.prepareStatement("insert into manager_tab (m_id,name,emailid,username,password,department) values(?,?,?,?,?,?)");
           pstmt.setString(1,m.getM_id());
           pstmt.setString(2,m.getName());
           pstmt.setString(3,m.getEmailid());
           pstmt.setString(4,m.getUsername());
           pstmt.setString(5,m.getPassword());
           pstmt.setString(6,m.getDepartment());
           flag=pstmt.executeUpdate();
       }
       catch(SQLException e)
       {
           System.out.println("Admin Dao Sql Panga"+e);

       }
       return flag;
    }
    
}
