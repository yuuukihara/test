<%@ page contentType="text/html;charset=UTF-8" import ="aa.*" %>
<% model a = new model("111","yuuki"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>yah</title>
</head>
<body>

<%= a.getName() %>

<form action="/AA/FormSampleServlet" method="post">
名前:<input type="text" name ="name"><br>
男<input type="radio" name="gender" value="0">
女<input type="radio" name="gender" value="1"><br>
<select name="qtype">
	<option value="company">会社について</option>
	<option value="product">製品について</option>
	<option value="support">サポートについて</option>
</select><br>
<textarea name="body"></textarea>
<input type="submit" value="送信">
</form>

</body>
</html>