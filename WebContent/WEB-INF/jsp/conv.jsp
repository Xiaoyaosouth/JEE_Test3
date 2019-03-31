<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>类型转换结果页面</title>
</head>
<body>
	<p>你十年后的年龄是：${requestScope.age }</p>
	<p>移动后的点是：${requestScope.pt }</p>
	<input type="button" value="返回" onClick="location='index.jsp'"/>
</body>
</html>