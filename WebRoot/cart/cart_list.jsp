<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<link href="../css/book.css" rel="stylesheet" type="text/css" />
		<link href="../css/second.css" rel="stylesheet" type="text/css" />
		<link href="../css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="../css/shopping_vehicle.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="../js/prototype-1.6.0.3.js"></script>
		<script type="text/javascript">
			 function change(id,qty){
			 //数量不能为空	
			 // alert(id,qty);		 
			 if(qty.strip().length==0){
			   // alert('数量不能为空');
			   return;
			 }
			 //必须是数字
			 var reg=/^[0-9]+$/;
			 if(!reg.test(qty.strip())){
			    // alert('必须是数字');
			    return;
			 }
			 location = 'modify.action?id='+id+'&qty='+qty.strip();
			 }
		</script>
	</head>
	<body>
		<br />
		<br />
		<div class="my_shopping">
			<img class="pic_shop" src="../images/pic_myshopping.gif" />

		</div>
		<div id="div_choice" class="choice_merch">
			<h2 id="cart_tips">
				您已选购以下商品
			</h2>
			<div class="choice_bord">
				<table class="tabl_buy" id="tbCartItemsNormal">
					<tr class="tabl_buy_title">
						<td class="buy_td_6">
							<span>&nbsp;</span>
						</td>
						<td>
							<span class="span_w1">商品名</span>
						</td>
						<td class="buy_td_5">
							<span class="span_w2">市场价</span>
						</td>
						<td class="buy_td_4">
							<span class="span_w3">当当价</span>
						</td>
						<td class="buy_td_1">
							<span class="span_w2">数量</span>
						</td>
						<td class="buy_td_2">
							<span>变更数量</span>
						</td>
						<td class="buy_td_1">
							<span>删除</span>
						</td>
					</tr>
					<tr class='objhide' over="no">
						<td colspan="8">
							&nbsp;
						</td>
					</tr>				
                      <!-- 购物列表开始 -->	
                      <s:iterator value="buyList">					
						<tr class='td_no_bord'>
							<td style='display: none'>
								${product.id}
							</td>
							<td class="buy_td_6">
								<span class="objhide"><img src=../productImages/${product.productPic}/></span>
							</td>
							<td>
								<a href="#">${product.productName }</a>
							</td>
							<td class="buy_td_5">
								<span class="c_gray">￥${product.fixedPrice}</span>
							</td>
							<td class="buy_td_4">
								&nbsp;&nbsp;
								<span>￥${product.dangPrice}</span>
							</td>
							<td class="buy_td_1">
								&nbsp;&nbsp;${qty}
							</td>

							<td >
								<input class="del_num" type="text" size="3" maxlength="4" id="num_${product.id}"/>
								<a href="javascript:;" onclick="change(${product.id},document.getElementById('num_${product.id}').value);">变更</a>
							</td>
							<td>
								<a href="del.action?id=${product.id}">删除</a>
							</td>
						</tr>
					<!-- 购物列表结束 -->
					</s:iterator>
				</table>
				<div id="div_no_choice" class="objhide">
					<div class="choice_title"></div>
					<div class="no_select">
						您还没有挑选商品
					</div>
				</div>
				<div class="choice_balance">
					<div class="select_merch">
						<a href='/dangdang/main/main.jsp'> 继续挑选商品>></a>
					</div>
					<div class="total_balance">
						<div class="save_total">
							您共节省：
							<span class="c_red"> ￥<span id="total_economy">${salePrice}</span>
							</span>
							<span id='total_vip_economy' class='objhide'> ( 其中享有优惠： <span
								class="c_red"> ￥<span id='span_vip_economy'>0.00</span></span>
								) </span>
							<span style="font-size: 14px">|</span>
							<span class="t_add">商品金额总计：</span>
							<span class="c_red_b"> ￥<span id='total_account'>${totalPrice}</span>
							   <a href="clear.action"><font style="font-size: medium" >清空购物车</font></a>
							</span>
						</div>		
					    <div id="balance" class="balance">
							 <a name="checkout" href="/dangdang/order/order.action"> 
								<img src="../images/butt_balance.gif" alt="结算" border="0" title="结算" />
							 </a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!-- 用户删除恢复区 --> 
		<div id="divCartItemsRemoved" class="del_merch">
			<div class="del_title">
				您已删除以下商品，如果想重新购买，请点击“恢复”
			</div>
	<s:iterator value="delList">
			<table class=tabl_del id=del_table>
				<tbody>
					<tr>
						<td width="58" class=buy_td_6>
							&nbsp;
						</td>
						<td width="365" class=t2>
							<a href="#">${product.productName }</a>
						</td>
						<td width="106" class=buy_td_5>
							￥${product.fixedPrice}
						</td>
						<td width="134" class=buy_td_4>
							<span>￥${product.dangPrice}</span>
						</td>
						<td width="56" class=buy_td_1>
							<a href="recovery.action?id=+${product.id}">恢复</a>
						</td>
						<td width="16" class=objhide>
							&nbsp;
						</td>
					</tr>
					<tr class=td_add_bord>
						<td colspan=8>
							&nbsp;
						</td>
					</tr>
					</c:if>


				</tbody>
			</table>
		</s:iterator>
		</div>
		</c:if>
		<br />
		<br />
		<br />
		<br />
		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
	</body>
</html>



