<%-- 
    Document   : login
    Created on : Oct 5, 2020, 12:00:38 PM
    Author     : 826847
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
         <h1>Login</h1>
        
        <form action="login" method="post">
           <label>Username:</label>
        <input type="text" name="username" value="">
        <br>
        <label>Password:</label>
        <input type="password" name="password" value="">
        <br>
        <input type="submit" value="Log in">
            
        </form>
         <p>${message}</p>
       
    </body>
</html>
