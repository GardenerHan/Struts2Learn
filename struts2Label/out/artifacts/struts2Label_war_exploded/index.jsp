<%@ page import="com.struts2.mylearn.domian.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.struts2.mylearn.psdd.PersonComparator" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: guixain
  Date: 2017/10/31
  Time: 17:07
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
   <h3>test</h3>
   personName:<s:property value="name"></s:property>
   <h2>set</h2>
   <s:set var="personName1" value="name" scope="request"></s:set>
   personRequestname:${requestScope.personName1}
  <br>
  personRequestname:${requestScope.personName}
  <br><br>
  <h2>push</h2>
  <%
    Student student = new Student() ;
    student.setAge(10);
    student.setStundentName("小学僧") ;
    request.setAttribute("student",student) ;
  %>
  <s:push value="#request.student">${stundentName}</s:push>
  <br><br>
  <h2>if else elseif</h2>
  <s:if test="age > 1 && age < 10">
     10> age > 1
  </s:if>
  <s:elseif test="age > 10">
       age >10
  </s:elseif>
  <s:else>
      age  < 1
  </s:else>
  <br><br>
  <h2>iterator</h2>
  <%
      List<Student> list = new ArrayList<>() ;
      list.add(new Student("AA",10)) ;
      list.add(new Student("bb",21)) ;
      list.add(new Student("KK",23)) ;
      request.setAttribute("list",list);
  %>
  <s:iterator value="#request.list" var="studentlist">
        ${stundentName}----${age}<br>
  </s:iterator>
  <br><br>
  <s:iterator value="list">
      ${stundentName}--- ${age}<br>
  </s:iterator>
  <br><br>
  <h2>sort</h2>
  <%
      PersonComparator pc = new PersonComparator() ;
      request.setAttribute("comparator",pc);
  %>
  <s:sort comparator="#request.comparator" source="list" var="student2">  </s:sort>
      <s:iterator value="#attr.student2">
          ${stundentName}---${age}
      </s:iterator>

  <br><br>
  <%
      Date date = new Date()  ;
      session.setAttribute("date",date);
  %>
    <s:date name="#session.date" format="yyyy-MM-dd ss:mm:hh" var="date2"></s:date>
   date:${date2}
    <br><br>
  <s:iterator value="list">
      <%--%{}把属性包装强制OGNL解析--%>
      <s:a href="getStudnet?name=%{stundentName}">${stundentName}</s:a>
  </s:iterator>






  </body>
</html>
