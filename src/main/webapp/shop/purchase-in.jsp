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
<p>${cart.size()}種類の商品があります</p>


<c:forEach var="item" items="${cart}">

	<div class="prod">
		<div class="divimg"><img src="image/${item.product.id}.jpg"></div>
		<p>${item.product.name}</p>
		<p>${item.product.price}円</p>
		<p>${item.count}個</p>
	</div>
</c:forEach>
<hr>


<form action="Purchase.action" method="post">
<p>お名前　<input class="text" type="text" name="name"></p>
ご住所　<input class="text" type="text" name="address">
<input class="button" type="submit" value="購入">
</form>

</body>
</html>