<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Corporate Employee Welfare | Contact</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/CewJS.js"></script>

<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
</head>
<body >
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="AdminHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="TechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterManager.jsp"><span><span>Register Manager</span></span></a></li>
          <li class="active"><a href="AddBulletinBoard.jsp"><span><span>Bulletin Board</span></span></a></li>
          <li class="active"><a href="AddVacancy.jsp"><span><span>Vacancies</span></span></a></li>
          <li class="active"><a href="LogoutServlet"><span><span>Logout</span></span></a></li>
      </ul>
      </div>
      <div class="clr"></div>
      <div class="logo">
        <h1><a href="index.html">Corporate Employee Welfare<br />
          <small>Share Thoughts, Gain More</small></a></h1>
      </div>
      <div class="clr"></div>
      <img src="images/image.jpg" width="930" height="160" alt="" />
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar" class="fbg_resize">
           <div class="article" >
           <div class="round">
        <h2>Message</h2>
        <table>
        <tr><td>From: </td><td>${msgdescriptionatt.sender}</td></tr>
        <tr><td>Date: </td><td>${msgdescriptionatt.date}</td></tr>
        <tr style="height:30px"><td>Description:</td></tr>
         <tr><td></td><td>  ${msgdescriptionatt.messagedescription}    </td></tr>
        </table>
      </div>
      </div>
      </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star"><span></span> Message</h2>
          <c:choose>
          <c:when test="${usertype=='admin'}">
                   <ul class="sb_menu">
                     <li><a href="AdminMessage.jsp">Create new Message</a></li>
                     <li><a href="AdminInbox.jsp">InBox</a></li>
                     <li><a href="AdminSentItems.jsp">Sent Items</a></li>
                   </ul>
           </c:when >
          <c:otherwise>
          <c:choose>
          <c:when test="${usertype=='manager'}">
                   <ul class="sb_menu">
                     <li><a href="ManagerMessage.jsp">Create new Message</a></li>
                     <li><a href="ManagerInbox.jsp">InBox</a></li>
                     <li><a href="ManagerSentItems.jsp">Sent Items</a></li>
                   </ul>
           </c:when>
           <c:otherwise>
                <ul class="sb_menu">
                     <li><a href="EmployeeMessage.jsp">Create new Message</a></li>
                     <li><a href="EmployeeInbox.jsp">InBox</a></li>
                     <li><a href="EmployeeSentItems.jsp">Sent Items</a></li>
                   </ul>
          </c:otherwise>
          </c:choose>
          </c:otherwise>
          </c:choose>
        </div>
        <div class="gadget">
          <ul class="ex_menu">
          </ul>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
      </div>
      <div class="col c2">
        <ul class="sb_menu">
        </ul>
      </div>
      <div class="col c3">
       </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <ul class="fmenu">
      <li class="active"><a href="AdminHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="TechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterManager.jsp"><span><span>Register Manager</span></span></a></li>
          <li class="active"><a href="AddBulletinBoard.jsp"><span><span>Bulletin Board</span></span></a></li>
          <li class="active"><a href="AddVacancy.jsp"><span><span>Vacancies</span></span></a></li>
          <li class="active"><a href="LogoutServlet"><span><span>Logout</span></span></a></li>
      </ul>
      <p class="lf">&copy; Copyright MyWebSite. Designed by CT Students </p>
      
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>
