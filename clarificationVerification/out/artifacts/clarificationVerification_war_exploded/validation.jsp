<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/21
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>validation</title>
</head>
<body>
    <s:debug></s:debug>
    <br><br>
    <s:form action="testValidation">
        <s:textfield name="age" label="age"></s:textfield>
        <s:submit value="提交"></s:submit>
    </s:form>
    <s:fielderror></s:fielderror>
    <%-- map-->数组--%>
    ${fieldErrors.age[0]}
</body>
</html>
