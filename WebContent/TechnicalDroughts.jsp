<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<body onload="fetchTechnicalDroughts()">
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
            <c:choose>
      <c:when test="${usertype=='admin'}">
        <ul>
          <li class="active"><a href="AdminHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="AdminTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterManager.jsp"><span><span>Register Manager</span></span></a></li>
          <li class="active"><a href="AddBulletinBoard.jsp"><span><span>Bulletin Board</span></span></a></li>
          <li class="active"><a href="AddVacancy.jsp"><span><span>Vacancies</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leaves</span></span></a></li>
           </ul>
       </c:when>
       <c:otherwise>
           <c:choose>
           <c:when test="${usertype=='manager'}">
           <ul>
          <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="BloodDonorRegistrationByManager.jsp"><span><span>View Donor</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leave</span></span></a></li>
          <li class="active"><a href="EditManagerProfile.jsp"><span><span>Edit Profile</span></span></a></li>
          </ul>
           </c:when>
           <c:otherwise>
                 
           </c:otherwise>
           </c:choose>       
       </c:otherwise>
      </c:choose><div class="clr"></div>
      <div class="logo">
        <h1><a href="index.html">Corporate Employee Welfare<br />
          <small>Share Thoughts, Gain More</small></a></h1>
      </div>
      
      <div class="clr"></div>
      <img src="images/image.jpg" width="930" height="160" alt="" />
      <div class="clr"></div>
    </div>
  </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article"><br/>
          <h2>Technical Droughts</h2>
   
           <form name="commentform" >
           <fieldset style="color:rgb(65,154,250);border-color:3;">
          <legend>  Enter your Comment</legend>
          <table>
          <tr><td>Comments:</td><td><textarea rows="3" cols="100" name="comment"></textarea></td></tr>     
          <tr><td><input type="button" value="Submit" onclick="goingToAddTechnicalDroughtsViaJS()"/></td></tr>
          <tr><td><span id="addmessagespan"></span> </td></tr>
          </table>
          </fieldset>       
         </form>
   <div id="droughtsarea" >
   
    </div>     
         
</div>
        </div>
      <div class="sidebar">
        
        </div>
</div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="clr"></div>
    </div>
  </div>
 </div>
</body>
</html>