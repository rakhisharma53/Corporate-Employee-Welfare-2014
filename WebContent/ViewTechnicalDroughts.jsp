<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    
    <c:forEach var="i" items="${droughtslistatt}">
    <div class="comment">
    <a href="#"><img src="GetTechnicalDroughtsPicServlet?username=${i.username}&usertype=${i.type}" width="40" height="40" alt="" class="userpic"/></a>
     <p><a href="#">   ${i.name} </a>Says:<br/>
           ${i.date}</p>
           <p style="left:20px">${i.comment}</p>
	
    
  </div>
    </c:forEach>     
   
  
 
</body>
</html>