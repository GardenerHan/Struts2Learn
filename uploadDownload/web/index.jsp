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
<s:form action="testUpload" method="POST" theme="simple" enctype="multipart/form-data">
    <s:fielderror name="ppt"></s:fielderror>
    pptFile:<s:file name="ppt" label="pptFile"></s:file>
    <%--这里会显示一个集合的形式[ffff, 0vvv, ogggg]--%>
    <%--如果只是总的超了上传大小 是 actionErrors--%>
    <br>
    pptDesc:<s:textfield name="pptDesc" label="pptDesc"></s:textfield>
    <br><br>
    pptFile:<s:file name="ppt" label="pptFile"></s:file>

    <br>
    pptDesc:<s:textfield name="pptDesc[1]" label="pptDesc"></s:textfield>
    <br><br>
    pptFile:<s:file name="ppt" label="pptFile"></s:file>
    <br>
    pptDesc<s:textfield name="pptDesc[2]" label="pptDesc"></s:textfield>
    <br><br>
    <s:submit></s:submit>
</s:form>
</body>
</html>
