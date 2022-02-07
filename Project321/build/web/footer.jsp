<%-- 
    Document   : footer
    Created on : Jan 25, 2021, 10:23:42 AM
    Author     : chutr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link href="https://netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">

        <link href='https://fonts.googleapis.com/css?family=Inconsolata:400,700' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <style>
            .button {

                display: inline-block;
                height: 40px;
                line-height: 40px;
                padding-right: 30px;
                padding-left: 70px;
                position: relative;
                background-color:rgb(0,0,0);
                color:rgb(255,255,255);
                text-decoration: none;
                text-transform: none;
                letter-spacing: 1px;
                margin-bottom: 14px;
                text-shadow:1px 1px 0px rgba(0,0,0,0.5);
            }

            .button:hover{
                text-decoration: none;
                color: #fff;
                text-shadow: none;
            }

            .button p{font-size: 18px;}
            .button span {
                position: absolute;
                left: 0;
                width: 50px;
                font-size:30px;
                -webkit-border-top-left-radius: 5px;
                -webkit-border-bottom-left-radius: 5px;
                -moz-border-radius-topleft: 5px;
                -moz-border-radius-bottomleft: 5px;
                border-top-left-radius: 5px;
                border-bottom-left-radius: 5px;
                border-right: 1px solid  rgba(0,0,0,0.15);
                text-decoration: none;
            }

            .button.facebook {
                background: #3b5998;
            }
            .button.google-plus{
                background: #db4a39;
            }
            .button.github{
                background: #171515;
            }
            .button.instagram{
                background: #3f729b;
            }
            h1{
                color:#9966FF ;font-family: monospace;
            }
            h1:hover{
                color: #ffffff;
            }
        </style>
        <div class="container">

            <div class="text-center center-block">
                <h1>Trang sức chẳng bao giờ thực sự hút mắt tôi, nhưng đồng hồ thì luôn luôn làm tôi chú ý.</h1>

                <br />
                <a href="https://www.facebook.com/tungchu195/" target="_blank" class="button facebook"><span><i class="fa fa-facebook" aria-hidden="true"></i></span><p>Facebook</p></a>
                <a href="https://www.instagram.com/tungfchu/" class="button instagram"><span><i class="fa fa-instagram" aria-hidden="true"></i></span><p>Instagram</p></a>
                <a href="https://plus.google.com/+Colorlib" target="_blank" class="button google-plus"><span><i class="fa fa-google-plus" aria-hidden="true"></i></span><p>Google +</p></a>
                <a href="https://github.com/tungtungchu6996" target="_blank" class="button github"><span><i class="fa fa-github" aria-hidden="true"></i></span><p>Github</p></a>

            </div>
            <hr>
        </div>

        <br />

        <!-- Social Footer, Single Coloured -->
        <!-- Include Font Awesome Stylesheet in Header -->
        <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">


    </body>
</html>
