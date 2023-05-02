<%--
  Created by IntelliJ IDEA.
  User: 28128
  Date: 2023/4/29
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>新增课程</h1>
<form action="/untitled4_war/ke/add" method="post">
    课程：<input type="text" name="ke_name" /><br/>
    课时：<input type="text" name="ke_time" /><br/>
    学院：<input type="text" name="school"  /><br/>
    <input type="submit" value="增加课程"/><br/>
</form>
</body>
</html>
