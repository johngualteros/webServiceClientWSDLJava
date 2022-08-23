<%-- 
    Document   : index
    Created on : 23/08/2022, 01:38:24 PM
    Author     : Aprendiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/Client" method="POST">
            <label for="numberAccount">Number Account </label>
            <input type="number" id="numberAccount" name="numberAccount"/>
            
            <button type="submit">Get Balance</button>
        </form>
        
        <h2><center>${balance}</center></h2>
    </body>
</html>
