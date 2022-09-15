<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
 <form:form action="showDetails" modelAttribute="student">
 <fieldset>
 <legend>Registration for the Cultural Festival</legend>
First Name: <input name="firstName" type="text" />
<br>
<br>
Last Name :<input name="lastName" type="text"/>
<br>
<br>
Branch :
<select name = "branch" >
<option value="${student.branches.CE}">${student.branches.CE}</option>
<option value="${student.branches.ME}">${student.branches.ME}</option>
<option value="${student.branches.IT}">${student.branches.IT}</option>
<option value="${student.branches.CS}">${student.branches.CS}</option>
<option value="${student.branches.EE}">${student.branches.EE}</option>
</select>
<br>
<br>
Favorite Activity :
<br>
<input type="radio" name="activity"  value="dancing"/> Dancing
<input type="radio" name="activity"  value="singing"/> Singing  
<input type="radio" name="activity"  value="sports"/> Sports   
<input type="radio" name="activity"  value="hackathon"/> Hackathon   
<input type="radio" name="activity"  value="Hobbies"/> Hobbies  
<br>
<br>
Public Attending the Event:
<br>
<input type="checkbox" name="attenders" value="self"/>Self
<input type="checkbox" name="attenders" value="parents"/>Parents
<input type="checkbox" name="attenders" value="friends"/>Friend
<br>
<br>
Submitting the Details:<input type="submit"  value="submit"/>
</fieldset>
</form:form>
</body>
</html>