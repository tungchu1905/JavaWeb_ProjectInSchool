<%-- 
    Document   : profile
    Created on : Mar 3, 2021, 12:04:19 PM
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

        <!------ Include the above in your HEAD tag ---------->

        <div class="container">
            <form action="home" method="get">
                <button type="submit" class="btn btn-primary">Back</button>
            </form>
            <div class="row">

                <div class="col-md-9">
                    <div class="card">
                        <div class="card-body">
                            <div class="row">
                                <div class="col-md-12">
                                    <h4>Thông tin của bạn</h4>
                                    <hr>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <form action="userupdate" method="get">
                                        <input hidden="" name="id" value="${sessionScope.acc.uid}">
                                        <div class="form-group row">
                                            <label for="username" class="col-4 col-form-label">User Name*</label> 
                                            <div class="col-8">
                                                <input id="username" disabled="" value="${sessionScope.username}" name="username" placeholder="Username" class="form-control here"  type="text">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="name" class="col-4 col-form-label">Name</label> 
                                            <div class="col-8">
                                                <input id="name" value="${sessionScope.acc.fullname}" name="name" placeholder="Full Name" class="form-control here" type="text">
                                            </div>
                                        </div>

                                        <div class="form-group row">
                                            <label for="email" class="col-4 col-form-label">Email*</label> 
                                            <div class="col-8">
                                                <input id="email" name="email" value="${sessionScope.acc.email}" placeholder="Email" class="form-control here" required="required" type="email">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="phone" class="col-4 col-form-label">Phone</label> 
                                            <div class="col-8">
                                                <input id="website" name="phone" value="${sessionScope.acc.phone}" placeholder="phone" class="form-control here" type="tel">
                                            </div>
                                        </div>
                                        <!--                                        <div class="form-group row">
                                                                                    <label for="publicinfo" class="col-4 col-form-label">Public Info</label> 
                                                                                    <div class="col-8">
                                                                                        <textarea id="publicinfo" name="publicinfo" cols="40" rows="4" class="form-control"></textarea>
                                                                                    </div>
                                                                                </div>-->
                                        

                                        <div class="form-group row">
                                            <div class="offset-4 col-8">
                                                <button name="submit" type="submit" class="btn btn-primary">Lưu lại</button> ${requestScope.mess}
                                            </div>
                                        </div>
                                    </form>
                                    <a style="" href="changepass.jsp"> <button class="btn btn-primary">Đổi mật khẩu</button></a>

                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
