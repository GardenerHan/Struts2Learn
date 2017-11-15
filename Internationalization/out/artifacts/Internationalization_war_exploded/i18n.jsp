<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/15
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>i18n</title>
</head>
<body>
    <s:debug></s:debug>
    <s:text name="time">
     <s:param value="date"></s:param>
    </s:text>
    <s:text name="time2"></s:text>
    <s:form action="" theme="simple">
       <%--lable会写死,但是这样用OGNL也ok，可以从国际资源文件中获取value
       因为对象栈中有DefaultTextProvider的实例，用getText()方法可以访问国际化资源文件
       %{getText()}强制OGNL解析

       如果是simple主题 上面都不行了
       需要自己写lable 用:
        <s:text name="username"></s:text>:
       --%>
        <%--
            页面上可以直接用<s:text name=""/> 标签来访问国际化资源
        --%>
       <s:text name="username"></s:text>: <s:textfield name="username" label="%{getText('username')}"></s:textfield>
       <s:text name="username"></s:text>: <s:textfield name="username" key="username"></s:textfield>
       <s:text name="password"></s:text>: <s:textfield name="userpassword" key="password"></s:textfield>
        <s:submit key="submit" value="%{getText('submit')}"></s:submit>
    </s:form>
</body>
</html>
