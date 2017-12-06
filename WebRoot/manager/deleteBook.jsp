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
    <center><h3>以下为所有商品的信息</h3></center>
     <table border="1" bordercolor="green" width="100%">
       <thead>
         <tr bgcolor="#33CCFF"><td>序号</td><td>书名</td><td>作者</td><td>出版社</td><td>市场价格</td>
           <td>当当网价格</td><td>操作</td>
         </tr>
       </thead>
   <s:iterator value="books" status="stat">
        <tr>
            <td><s:property value="#stat.count"/></td>
	        <td>${productName}</td>
	        <td>${author}</td>
	        <td>${publishing}</td>
            <td>${fixedPrice}</td>
            <td>${dangPrice}</td>
            <td><a href="/dangdang/main/deletebook.action?id=${id }">删除</a></td>
        </tr>
   </s:iterator>     
     </table>
  </body>
</html>
