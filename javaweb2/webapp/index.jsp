<%--
  Created by IntelliJ IDEA.
  User: 28128
  Date: 2023/4/29
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
    h1{

    }
    h3{
        width: 180px;
        height: 38px;
        margin: 100px auto;/*外边距上下100，左右自动*/
        text-align: center;/*文字左右居中*/
        line-height: 38px;/*文字上下居中，直接让字体高度 = 元素高度即可*/
        background: cornflowerblue;
        border-radius: 20px;/*圆角边框*/
    }
    a{
        text-decoration: none;/*去掉下划线*/
        color: black;
        font-size: 18px;
    }
</style>

<h3><p><a href="ke/findAll">查询所有课程</a></p></h3>
<h3><p><a href="ke/find">查询课程</a></p></h3>
<h3><p><a href="ke/add">增加课程</a></p></h3>

<h3><p><a href="ke/update">修改课程</a></p></h3>

<table width="600" border="1" bgcolor="#fff5ee">
    <tr>
        <th align="left">课程名字</th>
        <th align="right">课时</th>
        <th align="right">开课学院</th>
    </tr>
    <tbody>
    <c:forEach var="ke" items="${kebiao}">
        <tr>
            <td>${ke.ke_name}</td>
            <td>${ke.ke_time}</td>
            <td>${ke.school}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>

