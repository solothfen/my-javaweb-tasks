<%--
  Created by IntelliJ IDEA.
  User: 28128
  Date: 2023/4/30
  Time: 2:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改课程</h1>
<form action="/untitled4_war/ke/update1" method="post">
    课程名字：<input type="text" name="ke_name" /><br/>
    课时：<input type="text" name="ke_time" /><br/>
    学院：<input type="text" name="school"  /><br/>
    <input type="submit" value="修改课程"/><br/>
</form>
</body>
</html>