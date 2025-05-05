<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/main.css" />
<title>オンラインショップ</title>
</head>
<body>
<%@include file="menu.jsp" %>

<form action="Login.action" method="post">
<p>ログインID　<input class="text" type="text" name="login"></p>
パスワード　<input class="text" type="password" name="password">
<input class="button" type="submit" value="ログイン">
</form>
<hr>
</body>
</html>