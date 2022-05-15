<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>  
.error{color:red}  
</style> 
</head>
<meta charset="ISO-8859-1">
<title>Student Form</title>

<form:form action="processForm" modelAttribute="student">
Student First Name:<form:input path="studentFirstName"/>
<br></br>
Student Last Name(*):<form:input path="studentLastName"/>
<form:errors path="studentLastName" cssClass="error"/>
<br></br>
Country:
<form:select path="country">
<form:option value="india" label="India"/>
<form:option value="uk" label="UK"/>
<form:option value="brazil" label="Brazil"/>
<form:option value="russia" label="Russia"/>
</form:select>
<br></br>
Degree:
<form:select path="degree">
<form:options items="${student.degreeOption}" />
</form:select>
<br></br>
Sex:
Male<form:radiobutton path="sex" value="M"/>
Female<form:radiobutton path="sex" value="F"/>
<br></br>
Operating System:
Windows<form:checkbox path="operatingSystem" value="Windows"/>
Mac Os<form:checkbox path="operatingSystem" value="Mac Os"/>
Linux<form:checkbox path="operatingSystem" value="Linux"/>
<br></br>
<input type="submit" value="submit"/>

</form:form>

<body>

</body>
</html>