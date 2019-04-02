<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<form action="login.do" method="post">
		<table align="center">
			<caption>
				<h3>用户登录</h3>
			</caption>
			<tr>
				<td>用户名：<input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;码：<input type="text" name="password" /></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="登录" /> <input
					type="reset" value="重填" /></td>
			</tr>
		</table>
	</form>
	<br>
	<form action="conv.do" method="post">
		<table align="center">
			<caption>
				<h3>类型转换</h3>
			</caption>
			<tr align="right">
				<td>你现在的年龄：<input type="text" name="age" />&nbsp;求过几年后的年龄：<input
					type="text" name="year" /></td>
			</tr>
			<tr align="right">
				<td>“数,数”字符串：<input type="text" name="pt" />&nbsp;“数,数”各移动几格？<input
					type="text" name="move" /></td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="确定" /> <input
					type="reset" value="重填" /></td>
			</tr>
		</table>
	</form>
</body>
</html>