<%-- 
    Document   : adminadduser
    Created on : Mar 16, 2021, 11:53:16 PM
    Author     : chutr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-image: url('https://i.pinimg.com/564x/a7/91/9d/a7919dd1f52c70282a887c5b6c3f9be3.jpg')">
        <style>
            form{
                width: 50%;
                height: 100%;
                border:2px solid black;
                background-color: #FF99CC;
                border-radius: 10px;
               
            }
            .divinput{
                width: 80%;
            }
            .inputregister{
                width: 100%;
                height: 40px;
                margin: 10px;
            }
        </style>
        <form  action="AdminAddUser" method="get">
            <h2 style="text-align: center;font-family: monospace; color: #ffffff; font-size: 30px;"> Tạo account ảo</h2>

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
    </body>
</html>
