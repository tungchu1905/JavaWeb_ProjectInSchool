<%-- 
    Document   : home
    Created on : Jan 25, 2021, 10:23:51 AM
    Author     : chutr
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/home.css" rel="stylesheet" type="text/css"/>
        <title>Home</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="underheader">
            <div class="homeleft"><img style="width: 100%; height: 100%; border-radius: 50px;" src="img/shop/gallery1.png"></div>
            <div class="homeright">
            </div>
        </div>
        <div>
            <div class="banner">
                <h1 style="font-family: monospace;text-align: center; font-size: 50px; color: #fff"> TOP 3 đồng hồ mới nhất </h1>

                <!-- 3 NEWSEST PRODUCTs  -->
                <div class="threenewest">

                    <c:forEach items="${listtop3}" var="o">
                        <div class="newest">
                            <div class="newestimage">
                                <a href="detail?pid=${o.id}&cate=${o.pcate}">
                                    <img  style="padding-left: 37px;  height: 270px;width: 300px;
                                          " src="${o.image}">
                                </a>
                            </div>
                            <div style="padding-left: 37px;">
                                <div> <p  style="font-size: 20px;
                                          color: #FFFF00;
                                          margin-top: 30px;font-family: monospace;"> ${o.name} </p>  </div>

                                <div ><p class="price"> ${o.price}$ </p> </div>

                                <a class="moredetail" href="detail?pid=${o.id}&cate=${o.pcate}">More Detail </a>  

                            </div>
                        </div>
                    </c:forEach>
                </div>

                <!-- Somes PRODUCTs  -->
                <h1 style="font-family: monospace;text-align: center; margin-bottom: 25px; color: #00DD00"> Một số mẫu sản phẩm </h1>

                <c:forEach items="${listcate}" var="o">

                    <div class="cate"  > <a style="text-decoration: none; font-size: 20px;" href="category?cid=${o.cid}&choi=1">${o.cname}</a> </div>
                </c:forEach>


                <div class="list"> 
                    <c:forEach items="${listP}" var="o">
                        <div class="product">
                            <div class="image">
                                <a href="detail?pid=${o.id}&cate=${o.pcate}">
                                    <img style="padding-left: 37px;
                                         height: 270px;width: 300px;" src="${o.image}">
                                </a>   
                            </div>
                            <div style="padding-left: 37px;">
                                <div>  <p class="name">  ${o.name}  </p></div>
                                <div >  <p class="price">  ${o.price}$  </p></div>

                                <a class="moredetail" href="detail?pid=${o.id}&cate=${o.pcate}">More Detail </a> 

                               

                            </div>

                        </div>
                    </c:forEach>
                </div>

            </div>

            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
