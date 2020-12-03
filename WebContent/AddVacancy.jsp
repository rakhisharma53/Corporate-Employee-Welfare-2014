<!DOCTYPE html PUBLIC>
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
<body onload="checkNewMessagesViaJS();setFocusOn('jtitle')">
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
        
          <form name="addvacancyform"  method="post" action="ViewVacancyServlet">
        <fieldset>
        <legend> <h2> Add Vacancy </h2></legend>
          
          <table>
          
          <tr><td>Job Title:</td><td><input type="text" name="jtitle" id="jtitle"></td><td><span id="tspan" ></span></td></tr>   
          <!-- <tr><td>Date:</td><td><input type="date"/></td></tr>-->
          <tr><td>Qualification:</td><td><input type="text" name="qual" id="qual"  onblur='fill("qual","qspan")'/><span id="qspan"></span></td></tr>     
          <tr><td>Experience:</td><td><input type="text" name="exp" id="exp" placeholder="enter in numerics"  onblur='fill("exp","espan")'/><span id="espan"></span></td></tr>   
          <tr><td>No of vacancy:</td><td><input type="text" name="noofvac" id="noofvac"  onblur='fill("noofvac","nspan")'/><span id="nspan"></span></td></tr>   
          <tr><td>Package:</td><td><input type="text" name="pkg" id="pkg" placeholder="enter in numerics"  onblur='fill("pkg","pspan")'/><span id="pspan"></span></td></tr>
          <tr><td>Last Date:</td><td><input type="date" name="lastdate" id="lastdate"  onblur="dateValidation('date')"/><span id="dspan">dd-mm-yyyy</span></td></tr>
          <tr><td><input type="button" value="Add Vacancy" onclick="goingToAddVacancyServletViaJS()"/></td>
          <td><input type="submit" value="View Vacancy"/></td></tr>       
          </table>
          <span id="addvacancyspan"></span> 
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
          <li class="active"><a href="RegisterManager.jsp"><span><span>Register MGR</span></span></a></li>
          <li class="active"><a href="AddBulletinBoard.jsp"><span><span>Bulletin</span></span></a></li>
          <li class="active"><a href="AddVacancy.jsp"><span><span>Add Vacancies</span></span></a></li>
          <li class="active"><a href="ViewLeavesByManagerServlet"><span><span>Leaves</span></span></a></li>
          <li class="active"><a href="ViewDonor.jsp"><span><span>View Donor</span></span></a></li>
               </ul>
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>
