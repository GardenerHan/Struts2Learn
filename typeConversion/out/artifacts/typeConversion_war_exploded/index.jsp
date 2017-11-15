<%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/11/14
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
    <h2>index</h2>
    <s:debug></s:debug>
    <br><br>
    <%--如果是simple主题，不会自动显示错误信息
        可以通过OGNL或者EL显示fieldErrors的值
        其中：fieldErrors是一个Map<String,List<String>>
        使用:Fielderror标签 但是内容会在ul li span标签下

        在template.simple下面的filederror.ftl定义了simple主题下的s:fielderror 标签的样式

    --%>
    <s:form action="testConversion" theme="simple">
     Age: <s:textfield name="age" label="age"></s:textfield>
    ${fieldErrors.age[0]}
        <s:fielderror fieldName="age" style="color:red"></s:fielderror>
     <br><br>
       bith: <s:textfield name="bith" ></s:textfield>
        <br><br>
      <s:submit value="提交"></s:submit>
    </s:form>
  </body>
</html>
