<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/1
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>form_tag</title>
</head>
<body>
    <s:debug></s:debug>
    <%--struts2 from标签 自动排版 自动回显
       回显原理:从栈顶开始找，并将匹配到的对
     --%>
    <s:form action="save" >
        <s:textfield name="userName" label="UserName"></s:textfield>
        <s:password name="password" label="PassWord"></s:password>
        <s:textarea name="desc"  label="Desc"></s:textarea>
        <s:submit></s:submit>
    </s:form>
</body>
</html>
