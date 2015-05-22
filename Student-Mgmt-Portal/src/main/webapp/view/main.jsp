<%@ include file="init.jsp"%>

<html>
<body>
	<div class="heading">Login</div>
	<div class="loginForm">	
		<br />
		<c:url var="url" value="http://localhost:8090/Student-Portal/login/authenticateUser" />
		<div class="loginDiv">
		<form action="${url }" id="loginForm">
		
			<label for="username">User Name</label>
			<input id="username" name="username" type="text" name="firstName" />
			<br />
			<label for="password">Password:</label>
			<input id="password" type="password" name="password" />
			<br />
			<button name="login" class="loginBtn btn btn-success" type="submit">Submit</button>
		</form>
		</div>
	</div>
</body>
</html>