<%--
  Created by IntelliJ IDEA.
  User: 86188
  Date: 2022/4/13
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src = "${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userList = [];
        userList.push({name:"1212",age:"19"});
        userList.push({name:"12212121",age:"20"});
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick15",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"

        })

    </script>
</head>
<body>

</body>
</html>
