<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일업로드 테스트</title>

<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>

<body>
<h2>파일업로드 TEST</h2>

<form name="uploadForm" id="uploadForm">
	<input type="file" name="fileId" id="fileId">
	<button type="button" id="uploadBtn">업로드</button>
</form>

<script>
$('#uploadBtn').on('click', function(){
	if(confirm('업로드하시겠습니까?') == true){
		document.uploadForm.method = "POST";
		document.uploadForm.enctype = "multipart/form-data";
		document.uploadForm.action = "uploadFileProc.do";
		document.uploadForm.submit();
	}	
});
</script>
</body>
</html>