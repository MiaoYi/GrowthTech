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
            <li><a href="card">卡片制作</a></li>
            <li class="active"><a href="cards">卡片浏览</a></li>
            <li><a href="users">用户管理</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>

<div class="container">
  <div class="starter-template">
     <c:forEach var="c" items="${cards}">	
    
	<table width="60%" class="table-hover table-bordered  table-condensed">
	<tbody>
	<tr><th width="15%">标题</th><td width="75%" class="text-left">${c.title}</td></tr>
	<tr><th>作者</th><td class="text-left">${c.author}</td></tr>
	<tr><th>摘要</th><td class="text-left">${c.summary}</td></tr>
	<tr><th>正文</th><td class="text-left">${c.content}</td></tr>
	<tr><th>原始链接</th><td class="text-left">${c.originalLink}</td></tr>
	<tr><th>创建时间</th><td class="text-left">${c.createTime}</td></tr>
	<tr><th>发送时间</th><td class="text-left">${c.sendTime}</td></tr>
	</tbody>
	</table>
	<br>
	</c:forEach>
          
        
      <hr>

      <footer>
        <p align="center">© 成长科技公司 2014</p>
      </footer>

	    </div>
</div>
 

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./Starter Template for Bootstrap_files/jquery.min.js"></script>
    <script src="./Starter Template for Bootstrap_files/bootstrap.min.js"></script>
  

</body>
</html>