 Document   : lab3
    Created on : 28.06.2021 21:30
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
        <h1>Task of lab 3(task 2)</h1>
        <P>Заповнити масив 30 натуральних випадкових чисел в діапазоні від 1 до k включно. Визначити, скільки з них є простими числами</P>
    
        <P>  <%=request.getAttribute("resultArray")%></P>
        <P> <%=request.getAttribute("result")%></P>
        
        <div><form action="lab3form.jsp">
                <input type="submit" value="New k">
            </form> 
        </div>


        <div><form action="index.jsp">
                <input type="submit" value="Home">
            </form> 
        </div>
        
    </body>
</html>


        <div><form action="index.jsp">
                <input type="submit" value="Home">
            </form> 
        </div>
        
    </body>
</html>

        <div><form action="index.jsp">
                <input type="submit" value="Home">
            </form> 
        </div>
        
    </body>
</html>
