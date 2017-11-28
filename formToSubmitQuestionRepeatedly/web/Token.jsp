<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/28
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Token page</title>
</head>
<body>
        <s:form action="testToken">
            <s:token></s:token>
            <s:textfield name="username" label="userName"></s:textfield>
            <s:submit></s:submit>
        </s:form>
</body>
</html>
