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

<p>ログアウトしますか？</p>
<form action="Logout.action" method="post">
<input class="button" type="submit" value="ログアウト">
</form>
</body>
</html>