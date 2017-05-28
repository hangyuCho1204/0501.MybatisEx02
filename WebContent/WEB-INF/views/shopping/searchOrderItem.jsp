<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>주문 아이템</h3>
		<fieldset>
			<sf:form method="post" modelAttribute="orderItemCondition">
				주문 아이템 ID : <sf:input path="id"/>
				<input type="submit" value="검색"/>
			</sf:form>
		</fieldset>
		<c:if test="${bean!=null}">
		<fieldset>
			상품명 : ${bean.product.name} / 가격 : ${bean.product.price} / 수량 :${bean.amount}
		</fieldset>
		</c:if>
</body>
</html>