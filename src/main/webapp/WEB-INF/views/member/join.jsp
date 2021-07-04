<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html >
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		fn_join();
	}) 
	function fn_join(){
		$('#join_btn').click(function(){
			if ($('#id').val() == ''|| 
				$('#pw').val() == ''|| 
				$('#email').val() == ''|| 
				$('#name').val() == '' ) {
			   alert('아이디,비밀번호,이메일 ,이름은 필수 사항입니다.');
			   return false;
			}
			$('#f').attr('action','join.do')
			$('#f').submit();
		})
	}
</script>
</head>
<body>
	<h1>회원가입</h1><br><br>
	<form id="f" method="post">
		<input type="text" name="id" id="id" placeholder="아이디 입력" ><br>
		<input type="text" name="pw" id="pw" placeholder="비밀번호 입력" ><br>
		<input type="text" name="name"id="name" placeholder="이름  입력" ><br>
		<input type="text" name="phone" id="phone" placeholder="연락처" ><br>
		<input type="text" name="email"id="email" placeholder="이메일" ><br>
		<input type="text" name="addr" id="addr" placeholder="주소" ><br><br>
		<input type="button"  id="join_btn" value="회원가입하기">
	</form>
</body>
</html>