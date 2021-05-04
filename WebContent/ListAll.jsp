<%@page import="java.util.List"%>
<%@page import="com.mobicule.pojo.Company;"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/skeleton-framework/1.1.1/skeleton.min.css">
</head>
<body>
	<a
		href="<%=request.getContextPath()%>/company.htm?method=showAddCompanyForm">Add
		New Company</a>

	<br>
	<hr>

	<h2>List of All Companies</h2>

	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			<th>Email</th>
		</tr>
		<c:forEach var="company" items="${cList}">
			<tr>
				<td>${company.cId}</td>
				<td>${company.cName }</td>
				<td>${company.cAddress }</td>
				<td>${company.cEmail }</td>
				<td><a
					href="<%=request.getContextPath()%>/company.htm?method=showUpdateForm&cId=${company.cId }&cName=${company.cName}&cAddress=${company.cAddress}&cEmail=${company.cEmail}"
					title="Edit">UPDATE</a> <a
					href="<%=request.getContextPath()%>/company.htm?method=deleteCompany&cId=${company.cId}">DELETE</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<Br>
	<a href="HomePage.jsp">Home Page</a>

</body>
</html>