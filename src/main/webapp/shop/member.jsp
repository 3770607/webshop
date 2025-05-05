<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>オンラインショップ</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h1>新規会員登録</h1>

<form action="Member.action" method="post">
<p>お名前</p>
<input type="text" name="login">
<p>パスワード</p>
<input type="text" name="password">
<p></p>
<input type="submit" value="登録">
</form>

</body>
</html>