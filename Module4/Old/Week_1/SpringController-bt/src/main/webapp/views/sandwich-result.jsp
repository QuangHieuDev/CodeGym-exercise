<%--
  Created by IntelliJ IDEA.
  User: Piuta
  Date: 8/16/2020
  Time: 11:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<div>
    <h1>Sandwich Condiments</h1>
    <div>
        <c:forEach var="i" item="condiment">
            <h3>${i}</h3>
        </c:forEach>
    </div>
    <form action="/save">
        <label for="check0"><input type="checkbox" id="check0" name="condiment"/>Lettuce</label>
        <label for="check1"><input type="checkbox" id="check1" name="condiment"/>Tomato</label>
        <label for="check2"><input type="checkbox" id="check2" name="condiment"/>Mustard</label>
        <label for="check3"><input type="checkbox" id="check3" name="condiment"/>Sprouts</label>
        <hr/>
        <button type="submit" value="sandwich">Save</button>
    </form>
</div>
</body>
</html>
