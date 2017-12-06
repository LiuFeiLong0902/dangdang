<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>生成订单 - 当当网</title>
		<link href="../css/login.css" rel="stylesheet" type="text/css" />
		<link href="../css/page_bottom.css" rel="stylesheet" type="text/css" />
         <script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
         <script type="text/javascript">
          var flag = {"reName":false,"fullAddr":false,"pCode":false,"phone":false,"mobile":false};
            $(function(){
                $("#receiveName").blur(function(){
                     var receiveName = $(this).val();
                       if(receiveName.trim()==""){
                // document.getElementById('nameValidMsg').innerHTML="<img src='../images/yesAndNo/n.png'/>"; 
                         $("#nameValidMsg").html("<img src='../images/yesAndNo/n.png'/>"); 
                             flag.reName=false;
                     
                       }else{
                         $("#nameValidMsg").html("<img src='../images/yesAndNo/y.png'/>"); 
                         flag.reName=true; 
                       }
                });
               }); 
              $(function(){
                $("#fullAddress").blur(function(){
                    var fa = $(this).val();
                     if(fa.trim()==""){
                         $("#addressValidMsg").html("<img src='../images/yesAndNo/n.png'/>");  
                         flag.fullAddr=false;
                       }else{
                         $("#addressValidMsg").html("<img src='../images/yesAndNo/y.png'/>");  
                         flag.fullAddr=true;
                       }
                });
                });
               $(function(){   
                 $("#postalCode").blur(function(){
                    var pc = $(this).val();
                      var re=/^[0-9][0-9]{5}$/;
                     if(pc.trim()==""){
                         $("#codeValidMsg").html("<img src='../images/yesAndNo/n.png'/>");  
                        flag.pCode=false;
                       }else{
                         $("#codeValidMsg").html("<img src='../images/yesAndNo/y.png'/>"); 
                         flag.pCode=true; 
                       }
                });
                 });
                 $(function(){   
                 $("#phone").blur(function(){
                    var phone = $(this).val();
                      var va = /^(13[0-9]{9})|(15[89][0-9]{8})$/;
                     if(phone.trim()==""){
                         $("#phoneValidMsg").html("<img src='../images/yesAndNo/n.png'/>");  
                        flag.phone=false;
                       }else{
                         $("#phoneValidMsg").html("<img src='../images/yesAndNo/y.png'/>");  
                         flag.phone = true;
                       }
                });
               });
               $(function(){     
                 $("#mobile").blur(function(){
                    var mo = $(this).val();
                     if(mo.trim()==""){
                         $("#mobileValidMsg").html("<img src='../images/yesAndNo/n.png'/>");  
                       flag.mobile=false;
                       }else{
                         $("#mobileValidMsg").html("<img src='../images/yesAndNo/y.png'/>");
                         flag.mobile=true;  
                       }
                });
            });
            //表单提交事件
			$(function(){
				$("#f").submit(function(){
					var ok = flag.reName && flag.fullAddr && flag.pCode && flag.phone && flag.mobile;
					if(ok){
					    //通过表单检查
					    return true;
					}else{
					  $("#submit").html("&nbsp;&nbsp;&nbsp;&nbsp;表单验证不通过");
						return false;
					}
				});
			});
			$(function(){
			   $("#address").change(function(){
			        var id = $(this).val();			           
			       $.post(
			           "/dangdang/order/getAddress.action",
			           	{"id":id},
			           	 function(receive_add){  //data是action返回的一个address信息
						    if(id==0){
						        $("#receiveName").attr("value","");
						        $("#fullAddress").attr("value","");
						        $("#postalCode").attr("value","");
						        $("#phone").attr("value","");
						        $("#mobile").attr("value","");
						            
						    }else{
						        $("#receiveName").attr("value",receive_add.receiveName);
						        $("#fullAddress").attr("value",receive_add.fullAddress);
						        $("#postalCode").attr("value",receive_add.postalCode);
						        $("#phone").attr("value",receive_add.phone);
						        $("#mobile").attr("value",receive_add.mobile);
						          flag.reName=true;
						          flag.fullAddr=true;
						          flag.pCode=true;
						          flag.phone=true;
						          flag.mobile=true;
						    }
						}
			      );
			   });			   
			});
         </script>
	</head>
	<body>
		<%@include file="../common/head1.jsp"%>
		<div class="login_step">
			生成订单骤: 1.确认订单 >
			<span class="red_bold"> 2.填写送货地址</span> > 3.订单成功
		</div>
		<div class="fill_message">
			<p>
				选择地址：
				<select id="address">
				     <option value="0">
						填写新地址
					  </option>
				   <s:iterator value="receive_add">
					  <option value="${id}"><s:property value="fullAddress"/></option>
					</s:iterator>
				</select>
			</p>
			<form name="ctl00" method="post" action="/dangdang/order/address.action" id="f">
				<input type="hidden" name="id" id="addressId" />
				<table class="tab_login">
					<tr>
						<td valign="top" class="w1">
							收件人姓名：
						</td>
						<td>
							<input type="text" class="text_input" name="receive_address.receiveName"
								id="receiveName" />
							<div class="text_left" id="nameValidMsg">
								<p>
									请填写有效的收件人姓名
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							收件人详细地址：
						</td>
						<td>
							<input type="text" name="receive_address.fullAddress" class="text_input"
								id="fullAddress" />
							<div class="text_left" id="addressValidMsg">
								<p>
									请填写有效的收件人的详细地址
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							邮政编码
						</td>
						<td>
							<input type="text" class="text_input" name="receive_address.postalCode"
								id="postalCode" />
							<div class="text_left" id="codeValidMsg">
								<p>
									请填写有效的收件人的邮政编码
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							电话
						</td>
						<td>
							<input type="text" class="text_input" name="receive_address.phone"
								id="phone" />
							<div class="text_left" id="phoneValidMsg">
								<p>
									请填写有效的收件人的电话
								</p>
							</div>
						</td>
					</tr>
					<tr>
						<td valign="top" class="w1">
							手机
						</td>
						<td>
							<input type="text" class="text_input" name="receive_address.mobile"
								id="mobile" />
							<div class="text_left" id="mobileValidMsg">
								<p>
									请填写有效的收件人的手机
								</p>
							</div>
						</td>
					</tr>
				</table>

				<div class="login_in">

					<a href="/dangdang/cart/list.action"><input id="btnClientRegister1" class="button_1" name="submit"
					type="button" value="取消" /></a>			
			<s:token />
				<input id="btnClientRegister" class="button_1" name="submit"
					type="submit" value="下一步" />
				<span  id="submit" class="red"></span>	
				</div>
			</form>
		</div>
		<%@include file="../common/foot1.jsp"%>
	</body>
</html>

