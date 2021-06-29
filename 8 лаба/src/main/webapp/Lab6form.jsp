<%-- 
    Document   : Lab6form
    Created on : 29.06.2021
    Author     : Proniaieva Nina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div>
            <form action="./Lab6" method="post">
                <h3>Введіть число</h3>
                <input type="text" name="number" placeholder="insert number"/>
                
                <h3>Дерево:{2, 3, 10, 11, 5, 1, 6, 8}</h3>
                <h3>Пошук по індексу</h3>       
                <input type="text" name="value" placeholder="insert index"/>
                <h3>Пошук елементу</h3>
                <input type="text" name="isValue" placeholder="insert element"/>
                <input type="submit" value="Ok">
            </form>
        </div>
    </body>
</html>

