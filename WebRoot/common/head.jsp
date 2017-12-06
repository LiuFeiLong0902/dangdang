<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link href="../css/book_head090107.css" rel="stylesheet" type="text/css" />
<style type="">
  #tb1{
   display:none;
  }
</style>
<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
<script type="text/javascript" src="../js/my.js"></script>
<script type="text/javascript">
    $(function(){
      $('#t1').mouseenter(function(){
         $('#tb1').show();
      }).mouseleave(function(){
         $('#tb1').hide();
      });
    });
</script>
<div class="head_container">
	<div class="head_welcome">
		<div class="head_welcome_right">
			<span class="head_welcome_text"> </span>
			<span class="head_welcome_text">
			  <span class="little_n">
			     <s:if test="#session.user != null">
			       <table id="t1">
			          <tr>
			           <td>
	<a href="/dangdang/user/mydd.action" method="post" class="head_black12a" id="a1">我的当当</a> | 
					    </td>
					    <td>
	<a href="http://www.baidu.com" name="helpcenter" class="head_black12a" target="_blank" type="redirect">帮助</a>|
					    </td>
					   </tr>
					<!--  <tbody id="tb1" valign="top">  				   
					<tr id="d1"><td><a href="#">我的订单</a></td></tr>
					<tr id="d2"><td><a href="#">我的收藏</a></td></tr>
					<tr id="d3"><td><a href="#">我的积分</a></td></tr>
					</tbody>-->
					</table>
                 </s:if>
</span>
			 </span>
			<div class="cart gray4012">
				<a href="/dangdang/cart/list.action">购物车|</a>
			</div>
		</div>
    <s:if test="#session.user != null">
		<span class="head_toutext" id="logininfo">		
		<b>您好：<span class="red"><s:property value="#session.user.nickname"/></span>&nbsp;&nbsp;欢迎光临当当网</b>
		[&nbsp;<a href="/dangdang/user/logout.action" class="b">退出登录</a>&nbsp;]&nbsp;|
		[&nbsp;<a href="/dangdang/user/logout.action" class="b">更换帐号</a>&nbsp;]
		</span>   
    </s:if>
   <s:else>
      <span class="head_toutext" id="logininfo">		
		<b>您好,欢迎光临当当网</b>
		[&nbsp;<a href="../user/login_form.jsp" class="b">登录</a>&nbsp;|&nbsp;<a
			href="../user/register_form.jsp" class="b">免费注册</a>&nbsp;]
		</span>
      </s:else>   
	</div>
	<div class="head_head_list">
		<div class="head_head_list_left">
			<span class="head_logo"><a href="#" name="backtobook"><img
						src="../images/booksaleimg/book_logo.gif" /> </a> </span>
		</div>
		<div class="head_head_list_right">
			<div class="head_head_list_right_b">
			</div>
		</div>
	</div>
	<div class="head_search_div">
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_11.jpg"/>&nbsp;&nbsp;</a>
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_12.jpg"/>&nbsp;&nbsp;</a>
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_13.jpg"/>&nbsp;&nbsp;</a>
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_09.jpg"/>&nbsp;&nbsp;</a>
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_10.jpg"/>&nbsp;&nbsp;</a>
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_14.jpg"/>&nbsp;&nbsp;</a>
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_15.jpg"/>&nbsp;&nbsp;</a>
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_14.jpg"/>&nbsp;&nbsp;</a>
           <a href="#"><img src="../images/default/newimages/book/zh_090114ss_08.jpg"/>&nbsp;&nbsp;</a>
	</div>
	<div class="head_search_bg"></div>
</div>