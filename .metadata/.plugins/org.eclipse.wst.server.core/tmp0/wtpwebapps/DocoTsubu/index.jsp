<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <% User user = (User) session.getAttribute("loginUser"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>どこつぶへようこそ</h1>

<form action="/DocoTsubu/Login" method="post">
ユーザー名：<input type="text" name="name">
パスワード：<input type="password" name="pass">
<input type="submit" value="ログイン">
</form>

</body>
</html>