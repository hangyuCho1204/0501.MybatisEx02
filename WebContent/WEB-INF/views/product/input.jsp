<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color:red;
	}
</style>
<script type="text/javascript">
	function historyBack(){
		history.back(-1);
	}
</script>
</head>
<body>
	<h1>회원가입!</h1>
	<table>
	
	<sf:form method="post" modelAttribute="product">
	<tr>
			<td>
				<label>ID</label>
			</td>
			<td>
				자동부여!
			</td>
	</tr>	
	<tr>
			<td>
				<label>NAME</label>
			</td>
			<td>
				<sf:input id="name" path="name"/><sf:errors path="name" cssClass="error"/>
			</td>
	</tr>
	<tr>
			<td>
				<label>PRICE</label>
			</td>
			<td>
				<sf:input id="price" path="price"/><sf:errors path="price" cssClass="error"/>
			</td>
	<tr>
			<td>
				<label>DESCRIPTION</label>
			</td>
			<td>
				<sf:input id="description" path="description"/><sf:errors path="description" cssClass="error"/>
			</td>
	</tr>
	<tr align="center">
			<td>
			<input type="submit" id="sm">
			<input type="reset" value="칸비우기">
			<input type="button" value="돌아가기" onclick="historyBack()">
			</td>
	</tr>
	</sf:form>
	
	</table>

</body>
</html>