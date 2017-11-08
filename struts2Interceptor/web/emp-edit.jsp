<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/8
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:debug></s:debug>
    <s:form action="emp-update">
    <s:hidden name="employeeId"></s:hidden>
    <s:textfield label="FirstName" name="firstName"></s:textfield>
    <s:textfield label="LastName" name="lastName" ></s:textfield>
    <s:textfield label="Email" name="email"></s:textfield>
    <s:submit></s:submit>
</s:form>
</body>
</html>
