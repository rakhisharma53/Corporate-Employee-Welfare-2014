package net.cew.business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations 
{
	public static int mobileValidation(String mno)
	{
        Pattern p1=Pattern.compile("[7-9][0-9]........");
	    Matcher m1=p1.matcher(mno);
	    if(m1.find())
	    {
	    	return Constants.VALID;
    		
  	    }
	    else
	    {
	    	return Constants.NOVALID;
    		   
	    }
	 }

}
