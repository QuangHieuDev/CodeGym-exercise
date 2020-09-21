<%--
  Created by IntelliJ IDEA.
  User: Piuta
  Date: 7/30/2020
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
    <style>
        div input{
            display: flex;
            justify-content: center;
        }
    </style>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form method="post" action="/product">
    <div>
        <label>Product Description: <input type="text" name="productDes" placeholder="Product Description"/></label><br/>
        <label>List Price: <input type="text" name="listPrice" placeholder="List Price"/></label><br>
        <label>Discount Percent: <input type="text" name="discountPer" placeholder="Discount Percent"/></label><br>
        <button type="submit" id="submit" value="CalculateDsicount">Calculate Dsicount</button>
        <button type="button" onclick="test()" hidden>Test</button>
    </div>
    <div id="out">

    </div>
</form>
<script>
    function test() {
        document.getElementById("out").innerHTML = "<h1>Display Discount</h1>" +
            "<h3>Product Description</h3>" +
            "<h3>List Price</h3>" +
            "<h3>Discount Percent</h3>" +
            "<h3>Discount Amount</h3>" +
            "<h3>Discount Price</h3>";
        console.log("001");

    }
</script>
</body>
</html>
