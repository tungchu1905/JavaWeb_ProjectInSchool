<%-- 
    Document   : contact
    Created on : Mar 9, 2021, 2:02:59 PM
    Author     : chutr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <section id="contact">
            <div class="container">
                <div class="well well-sm">
                    <h3><strong>Contact Us</strong></h3>
                </div>
                <form action="home" method="get">
                    <button type="submit" class="btn btn-primary">Back</button>
                </form>
                <div class="row">
                    <div class="col-md-7">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m10!1m8!1m3!1d3736489.7218514383!2d90.21589792292741!3d23.857125486636733!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sbd!4v1506502314230" width="100%" height="315" frameborder="0" style="border:0" allowfullscreen></iframe>
                    </div>

                    <div class="col-md-5">
                        <h4><strong>Get in Touch</strong></h4>
                        <form action="contact" method="get">
                            <div class="form-group">
                                <input type="text" class="form-control" name="name" value="" placeholder="Name">
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control" name="email" value="" placeholder="E-mail">
                            </div>
                            <div class="form-group">
                                <input type="tel" class="form-control" name="phone" value="" placeholder="Phone">
                            </div>
                            <div class="form-group">
                                <textarea class="form-control" name="mess" rows="3" placeholder="Message"></textarea>
                            </div>
                            <button class="btn btn-default" type="submit" name="button">
                                <i class="fa fa-paper-plane-o" aria-hidden="true"></i> Submit
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </section>
        <h1 style="text-align: center">${requestScope.success}</h1>
    </body>
</html>
