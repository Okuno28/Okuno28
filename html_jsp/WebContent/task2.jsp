<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<%-- subtraction method --%>
		<%! int substraction (int x, int y){
			return x - y;
		}%>
		<title>JSP TASK</title>
	</head>
	<body>
		<h1>125 - 15 = <%= substraction(125,15) %></h1>
		<h1>17 - 21 = <%= substraction(17,21) %></h1>
	</body>
</html>