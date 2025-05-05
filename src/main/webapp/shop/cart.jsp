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
<c:choose>
	<c:when test="${cart.size()>0}">
		<p>${cart.size()}種類の商品があります。</p>
		<hr>
	</c:when>
	<c:otherwise>
		<p>カートに商品がありません。</p>
	</c:otherwise>
</c:choose>

<c:forEach var="item" items="${cart}">

	<div class="prod">
		<div class="divimg"><img src="image/${item.product.id}.jpg"></div>
		<p>${item.product.name}</p>
		<p>${item.product.price}円</p>
		<p>${item.count}個</p>
		<a href="CartRemove.action?id=${item.product.id}">カートから削除</a>
	</div>
</c:forEach>

</body>
</html>