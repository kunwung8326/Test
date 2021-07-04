<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>새글 등록 창 </h1>
	<form id="f" method="post" enctype="multipart/form-data">
	작성자
	<input type="text" name="writer" id="writer" ><br><br>
	제목
	<input type="text" name="title" id="title"><br><br>
	내용
	<input type="text" name="content"  id="content"><br><br>
	파일첨부 
	<input type="file" name="files" multiple><br><br>
	<button>저장하기</button>
	
	</form>
</body>
</html>