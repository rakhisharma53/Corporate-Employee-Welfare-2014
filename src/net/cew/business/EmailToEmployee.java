package net.cew.business;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailToEmployee {
	public void sendEmail(String receiver_id,String password,String username,String name )
	{
		try
	     {
	    	//PrintWriter out			=	response.getWriter();
	        
	        Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
			{
				protected PasswordAuthentication getPasswordAuthentication() 
					{
						return new PasswordAuthentication("cew6sem@gmail.com","@cew6sem");
					}
			});

			try 
			{
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("cew6sem@gmail.com"));
				message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(receiver_id));
				message.setSubject("Verification Mail");
				message.setText("Welcome: "+name+" \nyou are registered in our company as an employee. \n\n\n you username:  "+username+"\n\n\n\n your Password:"+password);

				Transport.send(message);
				
				System.out.println("Thanks! Your mail has been sent!");
				System.out.println("Done");

			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
	    }catch (Exception e) {
	    	e.printStackTrace();
		}
	
					
			
		}
}
