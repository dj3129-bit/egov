<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>

</head>
<body>
	<div>
		<div>
			<h3>ȸ������</h3>		
		</div>
		
		<div>
			<form method="post" name="signup_form">
				<div>
					<div><label>���̵�:</label></div>
					<div><input type="text" name="id"> 
					<div>
						<button type="button" id="check_id">[����] �ߺ�Ȯ��</button>
						<button type="button" id="check_id_async">[�񵿱�] �ߺ�Ȯ��</button>
						<button type="button" id="check_id_fetch">[fetch] �ߺ�Ȯ��</button>
					</div>
				</div>
				
				<div class="pwd">
					<div><label>��й�ȣ:</label></div>
					<div><input type="password" name="password"></div>
					<div><button type="button" class="view">Ȯ��</button></div>
				</div>
				
				<div class="pwd">
					<div><label>��й�ȣ Ȯ��:</label></div>
					<div><input type="password" name="check_password"></div>
					<div><button type="button" class="view">Ȯ��</button></div>
				</div>
				
				<div>
					<div><label>����:</label></div>
					<div><input type="text" name="name"></div>
				</div>
				
				<div>
					<div><label>��ȭ��ȣ:</label></div>
					<div><input type="text" name="tel"></div>
				</div>
				
				<div>
					<div><button type="button" id="signup">ȸ������</button></div>
					<div><a href=".."><button type="button">���</button></a></div>
				</div>
			</form>		
		</div>
	</div>
	
	<script src="/js/signup.js"></script>
</body>
</html>