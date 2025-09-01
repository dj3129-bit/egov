<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div><h3>����� ���</h3></div>
		
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>���̵�</th>
						<th>��й�ȣ</th>
						<th>����</th>
						<th>��ȭ��ȣ</th>
						<th>����</th>
					</tr>
				</thead>
				
				<tbody>
					<c:if test="${list.size() < 1}">
						<tr>
							<td colspan="5">�˻��� ����ڰ� �����ϴ�</td>
						</tr>
					</c:if>
					
					<c:forEach var="item" items="${list}">
						<tr>
							<td>${item.id}</td>
							<td>${item.password}</td>
							<td>${item.name}</td>
							<td>${item.tel}</td>
							<td><a href="update/${item.id}">����</a> <a href="delete/${item.id}">����</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<div>
			<div><a href="add">���</a></div>
			<div><a href="..">����</a></div>
		</div>
	</div>
</body>
</html>