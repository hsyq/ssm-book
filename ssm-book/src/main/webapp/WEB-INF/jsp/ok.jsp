<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
123

<br>
<% 
	int i=1;
	int j = 2;
%>>
${pageContext.request.contextPath }

<a href="${pageContext.request.contextPath }/aaa">ssm-book/aaa</a>
<br>
<c:if test="${3>1}">3大于1</c:if>
</html>