<%--
  Created by IntelliJ IDEA.
  User: Piuta
  Date: 8/11/2020
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product Management Application</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Product Management</h1>
</div>
<div align="center">
    <form method="post" action="/product?action=updateProduct">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit User
                </h2>
            </caption>
            <c:if test="${product != null}">
                <input type="hidden" name="id" value="${product.getId()}"/>
            </c:if>
            <tr>
                <th>Product Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="${product.getName()}"/>
                </td>
            </tr>
            <tr>
                <th>Product price:</th>
                <td>
                    <input type="number" name="price" size="45"
                           value="${product.getPrice()}"/>
                </td>
            </tr>
            <tr>
                <th>Quantity:</th>
                <td>
                    <input type="number" name="quantity" size="15"
                           value="${product.getQuantity()}"/>
                </td>
            </tr>
            <tr>
                <th>Color:</th>
                <td>
                    <input type="text" name="color" size="15"
                           value="${product.getColor()}"/>
                </td>
            </tr>
            <tr>
                <th>Category:</th>
                <td>
                    <select name="category">
                        <c:forEach items='${requestScope["categoryList"]}' var="category">
<%--                            <option value="${category}" <c:if test="${category == product.getCategory()}"> selected </c:if> > ${category.getName()}</option>--%>
                            <option value="${category}" <c:if test="${category == product.getCategory()}"> selected </c:if> > ${category}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button type="submit" value="save">Save</button>
                    <a href="product?action"><button type="button" value="back">Back</button></a>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>