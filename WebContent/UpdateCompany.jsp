<%@page import="com.mobicule.pojo.Company"%>
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



<h1>Update Company with ID = ${company.cId}</h1>
<form action="<%=request.getContextPath()%>/company.htm?method=updateCompany" method="post">
Company Id<input type="text" disabled="true" value="${company.cId}"><br>
<input type="hidden" name="cId" value="${company.cId}">
Company Name<input type="text" name="cName" value="${company.cName}" ><br>
Company Address<input type="text" name="cAddress" value="${company.cAddress}"><br>
Company Email<input type="email" name="cEmail" value="${company.cEmail}"><br>
<input type="submit" name="actionBtn" value="Update"><br>
<input type="reset" value="Reset">
</form>



<br>
<a href="HomePage.jsp">Home Page</a>
</body>
</html>