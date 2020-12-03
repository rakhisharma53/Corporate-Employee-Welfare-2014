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
     
        <div class="article" id="eventsdiv">
        <h2>Modify Events</h2>
         <form name="modifyeventform" method="post"  action="">
          <div class="round">
          <table>
          
          <tr><td><input type="hidden" name="eid" value="${eventformodifytatt.eventid}"/></td></tr>
          <tr><td>Date:</td><td><input type="text" name="date" value="${eventformodifytatt.date}"/></td></tr>   
          <!-- <tr><td>Date:</td><td><input type="date"/></td></tr>-->
          <tr><td>Title:</td><td><input type="text" name="title" value="${eventformodifytatt.title}"/></td></tr>     
          <tr><td>Venue:</td><td><input type="text" name="venue" value="${eventformodifytatt.venue}"/></td></tr>   
          <tr><td>Time:</td><td><input type="text" name="time" value="${eventformodifytatt.time}"/></td></tr>   
          <tr><td>Duration:</td><td><input type="text" name="duration" value="${eventformodifytatt.duration}"/></td></tr>   
          <tr><td>Description:</td><td><input type="text" name="description" value="${eventformodifytatt.description}"/></td></tr>   
          <tr><td><input type="submit" value="Update Event" onclick="goingToUpdateEventServletViaJS()"/></td></tr>
        <tr><td><span id="updateeventspan"></span> </td></tr>
          </table>
          </div>
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
          <li class="active"><a href="AdminHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="AdminTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterManager.jsp"><span><span>Register Manager</span></span></a></li>
          <li class="active"><a href="AddBulletinBoard.jsp"><span><span>Bulletin Board</span></span></a></li>
          <li class="active"><a href="AddVacancy.jsp"><span><span>Vacancies</span></span></a></li>
          <li class="active"><a href="LogoutServlet"><span><span>Logout</span></span></a></li>
      </ul>
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>

