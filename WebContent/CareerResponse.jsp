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
       <c:if test="${att==1}">
                <table border="2">
                <tr><th width="400px">Description</th><th width="200px">Download</th></tr>
                <c:forEach var="i" items="${careeratt}">
                <tr><td>${i.description}</td><td><a href="DownLoadActualFileServlet?filename=${i.filename}&filepath=${i.uploads}">Download</a></td></tr>
	            </c:forEach>
                </table>
        </c:if>
        <c:if test="${att==0}">
        <div class="round">
        No Record Available
        </div>
        </c:if>
        
</body>
</html>