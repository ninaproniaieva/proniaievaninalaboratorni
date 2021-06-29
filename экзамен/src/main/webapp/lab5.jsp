<%-- 
    Document   : lab5
    Created on : 29.06.2021 8:32
    Author     : Proniaieva Nina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab5</title>
    </head>


    <body bgcolor="#FFFFF0">

        <h1 align="center"> Lab 5</h1>

        <hr noshade size="2" width="100%">

        <h2 align="center">Шукане слово</h2>
        <h3 align="center"><%=request.getAttribute("searchWord")%></h3>


        <hr noshade size="3" width="60%">

        <h2 align="center">Відсортувати список об'єктів</h2>
        <h3 align="center">Невідсортований список об'єктів</h3>
        <h3 align="center"><%=request.getAttribute("list")%></h3>

        <hr noshade size="3" width="60%">
        <h3 align="center">Відсортовані поля типу String</h3>
        <h3 align="center"><%=request.getAttribute("sortStr")%></h3>

        <hr noshade size="3" width="60%">
        <h3 align="center">Відсортовані поля типу Short</h3>
        <h3 align="center"><%=request.getAttribute("sortShr")%></h3>

        <hr noshade size="3" width="60%">
        <h3 align="center">Відсортований список об'єктів</h3>
        <h3 align="center"><%=request.getAttribute("sortedList")%></h3>

        <hr noshade size="3" width="60%">
        <h2 align="center">Багатопотоковий пошук</h2>
        <h3 align="center"><%=request.getAttribute("mts")%></h3>

        <hr noshade size="3" width="100%">
        <div>

            <form action="lab5form.jsp" align="center">

                <input type="submit" value="New values">

            </form>

        </div>


        <div>

            <form action="index.jsp" align="center">

                <input type="submit" value="Home">

            </form>

        </div>



        <hr noshade size="2" width="100%">
        <form action="../index.jsp" align="center">
            <input type="submit" value="Home">
        </form>

    </body>  


</html>