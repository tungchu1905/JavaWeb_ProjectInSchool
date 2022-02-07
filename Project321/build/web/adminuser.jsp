<%-- 
    Document   : adminuser
    Created on : Mar 16, 2021, 6:04:45 PM
    Author     : chutr
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <style>

            body{
                background:#f5f5f5;
                margin-top:20px;
                background-image: url('https://imagesvc.meredithcorp.io/v3/jumpstartpure/image?url=https://cf-images.us-east-1.prod.boltdns.net/v1/static/3281700261001/df4a47fa-1885-420a-9fc5-6274005d9723/f3a0496f-86cb-4621-b335-39c562d55119/1280x720/match/image.jpg&w=1280&h=720&q=90&c=cc')
            }
            .card {
                border: none;
                -webkit-box-shadow: 1px 0 20px rgba(96,93,175,.05);
                box-shadow: 1px 0 20px rgba(96,93,175,.05);
                margin-bottom: 30px;
            }
            .table th {
                font-weight: 500;
                color: #827fc0;
            }
            .table thead {
                background-color: #f3f2f7;
            }
            .table>tbody>tr>td, .table>tfoot>tr>td, .table>thead>tr>td {
                padding: 14px 12px;
                vertical-align: middle;
            }
            .table tr td {
                color: #8887a9;
            }
            .thumb-sm {
                height: 32px;
                width: 32px;
            }
            .badge-soft-warning {
                background-color: rgba(248,201,85,.2);
                color: #f8c955;
            }

            .badge {
                font-weight: 500;
            }
            .badge-soft-primary {
                background-color: rgba(96,93,175,.2);
                color: #605daf;
            }
        </style>
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="card">
                        <div class="card-body">
                            <form action="home" method="get">
                                <button  type="submit" class="btn btn-primary">Trở lại</button>
                            </form>
                            <h5 style="font-size: 40px; color: #8887a9" class="header-title pb-3 mt-0">Thông tin danh sách người dùng</h5>
                            <div class="table-responsive">
                                
                                <table class="table table-hover mb-0">
                                    <thead>
                                        <tr class="align-self-center">
                                            <th>ID</th>
                                            <th>Tên người dùng</th>
                                            <th>Tên tài khoản</th>
                                            <th>Số điện thoại</th>
                                            <th>Email người dùng</th>
                                            <th>Xóa</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listAc}" var="o">
                                            <tr>
                                                <td>${o.uid}</td>
                                                <td><img src="https://bootdey.com/img/Content/avatar/avatar6.png" alt="" class="thumb-sm rounded-circle mr-2"> ${o.fullname}</td>
                                                <td>${o.username}</td>
                                                <td>${o.phone}</td>
                                                <td>${o.email}</td>
                                                <td><span class="badge badge-boxed badge-soft-warning"><a href="deleteuser?userid=${o.uid}">Xóa người dùng</a></span></td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!--end table-responsive-->
                            <div class="pt-3 border-top text-right"><a style="padding: 8px 16px; background-color: #f5f5f5; border-radius: 10px;" href="adminadduser.jsp" class="text-primary">Thêm tài khoản ảo <i class="mdi mdi-arrow-right"></i></a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
