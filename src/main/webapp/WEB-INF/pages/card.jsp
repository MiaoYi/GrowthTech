<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html  lang="zh-cn"><head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="http://v3.bootcss.com/docs-assets/ico/favicon.png">
    <link href="http://v3.bootcss.com/dist/css/bootstrap.css" rel="stylesheet">
    <link href="http://v3.bootcss.com/examples/starter-template/starter-template.css" rel="stylesheet">
    <link href="css/common.css" rel="stylesheet">
    <script src="js/calendar.js" type="text/javascript"></script>
<title>成长卡片</title>
</head>

  <body style="">

    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="home">成长卡片</a>
        </div>
        <div class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="home">主页</a></li>
            <li class="active"><a href="card">卡片制作</a></li>
            <li><a href="cards">卡片浏览</a></li>
            <li><a href="users">用户管理</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>

    <div class="container">

      <div class="starter-template">
       <form:form class="main form-horizontal" method="post" action="card" modelAttribute="card" enctype="multipart/form-data">
 
    <table width="60%" class="table-hover table-bordered">
    <tr>
        <td width="15%"><form:label path="title">标题</form:label></td>
        <td width="75%"><form:input path="title" id="title" class="form-control"/></td> 
    </tr>
    <tr>
        <td><form:label path="author">作者</form:label></td>
        <td><form:input path="author" class="form-control"/></td>
    </tr>
    <tr>
        <td><form:label path="summary">摘要</form:label></td>
        <td><form:input path="summary" class="form-control"/></td>
    </tr>
    
    <tr>
        <td><form:label path="cover">封面</form:label></td>
        <td><form:input path="cover" type="file" name="cover" class="form-control"/></td>
    </tr>
    
    <tr>
        <td><form:label path="content">正文</form:label></td>
        <td><form:textarea rows="10" path="content" class="form-control"/></td>
    </tr>
    <tr>
        <td><form:label path="originalLink">原始链接</form:label></td>
        <td><form:input path="originalLink" class="form-control"/></td>
    </tr>
    
    <tr>
        <td><form:label path="createTime">创建时间</form:label></td>
        <td><form:input path="createTime" onclick="new Calendar().show(this);" size="10" maxlength="10" readonly="readonly" class="form-control"/></td>
    </tr>
    
    <tr>
        <td><form:label path="sendTime">发送时间</form:label></td>
        <td><form:input path="sendTime" onclick="new Calendar().show(this);" size="10" maxlength="10" readonly="readonly" class="form-control"/></td>
    </tr>
    
    <tr>
    </tr>
    <tr>
        <td colspan="2">
           <button class="btn btn-success btn-lg" href="card">添加卡片</button> 
        </td>
    </tr>
</table>  

</form:form>
      </div>
      
      <hr>

      <footer>
        <p align="center">© 成长科技公司 2014</p>
      </footer>

    </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./Starter Template for Bootstrap_files/jquery.min.js"></script>
    <script src="./Starter Template for Bootstrap_files/bootstrap.min.js"></script>
  

</body>
</html>