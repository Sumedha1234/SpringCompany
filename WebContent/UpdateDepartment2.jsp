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


<%
Department department = (Department) session.getAttribute("department");

int dId =  department.getdId();
String dName = department.getdName();
String dManager = department.getdManager();
int cId = department.getcId();

%>

<h1>Update Department with ID = <%=dId %></h1>

<form action="CompanyServlet" method="get">
Company Id<input type="text" disabled="true" value="<%=cId%>"><br>
<input type="hidden" name="cId" value="<%=cId%>">

Department Id<input type="text" disabled="true" value="<%=dId%>"><br>
<input type="hidden" name="dId" value="<%=dId%>">

Department Name<input type="text" name="dName" value="<%=dName %>" required><br>
Department Manager<input type="text" name="dManager" value="<%=dManager %>" required><br>
<input type="submit" name="actionBtn" value="UpdateDepartment"><br>
<input type="reset" value="Reset">
</form>
<br>

<% 	String msg =(String)session.getAttribute("updateDepartmentMessage"); 

	if(msg != null){
%>
	<%=msg %>
	
	<%
		session.removeAttribute("updateDepartmentMessage");
	}
		
	%>

<br>
<a href="HomePage.jsp">Home Page</a>


</body>
</html>