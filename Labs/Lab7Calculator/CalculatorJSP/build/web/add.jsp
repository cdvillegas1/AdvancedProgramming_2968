<%-- 
    Document   : add
    Created on : May 22, 2019, 12:31:58 PM
    Author     : cadavi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>The addition is: </h1>
        <%="<h1> The sum is " + (Integer.parseInt(request.getParameter("t1"))
                + Integer.parseInt(request.getParameter("t2"))) + "</h1>"%>

    </body>
</html>
