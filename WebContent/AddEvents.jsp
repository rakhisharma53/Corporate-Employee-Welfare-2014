<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Corporate Employee Welfare | Contact</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script type="text/javascript" src="js/CewJS.js"></script>

</head>
<body >
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
          <li class="active"><a href="RegisterManager.jsp"><span><span>Register MGR</span></span></a></li>
          <li class="active"><a href="AddBulletinBoard.jsp"><span><span>Bulletin</span></span></a></li>
          <li class="active"><a href="AddVacancy.jsp"><span><span>Add Vacancies</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leaves</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
              </ul>
       </c:when>
       <c:otherwise>
           <c:choose>
           <c:when test="${usertype=='manager'}">
           <ul>
     <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leave</span></span></a></li>
               </ul>
           </c:when>
           <c:otherwise>
                 
           </c:otherwise>
           </c:choose>       
       </c:otherwise>
      </c:choose>
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
      <div class="mainbar">
     
        <div class="article">
       <form name="eventshomeform">            
      <h2>Add Events</h2>
          <ol>
              <li>
                <label>Date:</label>
                <input id="date" type="date" name="date" id="date" class="text" /><span id="dspan" onblur="dateValidation('date')">dd-mm-yyyy</span>
              </li>
              <li>
                <label>Title:</label>
                <input id="title" name="title" class="text"  /><span id="tspan"></span>
              </li>
              <li>
                <label>Venue:</label>
                <input id="venue" name="venue" class="text"  /><span id="vspan"></span>
              </li>
              <li>
                <label>Time:</label>
                <input id="time" name="time" class="text"  /><span id="tispan"></span>
              </li>
              <li>
                <label>Duration</label>
                <input id="duration" name="duration" class="text"  /><span id="dspan"></span>
              </li>
               <li>
                <label>Description:</label>
                <textarea id="description" name="description" rows="5" cols="50"></textarea><span id="descspan"></span>
              </li>
             
              <li>
                <label>Events Shown To:</label>
                <li>
               <li><input type="checkbox" name="eventshownto" id="admin" value="admin"/>Admin</li>
               <li><input type="checkbox" name="eventshownto" id="manager" value="manager"/>Manager</li>
               <li><input type="checkbox" name="eventshownto" id="employee" value="employee"/>Employee</li>
               <li>
              </li>
              
              <li>
              <input type="button" value="Add Event" onclick="goingToEventServletViaJS()"/>
              </li>
           
              <li>  <span id="addeventspan"></span></li> 
            </ol>
          </form>
       </div>
         
      </div>
      <div class="sidebar">
        <div class="searchform">
        </div>
        <div class="gadget">
          <h2 class="star"><span></span> Messages</h2>
          <ul class="sb_menu">
            <li><a href="AdminMessage.jsp">Compose New Message</a></li>
            <li><a href="AdminInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="AdminSentItems.jsp">Sent Items</a></li>
           </ul>
        </div>
        <div class="gadget">
          <h2 class="star"><span></span></h2>
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
<c:choose>
      <c:when test="${usertype=='admin'}">
        <ul>
       <li class="active"><a href="AdminHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="AdminTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterManager.jsp"><span><span>Register MGR</span></span></a></li>
          <li class="active"><a href="AddBulletinBoard.jsp"><span><span>Bulletin</span></span></a></li>
          <li class="active"><a href="AddVacancy.jsp"><span><span>Add Vacancies</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leaves</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
              </ul>
       </c:when>
       <c:otherwise>
           <c:choose>
           <c:when test="${usertype=='manager'}">
           <ul>
     <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leave</span></span></a></li>
               </ul>
           </c:when>
           <c:otherwise>
                 
           </c:otherwise>
           </c:choose>       
       </c:otherwise>
      </c:choose>
      </ul>
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>
