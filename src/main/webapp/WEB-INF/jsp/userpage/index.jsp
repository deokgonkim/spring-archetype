<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="app.name" /></title>
</head>
<body>
<h2><spring:message code="userpage.title" /></h2>
<ul>
    <li><spring:message code="userpage.login" /> : <sec:authentication property="principal.username" /></li>
    <li><spring:message code="userpage.roles" /> : <sec:authentication property="authorities" /></li>
</ul>
</body>
</html>