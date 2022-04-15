<%--
  Created by IntelliJ IDEA.
  User: 86188
  Date: 2022/4/13
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <form action="${pageContext.request.contextPath}/user/quick13" method="post">
     <input type="text" name="userList[0].name"> <br/>
     <input type="text" name="userList[0].addr"> <br/>
     <input type="text" name="userList[1].name"> <br/>
     <input type="text" name="userList[1].addr"> <br/>
     <input type="submit" name="提交">
 </form>
</body>
</html>
