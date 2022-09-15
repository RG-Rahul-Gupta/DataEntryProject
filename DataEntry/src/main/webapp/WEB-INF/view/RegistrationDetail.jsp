<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Details</title>
</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastName}
<br>
Branch: ${student.branch}
<br> 
Favorite Activity: ${student.activity}
<br> 
Function Attenders:
<ul>
<c:forEach var="temp" items="${student.attenders}">
<li>${temp}</li>
</c:forEach>
</ul>
</body>
</html>