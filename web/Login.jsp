<%-- 
    Document   : Login
    Created on : Dec 18, 2020, 9:11:46 PM
    Author     : KenKen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/logincss.css" rel="stylesheet" type="text/css"/>
        <title>1970Cafe</title>
    </head>
    <body style="background: #804000">
        <form align="center" style="font-size: 25px" action="login" method="post">
            <div class="Avatar"> 
                <img src="images/cflogo1.png" alt="" height="400" width="400"/>
            </div>
            <div class="container">
                <label ><h1><b>1970's Coffe</b></h1></label>
                <label><b>Username</b></label><br> 
                <input type="text" placeholder="Enter Username" name="username" > <br>
                <label><b>Password</b></label> <br>
                <input type="password" placeholder="Enter Password" name="password" > <br>
                <button type="submit">Login</button> <br>
            </div>
            <div class="container">
                <button><a href="Register.jsp" style="text-decoration: none; color: #ffffff" > Register<a></button>
            </div>
        </form>
    </body>
</html>
