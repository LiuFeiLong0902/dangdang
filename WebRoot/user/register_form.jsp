<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>用户注册 - 当当网</title>
		<link href="../css/login.css" rel="stylesheet" type="text/css" />
		<link href="../css/page_bottom.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
		<script type="text/javascript">
		 //标识各项是否通过检查
				var flag = {"email":false,"nickname":false,"pwd":false,"rpwd":false,"checkcode":false};
			//表单项目检查
			$(function(){
				$("#txtEmail").blur(function(){
				   // flag.all = false;
				   $("#email\\.info").html("");//清空提示信息
					//检查email
					var emailTxt =  $(this).val();
					//检查非空
					if(emailTxt.trim() == ""){
					    $("#email\\.info").html("Email地址不能为空");
					    flag.email=false;
						return;
					}
					//格式检查
					var pattern=/\b(^['_A-Za-z0-9-]+(\.['_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\.[A-Za-z0-9-]+)*((\.[A-Za-z0-9]{2,})|(\.[A-Za-z0-9]{2,}\.[A-Za-z0-9]{2,}))$)\b/;
					if(!pattern.test(emailTxt)){
						$("#email\\.info").html("Email格式不正确");
						flag.email=false;
						return;
					}
					//检查唯一性
					$.post(
						"validEmail.action",
						{"email":emailTxt},
						function(data){//data是服务器返回的ok值
						    if(data){
						         $("#email\\.info").html("Email地址可用");
						         $("#email\\.info").css('color','blue'); 
						          flag.email = true;
						    }else{
						    	$("#email\\.info").html("Email地址已被占用");
						    	flag.email=false;
						    	return;
						    }
						}
					);					
				});
				});
				
				// 检查昵称
				$(function(){
				 $("#txtNickName").blur(function(){
				     $("#name\\.info").html("");//清空提示信息
					//检查txtNickName
					var nameTxt =  $(this).val();
					//检查非空
					if(nameTxt.trim() == ""){
					    $("#name\\.info").html("昵称不能为空");
					    flag.nickname=false;
						return;
					}
					var reg = /^[a-zA-Z\d\_]{4,20}$|^[\u4e00-\u9fa5]{2,10}$/;
					   if(reg.test(nameTxt)){
					       $("#name\\.info").html("昵称可用");	
					       $("#name\\.info").css('color','blue'); 
					       flag.nickname=true;
					   }else{
					      $("#name\\.info").html("重置昵称");
					       flag.nickname=false;
                           return;
					   }				
				 });	
				 });
				 // 检查密码	
			$(function(){
			   $("#txtPassword").blur(function(){
			      $("#password\\.info").html("");
			      // 检查非空
                  var pwd = $(this).val();
			      if(pwd.trim()==""){
			        $("#password\\.info").html("密码不能为空");
			          flag.pwd=false;
			        return;
			      }
			      //检查是否符合要求		
			      if(pwd.length<=6){
			        $("#password\\.info").html("密码太短");
			         flag.pwd=false;
			        return;
			      }
			       if(pwd.length>=20){
			        $("#password\\.info").html("密码太长");
			         flag.pwd=false;
			        return;
			      }	else{
			        flag.pwd=true;
			        $("#password\\.info").html("密码可用").css('color','blue');
			      }
			 });
		});
			 // 检查确认密码
			 $(function(){
			   $("#txtRepeatPass").blur(function(){
			      $("#password1\\.info").html("");
			      // 检查非空
                  var pwd1 = $("#txtPassword").val();
                  var pwd2 = $(this).val();                 
			      if(pwd1.trim()!="" && pwd1==pwd2){
			        flag.rpwd=true;
			         $("#password1\\.info").html("密码一致").css('color','blue');
			      }else{
			        $("#password1\\.info").html("密码不一致");
			           flag.rpwd=false;
			        return;
			      }
			 });
			 });
			 
			 // 验证验证码
		$(function(){
			 $("#txtVerifyCode").blur(function(){
			  $("#number\\.info").html("");
			    var verifyC = $(this).val();
			    if(verifyC.trim()==""){
			        $("#number\\.info").html("请输入验证码");	
			          flag.checkcode = false;	        
			        return;
			      }
			     $.post(
						"verifyCode.action",
						{"checkcode":verifyC},
						function(data){//data是服务器返回的pass值
						    if(data){
						          flag.checkcode = true;
						          $("#number\\.info").html("验证码正确").css('color','blue');
						    }else{
						    	$("#number\\.info").html("验证码错误");
						    	 flag.checkcode = false;	   
						    	return;
						    }
						}
					);		
			 });			   		
			});	
			//表单提交事件
			$(function(){
				$("#f").submit(function(){
					var ok = flag.email && flag.nickname && flag.pwd && flag.rpwd && flag.checkcode;
					if(ok){
					    //通过表单检查
					    return true;
					}else{
						return false;
					}
				});
			});
		</script>
	</head>
	<body>
		<%@include file="../common/head1.jsp"%>
		<div class="login_step">
			注册步骤:
			<span class="red_bold">1.填写信息</span> > 2.验证邮箱 > 3.注册成功
		</div>
		<div class="fill_message">
			<form name="ctl00" method="post" action="register.action" id="f">
				<h2>
					以下均为必填项
				</h2>
				<table class="tab_login" >
					<tr>
						<td valign="top" class="w1">
							请填写您的Email地址：
						</td>
						<td>
							<input name="user.email" type="text" id="txtEmail" class="text_input"/>
							<div class="text_left" id="emailValidMsg">
								<p>
									请填写有效的Email地址，在下一步中您将用此邮箱接收验证邮件。
								</p>
									<span id="email.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							设置您在当当网的昵称：
						</td>
						<td>
							<input name="user.nickname" type="text" id="txtNickName" class="text_input" />
							<div class="text_left" id="nickNameValidMsg">
								<p>
									您的昵称可以由小写英文字母、中文、数字组成，
								</p>
								<p>
									长度4－20个字符，一个汉字为两个字符。
								</p>
								<span id="name.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							设置密码：
						</td>
						<td>
							<input name="user.password" type="password" id="txtPassword"
								class="text_input" />
							<div class="text_left" id="passwordValidMsg">
								<p>
									您的密码可以由大小写英文字母、数字组成，长度6－20位。
								</p>
								<span id="password.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							再次输入您设置的密码：
						</td>
						<td>
							<input name="password1" type="password" id="txtRepeatPass"
								class="text_input"/>
							<div class="text_left" id="repeatPassValidMsg">
							<span id="password1.info" style="color:red"></span>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							验证码：
						</td>
						<td>
							<img class="yzm_img" id='imgVcode' src="user/stream"/>
							<input name="number" type="text" id="txtVerifyCode"
								class="yzm_input"/>
							<div class="text_left t1">
								<p class="t1">
									<span id="vcodeValidMsg">请输入图片中的五个字母。</span>							
									<a href="javascript:;" onclick="document.getElementById('imgVcode').src ='user/stream?'+ new Date();">看不清楚？换个图片</a>								
								</p>
								<span id="number.info" style="color:red"></span>
							</div>
						</td>
					</tr>
				</table>
				<div class="login_in">
					<input id="btnClientRegister" class="button_1" name="submit"  type="submit" value="注 册"/>
				</div>
			</form>
		</div>
		<%@include file="../common/foot1.jsp"%>
	</body>
</html>

