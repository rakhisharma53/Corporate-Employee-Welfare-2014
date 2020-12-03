<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h2>Inbox</h2>
    
   <form name="inboxform" action="DeleteMessageServlet" method="post">   
      <table border="3" style="color:rgb(65,154,250);cellpadding:20;align:centre">
          <tr><th style="width:400px">Message Title</th><th style="width:100px">Date</th></tr>
       <c:forEach var="i" items="${inboxatt}">
           	<c:choose>
	            <c:when test="${i.msgstatus==true}">
                  <tr style="color:red"> <td><input type="checkbox" id="msg" name="msg" value="${i.msgid}"/><a href="ViewInboxMessageServlet?msgid=${i.msgid}"  style="color:red">${i.messagetitle}</a></td><td style="width:100px">${i.date}</td> </tr>
                 </c:when>
                 <c:otherwise>
                  <tr> <td><input type="checkbox" id="msg" name="msg" value="${i.msgid}"/><a href="ViewInboxMessageServlet?msgid=${i.msgid}">${i.messagetitle}</a></td><td style="width:100px">${i.date}</td> </tr>
                 </c:otherwise>
             </c:choose> 
         </c:forEach>
            </table>
  
             <input type="submit" value="Delete" />
             </form>
     
</body>
</html>