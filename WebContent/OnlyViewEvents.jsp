<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script type="text/javascript" src="js/CewJS.js"></script>
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <!-- <li><a href="index.html"><span><span>Home</span></span></a></li>
          <li><a href="support.html"><span><span>Support</span></span></a></li>
          <li class="active"><a href="about.html"><span><span>About Us</span></span></a></li>
        <li><a href="contact.html"><span><span>Contact Us</span></span></a></li>-->
         <li><a href="index.jsp"><span><span>Logout</span></span></a></li>
        </ul>
      </div>
      <div class="clr"></div>
      <div class="logo">
        <h1><a href="index.html">Corporate Employee Welfare<br/>
          <small>Share Thoughts, Gain More</small></a></h1>
      </div>
      <div class="clr"></div>
      <img src="images/image.jpg" width="930" height="160" alt="" />
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar" >
        <div class="article" >
        <h2>Events</h2>
        <c:forEach var="i" items="${eventatt}">
        <div style="border:2px solid #a1a1a1; padding:10px 40px;background:rgb(169,216,250);width:550px;border-radius:25px;">
        	<b>	<a href="EventDescriptionServlet?eventid=${i.eventid}&date=${i.date}&venue=${i.venue}&time=${i.time}&duration=${i.duration}&description=${i.description}&title=${i.title}" style="color:black">${i.title}</a></b>
        </div>
        
        </c:forEach>
            
          </div>
          </div>
          </div>
          </div>
          </div>
</body>
</html>