<%-- 
    Document   : laboratorna1
    Created on : 28.06.2021 23:14
    Author     : Нина Проняева
--%>


<%@page import="IP12.proniaieva.lab2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <form action="./lab2" method="post" class="form-inline">
                    <label for="x">Enter x</label>
                    <div class="input-group">
                        <input  class="form-control" id="x" type="text" name="x" placeholder="##.###"/>
                        <input class="btn btn-success" type="submit" value="Submit"/>
                    </div>
                    <p class="mt-3 mb-0">Result: <%=request.getAttribute("result")%></p>
                </form>
               
    </body>
</html>



 
