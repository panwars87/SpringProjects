<!doctype html>
<html>
	<head>
	
		<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
			isELIgnored="false" pageEncoding="ISO-8859-1"%>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		
		<script type="text/javascript" src="<c:url value='/js/jquery.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/main.js'/>"></script>
	
	</head>
	<body>
		<div id="page1" class="toggleSection">
		       <%@ include file="viewAjax.jsp"%>
		</div>
		<div id="page2" class="toggleSection">
		       <%@ include file="viewAjax-page2.jsp"%>
		</div>
		<div id="final" class="toggleSection">
		       <%@ include file="final.jsp"%>
		</div>
	
	</body>
</html>