<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Corporate Employee Welfare | Contact</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script type="text/javascript" src="js/CewJS.js"></script>
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
         <h2>Welcome ${mgrprofileatt.name }<a href="EditManagerProfileServlet"><sub style="font-size:7pt"><u>Edit Profile</u></sub></a></h2>
                <form name="profilepicform" method="post" action="AddPicServlet" enctype="multipart/form-data">
                     <img src="GetProfilePic?username=${mgrprofileatt.username}" width="130" height="150" onclick="changeImage()" alt="Click Here To Upload your pic" id="imagearea"/>
                
                
                <input type="file" name="picuploader"  id="picuploader" style="visibility:hidden"/>
                <input type="submit" value="upload" id="picuploadbt" style="visibility:hidden"/>
        </form>       
    
          <p></p>
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
            <li><a href="ManagerMessage.jsp">Create new Message</a></li>
            <li><a href="ManagerInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="ManagerSentItems.jsp">Sent Items</a></li>
            <li><a href="LogoutServlet">Logout</a></li>
       
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
           <li class="active"><a href="ManagerHome.jsp"><span><span>Profile</span></span></a></li>
           <li class="active"><a href="ViewVacancyServlet"><span><span>Vacancy</span></span></a></li>
          <li class="active"><a href="ViewEventServlet"><span><span>Events</span></span></a></li>
          <li class="active"><a href="BloodDonorRegistrationByManager.jsp"><span><span>Donor Registration</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>LeavesRequest</span></span></a></li>
          <li class="active"><a href="LogoutServlet"><span><span>Logout</span></span></a></li>
       </ul>
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>
