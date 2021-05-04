<%@page import="java.util.List"%>
<%@page import="com.mobicule.pojo.Company;"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton-framework/1.1.1/skeleton.min.css">

</head>
<body>

<h2>Add Department</h2>
<form action="<%=request.getContextPath()%>/department.htm?method=addDepartment"
		method="post">
	Company ID <select name="cId">
	
	<c:forEach  var="company" items="${cdList }">
		<option value="${company.cId}" >${ company.cId }</option>
	</c:forEach>
	
	</select>
	<br>
	
	Department Name<input type="text" name="dName" required><br>
	Department Manager<input type="text" name="dManager" required><br>
	<input type="submit" value="Add Department"><br>
	<input type="reset" value="Reset">
</form> 
	<br>
	
	<a href="HomePage.jsp">Home Page</a>

</body>
</html>