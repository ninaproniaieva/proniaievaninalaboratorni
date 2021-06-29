<%-- 
    Document   : lab4
    Created on : 29.06.2021, 8:00
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
        
        <h3 align = "center">1.Очищення тексту.</h3>      
        <p align = "center"><%=request.getAttribute("cleanText")%></p>
       
        <h3 align = "center">2.Визначити загальну кількість слів у тексті.</h3>
        <p align = "center"><%=request.getAttribute("listSize")%></p>
        
        <h3 align = "center">3.Визначити кількість унікальних слів у тексті.</h3>
        <p align = "center"><%=request.getAttribute("setSize")%></p>
        
        <h3 align = "center">4.Визначити перші 8 слів, що зустрічаються найчастіше.</h3>
        <p align = "center"><%=request.getAttribute("6MostFrequentWords")%></p>
        
        <h3 align = "center">5.Визначити кількість слів, що не містять літеру s.</h3>
        <p align = "center"><%=request.getAttribute("AmountOfWordsWithoutV")%></p>
        
        <h3 align = "center">6.Визначити кількість слів, що мають рівно 4  літер.</h3>
        <p align = "center"><%=request.getAttribute("AmountOfWordsWith3UniqueLet")%></p>
        
        <h3 align = "center">7.Визначити перші 5 трьохлітерні послідовності у словах тексту, що зустрічаються найчастіше.</h3>
        <p align = "center"><%=request.getAttribute("find4MostPopular3Sequences")%></p>
        
        <div align = "center">
            <form action="index.jsp" align = "center">
                <input type="submit" value="Home">
            </form>
        </div>
        
    </body>
</html>