<%--
  Created by IntelliJ IDEA.
  User: 28128
  Date: 2023/4/30
  Time: 2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询课程</h2>
<table width="600" border="1" bgcolor="#fff5ee">
    <tr>
        <th align="left">课程名字</th>
        <th align="right">课时</th>
        <th align="right">开课学院</th>
    </tr>
    <tbody>
    <c:forEach var="ke" items="${kebiao2}">
        <tr>
            <td>${ke.ke_name}</td>
            <td>${ke.ke_time}</td>
            <td>${ke.school}</td>
        </tr>
        <h3><p><a href="update">修改该课程</a></p></h3>
        <h3><p><a href="delete?ke_name=${ke.ke_name}">删除该课程</a></p></h3>
    </c:forEach>
    </tbody>
</table>


</body>
</html>