<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
	<title>Jun's Company Home Page</title>
</head>

<body>
	<h2>Jun's Company Home Page</h2>
	<hr>
	
	<p>
	Welcome to the Jun's company home page!
	</p>
	
	<hr>
	
	<!-- display user name and role -->
	<p>
		User: <security:authentication property="principal.username"/>
	<br><br>
		Roles: <security:authentication property="principal.authorities"/>
	</p>
	
	
	<!-- Add a link to point to /leaders -->
	<security:authorize access="hasRole('MANAGER')">
	<p>
		<a href="${pageContext.request.contextPath}/leaders">Manager</a>(Only for Manager)
	</p>
	</security:authorize>

	<!-- Add a link to point to /admin -->
	<security:authorize access="hasRole('ADMIN')">
	<p>
		<a href="${pageContext.request.contextPath}/admin">Admin</a>(Only for admin)
	</p>
	</security:authorize>
	
	<hr>
	
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath }/logout" method="POST">
		
		<input type="submit" value="Logout">
		
	</form:form>
	
</body>

</html>