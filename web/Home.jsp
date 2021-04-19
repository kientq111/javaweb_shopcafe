<%-- 
    Document   : Home
    Created on : Dec 18, 2020, 6:08:32 PM
    Author     : KenKen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="css/web.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <jsp:include page="Header.jsp"/>
        </header>
        <div class="imgcat">
            <a href="articleController?p=1"><img src="images/cfbanner2.png" alt=""/></a>
            <a href="articleController?p=2" ><img  src="images/cfbanner1.png" alt="" align="right"/></a>
            <a href="articleController?p=5"><img src="images/cfbanner3.jpg" alt=""/></a>
            <a href=""><img src="images/cfbanner4.jpg" alt="" align="right"/></a>
            
        </div>
        <footer>
            <jsp:include page="Footer.jsp"/>
        </footer>
    </body>
</html>
