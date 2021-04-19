<%-- 
Document   : AccountProfile
Created on : Dec 18, 2020, 11:23:12 PM
Author     : KenKen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.Account"%>
<%@page import="entity.Comment"%>
<%@page import="entity.Article"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/web.css" rel="stylesheet" type="text/css"/>
        <%
            ArrayList<Article> arcdetail = (ArrayList<Article>) request.getAttribute("arcdetail");
            ArrayList<Comment> cmt = (ArrayList<Comment>) request.getAttribute("cmtLs");
            ArrayList<Comment> cmtAdmin = (ArrayList<Comment>) request.getAttribute("cmtLsAdmin");
            Account acc = (Account) session.getAttribute("ac");
            String act = "CmtController?id=";
        %>
    </head>
    <body>

        <header>
            <jsp:include page="Header.jsp"/>
        </header>
        <div>
                <% for (Article a : arcdetail) {
                %>
                <div class="tittle">
                    <% act = act + a.getId();%>
                    <b><%=a.getTittle()%></a></b>
                    </br>
                    </br>
                </div>
                <div>
                    <image src="<%=a.getImg()%>" width="500" height="500">
                    </br>
                </div>
                <div class="content">
                    <p><%= a.getDetail()%></p>
                </div>
                ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                <%}%>
                <h3>Comment</h3>
                <% for (Comment c : cmt) {
                %>
                <table>
                    <tr>
                        <th><%=c.getAccount_username()%></th>
                        <td><%= c.getCmt()%></td>
                         <%
                    if (acc.getRole().equalsIgnoreCase("admin")) {%>
                       <td><button onclick="location.href = 'AdminCmtController?ID=<%=c.getCmtID()%>&check=d'">Delete</button></td> 
                       <%}%>
                    </tr>
                </table>
                --------------------------------------------------------
                <%}%>
                <%
                    if (acc.getRole().equalsIgnoreCase("admin")) {%>
                <% for (Comment cAd : cmtAdmin) {
                %>
                <table>
                    <tr>
                        <th><%=cAd.getAccount_username()%></th>
                        <td><%= cAd.getCmt()%></td>
                        <td><button onclick="location.href = 'AdminCmtController?ID=<%=cAd.getCmtID()%>&check=a'">Accept</button></td>
                        <td><button onclick="location.href = 'AdminCmtController?ID=<%=cAd.getCmtID()%>&check=d'">Delete</button></td>
                    </tr>
                </table>
                --------------------------------------------------------
                <%}%>
                <%}
                %>
                <br><br>
            
            <form action="<%=act%>" method="post">
                <tr>
                    <td><input type="text" name="cmt"></td>
                    <td><input type="submit" value="Gửi"/></td>
                </tr>
            </form>
            <br><br>
        </div>
        <footer>
            <jsp:include page="Footer.jsp"/>
        </footer>
    </body>
</html>
