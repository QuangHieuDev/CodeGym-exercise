<%--
  Created by IntelliJ IDEA.
  User: Piuta
  Date: 8/20/2020
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="user" action="/create" method="post">
    <form:hidden path="id"/>
    Name: <form:input path="name"/><br>
    Gender: <form:radiobuttons path="gender" items="${gendersArray}"/><br>
    Is admin: <form:checkbox path="admin"/><br>
    Hobbies: <form:checkboxes path="hoddies" items="${hobbiesArray}"/><br>
    Type: <form:select path="type" items="${typesArray}"/><br>
    Country: <form:select path="country"  items="${countriesArray}"/><br>
    <button type="submit">Create user</button>
</form:form>
</body>
</html>
