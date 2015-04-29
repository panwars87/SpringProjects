<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring4 MVC -HelloWorld</title>
</head>
<body>
	<h1>Welcome to Spring home.....</h1>
	<br />
	
	<c:if test="${not empty statusMessageKey}">
		${statusMessageKey }
	</c:if>
	
	<br />
	<c:url var="url" value="/viewAjax" />
	<a href="${url}">Say Hello!</a>
</body>
</html>