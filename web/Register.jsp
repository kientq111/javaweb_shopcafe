<%-- 
    Document   : Register
    Created on : Dec 18, 2020, 5:27:27 PM
    Author     : KenKen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/logincss.css" rel="stylesheet" type="text/css"/>
        <title>REGISTER</title>
    </head>
    <body style="background: #804000">
        <form align="center" style="font-size: 25px" action="register" method="post">
            <div class="Avatar"> 
                <img src="images/cflogo1.png" alt="" height="400" width="400"/>
            </div>
            <div class="container">
                <label ><b>REGISTER</b></label> <br> <br>
                
                <label><b>Username</b></label><br> 
                <input type="text" placeholder="Enter Username" name="username" required> <br><br>
                <label><b>Password</b></label> <br>
                <input type="password" placeholder="Enter Password" name="password" required> <br><br>
                <label><b>Fullname</b></label><br> 
                <input type="text" placeholder="Enter Fullname" name="fullname" required> <br><br>
                <label><b>Gender</b></label>
                <input type="radio" name="gender" value="1"> Male
                <input type="radio" name="gender" value="0"> Female<br><br>
                <label><b>Role: User</b></label><br><br>
                
                <button type="submit">Register</button> <br>
            </div>
            <div class="container">
                <button><a href="Login.jsp">Cancel</a></button>
            </div>
        </form>
    </body>
</html>
