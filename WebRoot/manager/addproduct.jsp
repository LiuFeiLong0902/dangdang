<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>add product page</title>
    
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
     <form action="/dangdang/main/addProduct.action" target="rightFrame" method="post">
       <fieldset>
         <legend style="color:red">添加商品</legend>
         <font style="color:blue">商品名字：</font><input type="text" name="name"/><br/>
         <br/>
         <font style="color:blue">商品描述：</font><input type="text" name="description"/><br/>
         <br/>
         <font style="color:blue">市场价格：</font><input type="text" name="fixedprice"/><br/>
         <br/>
         <font style="color:blue">当当价格：</font><input type="text" name="dangprice"/><br/>
         <br/>
         <input type="submit" value="提交">
       </fieldset>
     </form>
  </body>
</html>
