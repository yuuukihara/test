<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User,model.Mutter,java.util.List" %>
<%User loginUser = (User) session.getAttribute("loginUser"); %>
<%List<Mutter> mutterList=(List<Mutter>) application.getAttribute("mutterList"); %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>どこつぶ</h1>
<%= loginUser.getName() %>さんログイン中<br>

<p><a href="/DocoTsubu/Main">更新</a></p>

<form action="/DocoTsubu/Main" method="post">
<input type="text" name="text">
<input type="submit" value="つぶやく">
</form>

<% for(Mutter mutter : mutterList) {%>
　<p><%= mutter.getUserName() %>：<%= mutter.getText() %></p>
<% } %>

<a href="/DocoTsubu/Logout">ログアウト</a>

</body>
</html>