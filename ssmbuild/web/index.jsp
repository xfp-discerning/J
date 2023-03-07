<%--
  Created by IntelliJ IDEA.
  User: xfp
  Date: 2023/3/7
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a{
        text-decoration: none;
        color: aqua;
        font-size: 18px;
      }
      h3{
        width: 180px;
        height: 40px;
        margin: 100px auto;
        text-align: center;
        line-height: 40px;
        background: burlywood;
        border-radius: 5px;
      }
    </style>
  </head>
  <body>

  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">点击进入页面</a>
  </h3>

  </body>
</html>
