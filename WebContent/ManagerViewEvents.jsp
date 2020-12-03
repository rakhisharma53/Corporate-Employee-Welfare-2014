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
          <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="ViewVacancyServlet"><span><span>Vacancy</span></span></a></li>
          <li class="active"><a href="ViewEventServlet"><span><span>Events</span></span></a></li>
          <li class="active"><a href="BloodDonorRegistrationByManager.jsp"><span><span>Donor Registration</span></span></a></li>
          <li class="active"><a href="TechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Employee</span></span></a></li>
          <li class="active"><a href="ViewMessageSendByAdminServlet"><span><span>Messages</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>LeavesRequest</span></span></a></li>
          <li class="active"><a href="EditManagerProfile.jsp"><span><span>Edit Profile</span></span></a></li>
          <li class="active"><a href="LogoutServlet"><span><span>Logout</span></span></a></li>
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
      <div class="mainbar">
        <div class="article">
        <form name="vieweventsform" >
        <fieldset>
        <legend> <h2> View Events </h2></legend>
          
          <table  border="2"  cellspacing="5"cellpadding="5">
          <tr>
<th>date</th><th>title</th><th>venue</th><th>time</th><th>duration</th><th>description</th>
</tr>
<c:forEach var="i" items="${eventatt}">
	<tr>
		<td>${i.date}</td>
		<td>${i.title}</td>
		<td>${i.venue}</td>
		<td>${i.time}</td>
		<td>${i.duration}</td>
		<td>${i.description}</td>

	</tr>
</c:forEach>
            
            </table>
          </fieldset>
         </form>
          </div>
          </div>
          </div>
          </div>
          </div>
</body>
</html>