<%@page import="com.mobicule.pojo.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.mobicule.pojo.Company;"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/skeleton-framework/1.1.1/skeleton.min.css">
</head>
<body>

	<a
		href="<%=request.getContextPath()%>/department.htm?method=showAddDepartmentForm">Add
		New Department</a>
		
	<br>
	
	<hr>
	
	<%-- <% List<Department> list =(List<Department>) request.getAttribute("dList"); %> --%>
	<!--  -->

<h2>List of All Departments</h2>

<table>
			<tr>
				<th>DID</th>
				<th>Department Name</th>
				<th>Dept. Manager</th>
				<th>CID</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach  var="department" items="${dList}">
			<tr>
				<td>${department.dId}</td>
				<td>${department.dName }</td>
				<td>${department.dManager }</td>
				<td>${department.cId }</td>
				<td><a
					href="<%=request.getContextPath()%>/department.htm?method=showUpdateForm&dId=${department.dId}&dName=${department.dName }&dManager=${department.dManager }&cId=${department.cId }"
					title="Edit">UPDATE</a>
				</td> 
				<td><a href="<%=request.getContextPath()%>/department.htm?method=deleteDepartment&dId=${department.dId}">DELETE</a>
				</td>
			</tr>
			</c:forEach>
		</table>
		
		<br>
		
		
	<br>
	
	<a href="HomePage.jsp">Home Page</a>
		

</body>
</html>