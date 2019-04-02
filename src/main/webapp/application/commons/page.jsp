<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<a href="${url}1">首页</a>
<c:choose>
    <c:when test="${pageInfo.pageNum<=1 }">上一页</c:when>
    <c:when test="${pageInfo.pageNum>1 }"><a href="${url}${pageInfo.pageNum-1}">上一页</a></c:when>
</c:choose>
<c:choose>
    <c:when test="${pageInfo.pageNum >= pageInfo.pages }">下一页</c:when>
    <c:when test="${pageInfo.pageNum<pageInfo.pages  }"><a href="${url}${pageInfo.pageNum+1}">下一页</a></c:when>
</c:choose>
<a href="${url}${pageInfo.pages}">尾页</a>