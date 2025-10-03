<%-- 
    Document   : error.jsp
    Created on : Oct 4, 2025, 3:55:55 AM
    Author     : Noci-Sero
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>There is an existing student with this ID</h1>
        <jsp:include page="studenttable" flush="true"/>
    </body>
</html>
