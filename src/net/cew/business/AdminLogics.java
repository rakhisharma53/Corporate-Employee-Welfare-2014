package net.cew.business;

public class AdminLogics 
{
	public static String generatePassword(String mn,String department,int code)
	{
		System.out.println("Password Logics");
    	
		String password=null;
		mn=mn.substring(0,3);
		department=department.substring(0,3);
		code=code+3;
		
		password=mn+code+department;
		return password;
	}
	
	public static String generateManagerId(String m_id)
	{
		System.out.println("ManagerID Logics");
    	
		int un =Integer.parseInt(m_id.substring(3));
		un++;
		m_id="CEW"+un;
		return m_id;
		
	}
}
