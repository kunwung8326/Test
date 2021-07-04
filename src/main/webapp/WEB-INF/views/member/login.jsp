<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html  >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		fn_join();
		fn_login();
		
	})
	function fn_join(){
		$('#join').click(function(){
			location.href = 'joinPage.do'
		})
	} 
	function fn_login(){
		$('#login').click(function(){
			$('#f').attr('action','login.do')
			$('#f').submit();
				
			
			
		})
		
	}
	
	
	
	
	
	
</script>
</head>
<body>
	<h1>로그인</h1><br><br>
	<form  id="f" method="post" >
	<input type="text" name="id" id="id"  placeholder="ID"><br> 
	<input type="password" name="pw" id="pw"  placeholder="PW"><br>
	<input type="button" id="login" value="로그인">&nbsp;
	<input type="button" id="join" value="회원가입">&nbsp;
	
	</form>
</body>
</html>