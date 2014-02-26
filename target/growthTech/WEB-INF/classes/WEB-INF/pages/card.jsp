<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/jquery-ui-1.8.6.custom.css" rel="stylesheet" type="text/css" />
    <script src="js/jquery-1.4.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui-1.8.6.custom.min.js" type="text/javascript"></script>
    <script src="js/calendar.js" type="text/javascript"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2>New Card</h2>
<form:form method="post" action="card" modelAttribute="card" enctype="multipart/form-data">
 
    <table>
    <tr>
        <td><form:label path="title">标题</form:label></td>
        <td><form:input path="title"/></td> 
    </tr>
    <tr>
        <td><form:label path="author">作者</form:label></td>
        <td><form:input path="author"/></td>
    </tr>
    <tr>
        <td><form:label path="summary">摘要</form:label></td>
        <td><form:input path="summary" /></td>
    </tr>
    
    <tr>
        <td><form:label path="cover">封面</form:label></td>
        <td><input path="cover" type="file" name="cover"></input></td>
    </tr>
    
    <tr>
        <td><form:label path="content">正文</form:label></td>
        <td><form:textarea path="content" /></td>
    </tr>
    <tr>
        <td><form:label path="originalLink">原始链接</form:label></td>
        <td><form:input path="originalLink" /></td>
    </tr>
    
    <tr>
        <td><form:label path="createTime">创建时间</form:label></td>
        <td><form:input path="createTime" name="cn_date" type="text" id="cn_date" onclick="new Calendar().show(this);" size="10" maxlength="10" readonly="readonly"/></td>
    </tr>
    
    <tr>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="添加卡片"/>
        </td>
    </tr>
</table>  
     
</form:form>
</body>
</html>