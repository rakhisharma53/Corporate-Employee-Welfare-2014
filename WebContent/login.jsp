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
<body onload="goingToViewBulletinServletViaJS();setFocusOn('ut')">
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="menu_nav">
        <ul>
       <li  class="active"><a href="BasicServlet?id=home"><span><span>Home</span></span></a></li>
          <li  class="active"><a href="BasicServlet?id=login"><span><span>Login</span></span></a></li>
          <li class="active"><a href="BasicServlet?id=gallery"><span><span>Gallery</span></span></a></li>
          <li class="active"><a href="ViewVacancyServlet"><span><span>Vacancies</span></span></a></li>
       
          <li  class="active"><a href="BasicServlet?id=career"><span><span>Career with us</span></span></a></li>
          <li  class="active"><a href="BasicServlet?id=contact"><span><span>Contact Us</span></span></a></li>
          </ul>
      </div>
      <div class="clr"></div>
      <div class="logo">
        <h1><a href="index.jsp">Corporate Employee Welfare<br />
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
        <form name="loginform"><br/>
        <br/>
        <fieldset style="border:#50b3ee 4px solid;">
        <legend> <h2>Login</h2></legend>
          
          <table>
          <tr><td>User Type:</td><td><select name="ut" id="ut" onblur="fill('ut','utspan')">
           <option value="select">---select---</option>
           <option value="admin">Admin</option>
          <option value="manager">Manager</option>
          <option value="employee">Employee</option>
          </select><span id="utspan"></span>
          </td></tr>          <tr><td>User Name:</td><td><input type="text" id="un" name="un"class="text" onblur="fill('un','unspan')"/></td><td><span id="unspan"></span></td></tr>
          <tr><td>Password:</td><td><input type="password" id="up" name="up" class="text" onblur="fill('up','passspan')"/></td><td><span id="passspan"></span></td></tr>
          <tr><td></td><td><input type="button" value="Login" onclick="userLoginMethod()"/></td></tr>
          <tr><td></td><td><span id="loginspan"></span></td></tr>
          </table>
          
          </fieldset>
         </form>
        
        </div>
      </div>
       <div class="sidebar" >
        <h2>Bulletin Board</h2>
        <div class="gadget" id="bulletinarea"  >
         
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
           <li  class="active"><a href="BasicServlet?id=home"><span><span>Home</span></span></a></li>
          <li  class="active"><a href="BasicServlet?id=login"><span><span>Login</span></span></a></li>
          <li class="active"><a href="BasicServlet?id=gallery"><span><span>Gallery</span></span></a></li>
          <li class="active"><a href="ViewVacancyServlet"><span><span>Vacancies</span></span></a></li>
       
          <li  class="active"><a href="BasicServlet?id=career"><span><span>Career with us</span></span></a></li>
          <li  class="active"><a href="BasicServlet?id=contact"><span><span>Contact Us</span></span></a></li>
       </ul>
      <p class="lf">&copy; Copyright MyWebSite. Designed by CT Students</p>
      
      <div class="clr"></div>
    </div>
  </div>
</div>
</body>
</html>
