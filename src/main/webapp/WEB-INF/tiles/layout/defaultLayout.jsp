<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/css/reset.css" />">
<link rel="stylesheet" type="text/css" href="<c:url value="/css/layout.css" />">
<title><tiles:getAsString name="title" /></title>
</head>
<body>
<div id="header">
    <tiles:insertAttribute name="header"/>
</div>
<div id="menu">
    <tiles:insertAttribute name="menu" />
</div>
<div id="content">
    <tiles:insertAttribute name="content"/>
</div>
<div id="footer">
    <tiles:insertAttribute name="footer"/>
</div>
</body>
</html>