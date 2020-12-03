package net.cew.business;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryption 
{
	public static String getEncryptedPassword(String plainpassword)
	{
		System.out.println("password"+plainpassword);
		MessageDigest md=null;
		try
		{
			md=MessageDigest.getInstance("MD5");
		}
		catch(NoSuchAlgorithmException e)
		{
		  System.out.println("Encrypted password exception");
		}
		md.update(plainpassword.getBytes(),0,plainpassword.length());
		BigInteger bi=new BigInteger(1,md.digest());
		String encpass=bi.toString(16);
		return encpass;
	}

}
