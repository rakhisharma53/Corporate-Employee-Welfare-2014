<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
<body>
<table border="2">
<tr><th width="90px">Date</th><th width="130px">Title</th><th width="70px">Venue</th><th>Time</th><th>Duration</th><th width="500px">Description</th></tr>
<c:forEach var="i" items="${eventatt}">

	<tr>
		<td>${i.date}</td>
		<td>${i.title}</td>
		<td>${i.venue}</td>
		<td>${i.time}</td>
		<td>${i.duration}</td>
		<td>${i.description}</td>

		<td><a href="ModifyEventServlet?evtid=${i.eventid }">Modify Event</a></td>
	</tr>
</c:forEach>
</table>

</body>
</html>
