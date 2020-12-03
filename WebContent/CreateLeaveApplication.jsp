<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC >
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Corporate Employee Welfare | Contact</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/CewJS.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>

</head>
<body onload="checkNewMessagesViaJS()">
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
      <c:choose>
      <c:when test="${usertype=='employee'}">
           <ul>
         <li class="active"><a href="EmployeeHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="EmployeeTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
         <li class="active"><a href="CreateLeaveApplication.jsp"><span><span>Leave</span></span></a></li>
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
        <form name="leavebyemployeeform" method="post" action="ViewLeaveByEmpServlet">
        <fieldset>
        <legend> <h2> Apply For Leave </h2></legend>
          <table>
          <tr><td>From:</td><td><input type="text" name="from"/>dd-mm-yyyy</td></tr>   
         <!-- <tr><td>Date:</td><td><input type="date"/></td></tr>-->
          <tr><td>To:</td><td><input type="text" name="to" onblur="calculateNoOfDaysViaJS()"/>dd-mm-yyyy</td></tr>     
          <tr><td>Days:</td><td><input type="text" name="days"  readonly="readonly"></td></tr>   
          <tr><td>Reason:</td><td><input type="text" name="reason"/></td></tr>   
          <tr><td><input type="button"  value="Apply" onclick="goingToApplyForLeaveServletViaJS()"/></td>
         <tr><td><input type="submit"  value="ViewLeave"/></td></tr>
          <tr><td><span id="applyleavespan"></span> </td></tr>
          </table>
          </fieldset>
         </form>
    
        </div>
     </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star"><span></span> Messages</h2>
          <ul class="sb_menu">
          <c:choose>
          <c:when test="${usertype=='employee'}">
             <li><a href="EmployeeMessage.jsp">Compose New Message</a></li>
            <li><a href="EmployeeInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="EmployeeSentItems.jsp">Sent Items</a></li>
         </c:when>
       <c:otherwise>
                 
            <li><a href="ManagerMessage.jsp">Compose New Message</a></li>
            <li><a href="ManagerInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="ManagerSentItems.jsp">Sent Items</a></li>
             </c:otherwise>
      </c:choose>
          
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
      <c:choose>
      <c:when test="${usertype=='employee'}">
           
                  <li class="active"><a href="EmployeeHome.jsp"><span><span>Profile</span></span></a></li>
          <li class="active"><a href="index.jsp"><span><span>Home</span></span></a></li>
          <li class="active"><a href="EventsHome.jsp"><span><span>Events</span></span></a></li>
          <li class="active"><a href="EmployeeTechnicalDroughts.jsp"><span><span>Technical Droughts</span></span></a></li>
         <li class="active"><a href="CreateLeaveApplication.jsp"><span><span>Leave</span></span></a></li>
         <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>

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