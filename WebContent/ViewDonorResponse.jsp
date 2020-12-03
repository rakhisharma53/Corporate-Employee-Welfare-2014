<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/>
<table border="2">
<tr><th>Id</th><th>Name</th><th>Type</th><th>Contact</th></tr>
<c:forEach var="i" items="${donoratt}">
  <tr><td width="100px">${i.donorid}</td><td  width="100px">${i.name}</td><td  width="100px">${i.usertype}</td><td  width="100px">${i.contactno}</td></tr>
</c:forEach>


</table>
</body>
</html>