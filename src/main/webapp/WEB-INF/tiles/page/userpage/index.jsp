<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<h2><spring:message code="userpage.title" /></h2>
<ul>
    <li><spring:message code="userpage.login" /> : <sec:authentication property="principal.username" /></li>
    <li><spring:message code="userpage.roles" /> : <sec:authentication property="authorities" /></li>
</ul>