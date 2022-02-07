<%-- 
    Document   : news
    Created on : Feb 26, 2021, 10:48:30 AM
    Author     : chutr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <h1 style="font-size: 50px; color: #FFFF00">Tin tức</h1>
        <div style="width: auto; height:auto;  ">
            <table style="margin-left: 30px;">
                <tr>
                    <td>
                    </td>
                    <td>
                    </td>
                </tr>
                <c:forEach items="${listN}" var="o">
                    <tr>
                        <td>
                            <img style="width:190px; height: 190px;" src="${o.nimage}">
                        </td>
                        <td style="padding-left: 40px; font-family: monospace;">
                            <a target="blank" style="text-decoration: none; font-size: 20px; color: #fff" href="${o.nlink}" ><h2>${o.nname}</h2></a>
                        </td>
                    </tr>
                </c:forEach>

            </table>
            <div style="text-align: center; font-size: 30px">
                <c:forEach begin="1" end="${end}" var="i">

                    <a style="color: #f3f2f7" href="newscontrol?index=${i}"> ${i}</a>
                </c:forEach> 
            </div>
        </div>
       
    </body>
</html>
