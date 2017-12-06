<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>生成订单 - 当当网</title>
		<link href="../css/login.css" rel="stylesheet" type="text/css" />
		<link href="../css/page_bottom.css" rel="stylesheet" type="text/css" />
	
	</head>
	<body>
		<%@include file="../common/head1.jsp"%>
		 <br/>
			<h2><a href="/dangdang/main/main.jsp">主页面</a>>>个人信息</h2>
		 <br/>	
		<form action="/dangdang/user/mddModify.action" method="post">
		<h3 class="black">
		 <br/>
        邮箱:<input type="text" disabled="disabled" id="email" value="${user.email }"/><span><font style="font-weight: lighter">邮箱不可修改</font></span><br/>
        <br/>
        昵称:<input type="text" name="nickname" value="${user.nickname }"/><br/>
        <br/>
        密码:<input type="text" name="password" value="${user.password }"/><br/>
        <br/>
        <input type="submit" value="保存" style="width: 100px"/>
        </h3>
       </form> 
		<%@include file="../common/foot1.jsp"%>
	</body>
</html>

