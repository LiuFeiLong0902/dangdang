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
         <tr bgcolor="#33CCFF"><td>时间</td><td>邮箱</td><td>昵称</td><td>用户等级</td><td>总价</td><td>收货人</td>
           <td>收货人地址</td><td>邮编</td><td>电话号码</td>
         </tr>
       </thead>
   <s:iterator value="orders">
        <tr><td>${time}</td><td>${email}</td><td>${nickname}</td><td>${level}</td>
           <td>${totalPrice}</td><td>${recename}</td><td>${allrece}</td>
           <td>${code}</td><td>${mobile}</td>
        </tr>
   </s:iterator>     
     </table>
  </body>
</html>
