<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data">
	<div>
		<input type="file" name="files" />
	</div>
	<div>
		<input type="file" name="files" />
	</div>
	<div>
		<input type="file" name="files" />
	</div>
	<div>
		<input type="file" name="files" />
	</div>
	<div>
		<input type="file" name="files" />
	</div>
	
	<div>
		<input type="submit" /> <!-- value값 지정하지 않았을 경우 '제출'로 출력됨 -->
	</div>
</form>

</body>
</html>