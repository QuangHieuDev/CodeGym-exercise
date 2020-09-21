<%--
  Created by IntelliJ IDEA.
  User: Piuta
  Date: 8/11/2020
  Time: 11:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap.min.css">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

</head>
<body>
<div>
    <div>
        <form action="/action=search">
            <a href="/product?action=search"><button type="button" value="add">+Add new profuct</button></a>
            <input type="text" name="name" value="" placeholder="Search name product">
            <button type="submit" value="search">Search</button>
        </form>
    </div>
    <h3>Product List</h3>
    <table id="table" class="table table-striped">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Quantity</th>
            <th scope="col">Color</th>
            <th scope="col">Category</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="product" items='${requestScope["listProduct"]}'>
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getQuantity()}</td>
                <td>${product.getColor()}</td>
                <td>${product.getCategory()}</td>
                <td>
                    <a href="/product?action=editProduct&id=${product.getId()}"><button type="button" value="/product?action=editProduct">Edit</button></a>
                    <a href="/product?action=deleteProduct&id=${product.getId()}"><button type="button" value="/product?action=deleteProduct">Delete</button></a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap.min.js"></script>

<script>
    $(document).ready(function () {
        $('#table').DataTable();
    });
</script>
</body>
</html>