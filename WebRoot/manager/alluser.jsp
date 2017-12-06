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
         <tr bgcolor="#33CCFF"><td>序号</td><td>邮箱</td><td>昵称</td><td>密码</td><td>用户等级</td><td>邮箱是否验证</td>
           <td>邮箱验证码</td><td>最后登陆时间</td><td>登陆ip地址</td>
         </tr>
       </thead>
   <s:iterator value="users">
        <tr><td>${id}</td><td>${email}</td><td>${nickname}</td><td>${password}</td>
           <td>${userIntegral}</td><td>${isEmailVerify}</td><td>${emailVerifyCode}</td>
           <td>${lastLoginTime}</td><td>${lastLoginIp}</td>
        </tr>
   </s:iterator>     
     </table>
  </body>
</html>
