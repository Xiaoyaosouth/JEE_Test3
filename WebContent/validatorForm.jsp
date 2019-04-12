<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html charset=UTF-8">
<title>P425交易表单</title>
</head>
<body>
	<form action="./validate/annotation.do" method="post">
		<table>
			<tr>
				<td>产品编号：<input name="productId" id="productId"/></td>
			</tr>
			<tr>
				<td>用户编号：<input name="userId" id="userId"/></td>
			</tr>
			<tr>
				<td>交易日期：<input name="date" id="date"/></td>
			</tr>
			<tr>
				<td>价格：<input name="price" id="price"/></td>
			</tr>
			<tr>
				<td>数量：<input name="quantity" id="quantity"/></td>
			</tr>
			<tr>
				<td>交易金额：<input name="amout" id="amout"/></td>
			</tr>
			<tr>
				<td>用户邮件：<input name="email" id="email"/></td>
			</tr>
			<tr>
				<td>备注：<textarea id="note" name="note" rows="5" cols="20"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
				  <input type="submit" value="提交" />
				  <input type="reset" value="重填" />
				</td>
			</tr>
		</table>
	</form>
	<p>[测试提示]</p>
	<p>产品编号：12</p>
	<p>用户编号：1231</p>
	<p>交易日期：如2019-10-01</p>
	<p>价格：12323</p>
	<p>数量：500</p>
	<p>交易金额：3523</p>
	<p>邮件：email</p>
	<p>备注：随便</p>
</body>
</html>