<%-- 
    Document   : shop
    Created on : Jan 25, 2021, 10:23:35 AM
    Author     : chutr
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/shop.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <style>
            p{font-family: monospace; color: #FFFF00;}
        </style>
        <%@include file="header.jsp" %>
        <h1 style="text-align: center; font-size: 50px;color: coral"> Danh sách sản phẩm </h1>
        <div  class="inbody">
            <div class="Bodyleft">
                <div class="menu">

                    <dl>
                        <dt style="font-family: monospace; color: #FFFF00;font-size: 20px; color: #db4a39">Mẫu theo màu</dt>
                        <c:forEach items="${listC}" var="o">
                            <dd style="padding: 10px 0;"><a style="padding: 5px 10px;text-decoration: none; background-color: appworkspace; border-radius:4px;  "
                                                            href="category?cid=${o.cid}&choi=2&choice=1">${o.cname}</a></dd>
                            </c:forEach>
                        <dt style="  font-family: monospace; color: #FFFF00;font-size: 20px;  color: #db4a39" >Các loại đồng hồ</dt>

                        <c:forEach items="${listT}" var="o">
                            <dd style="padding: 10px 0;"><a style="padding: 5px 10px;text-decoration: none; background-color: appworkspace; border-radius:4px; " 
                                                            href="category?tid=${o.tid}&choi=2&choice=2">${o.tname}</a></dd>
                            </c:forEach>

                    </dl>



                </div>
                <div style="width: 90%; height: 600px; border: 1px solid black">
                    <img style="width: 100%;height: 600px;" src="img/shop/gallery2.png">
                </div>
            </div>
            <div class="Bodyright">
                <c:forEach items="${listS}" var="o">
                    <div class="shopproduct">
                        <div class="image">
                            <a href="detail?pid=${o.id}&cate=${o.pcate}"> 
                                <img style="                            
                                     height: 270px;width: 270px;                                    
                                     " src="${o.image}"> </a> 
                        </div>
                        <div> 
                            <p><a style="font-family: monospace; color: #FFFF00; font-size: 15px;" href="detail?pid=${o.id}&cate=${o.pcate}"> ${o.name}</a></p>

                        </div>
                        <div> <p class="price">${o.price}$</p>  </div>
                        <div> <p class="moredetail">${o.description}</p>  </div>
                        <c:if test="${sessionScope.acc!=null}">
                            <c:if test="${sessionScope.acc.isAdmin!=1}">
                                <c:if test="${o.quantity != 0}">
                                    <div> <p class="addtocart"> <img  src="img/icon/cart.png">
                                            <a style="font-family: monospace; color: #fff; font-size: 15px;background-color: #FF6633;padding: 5px 10px; border-radius: 10px; " href="addcart?aid=${acc.uid}&pid=${o.id}&soluong=1">
                                                Thêm vào giỏ </a></p> </div> 
                                            </c:if> 
                                        </c:if>

                            <c:if test="${o.quantity== 0}">
                                <div><p>Hết Hàng</p></div>
                            </c:if>


                        </c:if>

                    </div>
                </c:forEach>
                <div style="text-align: center; font-size: 30px">
                    <c:forEach begin="1" end="${end}" var="i">
                        <a style="color: #f3f2f7" href="shop?index=${i}"> ${i}</a>
                    </c:forEach> 
                </div>

            </div>
        </div>
    </body>
</html>
