<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Bookshop2</title>
</head>
<body>
	<div>
		<div>
			<h1>BookShop2</h1>
		</div>
		
		<c:if test="${sessionScope.member == null}">
			<div>
				<div><a href="login">�α���</a></div>
			</div>
			<div>
				<div><a href="signup">ȸ������</a></div>
			</div>
		</c:if>
	
		<c:if test="${sessionScope.member != null}">
			<div>
				<div>${sessionScope.member.name}(${sessionScope.member.id})�� ȯ���մϴ�</div>
				<div><a href="logout">�α׾ƿ�</a> </div>
			</div>
		</c:if>
		
		<div>
			<div><a href="book/list">��������</a> </div>
			<div><a href="customer/list">������</a> </div>
			<div><a href="orders/list">�ֹ�����</a> </div>
		</div>
		
		<div>
			<div><a href="member/list">����� ����</a></div>
		</div>
	</div>
</body>
</html>