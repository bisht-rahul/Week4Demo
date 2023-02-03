<%-- 
    Document   : helloWorldForm.jsp
    Created on : 27-Jan-2023, 12:59:03 PM
    Author     : Rahul Bisht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="hello">
            First Name: <input type="text" name="firstname"><br>
            Last Name: <input type="text" name="lastname"><br>
            <input type="submit" value="Submit">
        </form>
        
        <c:if test="${invalid == true}">
            <p>Invalid Entry. Please enter both your fristname and lastnames.</p>
         </c:if>
    </body>
</html>
