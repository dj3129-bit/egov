<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			<div><h3>����� ���� ����</h3></div>
			
			<div>
				<form method="post">
					<div>
						<div><label>���̵�:</label></div>
						<div><input type="text" name="id" value="${item.id}"></div>
					</div>
					<div>
						<div><label>��й�ȣ:</label></div>
						<div><input type="text" name="password" value="${item.password}"></div>
					</div>
					<div>
						<div><label>����:</label></div>
						<div><input type="text" name="name" value="${item.name}"></div>
					</div>
					<div>
						<div><label>��ȭ��ȣ:</label></div>
						<div><input type="text" name="tel" value="${item.tel}"></div>
					</div>
					<div>
						<div><button>���</button></div>
						<div><a href="../list"><button type="button">���</button></a></div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>