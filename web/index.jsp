<%-- 
    Document   : index
    Created on : 21 Apr, 2020, 1:31:41 PM
    Author     : Vishwas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login Here</h1>
        <div>
            <form action="Login" method="POST">
            <center><h1>Login here</h1></center>
            <center>
            UserName :<input type="text" name="username" placeholder="Username">
            Password :<input type="text" name="password" placeholder="Password">
            <br>
            <input type="submit" value="Submit">
            </center>
            </form>
        </div>
    </body>
</html>
