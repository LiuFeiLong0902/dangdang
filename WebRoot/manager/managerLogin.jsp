<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员登陆</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="black">
    <center>
    <br/>
     <div>
     <h1 style="color: blue;">当当网后台管理登陆界面</h1>
     <h2 style="color: purple">Dangdang Background Management Login page</h2>
     </div>
     <br/>s
     <br/>
     <br/>
      <form action="/dangdang/main/managerlogin.action" method="post">
      <h3 style="color: green"><img src="/dangdang/images/author.png"/>管理员登陆</h3>
      <h4 style="color: white">
       账号：<input type="text" name="managername"/><br/>
       <br/>
       密码：<input type="password" name="password"/><br/>
       <br/>        
      </h4>
      <input type="submit" name="submit" value="登陆" style="width:80px">
     <a href="/dangdang/main/main.jsp"><input type="button" name="submit" value="取消" style="width:80px"></a>
     </form> 
    </center>
  </body>
</html>
