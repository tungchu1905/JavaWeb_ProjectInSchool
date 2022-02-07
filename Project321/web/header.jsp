<%-- 
    Document   : header
    Created on : Jan 25, 2021, 10:23:29 AM
    Author     : chutr
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body style="background-color: #336666">
        <div class="header2">
            <div class="left">
                <a style="background-color: #808080;" href="home">
                    <img style="width: 70%; border-radius: 50px;" src="https://cdn.dribbble.com/users/1162077/screenshots/5301081/timer_4x.png?compress=1&resize=400x300"> 
                </a> 

            </div>
            <div style="width: 65%;
                 height: 70px;
                 display: inline-block;
                 margin-top: 23px;">
                <a  href="home" > Trang chủ </a>
                <a href="shop"> Sản Phẩm  </a>
                <c:if test="${sessionScope.acc.isAdmin!=1}">
                    <a href="cart?aid=${acc.uid}"> Giỏ Hàng </a>

                    <a href="contact.jsp"> Liên hệ</a>  
                </c:if>
                <a href="newscontrol"> Tin tức </a>

                <c:if test="${sessionScope.acc.isAdmin==1}">
                    <a href="adminpage">
                        ADMIN PAGE
                    </a>
                    <a href="adminuser">
                        Quản lí user
                    </a>
                </c:if>
            </div>
            <div style="width: 22%;
                 height: 70px;
                 float: right;
                 margin-top: 21px;">
                <c:if test="${sessionScope.acc==null}">
                    <a href="login"><img src="img/icon/login.png">Login</a>
                    </c:if>
                    <c:if test="${sessionScope.acc!=null}">
                    <a href="profile.jsp">${sessionScope.username} </a>

                    <a  href="logout">Logout</a>
                </c:if>



            </div>
        </div>
        <div style="margin: 20px;">

            <form action="search" method="get">
                <input style="width: 500px; height: 30px; border-radius: 20px; " 
                       type="text" placeholder="Tim kiem" name="searchname" value="${nameofsearch}">
                <input style="border-radius: 15px;" type="submit" value="Tim Kiem">

            </form>

        </div>
    </body>
</html>
