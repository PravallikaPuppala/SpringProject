<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 19-05-2023
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#ffe4c4">
<h1>Single Customer Details</h1>
<table border="2" width="70%" cellpadding="2">
    <tr><th>customerId</th><th>customerName</th><th>accountType</th><th>PhoneNo</th><th>address</th><th>fatherName</th><th>email</th>
        <th>aadhaarNo</th><th>Edit</th></tr>
    <tr>
        <td>${cust.customerId}</td>
        <td>${cust.customerName}</td>
        <td>${cust.accountType}</td>
        <td>${cust.phoneNo}</td>
        <td>${cust.address}</td>
        <td>${cust.fatherName}</td>
        <td>${cust.email}</td>
        <td>${cust.aadhaarNo}</td>

        <td><a href="editBank/${cust.customerId}">Edit</a></td>
    </tr>
</table>
<br>
   <a href="http://localhost:8088/SpringProject_war_exploded/login"><button>back</button></a>
   <a href="http://localhost:8088/SpringProject_war_exploded/"><button>logout</button></a>
</body>
</html>
