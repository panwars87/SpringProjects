<%@ include file="init.jsp" %>

<html>
	<body>
		<div>
			<p>Login</p>
			<c:url var="url" value="http://localhost:8090/Student-Portal/login/authenticateUser" />
			<form action="${url }" id="loginForm">
				<input type="text" name="firstName" />
				<input type="text" name="password" />
				<input type="submit" value="Submit">
			</form>		
		</div>
	</body>
</html>