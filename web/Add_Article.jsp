<%-- 
Document   : AccountProfile
Created on : Dec 18, 2020, 11:22:45 PM
Author     : KenKen
--%>

<%@page import="entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <jsp:include page="Header.jsp"/>
        </header>
        <%
            Account acc = (Account) session.getAttribute("ac");
        %>
        <form action="${pageContext.request.contextPath}\AddArticleController" method="POST" enctype="multipart/form-data">
            <table Cellspacing='20' style="border:2px solid orange;margin:auto">
                <h2>Update</h2>
             
                <tr>
                    <td>Title: </td>
                    <td><input type="text" name="title"/></td>
                </tr>
                <tr>
                    <td>Detail: </td>
                    <td><input type="textarea" name="detail"/></td>
                </tr>
                <tr>
                    <td>Img: </td>
                    <td><input type="file" name="img"/></td>
                </tr>
                <tr>
                    <td>CatID: </td>
                   
                    <td>  <select name="catID">
                            <option value="1">Menu</option>
                            <option value="2">Bảng Tin</option>
                            <option value="3">Ưu đãi</option>
                        </select> </td>
                        
                </tr>
                <tr>
                    <td><input type="submit" value="Add"/></td>
                    <td><input type="button" onclick="location.href = 'AccountProfile.jsp'" value="Cancel"/></td>
                </tr>
                <tr>
                    <td>
                        <%
                            if (acc.getRole().equalsIgnoreCase("admin")) {%>
                <tr>    
                    <td><input type="button" onclick="location.href = 'FunctionServlet'" value="Sửa/Xóa bài viết"/></td>
                </tr>
                <%}
                %>
                </tr>
            </table>
        </form>
        <footer>
            <jsp:include page="Footer.jsp"/>
        </footer>
    </body>
</html>

