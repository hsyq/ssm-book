<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript">
	$(function() {
		//获取项目名
		var $projectName = $("#projectName").val();

		$("#btn1").click(function() {
			alert($projectName);
		})

		//获取当前url
		var curUrl = window.document.location.href;
		// 获取协议
		var protocol = window.location.protocol;
		// 获取主机名和端口号
		var host = window.location.host;
		// 获取主机名
		var hostName = window.location.hostname;
		var port = window.location.port;

		// 获取当前协议+主机+端口+项目
		var phpp = protocol +"//"+ host + $projectName;
		// alert(phpp);
		//http:localhost/ssm-book
		
		$("#ajax").click(function() {
		// var url="http://localhost/ssm-book/ajax";
		//var url = "${pageContext.request.contextPath }/test/ajax";
		/* var param = "yy";
			$.get(url,function(d){
				alert(d);
			}) 
 */		
		
			$.ajax({
				type:"post",
				url:"${pageContext.request.contextPath }/test/sendJson",
				contentType:"application/json;charset=utf-8",
				data:'{"userId":123,"username":"jack"}',
				success:function(data){
					alert(data);
				}	
			})
		})
	})
</script>
</head>
<body>

	隐藏框：获取当前项目名
	<input type="hidden" name="projectName" id="projectName"
		value="${pageContext.request.contextPath}" />
	<input type="button" id="btn1" value="取得工程名" /> 123

	<br>
	<%
		int i = 1;
		int j = 2;
	%>> ${pageContext.request.contextPath }

	<a href="${pageContext.request.contextPath }/aaa">ssm-book/aaa</a>
	<br>
	<c:if test="${3>1}">3大于1</c:if>
	<br> $.load()测试
	<br>

	<input type="button" id="ajax" value="点我">
	
	<br>
	上传图片测试<br>
	<form action="">
	<input>
		<img alt="" src="/pic">
	</form>
	
	<br>
	RestFul风格测试<br>
	<a href="${pageContext.request.contextPath }/user/123">/user/123</a>
</html>