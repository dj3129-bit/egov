<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Language" content="ko" >
<title>데이터 가져오기</title>
</head>
<body>

<c:choose>
	<c:when test="${not empty result.tempId}">
		<c:set var="actionUrl" value="/tempCrud/update.do"/>
		<c:set var="pageName" value="수정"/>
	</c:when>
	<c:otherwise>
		<c:set var="actionUrl" value="/tempCrud/insert.do"/>
		<c:set var="pageName" value="등록"/>
	</c:otherwise>			
</c:choose>

<c:out value="${pageName}"/>폼
<form action="${actionUrl}" method="post" name="tempCrudVO">
	<input type="hidden" name="crudId" value="${result.crudId}"/>
	
	<label for="crudCtgry">카테고리</label>
	<select id="crudCtry" name="crudCtgry">
		<option value="수업1">수업1</option>
		<option value="수업2">수업2</option>
		<option value="수업3">수업3</option>
	</select>
	<br>
	<label for="crudSj">제목</label>
	<input type="text" name="crudSj" value="${result.crudSj}"/>
	<br/>
	<label for="crudSj">작성자</label>
	<input type="text" name="userNm" value="${result.userNm}"/>
	<br/>
	<label for="crudCn">내용</label>
	<textarea id="crudCn" name="crudCn"></textarea>
	<br/>
	<c:choose>
		<c:when test="${not empty result.tempId}">
			<button type="submit">수정</button>
		</c:when>
		<c:otherwise>
			<button type="submit">등록</button>
		</c:otherwise>			
	</c:choose>
</form>

 </body>
</html>