<%-- 
    Document   : home
    Created on : Oct 5, 2020, 12:10:58 PM
    Author     : 826847
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${username}</h2>
        
         <form action="login" method="get">
             <input type="submit" value="logout">
            <input type="hidden" name="action" value="reset">
         </form>
    </body>
</html>
