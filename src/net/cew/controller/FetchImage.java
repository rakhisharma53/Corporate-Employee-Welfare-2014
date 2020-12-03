package net.cew.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.cew.factory.ConnectionPool;
public class FetchImage extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("1");
		PrintWriter out=response.getWriter();
		
		File file =new File(request.getSession().getServletContext().getRealPath("/temp"));
		System.out.println(request.getSession().getServletContext().getRealPath("/temp"));
		
		File file_2 =new File(request.getSession().getServletContext().getRealPath("/thumb"));
		File[] listfile=file.listFiles();
		File[] listfile_2=file_2.listFiles();
		
		System.out.println("2");
		if(listfile!=null && listfile_2!=null)
		{
			for(int ctr=0;ctr< listfile.length;ctr++)
			{
				listfile[ctr].delete();
			}
			for(int ctr=0;ctr<listfile_2.length;ctr++)
			{
				listfile_2[ctr].delete();
			}
		}
		try
		{
			System.out.println("3");
			String url="jdbc:mysql://localhost:3306/cew";
			String user="root";
			String pass="root";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, user, pass);
			PreparedStatement stmt=conn.prepareStatement("SELECT image from imagestab");
			ResultSet rs=stmt.executeQuery();
			int i=0;
			while(rs.next())
			{
				i++;
				if(rs.getBinaryStream(1)!=null)
	    		{	 
					java.io.InputStream stream=rs.getBinaryStream(1);
				    java.io.ByteArrayOutputStream output=new java.io.ByteArrayOutputStream();
				    int a1=stream.read();
				    while(a1>=0)
				    {
					     output.write((char)a1);
					     a1=stream.read();
				    }
				    java.awt.Image img_thumb=java.awt.Toolkit.getDefaultToolkit().createImage(output.toByteArray());
				    java.awt.Image img_main=java.awt.Toolkit.getDefaultToolkit().createImage(output.toByteArray());
				    java.awt.Image img1=img_thumb.getScaledInstance(151,151,java.awt.image.BufferedImage.SCALE_SMOOTH); //thumb size
				    java.awt.Image img2=img_main.getScaledInstance(1024,1024,java.awt.image.BufferedImage.SCALE_SMOOTH); //image size
				    javax.swing.ImageIcon imageIcon = new javax.swing.ImageIcon(img1);
				    javax.swing.ImageIcon imageIcon2 = new javax.swing.ImageIcon(img2);
				    java.awt.image.BufferedImage bufferedImageIn1 = new
				    java.awt.image.BufferedImage(imageIcon.getIconWidth(),imageIcon.getIconHeight(),java.awt.image.BufferedImage.TYPE_INT_ARGB);
				    java.awt.Graphics g1 = bufferedImageIn1.getGraphics();
				    g1.drawImage(imageIcon.getImage(), 0, 0, null);
				    java.awt.image.BufferedImage bufferedImageIn2 = new
				    java.awt.image.BufferedImage(imageIcon2.getIconWidth(),imageIcon2.getIconHeight(),java.awt.image.BufferedImage.TYPE_INT_ARGB);
				    java.awt.Graphics g2 = bufferedImageIn2.getGraphics();
				    g2.drawImage(imageIcon2.getImage(), 0, 0, null);
				    String pattemp=request.getSession().getServletContext().getRealPath("/");
				    javax.imageio.ImageIO.write(bufferedImageIn1,"png",new java.io.File(pattemp+"thumb/A("+i+").png"));
				    javax.imageio.ImageIO.write(bufferedImageIn2,"png",new java.io.File(pattemp+"temp/A("+i+").png"));
	    		}
			}
			out.print(i);
			System.out.println("4");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

