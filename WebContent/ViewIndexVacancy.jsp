<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC >
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
<body onload="goingToViewBulletinServletViaJS()">
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
        
        <h2>Vacancy</h2>       
         
             <c:forEach var="i" items="${viewvacancyatt}">
             <div class="round">
             	           
			<h3 style="color:#50b3ee">	${i.noofvacancy} Vacancy of the ${i.jobtitle} having package ${i.package1}<br/></h3>
			<h3 style="color:#50b3ee">Requirements:</h3>
				<div class="smallround" style="left:300px;">
  				 ${i.qualification}<br/>
				${i.experience} year Experience
				</div>
			    <pre>                                       Last Date of Application Form: ${i.date }</pre>		
			</div>
			</c:forEach>
      
   </div>
      </div>
       <div class="sidebar" >
        <h2>Bulletin Board</h2>
        <div class="gadget" id="bulletinarea">
         
        </div>
       
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

        