<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/24
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<s:debug></s:debug>
<s:form action="testUpload" method="POST" enctype="multipart/form-data">
    <s:file name="ppt" label="pptFile"></s:file>
    <%--这里会显示一个集合的形式[ffff, 0vvv, ogggg]--%>
    <s:textfield name="pptDesc" label="pptDesc"></s:textfield>
    <s:file name="ppt" label="pptFile"></s:file>
    <s:textfield name="pptDesc[1]" label="pptDesc"></s:textfield>
    <s:file name="ppt" label="pptFile"></s:file>
    <s:textfield name="pptDesc[2]" label="pptDesc"></s:textfield>
    <s:submit></s:submit>
</s:form>
</body>
</html>
