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
<h1>オンラインショッピングへようこそ！</h1>
<img src="image/sushi.png"></a>

<h2>新規会員登録はこちら</h2>
<form action="member.jsp" method="post">
<input type="submit" value="新規会員登録">
</form>

<h2>アンケートにご協力ください</h2>
<form action="question.jsp" method="post">
<input type="submit" value="アンケート">
</form>

</body>
</html>