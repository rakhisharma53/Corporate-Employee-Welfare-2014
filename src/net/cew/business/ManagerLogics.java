package net.cew.business;

public class ManagerLogics {
	public String generatePasswordForEmp(String mn,int code)
	{
		System.out.println("Password Logics in manager logics");
    	
		String password=null;
		mn=mn.substring(0,3);
		code=code+3;
		
		password=mn+code;
		return password;
	}
	
	public String generateEmployeeId(String e_id)
	{
		System.out.println("ManagerID Logics");
    	
		int un =Integer.parseInt(e_id.substring(3));
		un++;
		e_id="CEW"+un;
		return e_id;
		
	}
}
