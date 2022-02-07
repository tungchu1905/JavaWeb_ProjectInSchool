<%-- 
    Document   : checkout
    Created on : Jan 25, 2021, 10:24:23 AM
    Author     : chutr
--%>

<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.Product"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>JSP Page</title>
        <% ArrayList<Product> pd = (ArrayList<Product>) request.getAttribute("listCa"); %>
    </head>
    <body>
        <%
            double total = 0;
        %>
        <div class="container wrapper">
            <form action="home" method="get">
                <button type="submit" class="btn btn-primary">Back</button>
            </form>
            <div class="row cart-body">
                <form class="form-horizontal" method="get" action="checkout">
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-push-6 col-sm-push-6">
                        <!--REVIEW ORDER-->
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                Review Order <div class="pull-right"></div>
                            </div>
                            <div class="panel-body">
                                <% for (int i = 0; i < pd.size(); i++) {
                                %>
                                <div class="form-group">
                                    <div class="col-sm-3 col-xs-3">
                                        <img style="height: 70px; width: 70px;" class="img-responsive" src=<%= pd.get(i).getImage()%> />
                                    </div>
                                    <div class="col-sm-6 col-xs-6">
                                        <div class="col-xs-12"><%= pd.get(i).getName()%></div>
                                        <div class="col-xs-12"><small>Quantity:<span><%= pd.get(i).getSoluong()%></span></small></div>
                                    </div>
                                    <div class="col-sm-3 col-xs-3 text-right">
                                        <h6><span>$</span><%= pd.get(i).getPrice() * pd.get(i).getSoluong()%></h6>
                                        <% total = total + pd.get(i).getPrice() * pd.get(i).getSoluong();%>
                                    </div>
                                </div>
                                <div class="form-group"><hr /></div>
                                <input type="hidden" name="<%= pd.get(i).getImage()%>" value="<%= pd.get(i).getQuantity() - pd.get(i).getSoluong()%>" >
                                <%}%>


                                <div class="form-group">
                                    <div class="col-xs-12">
                                        <strong>Subtotal</strong>
                                        <div class="pull-right"><span>$</span><span><%= total%></span></div>
                                    </div>
                                    <%if (total > 400) {%>
                                    <div class="col-xs-12">
                                        <small>Tiền Ship</small>
                                        <div class="pull-right"><span>0</span></div>
                                        <div class="form-group"><hr /></div>
                                        <div class="form-group">
                                            <div class="col-xs-12">
                                                <strong>Tổng cộng</strong>
                                                <div class="pull-right"><span>$</span><span><%= total + 0%></span></div>
                                            </div>
                                        </div>
                                    </div>
                                    <%} else {%>
                                    <div class="col-xs-12">
                                        <small>Tiền Ship</small>
                                        <div class="pull-right"><span>50$</span></div>
                                    </div>
                                    <div class="form-group"><hr /></div>
                                    <div class="form-group">
                                        <div class="col-xs-12">
                                            <strong>Tổng cộng</strong>
                                            <div class="pull-right"><span>$</span><span><%= total + 50%></span></div>
                                        </div>
                                    </div>
                                    <%}%>
                                </div>

                            </div>
                        </div>
                        <!--REVIEW ORDER END-->
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-pull-6 col-sm-pull-6">
                        <!--SHIPPING METHOD-->
                        <div class="panel panel-info">
                            <div class="panel-heading">Địa chỉ</div>
                            <div class="panel-body">
                                <div class="form-group">
                                    <div class="col-md-12">
                                        <h4>Địa chỉ ship</h4>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Họ và tên:</strong></div>
                                    <div class="col-md-12">
                                        <input type="text" name="fullname" class="form-control" placeholder="tên đầy đủ"value="" required="" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Địa chỉ: </strong></div>
                                    <div class="col-md-12">
                                        <input placeholder="Thôn, Xã, Huyện" type="text" name="address" class="form-control" value="" required="" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Thành phố</strong></div>
                                    <div class="col-md-12">
                                        <input type="text" name="city" placeholder="thành phố" class="form-control" value="" required="" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Số điện thoại:</strong></div>
                                    <div class="col-md-12"><input type="tel" name="phone_number" placeholder="điện thoại" required="" class="form-control" value="" /></div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Địa chỉ Email:</strong></div>
                                    <div class="col-md-12"><input type="email" name="email_address" placeholder="email" required="" class="form-control" value="" /></div>
                                </div>
                            </div>
                        </div>
                        <!--SHIPPING METHOD END-->
                        <!--CREDIT CART PAYMENT-->
                        <div class="panel panel-info">
                            <div class="panel-heading"><span><i class="glyphicon glyphicon-lock"></i></span> Secure Payment</div>
                            <div class="panel-body">
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Card Type:</strong></div>
                                    <div class="col-md-12">
                                        <select id="CreditCardType" name="CreditCardType" required="" class="form-control">
                                            <option value="Visa">Visa</option>
                                            <option value="MasterCard">MasterCard</option>
                                            <option value="American Express">American Express</option>
                                            <option value="Discover">Discover</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Credit Card Number:</strong></div>
                                    <div class="col-md-12"><input type="text" class="form-control" required="" name="card_number" value="" /></div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <button type="submit" class="btn btn-primary btn-submit-fix">Place Order</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--CREDIT CART PAYMENT END-->
                    </div>

                </form>
            </div>
            <div class="row cart-footer">

            </div>
        </div>


    </body>
</html>
