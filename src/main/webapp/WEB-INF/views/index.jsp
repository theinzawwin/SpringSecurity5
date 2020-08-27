<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sec:authentication property="principal.username" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sec:authorize access="hasRole('ROLE_ADMIN')">
<a href="<c:url value='/admin/index.htm' />">Admin</a>
</sec:authorize>
<sec:authorize access="hasRole('ROLE_ADMIN')">
<a href="<c:url value='/item/list.htm' />">Item Edit</a>
</sec:authorize>
<sec:authorize access="hasRole('ROLE_MANAGER')">
<a href="<c:url value='/manager/manager.htm' />">Manager</a>
<a href="<c:url value='/item/edit.htm' />">Item Edit</a>
</sec:authorize>

<a href="<c:url value='/logout.htm' />">Click here to logout</a> 
</body>
</html>