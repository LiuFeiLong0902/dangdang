<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center><h3>所有注册用户的信息</h3></center>
     <table border="1" bordercolor="green" width="100%">
       <thead>
         <tr bgcolor="#33CCFF"><td>序号</td><td>邮箱</td><td>昵称</td><td>密码</td><td>用户等级</td><td>操作</td>
           
         </tr>
       </thead>
   <s:iterator value="users">
        <tr><td>${id}</td><td>${email}</td><td>${nickname}</td><td>${password}</td>
           <td>${userIntegral}</td><td><a href="/dangdang/main/deletesingleuser.action?id=${id}">删除</a></td>
        </tr>
   </s:iterator>     
     </table>
  </body>
</html>
