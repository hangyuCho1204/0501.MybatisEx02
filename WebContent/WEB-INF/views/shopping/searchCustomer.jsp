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
	<h3>회원 검색</h3>
		<fieldset>
			<sf:form method="post" modelAttribute="customer">
				NAME : <sf:input path="name"/>
				ADDRESS : <sf:input path="address"/>
				E-MAIL<sf:input path="email"/>
				<input type="submit" value="검색"/>
			</sf:form>
		</fieldset>
		<c:if test="${lists!=null}">
		<fieldset>
			<table>
				<thead>
					<tr>
						<td>이름</td>
						<td>주소</td>
						<td>이메일</td>
				</thead>
				<tbody>
				<c:forEach var="bean" items="${lists}">
					
					<tr>
						<td>${bean.name}</td><td>${bean.address}</td><td>${bean.email}</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</fieldset>
		</c:if>
</body>
</html>