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
<script type="text/javascript" >
</script>

</head>
<body onload="checkNewMessagesViaJS();setFocusOn('department')">
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
        <h1><a href="index.jsp">Corporate Employee Welfare<br />
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
        <form name="employeeregistrationform">
        <fieldset>
        <legend> <h2> Employee Registration </h2></legend>
          
          <table>
         
        
           <tr><td>Department:</td><td><select id="department" name="department">
              <option value="">-----Select-----</option>
          <option value="netWorking">NetWorking</option>
          <option value="designing">Software Designing</option>
          <option value="development"> Software Development</option>
          <option value="testing"> Software Testing</option></select></td></tr>
        
          <tr><td>Employee Name:</td><td><input type="text" name="empn" onkeypress="return onlyAlphabets(event,this,'nspan')"/><span id="nspan"></span></td></tr>   
          <tr><td>Email Id:</td><td><input type="text" id="eid" name="empeid" onblur="emailValidity('eid','espan')"/><span id="espan"></span></td></tr>     
          <tr><td><input type="button" value="Register" onclick="goingTOEmployeeRegisterationServletViaJS()"/>
          </td></tr>
          </table>
          <span id="employeeregistrationspan"></span>
          
          </fieldset>
         </form>
        </div>
      </div>
      <div class="sidebar">
        <div class="searchform">
        </div>
        <div class="gadget">
          <h2 class="star"><span></span> Messages</h2>
          <ul class="sb_menu">
            <li><a href="ManagerMessage.jsp">Compose New Message</a></li>
            <li><a href="ManagerInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="ManagerSentItems.jsp">Sent Items</a></li>
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
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
          <li class="active"><a href="ManagerTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
          <li class="active"><a href="RegisterEmp.jsp"><span><span>Register Emp</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leave</span></span></a></li>
          </ul>
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>

