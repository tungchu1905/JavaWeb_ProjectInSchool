<%-- 
    Document   : shopcart
    Created on : Jan 25, 2021, 10:24:17 AM
    Author     : chutr
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Account"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/shopcart.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        <% ArrayList<Product> pd = (ArrayList<Product>) request.getAttribute("listCa"); %>
    </head>
    <body>
        <%
            double total = 0;
        %>
        

        <h1 style="text-align: center; font-size: 40px;color: coral">Giỏ Hàng của bạn</h1>
        <div class="cartS">
            <form action="cartcheck" method="get">
                <table>
                    <tr>
                        <th class="sanpham">
                            Sản phẩm
                        </th>
                        <th>
                            Số lượng mua
                        </th>
                        <th>
                            Gía
                        </th>
                        <th>
                            Tong
                        </th>
                        <th>

                        </th>
                    </tr>
                    <% for (int i = 0; i < pd.size(); i++) {
                    %>
                    <tr>
                        <td>
                            <img class="imge"src="<%=pd.get(i).getImage()%>" > <%=pd.get(i).getName()%>
                        </td>
                        <td>
                            <input style="font-size: 20px; text-align: center;" 
                                   type="number" value="<%= pd.get(i).getSoluong()%>" min="1" max="${detailp.quantity}" name="<%= pd.get(i).getImage()%>"  >
                        </td>
                        <td>
                            $<%=pd.get(i).getPrice()%>

                        </td>
                        <td>
                            <%= pd.get(i).getPrice() * pd.get(i).getSoluong()%>
                            <% total = total + pd.get(i).getPrice() * pd.get(i).getSoluong();%>
                        </td>
                        <td class="t-data"><a href="deleteCart?aid=${sessionScope.acc.uid}&pid=<%=pd.get(i).getId()%>">
                                <i class="ti-close"></i>X</a>
                        </td>

                    </tr>
                    <%}%>
                </table>
                <div style="text-align: center; font-size: 30px">
                    <c:forEach begin="1" end="${end}" var="i">

                        <a style="color: #f3f2f7" href="cart?index=${i}"> ${i}</a>
                    </c:forEach> 
                </div>
                <% if (total != 0) {%>
                <div style="float: right;">
                    <input style="width: 120px;height: 120px;" type="submit" value="Thanh toán">
                </div>
                <%}%>
            </form>
            <div style="width: 100%; display: inline">
                <div style="width: 25%; float: left;" >
                    <form action="shop" method="get">
                        <input style="width: 100%;height: 120px;" type="submit" value="Tiếp tục mua sắm">
                    </form>
                </div>

                <div style="width: 25%; float: right;" >
                    <form action="CartDeleteAll" method="get">
                        <input style="width: 50%;height: 120px;" type="submit" value="Xóa tất cả">
                    </form>  
                </div>
            </div>



        </div>

    </body>
</html>
