<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 17-05-2023
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#ffe4c4">
<h1 align="center">update details</h1>
    <form:form modelAttribute="bank" action="updateCustomerDetails" method="post" align="center">

    <form:label path="customerId"> customerId:</form:label>
        <form:input path="customerId" readonly="true"></form:input>
    <br><br>
    <form:label path="customerName"> customerName:</form:label>
        <form:input path="customerName"></form:input>
    <br><br>
    <form:label path="accountType"> accountType:</form:label>
        <form:input path="accountType"></form:input>
    <br><br>
    <form:label path="PhoneNo"> PhoneNo:</form:label>
        <form:input path="phoneNo"></form:input>
    <br><br>
    <form:label path="address">address :</form:label>
        <form:input path="address"></form:input>
    <br><br>

    <form:label path="fatherName">fatherName :</form:label>
        <form:input path="fatherName"></form:input>
    <br><br>
    <form:label path="email">email:</form:label>
        <form:input path="email"></form:input>
    <br><br>

    <form:label path="aadhaarNo"> aadhaarNo:</form:label>
        <form:input path="aadhaarNo"></form:input>
    <br><br>

<%--        <form:label path="password"> password:</form:label>--%>
<%--        <form:password path="password"></form:password>--%>
<%--        <br><br>--%>
<%--        <form:label path="role"> role:</form:label>--%>
<%--        <form:input path="role"></form:input>--%>
<%--        <br><br>--%>

    <input type="submit" value="Submit">
    </form:form>


</body>
</html>
