<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Trainee
  Date: 18-05-2023
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1 align="center"> Login Here</h1>
    <h2 style="color: red" align="center">${message}</h2>
    <center>
        <form name='loginForm' action="<c:url value="/login" />" method='POST'>

            <table>
                <tr>
                    <td>Email:</td>
                    <td><input type='text' name='email' placeholder='email'></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type='password' name='password' placeholder="password" /></td>
                </tr>
                <tr>
                    <td><input name="submit" type="submit" value="submit" /></td>
                    <td><input name="reset" type="reset"/> <input type="hidden"/></td>
                </tr>
            </table>
        </form>
    </center>
</head>
<body bgcolor="#ffe4c4">

</body>
</html>
