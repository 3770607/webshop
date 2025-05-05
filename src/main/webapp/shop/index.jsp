<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/main.css" />
<title>オンラインショップ</title>
</head>
<body>
<%@include file="menu.jsp" %>

<form action="Product.action" method="post">
<input class="text" type="text" name="keyword" placeholder="キーワードを入力">
<input class="button" type="submit" value="検索">
</form>


<c:forEach var="p" items="${list}">

	<div class="prod">
		<div class="divimg"><img src="image/${p.getId()}.jpg"></div>
		<p>${p.getName()}</p>
		<p>${p.getPrice()}円</p>
		<a href="CartAdd.action?id=${p.id}">カートに追加</a>
	</div>
</c:forEach>

</body>
</html>