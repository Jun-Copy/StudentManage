<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/4/2
  Time: 20:52下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>">
    <title>学生管理</title>
</head>
<body>
<h3>学生管理</h3>
<a href="">添加学生</a>
<table border="1px">
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>描述</td>
        <td>班级id</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="student">
        <tr>
            <td>${student.stuId}</td>
            <td>${student.stuName}</td>
            <td>${student.stuSex}</td>
            <td>${student.stuDescribe}</td>
            <td>${student.clId}</td>
            <td>
                <a href="">编辑</a>
                <a href="">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<jsp:include page="/application/commons/page.jsp"/>
</body>
</html>
