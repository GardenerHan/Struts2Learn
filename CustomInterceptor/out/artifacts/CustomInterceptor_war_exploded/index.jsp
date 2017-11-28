<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/28
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <s:form action="testInterceptor">
      <s:textfield name="username" label="userName"></s:textfield>
      <s:submit></s:submit>
    </s:form>

  </body>
</html>
