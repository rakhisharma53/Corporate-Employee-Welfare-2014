package net.cew.business;

import java.util.Date;

public class NoOfDays {
	public long calculateNoOfDays(Date d1,Date d2) 
	{
	
        	long l=d1.getTime();
		     System.out.println(l);
           long l1=d2.getTime();
		     System.out.println(l1);
		   long ml=l1-l;
		   long days=ml/1000/60/60/24;
		   System.out.println("Days= "+days);
         return days;

	}
}
