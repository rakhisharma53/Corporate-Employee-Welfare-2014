<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
<body onload="checkNewMessagesViaJS()">
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
       <ul>
   <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leave</span></span></a></li>
               </ul>
       </c:otherwise>
      </c:choose>
      </div>
      <div class="clr"></div>
      <div class="logo">
        <h1><a href="index.html">Corporate Employee Welfare<br />
          <small>Share Thoughts, Gain More</small></a>  <small style="text-align:right;">Edit Profile</small></h1>
        
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
        <form name="viewleavebymanagerwithformatform"  method="post" action="ViewLeaveByManagerWithFormatServlet">
        <h2>Leave Request</h2>
        <div class="round">  
                  <h3>Respected Manager,<br/>
                  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                  I want leave from ${viewleavebymanagerwithformatatt.from} to ${viewleavebymanagerwithformatatt.to} for ${viewleavebymanagerwithformatatt.days} days because ${viewleavebymanagerwithformatatt.reason}.<br/>
                  Kindly grant me leave.<br/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp ${viewleavebymanagerwithformatatt.username}</h3>
                  <div class="menu_nav">
                  <ul><li class="active"><a href="AcceptLeaveByManagerServlet?leaveid=${viewleavebymanagerwithformatatt.leaveid }&status=Accepted"><span><span>Accept</span></span></a> </li>
                  <li class="active"><a href="AcceptLeaveByManagerServlet?leaveid=${viewleavebymanagerwithformatatt.leaveid }&status=Rejected"><span><span>Reject</span></span></a></li></ul>
                  </div>
          </div>
         </form>
        </div>
        <div class="article">
          </div>
      </div>
      <div class="sidebar">
        <div class="searchform">
        </div>
        <div class="gadget">
          <h2 class="star"><span></span> Messages</h2>
          <ul class="sb_menu">
                  <c:choose>
          <c:when test="${usertype=='manager' }">
            <li><a href="ManagerMessage.jsp">Compose New Message</a></li>
            <li><a href="ManagerInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="ManagerSentItems.jsp">Sent Items</a></li>
            </c:when>
          <c:otherwise>
            <li><a href="AdminMessage.jsp">Compose New Message</a></li>
            <li><a href="AdminInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="AdminSentItems.jsp">Sent Items</a></li> 
          </c:otherwise>
          </c:choose>
          
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
          <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leave</span></span></a></li>
        
       </c:otherwise>
      </c:choose>
           </ul>
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>
