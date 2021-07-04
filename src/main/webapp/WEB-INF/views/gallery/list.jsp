<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		fn_login();
		fn_leave();
		fn_logOut();
	})
	
	function fn_login(){
		$('#login_btn').click(function(){
			location.href = "loginPage.do";
		})
		
	}
	
	function fn_leave(){
		$('#leave_btn').click(function(){
		     if( confirm('정말 계정을 삭제하시겠습니까?')){
			
		    	 location.href='leave.do'
		     }
			
		})
		
	}
	function fn_logOut(){
		$('#logOut_btn').click(function(){
			if(confirm('로그아웃 하시겠습니까?')){
				location.href='logOut.do'
				
			}
		})
		
	}
	
	function fn_upload(){
		$('#upload_btn').click(function(){
			location.href='uploadPage.do'
		})
		
	}
	
	function fn_list(){
		
	}
	
	
	
	
	
	
	
	
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>갤러리 게시판</h1><br><br>
	
	<c:if test="${ empty loginUser}"><input type="button" id="login_btn" value="로그인하러가기"></c:if>
	
	<c:if test="${not empty loginUser}"><input type="button" id="logOut_btn" value="로그아웃하기"></c:if>
	
	<c:if test="${not empty loginUser}"><input type="button" id="leave_btn" value="회원 탈퇴하기"></c:if>
	
	<c:if test="${not empty loginUser}"><a href="insertPage.do">게시글  등록</a></c:if>
 	
	
 	
	
	
	<table border="1">
		<thead>
			<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
			<td>등록일</td>
			<td>수정일</td>
			<td>IP</td>
			<td>조회수</td>
							
			
			</tr>
			
		</thead>
		<tbody>
		<c:forEach var="list" items="list">
		<tr>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		</tr>
		</c:forEach>
		</tbody>
		<tfoot>
		<tr>
			<td colspan="7"></td>
		</tr>
		</tfoot>
	</table>
</body>
</html>