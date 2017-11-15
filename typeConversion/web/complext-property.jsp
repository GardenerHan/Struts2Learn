<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/15
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>complext-property</title>
</head>
<body>
    <s:debug></s:debug>
    <s:form action="testProperty">
        <s:textfield name="name" label="IndustryName"></s:textfield>
        <s:textfield name="cpy.name" label="name"></s:textfield>
        <s:textfield name="cpy.birth" label="birth"></s:textfield>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
