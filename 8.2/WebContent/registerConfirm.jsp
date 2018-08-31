<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="model.User" %>
<% User registerUser =(User) session.getAttribute("registerUser"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>以下を登録します</p>
ログインID<%= registerUser.getId() %><br>
名前<%= registerUser.getName() %><br>

<a href="/8.2/RegisterUser">戻る</a>
<a href="/8.2/RegisterUser?action=done">登録</a>



</body>
</html>