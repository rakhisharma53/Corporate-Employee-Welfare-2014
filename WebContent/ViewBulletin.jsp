<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div  style="border:solid;border-color:#50b3ee;color:#50b3ee;height:500px">

<marquee direction="up" onmouseover="this.setAttribute('scrollamount',0,0)" onmouseout="this.setAttribute('scrollamount',6,0)">
<c:forEach var="i" items="${viewbulletatt}">  
       
     
          ${i.bulletin}<br/>
         ............................................................................................<br/>    
       </c:forEach>
        </marquee>
  </div>
 
</body>
</html>