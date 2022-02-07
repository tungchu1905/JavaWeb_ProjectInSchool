<%-- 
    Document   : changepass
    Created on : Mar 15, 2021, 10:44:35 PM
    Author     : chutr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body style="background-color:  #336666;">
        <style>
            .change-password {
                padding: 28%;
                margin-top: -29%;
            }
            .change-password .card-header {
                padding: 2.8%;
                border: 1px solid #bdbdbd;
            }
            .change-password .card-body {
                background: #ffffff;
                border: 1px solid #bdbdbd;
                padding: 7%;
                text-align: left;
                font-size: 13px;
                margin-bottom: -78%;
            }
            .change-password .btn{
                width: 100%;
                margin-top: 5%;
                font-size: 13px;
            }

        </style>
        <div class="change-password">
            <div class="card-header">
                <h2 style="color: #FFFF00">Đổi mật khẩu</h2>
            </div>
            <div class="card-body">
                <form action="changepass" method="get">
                  <div class="form-group">
                    <label for="pwd">Mật khẩu cũ</label>
                    <input type="password" id="pwd" name="pwd" value="${sessionScope.acc.password}" class="form-control">
                </div>
                <div class="form-group">
                    <label for="pwd">Mật khẩu mới</label>
                    <input type="password" id="pwd" name="newpass" class="form-control">
                    <span class="form-text small text-muted">Mật khẩu mới phải trên 6 kí tự
                    </span>
                </div>
                <div class="form-group">
                    <label for="pwd">Nhập lại mật khẩu</label>
                    <input type="password" id="pwd" name="renewpass" class="form-control">
                    <span class="form-text small text-muted">Nhập lại mật khẩu mới 1 lần nữa
                    </span>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn" Value="Xác nhận đổi mật khẩu">
                </div>  
                </form>
                
            </div>
        </div>
        
    </body>
</html>
