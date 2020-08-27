<%@ include file="/WEB-INF/views/common/include.jsp"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <div> <jsp:include page="header.jsp" /></div>    
        <div style="float:left;padding:10px;width:15%;"> <jsp:include page="menu.jsp" /></div>    
        <div style="float:left;padding:10px;width:80%;border-left:1px solid pink;">    
       <jsp:include page="${partial}" /></div>    
        <div style="clear:both"><jsp:include page="footer.jsp" /></div>    
</body>
</html>