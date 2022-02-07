<%-- 
    Document   : adminpage
    Created on : Feb 23, 2021, 9:38:51 PM
    Author     : chutr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/adminpage.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <%@include file="header.jsp" %>
        <table>
            <tr>
                <th class="ten">
                    Tên 
                </th>
                <th class="anhadmin">
                    Ảnh 
                </th>
                <th>
                    Giá
                </th>
                <th class="tit">
                    Title
                </th>
                <th>
                    Số lượng
                </th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach items="${listP}" var="o">
                <tr>
                    <td>
                        ${o.name}
                    </td>
                    <td>
                        <img class="imge" src="${o.image}">
                    </td>
                    <td>
                        ${o.price}
                    </td>
                    <td>
                        ${o.title}
                    </td>
                    <td>
                        ${o.quantity}
                    </td>
                    <td><a style="color: #ffffff;" href="admincontrol?pid=${o.id}&xet=2"> Chỉnh sửa </a></td>
                    <td><a style="color: #ffffff;" href="admindelete?pid=${o.id}" > Xóa </a></td>
                </tr>
            </c:forEach>
                <tr> <th> <a style="color: #ffffff;" href="admincontrol?xet=1">Thêm sản phẩm</a>  </th>
                    <th><h4>Tổng số mặt hàng: ${requestScope.count}</h4></th>
                    </tr>
        </table>
        <div style="text-align: center; font-size: 30px">
            <c:forEach begin="1" end="${end}" var="i">

                <a style="color: #f3f2f7" href="adminpage?index=${i}"> ${i}</a>
            </c:forEach> 
        </div>
    </body>
</html>
