<%-- 
    Document   : addstudent
    Created on : Oct 4, 2025, 3:55:46 AM
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
        <h1>ID: <%=request.getParameter("id")%> </h1>
        <h1>Name: <%=request.getParameter("name")%> </h1>
        <h1>GPA: <%=request.getParameter("gpa")%> </h1>
        <h1>is added</h1>
        <jsp:include page="studenttable" flush="true"/>
    </body>
</html>
