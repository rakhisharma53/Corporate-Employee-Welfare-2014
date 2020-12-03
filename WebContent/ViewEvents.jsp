<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
<script type="text/javascript" src="js/CewJS.js"></script>
</head>
<body>

<h2>Events</h2>
   <c:forEach var="i" items="${eventatt}">
     <div class="round" id="color"  >
     <table>
	<tr><td>Date:</td><td>${i.date}</td><td></td></tr>
	<tr><td>Venue:</td><td>${i.venue}</td><td></td></tr>
	<tr><td>Time:</td><td>${i.time}</td><td></td></tr>
	<tr><td>Duration:</td><td>${i.duration}</td><td></td></tr>
	<tr><td>Description:</td></tr>
	<tr><td></td><td>${i.description}</td></tr>
	</table>
	</div>
 
    </c:forEach>
      <input type="button" value="Add Events" onclick="viewAddEventsJsp()"/>
   <input type="button" value="Modify Events" onclick="modifyEventJsp()"/>
 
<!---->
</body>
</html>