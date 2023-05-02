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

<a href="ke/findAll">测试查询</a>

<h3>测试包</h3>

<form action="ke/save" method="post">
  课程：<input type="text" name="ke_name" /><br/>
  课时：<input type="text" name="ke_time" /><br/>
  学院：<input type="text" name="school"  /><br/>
  <input type="submit" value="保存"/><br/>
</form>

</body>
</html>