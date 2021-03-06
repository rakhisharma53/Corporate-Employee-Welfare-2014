<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Corporate Employee Welfare | Contact</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/CewJS.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script type="text/javascript" >
window.history.forward();
function noBack()
{
      window.history.forward();
} 
</script>

</head>
<body onload="checkNewMessagesViaJS();noBack()">
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
         <li class="active"><a href="EmployeeHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="EmployeeTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
         <li class="active"><a href="CreateLeaveApplication.jsp"><span><span>Leave</span></span></a></li>
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
     <div class="article">
         <h2>Welcome ${employeeatt.name }<a href="EditManagerProfileServlet"><sub style="font-size:7pt"><u>Edit Profile</u></sub></a></h2>
                <form name="profilepicform" method="post" action="AddPicServlet" enctype="multipart/form-data">
                     <img src="GetProfilePic?username=${employeeatt.username}" width="130" height="150" onclick="changeImage()" id="imagearea"/>
                           
                <input type="file" name="picuploader"  id="picuploader" style="visibility:hidden"/>
                <input type="submit" value="upload" id="picuploadbt" style="visibility:hidden"/>
        </form>       
    
        </div>
     </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star"><span></span> Messages</h2>
          <ul class="sb_menu">
            <li><a href="EmployeeMessage.jsp">Compose New Message</a></li>
            <li><a href="EmployeeInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="EmployeeSentItems.jsp">Sent Items</a></li>
            <li><a href="LogoutServlet">Logout</a></li>
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
         <li class="active"><a href="EmployeeProfile.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="EmployeeHomePage.jsp"><span><span>Home</span></span></a></li>
             <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
         <li class="active"><a href="EmployeeTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
         <li class="active"><a href="LeaveByEmployye.jsp"><span><span>Leave</span></span></a></li>
         <li class="active"><a href="BloodDonorRegistrationByEmployee.jsp"><span><span>Blood Donar Registration</span></span></a></li>
         <li class="active"><a href="LogoutServlet"><span><span>Logout</span></span></a></li>
         </ul>
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>
