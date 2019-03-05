<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<div id="titleSection">
    <h2><a href="<c:url value="/" />"><spring:message code="app.name" /></a></h2>
</div>
<div id="topNavigation">
<sec:authorize access="hasRole('ROLE_ADMIN')">
    <a href="<c:url value="/admin" />"><spring:message code="topmenu.admin" /></a>
     | 
</sec:authorize>
    <a href="<c:url value="/userpage" />"><spring:message code="topmenu.userpage" /></a>
</div>
<div id="idSection">
<sec:authorize access="!isAuthenticated()">
    <a href="<c:url value="/spring_security_login" />"><spring:message code="common.login" /></a>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <a href="<c:url value="/userpage" />"><spring:message code="common.userpage"/></a>
    |
    <a href="<c:url value="/j_spring_security_logout" />"><spring:message code="common.logout" /></a>
</sec:authorize>
</div>