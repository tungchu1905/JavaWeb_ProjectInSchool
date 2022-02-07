<%-- 
    Document   : register
    Created on : Jan 25, 2021, 10:24:07 AM
    Author     : chutr
--%>

<%@page import="entity.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/register.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
       <body style=" background-image: url('https://wallpapershd.info/wp-content/uploads/2020/03/wallpaper-style-dial-wrist-watch-1583747822-featured-image.jpg')">



        <h1 style="text-align: center; color: rgb(255,255,255)">Đăng kí tài khoản</h1> 
        <div class="registerform" >
            <form action="home" method="get">
                <button  type="submit" class="btn btn-primary">Trở lại</button>
            </form>
            <div class="registerleft">
                <a style="background-color: #009966;font-family: monospace; color: #FFFF00; width: 30%;    height: 20%; padding: 20px;
                   margin: 30%;border:2px solid #ffffff;  border-radius: 10px;display: block;"  href="login.jsp"> Đã có tài khoản? Đăng kí ngay </a>
            </div>
            <div class="registerright">

                <form  action="login" method="post">
                    <h2 style="text-align: center;font-family: monospace; color: #FF6633"> Vui Lòng Đăng Kí</h2>

                    <div class="divinput">
                        <input oninput="checkusername()" id="usercheck" class="inputregister" type="text" name="username" value=""
                               placeholder="Username have 8 - 32 character" required="">
                    </div>
                    <div class="divinput">
                        <input oninput="checkpass()" id="pass" class="inputregister" type="password" name="password" value=""
                               placeholder="Password have more than 6 character" required>
                    </div>
                    <div class="divinput">
                        <input oninput="checkrepass()" id="repass" class="inputregister" type="password" name="repassword" value=""
                               placeholder="Repeat your password" required>
                    </div>

                    <div>

                        <input type="hidden" value="signup" name="command">
                        <input style="margin: 10px 0 0 40px; width: 20%; height:  40px" id="dangki" onclick="checklogin()" type="submit" value="Dang Ki">

                    </div>
                </form>

            </div>
        </div>
        <script>
            function checkusername() {
                var user = document.getElementById('usercheck').value;
                if (user.length < 8) {
                    user = "";
                    document.getElementById('usercheck').style.border = "2px solid red";
                } else {
                    document.getElementById('usercheck').style.border = "2px solid green";
                }
            }

            function checkpass() {
                var pass = document.getElementById('pass').value;
                if (pass.length < 6) {
                    document.getElementById('pass').style.border = "2px solid red";
                    pass = "";
                } else {
                    document.getElementById('pass').style.border = "2px solid green";
                }
            }

            function checkrepass() {
                var repass = document.getElementById('repass').value;
                var pass = document.getElementById('pass').value;

                if (repass === pass) {
                    repass = "";
                    document.getElementById('repass').style.border = "2px solid green";
                } else {
                    document.getElementById('repass').style.border = "2px solid red";
                }
            }
        </script>
    </body>
</html>
