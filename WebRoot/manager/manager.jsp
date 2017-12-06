<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <frameset rows="98,*,8" frameborder="no" border="0" framespacing="0" id="frameset">
    <frame src="/dangdang/manager/top.jsp" name="topFrame" scrolling="no" noresize="noresize" id="topFrame"/>
    <frameset cols="170,*" frameborder="no" border="0" framespacing="0">
      <frame src="/dangdang/manager/left.jsp" name="leftFrame" id="leftFrame" />
  	  <frame src="/dangdang/manager/welcome.jsp" name="rightFrame" id="rightFrame" />
    </frameset>
    <frame src="/dangdang/manager/down.jsp" name="bottomFrame" scrolling="no" noresize="noresize" id="bottomFrame"/>
  </frameset>
  <body>
  </body>
</html>
