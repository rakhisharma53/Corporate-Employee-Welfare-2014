<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Corporate Employee Welfare | Contact</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script type="text/javascript" src="js/CewJS.js"></script>
</head>
<body onload="checkNewMessagesViaJS();">
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
        <form name="editmanagerprofileform">
        <fieldset>
        <legend> <h2> Edit Profile </h2></legend>
          <c:choose>
          <c:when test="${ usertype=='manager'}">
          <table>
          <tr><td>ManagerID:</td><td><input type="text" name="un" value="${mgrprofileatt.username}"/></tr>
          <tr><td>Manager Name:</td><td><input type="text" id="n" name="n" value="${mgrprofileatt.name}" onkeypress="return onlyAlphabets(event,this,'nspan');"/><span id="nspan"></span></tr>   
          <tr><td>Email Id:</td><td><input type="text" id="eid" name="eid" value="${mgrprofileatt.emailid}" onblur="emailValidity('eid','espan')"/><span id="espan"></span></td></tr>  
          <tr><td>Father name:</td><td><input type="text" name="fn" value="${mgrprofileatt.f_name}" onkeypress="return onlyAlphabets(event,this,'fspan');"/><span id="fspan"></span></td></tr>
          <tr><td>Dob:</td><td><input type="date" name="dob" id="dob" value="${mgrprofileatt.dob}" onclick="dateValidation('dob')"/><span id="dspan">dd-mm-yyyy</span></td></tr>
          <tr><td>Mobile no:</td><td><input type="text" name="mno" value="${mgrprofileatt.mobileno}" onblur="mobileValidity('mno','mspan')"/><span id="mspan"></span></td></tr>
          <tr><td>Address</td></tr>
          <tr><td>Line1:</td><td><input type="text" name="l1" value="${mgrprofileatt.line1}"/></td></tr> 
          <tr><td>Line2:</td><td><input type="text" name="l2" value="${mgrprofileatt.line2}"/></td></tr>
          <tr><td>City:</td><td><input type="text" name="city" value="${mgrprofileatt.city}"/></td></tr>
          <tr><td>State:</td><td><input type="text" name="st" value="${mgrprofileatt.state}"/></td></tr>
          <tr><td>Pincode:</td><td><input type="text" id="pcode" name="pcode" value="${mgrprofileatt.pincode}" onblur="numberValidity('pcode','pspan')"/><span id="psapn"></span></td></tr>  
          <tr><td>Blood group:</td><td><select name="bg" >
          <option value="${mgrprofileatt.bg }">${mgrprofileatt.bg }</option>
          <option value="A positive">A +ve</option>
          <option value="B positive">B +ve</option>
          <option value="AB positive">AB +ve</option>
                    <option value="O positive">O +ve</option>
                    <option value="A negative">A -ve</option>
          <option value="B negative">B -ve</option>
          <option value="AB negative">AB -ve</option>
                    <option value="O negative">O -ve</option>
          </select></td></tr>         
          <tr><td></td><td><input type="button" value="Update" onclick="goingToEditManagerProfileServletViaJS()"/>
          <tr><td><span id="updatemanagerprofilespan"></span>
          </td></tr>
          </table>
          
          </c:when>
          <c:otherwise>
          <table>
          <tr><td>EmployeeID:</td><td><input type="text" name="un" value="${employeeatt.username}"/></tr>
          <tr><td>Name:</td><td><input type="text" name="n" value="${employeeatt.name}"/></tr>   
          <tr><td>Email Id:</td><td><input type="text" name="eid" value="${employeeatt.emailid}"/></td></tr>  
          <tr><td>Father name:</td><td><input type="text" name="fn" value="${employeeatt.f_name}"/></td></tr>
          <tr><td>Dob:</td><td><input type="text" name="dob" value="${employeeatt.dob}"/></td></tr>
          <tr><td>Mobile no:</td><td><input type="text" name="mno" value="${employeeatt.mobileno}" onblur="mobileValidity('mno','mspan')"/><span id="mspan"></span></td></tr>
          <tr><td>Address</td></tr>
          <tr><td>Line1:</td><td><input type="text" name="l1" value="${employeeatt.line1}"/></td></tr> 
          <tr><td>Line2:</td><td><input type="text" name="l2" value="${employeeatt.line2}"/></td></tr>
          <tr><td>City:</td><td><input type="text" name="city" value="${employeeatt.city}"/></td></tr>
          <tr><td>State:</td><td><input type="text" name="st" value="${employeeatt.state}"/></td></tr>
          <tr><td>Pincode:</td><td><input type="text" name="pcode" value="${employeeatt.pincode}"/></td></tr>  
          <tr><td>Blood group:</td><td><select name="bg" >
          <option value="${employeeatt.bg }">${employeeatt.bg }</option>
          <option value="A positive">A +ve</option>
          <option value="B positive">B +ve</option>
          <option value="AB positive">AB +ve</option>
                    <option value="O positive">O +ve</option>
                    <option value="A negative">A -ve</option>
          <option value="B negative">B -ve</option>
          <option value="AB negative">AB -ve</option>
                    <option value="O negative">O -ve</option>
          </select></td></tr>    

          
          <tr><td></td><td><input type="button" value="Update" onclick="goingToEditManagerProfileServletViaJS()"/>
          <tr><td><span id="updatemanagerprofilespan"></span>
          </td></tr>
          </table>
          
          </c:otherwise>
          </c:choose>
                    </fieldset>
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
            <c:when test="${usertype=='employee'}">
            <li><a href="EmployeeMessage.jsp">Create new Message</a></li>
            <li><a href="EmployeeInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="EmployeeSentItems.jsp">Sent Items</a></li>
            </c:when>
       <c:otherwise>
            <li><a href="ManagerMessage.jsp">Create new Message</a></li>
            <li><a href="ManagerInbox.jsp">Inbox</a><b><sup id="messagecountarea" style="color:red"></sup></b></li>
            <li><a href="ManagerSentItems.jsp">Sent Items</a></li>
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
       </ul>
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>

