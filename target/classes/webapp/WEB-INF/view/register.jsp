<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 23-05-2023
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>

        .error{color: red}
    </style>
</head>
<body bgcolor="#ffe4c4">


<%--@elvariable id="bank" type="skytech"--%>
<form:form modelAttribute="bank" action="success" method="post" align="center" >
    <h1>Bank of Baroda registration form</h1>
    <form:label path="customerName"> customerName:</form:label>
    <form:input path="customerName"></form:input>
    <br>
    <form:errors path="customerName" cssClass="error"></form:errors>
    <br><br>
    <form:label path="accountType"> accountType:</form:label>
    <form:input path="accountType"></form:input>

    <br>
    <form:errors path="accountType" cssClass="error"></form:errors>
    <br><br>
    <form:label path="PhoneNo"> PhoneNo:</form:label>
    <form:input path="PhoneNo"></form:input>
    <br>
    <form:errors path="PhoneNo" cssClass="error"></form:errors>
    <br><br>
    <form:label path="address">address :</form:label>
    <form:input path="address"></form:input>
    <br>
    <form:errors path="address" cssClass="error"></form:errors>
    <br><br>
    <form:label path="fatherName">fatherName :</form:label>
    <form:input path="fatherName"></form:input>
    <br>
    <form:errors path="fatherName" cssClass="error"></form:errors>
    <br><br>
    <form:label path="email">email:</form:label>
    <form:input path="email"></form:input>
    <br>
    <form:errors path="email" cssClass="error"></form:errors>
    <br><br>

    <form:label path="aadhaarNo"> aadhaarNo:</form:label>
    <form:input path="aadhaarNo"></form:input>
    <br>
    <form:errors path="aadhaarNo" cssClass="error"></form:errors>
    <br><br>
    <form:label path="password"> password:</form:label>
    <form:input path="password"></form:input>
    <br>
    <form:errors path="password" cssClass="error"></form:errors>
    <br><br>

    <form:label path="role"> role:</form:label>
    <form:input path="role"></form:input>

    <br><br>
    <input type="submit" value="Submit">
    <a href="http://localhost:8088/SpringProject_war_exploded/" ><input type="button" value="back"></a>
    <a href="http://localhost:8088/SpringProject_war_exploded/"><button>logout</button></a>
</form:form>
</body>
</html>
