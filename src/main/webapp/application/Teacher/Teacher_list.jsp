<%--
  Created by IntelliJ IDEA.
  User: sun
  Date: 2019/4/2
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>">
    <title></title>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>名字</th>
            <th>性别</th>
            <th>描述</th>
            <th>班级ID</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="teacher">
        <tr>
            <td>${teacher.teaId}</td>
            <td>${teacher.teaName}</td>
            <td>${teacher.teaSex}</td>
            <td>${teacher.teaDescribe}</td>
            <td>${teacher.clId}</td>
            <td>
                <a href=""></a>编辑|
                <a href=""></a>删除
            </td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
