<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:useBean id="db" class="hr.DostępDoBazy"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista pracowników</title>
</head>
<body>
<h1>Lista pracowników</h1>

<ol>    
<c:forEach var="emp" items="${db.allEmployees}">
    <li>${emp.firstName} ${emp.lastName}</li>
</c:forEach>
</ol>

</body>
</html>



