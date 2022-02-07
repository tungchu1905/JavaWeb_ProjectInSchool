<%-- 
    Document   : pdetail
    Created on : Jan 26, 2021, 4:35:55 PM
    Author     : chutr
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/productdetail.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        <style>
            h6{
                font-size: 22px;
                margin: 15px 0 20px 2px;
                font-family: monospace; color: #FFFF00;
            }
        </style>
    </head>
    <body>

        <%@include file="header.jsp" %>
        <h1 style="font-family: monospace;text-align: center; font-size: 50px; color: coral"> Chi Tiết Sản Phẩm </h1>
        <div  class="inbody">
            <div class="Bodyleft">
                <div class="menu">

                    <dl>
                        <dt style="font-family: monospace;font-size: 20px; color: #db4a39">Mẫu theo màu</dt>
                        <c:forEach items="${listC}" var="o">
                            <dd style="font-family: monospace;padding: 10px 0;"><a style="padding: 5px 10px;text-decoration: none; background-color: appworkspace; border-radius:4px; " href="category?cid=${o.cid}&choi=2&choice=1">${o.cname}</a></dd>
                            </c:forEach>
                        <dt style="font-family: monospace;font-size: 20px; color: #db4a39">Các loại đồng hồ</dt>
                        <c:forEach items="${listT}" var="o">
                            <dd style="font-family: monospace;padding: 10px 0;"><a style="padding: 5px 10px;text-decoration: none; background-color: appworkspace; border-radius:4px; " href="category?tid=${o.tid}&choi=2&choice=2">${o.tname}</a></dd>
                            </c:forEach>
                    </dl>

                </div>
                <div style="width: 90%; height: 500px; border: 1px solid black">
                    <img style="width:100%;height: 500px;" src="img/shop/gallery2.png">
                </div>
            </div>
            <div class="Bodyright">
                <div class="inleft">
                    <img style="width: 100%;height: 100%;" src="${detailp.image}">
                </div>
                <div class="inright">
                    <h6>Gía tiền: ${detailp.price}$ </h6>
                    <h6>Tên bánh: ${detailp.name} </h6>
                    <c:if test="${detailp.quantity==0}">
                        <h6> Hết hàng  </h6>
                    </c:if>
                    <c:if test="${detailp.quantity!=0}">

                        <h6>Số Lượng hàng: ${detailp.quantity} </h6>

                    </c:if>
                        <h6 style="color: #ffffff">${detailp.description} </h6>

                    <c:if test="${sessionScope.acc!=null}">
                        <c:if test="${sessionScope.acc.isAdmin!=1}">
                            <c:if test="${detailp.quantity!=0}">

                                <form action="addcart" method="get">
                                    <input hidden="" name="aid" value="${acc.uid}">
                                    <input hidden="" name="pid" value="${detailp.id}">
                                    <input type="number" value="1" min="1" max="${detailp.quantity}" name="soluong" >

                                    <br>  <img src="img/icon/cart.png"> <input style="width: 150px;height: 40px;" type="submit" value="Thêm vào giỏ">
                                </form>
                            </c:if>
                        </c:if>

                    </c:if>
                    <c:if test="${o.quantity== 0}">
                        <div><p>Hết Hàng</p></div>
                    </c:if>
                </div>
                <h1 style="text-align: center; color: coral;">Các sản phẩm liên quan</h1>
                <div class="under">
                    <c:forEach items="${listR}" var="o">
                        <div class="related"> 
                            <a href="detail?pid=${o.id}&cate=${o.pcate}">
                                <img style="width: 100%; height: 70%;" src="${o.image}">
                            </a> 
                            <h3 style="font-family: monospace; color: #FFFF00">  ${o.name} </h3>
                            <h3 style="color: #FFFF00">  ${o.price} </h3>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>
    </body>
</html>
