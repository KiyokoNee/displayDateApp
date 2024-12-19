<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Current Time</title>
		<link rel="stylesheet" href="/css/style.css" />
		<script src="js/timescript.js"></script>
	</head>
	<body>
		<h1><c:out value="${time}"></c:out></h1>
	</body>
</html>