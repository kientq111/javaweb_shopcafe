<%-- 
    Document   : Header
    Created on : Dec 18, 2020, 3:48:48 AM
    Author     : KenKen
--%>

<%@page import="entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Hiphop Page</title>
        <link href="css/web.css" rel="stylesheet" type="text/css"/>

    </head>

    <body>
        <%
            Account acc = (Account) session.getAttribute("ac");
        %>


        <div class="header-area">
            <div class="logo">
                <a href="Home.jsp" >
                    <img src="images/cf1.png" alt="HomePage"  style="width:500px;height:200px; margin-left: 50px" />
                </a>
                <div align="right"><jsp:include page="Search.jsp"/></div>
            </div>
            <div class="categories" id="menu">
                <ul>
                    <li><a href="Home.jsp">TRANG CHỦ<a></li>
                                <li><a href="Introduce.jsp">CÂU CHUYỆN<a></li>
                                            <li><a href="articleController?p=1">THỰC ĐƠN<a></li>
                                                        <li><a href="articleController?p=2">BẢNG TIN<a></li>
                                                                    <li><a href="articleController?p=3">ƯU ĐÃI<a></li>
                                                                                <li><a>MORE<a>
                                                                                            <ul class="submenu" style="text-align: left">
                                                                                                <%
                                                                                                                            if (acc.getRole().equalsIgnoreCase("admin")) {%>
                                                                                                <li><a href="ShowFBController">Feedback</a></li>
                                                                                                    <%} else {%>
                                                                                                <li><a href="Feedback.jsp">Feedback</a></li>
                                                                                                    <%}
                                                                                                    %>
                                                                                                <li><a href="AccountProfile.jsp">Tài khoản</a></li>
                                                                                            </ul>
                                                                                            </li>

                                                                                            </ul>
                                                                                            </div>
                                                                                            </div>

                                                                                            </body>
                                                                                            </html>

