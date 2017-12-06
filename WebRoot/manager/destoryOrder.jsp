<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

  </head>
  
  <body>
    <center><h3>以下为所有注册用户的信息</h3></center>
     <table border="1" bordercolor="green" width="100%">
       <thead>
        <tr bgcolor="#33CCFF">
         <td>序号</td>
         <td>邮箱</td>
         <td>昵称</td>
         <td>用户等级</td>
         <td>总价</td>
         <td>电话号码</td>
         <td>操作</td>
       </tr>
       </thead>
   <s:iterator value="orders" status="stat">
      <tr>
        <td><s:property value="#stat.count"/></td>
        <td>${email}</td>
        <td>${nickname}</td>
        <td>${level}</td>
        <td>${totalPrice}</td>
        <td>${mobile}</td>
        <td><a href="/dangdang/main/destory.action?email=${email}">撤销</a></td>
      </tr>
   </s:iterator>     
     </table>
  </body>
</html>
