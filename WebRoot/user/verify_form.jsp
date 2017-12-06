<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>用户注册 - 当当网</title>
		<link href="../css/login.css" rel="stylesheet" type="text/css" />
		<link href="../css/page_bottom.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="../js/jquery-1.4.3.js"></script> 
		 <script type="text/javascript">
		       var flag = {"all":false};
		       $(function(){
		           $("#validatecode").blur(function(){
		              $("#errorMsg").html("");
		                var vs = $(this).val();
		                  if(vs.trim() == ""){
		                //    $("#errorMsg").html("不能为空");
		                   return;
		                }
		            $.post(
		               "isEmailValid.action",
					    	{"code":vs},
						   function(data){//data是服务器返回的ok值
						    if(data){
						          flag.all = true;
						    }else{
						    	$("#errorMsg").html("邮箱验证码错误");
						    	return;
						    }
						}
		            
		            );    
		           });
		       });
		       $(function(){
		           $("#valid").submit(function(){
		           var em = $("#validatecode").val();
		            if(em.trim() == ""){
		               $("#errorMsg").html("不能为空");
		            }
		           var ok = flag.all;
		              if(ok){
		                 return true;
		              }else{
		              //  $("#errorMsg").html("验证码错误");
		                 return false;
		              }
		           });
		       });
		 </script>
	</head>
	<body>
		<%@include file="../common/head1.jsp"%>

		<div class="login_step">
			注册步骤: 1.填写信息 >
			<span class="red_bold">2.验证邮箱</span> > 3.注册成功
		</div>
		<form action="isEmailValid_bak.action" method="post" id="valid">
			<div class="validate_email">
				<h2>
					感谢您注册当当网！现在请按以下步骤完成您的注册!
				</h2>
				<div class="look_email">
					<h4>
						第一步：查看您的电子邮箱
					</h4>
					<div class="mess reduce_h">
						我们给您发送了验证邮件，邮件地址为：
						<span class="red"><s:property value="#session.user.email"/>
						</span>
						请登录您的邮箱收信。
					</div>
					<h4>
						第二步：输入验证码<br />
                       </h4>
						<span class="red" id="evc"><s:property value="#session.user.emailVerifyCode"/></span>
                       <br />			 
					<div class="mess">
					 
						<span class="write_in">输入您收到邮件中的验证码：</span>						
						<input name="code" type="text" id="validatecode" class="yzm_text"/>
						<input class="finsh" type="submit" value="完 成" id="Button1" />
						<span id="errorMsg" class="red"></span>
					</div>
				</div>
			</div>
		</form>
		<%@include file="../common/foot1.jsp"%>
	</body>
</html>

