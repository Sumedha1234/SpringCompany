<%@page import="com.mobicule.pojo.Department"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton-framework/1.1.1/skeleton.min.css">

</head>
<body>
<form action="<%=request.getContextPath()%>/department.htm?method=updateDepartment" method="post">
cId <input type="text" value="${department.cId}" disabled="true"><br>
<input type="hidden" name="cId" value="${department.cId }">

dId <input type="text" value="${department.dId}" disabled="true"><br>
<input type="hidden" name="dId"  value="${department.dId }">

Department Name <input type="text" name="dName" value="${department.dName}" ><br>
Department Manager <input type="text" name="dManager" value="${department.dManager}" ><br>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>

<br>
<a href="HomePage.jsp">Home Page</a>


</body>
</html>