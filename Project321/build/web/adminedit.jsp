<%-- 
    Document   : adminedit
    Created on : Feb 10, 2021, 10:36:25 AM
    Author     : chutr
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>
        <style>
            .ip{
                margin: 10px;
            }
            table tr td{
                padding: 5px 20px 5px 20px;
                color: #FFFF00;
                font-size: 30px;
            }
            td input{
                width: 250px;
                height: 40px;
            }
            h2{
                color: #FF6633;
                font-size: 30px;
            }
            form{
                background-color: #3399FF
            }
            select{
                width: 250px;
                height: 40px;
            }
        </style>
    </head>
    <body style="background-color:  #ffffff;">
        <%
            int a = Integer.parseInt(request.getParameter("xet"));
        %>



        <%    if (a == 2) { %>
        <h2 style="text-align: center;">Edit Product</h2><br>
        <form action="adminedit" method="get">
            <table style="margin:0 auto;" >
                <tr> 
                    <td>
                        <%    if (a == 2) {
                                int pidd = Integer.parseInt(request.getParameter("pid"));%>

                        <input hidden="" name="pid" value="<%= pidd%>">
                        <%}%>
                    </td>
                </tr>
                <tr>

                    <td>
                        <img style="width: 100px; height: 100px;" src="${pd.image}">
                    </td> 
                    <td>
                        <!--                        <input  class="ip" id="filebutton" name="image" 
                                                        type="file" accept=".jpg,.jpeg,.png" required="">-->
                    </td>


                    <td>Name :</td>
                    <td><input class="ip" value="${pd.name}" type="text" name="name" required=""> </td>
                </tr>
                <tr>
                    <td>Category ID: </td>
                    <td><select name="catename">
                            <c:forEach items="${listC}" var="o">
                                <option value="${o.cid}">${o.cname}</option> 
                            </c:forEach></select>
                    </td>
                    <td>Taste ID: </td>
                    <td><select  name="tastename">  
                            <c:forEach items="${listT}" var="o">
                                <option value="${o.tid}">${o.tname}</option> 
                            </c:forEach></select>  </td>

                </tr>
                <tr>
                    <td>Price:   </td>
                    <td><input class="ip"  value="${pd.price}" type="text" name="price" required=""></td>
                    <td>Description:  </td>
                    <td><input class="ip" value="${pd.description}" type="text" name="des"  required=""></td>

                </tr>
                <tr>
                    <td> Title: </td>
                    <td> <input class="ip" value="${pd.title}" type="text" name="title" required=""></td>
                    <td>Quantity: </td>
                    <td><input class="ip" value="${pd.quantity}" type="text" name="quantity" required=""></td>
                </tr>
            </table>
            <input hidden="" name="adminchose" value="2">
            <input style="width: 150px; height: 50px;"  type="submit" value="Confirm">
        </form>

        <%}%>
        <%    if (a == 1) { %>
        <h2 style="text-align: center;">Add Product</h2><br>
        <form action="adminedit" method="get">
            <table style="margin:0 auto" >
                <tr> 

                </tr>
                <tr>

                    <td>
                        Image:  
                    </td> 
                    <td><input  class="ip" id="filebutton" name="image" 
                                type="file" accept=".jpg,.jpeg,.png" required=""></td>


                    <td>Name :</td>
                    <td><input class="ip" type="text" name="name" required=""> </td>
                </tr>
                <tr>
                    <td>Category ID: </td>
                    <td><select name="catename">
                            <c:forEach items="${listC}" var="o">
                                <option value="${o.cid}">${o.cname}</option> 
                            </c:forEach></select>
                    </td>
                    <td>Taste ID: </td>
                    <td><select name="tastename">  
                            <c:forEach items="${listT}" var="o">
                                <option value="${o.tid}">${o.tname}</option> 
                            </c:forEach></select>  </td>

                </tr>
                <tr>
                    <td>Price:  </td>
                    <td><input class="ip" type="text" name="price" required=""></td>
                    <td>Description:  </td>
                    <td><input class="ip" type="text" name="des"  required=""></td>

                </tr>
                <tr>
                    <td> Title: </td>
                    <td> <input class="ip" type="text" name="title" required=""></td>
                    <td>Quantity: </td>
                    <td><input class="ip" type="text" name="quantity" required=""></td>
                </tr>
            </table>
            <input hidden="" name="adminchose" value="1">
            <input style="width: 150px; height: 50px;"  type="submit" value="Confirm"><br>
        </form>
        <%}%>
        <form action="adminpage" method="get">
            <button style="margin: 2% 40%; width: 150px; height: 50px;" type="submit" class="btn btn-primary">Trở lại</button>
        </form>
    </body>
</html>
