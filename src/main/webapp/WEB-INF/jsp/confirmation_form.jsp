<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation Form</title>
Student name is ${student.studentFirstName} ${student.studentLastName}
<br></br>
Country: ${student.country}
<br></br>
Degree: ${student.degree}
<br></br>
Sex: ${student.sex}
<br></br>
Operating System:
<ul>
<c:forEach var="temp" items="${student.operatingSystem}">
<li>${temp}</li>
</c:forEach>
</ul>

</head>
<body>

</body>
</html>