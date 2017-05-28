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
	<h3>주문 ID 검색</h3>
		<fieldset>
			<sf:form method="post" modelAttribute="orders">
			
			
				주문 ID : <sf:input path="id"/>
				<input type="submit" value="검색"/>
			</sf:form>
		</fieldset>
		<c:if test="${bean!=null}">
		<fieldset>
			주문번호 : ${bean.id} / 주문일자 : ${bean.date} / 고객이름 :${bean.customer.name}
		</fieldset>
		<fieldset>
			<h5>주문 정보</h5>
			<c:forEach var="bean" items="${bean.items}">
				상품명 : ${bean.product.name} / 상품가격 : ${bean.product.price }
			</c:forEach>
			
		</fieldset>
		</c:if>
</body>
</html>