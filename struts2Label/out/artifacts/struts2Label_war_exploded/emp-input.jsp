<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/6
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>emp-input</title>
</head>
<body>
    <%
        //方式二:设置属性
    request.setAttribute("theme","xhtml");
    %>
    <s:debug></s:debug>
    <%--theme 设置主题--%>
    <%--方式一: 标签上添加theme="simple" --%>
    <s:form action="emp-save" >
        <s:textfield label="Name" name="name" ></s:textfield>
        <s:password label="Password" name="password"></s:password>
        <s:radio list="#{'1':'Male','2':'Female'}" label="Gender" name="gender"></s:radio>
        <s:select list="#request.depts" name="dept" listValue="deptName" listKey="deptId" label="Department"></s:select>
        <s:checkboxlist list="#request.roles" name="roles" listKey="roleId" listValue="roleName" label="Roles"></s:checkboxlist>
        <s:textarea label="Desc" name="desc"></s:textarea>
        <s:submit value="提交"></s:submit>
    </s:form>
</body>
</html>
