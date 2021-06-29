<%-- 
    Document   : Lab8
    Created on : 29.06.2021 9:24
    Author     : Proniaieva Nina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="knu.fit.ist.ta.lab8.AlgorithmDetails"%>
<%@page import="knu.fit.ist.ta.lab8.Task"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 8</title>
    </head>
    <body>
        <div>
            <h1>Lab 8</h1>
            <form action="index.jsp">
                <input type="submit" value="Home">
            </form>
            <div>
                <h2>Відсортувати масив цілих чисел</h2>
                <p><b>Вихідні дані:</b><br>Кількість елементів: 30000</p>
                    <%! Task algorithms = new Task(30000);%>
                <hr>
                <% AlgorithmDetails insertionSort = algorithms.insertionSort();%>
                <p><b>Назва алгоритму: </b>Insertion Sort</p>
                <p><b>Час роботи:</b>  <%= insertionSort.getTime()%>ms</p>
                <p><b>Кількість порівнянь </b><%= insertionSort.getComparisons()%></p>
                <p><b>Кількість перестановок </b><%= insertionSort.getSubstitutions()%></p>
                <p><b>Складність(Big-O): O^2</b></p>
                <hr>
                <% AlgorithmDetails heapSort = algorithms.heapSort();%>
                <p><b>Назва алгоритму: </b>Heap Sort</p>
                <p><b>Час роботи:</b>  <%= heapSort.getTime()%>ms</p>
                <p><b>Кількість порівнянь </b><%= heapSort.getComparisons()%></p>
                <p><b>Кількість перестановок </b><%= heapSort.getSubstitutions()%></p>
                <p><b>Складність(Big-O): O(nlog n)</b></p>
                <hr>
                <% AlgorithmDetails bubbleSort = algorithms.bubbleSort();%>
                <p><b>Назва алгоритму: </b>Buble Sort</p>
                <p><b>Час роботи:</b>  <%= bubbleSort.getTime()%>ms</p>
                <p><b>Кількість порівнянь </b><%= bubbleSort.getComparisons()%></p>
                <p><b>Кількість перестановок </b><%= bubbleSort.getSubstitutions()%></p>
                <p><b>Складність(Big-O): O^2</b></p>
            </div>
        </div>
    </body>
</html>

