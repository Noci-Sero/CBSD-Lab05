<%-- 
    Document   : studenttable
    Created on : Oct 4, 2025, 3:56:09 AM
    Author     : Noci-Sero
--%>

<%@page import="StudentServlet.Student, StudentServlet.StudentTable, java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! List<Student> pupilList;%>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>GPA</th>
                </tr>
            </thead>
            <tbody>
                <%
                    pupilList = StudentTable.findAllStudent();
                    System.out.println(pupilList.size());
                    for (int i = 0; i < pupilList.size(); i++) {
                        out.println("<tr>");
                        out.println("<td>" + pupilList.get(i).getStudentid() + "</td>");
                        out.println("<td>" + pupilList.get(i).getStudentname() + "</td>");
                        out.println("<td>" + pupilList.get(i).getGpa() + "</td>");
                        out.println("</tr>");
                    }
                %>
            </tbody>
        </table>
        <a href="index.html">Back to Add Student</a>
    </body>
</html>
