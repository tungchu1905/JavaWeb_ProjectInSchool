<%-- 
    Document   : login
    Created on : Jan 25, 2021, 10:23:58 AM
    Author     : chutr
--%>

<%@page import="entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    </head>
    <body style=" background-image: url('https://wallpapershd.info/wp-content/uploads/2020/03/wallpaper-style-dial-wrist-watch-1583747822-featured-image.jpg')">

        <h1 style="text-align: center;font-family: monospace;color: rgb(255,255,255) ">Đăng nhập</h1> 
        <div class="loginform" >
            <form action="home" method="get">
                <button  type="submit" class="btn btn-primary">Trở lại</button>
            </form>
            <div class="loginleft">
                <a style="background-color: #009966;font-family: monospace; color: #FFFF00; width: 30%;    height: 20%; padding: 15px;
                   margin: 30%;border:2px solid rgb(255,255,255);  border-radius: 10px;display: block;" href="register.jsp" >Tạo tài khoản mới </a>
            </div>
            <div class="loginright">
                <form  action="login" method="post">
                    <h2 style="text-align: center;font-family: monospace; color: #FF6633"> Vui Lòng Đăng Nhập</h2>
                    ${requestScope.mess}
                    <div  class="divinput">
                        <input  class="inputlogin" type="text" name="username" value="${username}"
                                placeholder="Username" required="">
                    </div>
                    <div class="divinput">
                        <input id='pass' class="inputlogin" type="password" name="password" value="${password}"
                               placeholder="Password" required=""> 
                        <img onclick="show()" style="height: 25px; width: 25px; float: right;"
                             src="https://images.vexels.com/media/users/3/132068/isolated/preview/f9bb81e576c1a361c61a8c08945b2c48-search-icon-by-vexels.png">
                    </div>
                    <div>
                        <div style="margin-left: 20px;">
                            <input type="checkbox" name="remember">
                            <label for="f-option">Remember me</label>
                        </div>
                        <input type="hidden" value="loginaccount" name="command">
                        <input style="width: 20%; height: 40px; margin: 30px 0px 0px 40px;" type="submit" value="Login">

                    </div>
                </form>
            </div>
        </div>
        <script>
            function show() {
                let x = true;
                if (x === true) {
                    document.getElementById('pass').type = "text";
                    x = false;
                } else if (x === false) {
                    document.getElementById('pass').type = "password";
                    x = true;
                }

            }
        </script>
    </body>
</html>
