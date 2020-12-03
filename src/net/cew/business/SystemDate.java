package net.cew.business;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SystemDate {
	public static Date getSystemDate()
	{
	
      Calendar c=Calendar.getInstance();
      String cdate=c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR);
      DateFormat df=new SimpleDateFormat("dd/mm/yyyy");
      Date dateobj=new Date();
      try
      {
	  System.out.println(df.parse(cdate));  
      }
      catch(Exception e)
      {
	     System.out.println("System date panga");  
      
      }
      return dateobj;
    }
}
