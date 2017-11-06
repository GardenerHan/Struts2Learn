<%@ page import="java.util.List" %>
<%@ page import="com.struts2.mylearn.domian.City" %>
<%@ page import="java.util.ArrayList" %><%--
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
    <%
        List<City> cities = new ArrayList<>() ;
        cities.add(new City(1001,"AA")) ;
        cities.add(new City(1002,"BB")) ;
        cities.add(new City(1003,"CC")) ;
        request.setAttribute("cities",cities);

    %>

    <s:form action="save" >
        <s:hidden name="userId" value="1001"></s:hidden>
        <s:textfield name="userName" label="UserName"></s:textfield>
        <s:password name="password" label="PassWord"></s:password>
        <s:textarea name="desc"  label="Desc"></s:textarea>
        <s:checkbox name="married" label="Married"></s:checkbox>
        <s:radio name="gender" list="#{'1':'Male','0':'Female'}" label="Gender"></s:radio>
        <s:checkboxlist name="cities" list="#request.cities" listKey="cityId" listValue="cityName" label="City" ></s:checkboxlist>

        <s:select list="{11,22,33,44,55}"
                   headerKey=""
                   headerValue="请选择" label="Age" name="age">
            <%--s:optgroup 可作为s:select的子标签 用于显示更多的下拉框
               注意:必须有键值对 而不能使用一个集合>
            --%>
            <s:optgroup label="88-100" list="#{12:23,35:67}" ></s:optgroup>
            <s:optgroup label="99=78" list="#{34:56}" />
        </s:select>
        <s:submit></s:submit>
    </s:form>















</body>
</html>
