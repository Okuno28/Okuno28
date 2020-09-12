<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<%@page import = "java.util.Date" %>
		<%@page import = "java.text.SimpleDateFormat" %>
		<%!int count = 1;
   		   Date now = new Date();
   	   	   SimpleDateFormat today = new SimpleDateFormat("yyyy年MM月dd日");%>
		<title>JSP kadai3</title>
	</head>
	<body>
		<%--リロードする度にcount++ --%>
		<h1>訪問回数：<%= count++ %></h1>
		<p>今日の日付：<%=today.format(now)%><p>
	</body>
</html>