<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.Date, java.text.SimpleDateFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Current Date</title>
		<link rel="stylesheet" href="/css/style.css" />
		<script src="/js/datescript.js"></script>
	</head>
	<body>
		<h1><c:out value="${date}"></c:out></h1>
	</body>
</html>