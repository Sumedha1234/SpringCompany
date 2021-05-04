<html>
<head>
<script>
	function check_Alpha(letters) {
		var regex1 = /^[a-zA-Z]+$/;
		var regex2 = /^[a-zA-Z0-9.-]+$/;

		if (regex1.test(letters.cName.value) == false) {
			alert("Name must be alphabets only");
			letters.cName.focus();
			return false;
		}
		if (regex1.test(letters.cName.value) == " ") {
			alert("Name cannot be empty");
			letters.cName.focus();
			return false;
		}
		if (regex2.test(letters.cAddress.value) == false) {
			alert("Invalid address format");
			letters.cAddress.focus();
			return false;
		}
		if (regex2.test(letters.cAddress.value) == " ") {
			alert("Address cannot be empty");
			letters.cAddress.focus();
			return false;
		}

	}

	var today = new Date();
	var isToday = (today.toDateString() == otherDate.toDateString());
</script>
<title>Add Company</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/skeleton-framework/1.1.1/skeleton.min.css">

</head>
<body>
	<form
		action="<%=request.getContextPath()%>/company.htm?method=addCompany"
		method="post" onSubmit="return check_Alpha(this)">
		Company Name<input type="text" name="cName" required><br>
		Company Address<input type="text" name="cAddress"><br>
		Company Email<input type="email" name="cEmail"><br> Date<input
			type="date" name="cDate"><br> <input type="submit"
			name="actionBtn" value="Add Company"><br> <input
			type="reset" value="Reset">
	</form>

	<br>
	<br>

	<a href="HomePage.jsp">Home Page</a>

</body>
</html>