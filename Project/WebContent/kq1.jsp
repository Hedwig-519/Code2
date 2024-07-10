<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		double Pi=3.14;
	%>
	
	<h2>Diện tích: <%= Pi * Math.pow(Double.parseDouble(request.getParameter("R")), 2)%></h2>
	<h2>Chu vi: <%= 2*Pi*Double.parseDouble(request.getParameter("R")) %></h2>
	<a href="dientichvabankinhduongtron.jsp"></a>
</body>
</html>