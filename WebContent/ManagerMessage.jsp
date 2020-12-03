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
<body  onload="checkNewMessagesViaJS();setFocusOn('uname')">
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leave</span></span></a></li>
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
        <div class="article">
          <h2>Compose Message</h2>
          <span id="addmessagespan" style="align:center;color:rgb(65,151,243);"></span>
          <form action="#" name="sendmessageform">
            <ol>
              <li>
                <label for="name">UserName</label>
                <input id="uname" name="uname" class="text" onblur='fill("uname","uspan")' /><span id="uspan"></span>
              </li>
              <li>
                <label for="email">Title</label>
                <input id="email" name="msgtit" class="text"   /><span id="tspan"></span>
              </li>
              <li>
                <label for="message">Message</label>
                <textarea id="message" name="msgdes" rows="8" cols="50"></textarea><span id="mspan"></span>
              </li>
              <li>
                <input type="button" value="Send" onclick="goingToAddMessageServletThroughJS()"/>
                <div class="clr"></div>
              </li>
            </ol>
                </form>
        </div>
      </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star"><span></span> Message</h2>
          <ul class="sb_menu">
            <li><a href="ManagerMessage.jsp">Compose new Message</a></li>
            <li><a href="ManagerInbox.jsp">Inbox</a></li>
            <li><a href="ManagerSentItems.jsp">Sent Items</a></li>
          </ul>
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
                 <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leave</span></span></a></li>
 </ul>
      <p class="lf">&copy; Copyright MyWebSite. Designed by CT Students </a></p>
      
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>
