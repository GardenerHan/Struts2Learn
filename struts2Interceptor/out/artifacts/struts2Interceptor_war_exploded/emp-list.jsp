<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/8
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>emp-list</title>
</head>
<body>
    <s:debug></s:debug>
    <s:form action="emp-save">
        <s:textfield label="FirstName" name="firstName"></s:textfield>
        <s:textfield label="LastName" name="lastName" ></s:textfield>
        <s:textfield label="Email" name="email"></s:textfield>
        <s:submit></s:submit>
    </s:form>
    <br><br>
    <table cellpadding="10" border="1" style="text-align: center">
        <thead>
            <tr>
                <td>ID</td>
                <td>FirstName</td>
                <td>LastName</td>
                <td>Email</td>
                <td>Edit</td>
                <td>Delete</td>
            </tr>
        </thead>
        <tbody>
            <s:iterator value="#request.emps">
                <tr>
                    <td>${employeeId}</td>
                    <td>${firstName}</td>
                    <td>${lastName}</td>
                    <td>${email}</td>
                    <td><a href="emp-edit?employeeId=${employeeId}">Edit</a> </td>
                    <td><a href="emp-delete?employeeId=${employeeId}">Delete</a> </td>

                </tr>
            </s:iterator>
        </tbody>
    </table>
</body>
</html>
