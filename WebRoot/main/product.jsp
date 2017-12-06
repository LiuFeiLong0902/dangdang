<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<link href="../css/book.css" rel="stylesheet" type="text/css" />
		<link href="../css/second.css" rel="stylesheet" type="text/css" />
		<link href="../css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="../css/animate.css" rel="stylesheet" type="text/css" />
<style type="">
    #tips{
       position:absolute;
    }
</style>
		<script type="text/javascript" src="../js/prototype-1.6.0.3.js"></script>
        <script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
<script type="text/javascript">
    //购买处理
			$(function(){
				//为购买添加单击处理
				$(".goumai").click(function(){
					var id = $(this).attr("id");
				    	// alert(id);
					//发送ajax请求
					$.post(
						"/dangdang/cart/buy.action",
						{"id":id},
						function(data){//Action返回的ok值
							if(data){
								 $('#warn_'+id).html('&nbsp;&nbsp;购买成功');
							}else{
								 $('#warn_'+id).html('&nbsp;&nbsp;已购买过');
							}
						});
					return false;
				});
			});
		</script>
	</head>
	<body>》&nbsp; 
		<!-- 头部开始 -->
		<%@include file="../common/head.jsp"%>
		<!-- 头部结束 -->

		<div style="width: 962px; margin: auto;">
			<a href="#"><img src="../images/default/book_banner_081203.jpg" border="0" /> </a>
		</div>
		<div  class='your_position'>您现在的位置:&nbsp;
			<a href='/dangdang/main/main.jsp'>当当图书</a> &gt;&gt;
			<font style='color: #cc3300'><strong>${pName}</strong></font>
		</div>
		<div class="book">
			<!--中栏开始-->
			<div class="book_center">
			<table border="1">
			  <tr >
			     <td><img id=img_show_prd src="../productImages/${product.productPic}"/></td>
			     <td>作者：${book.author}</td>
			  </tr>
			  <tr>
			     <td>书名：${product.productName}</td>
			    <td>出版社：${book.publishing}</td>
			  </tr>
			  <tr>
			  <td>出版时间：2012-08-22</td>
			   <td>字数：${book.wordNumber}</td>
			  </tr>
			  <tr>
			    <td>页数：${book.totalPage}</td>
			    <td>印刷时间： 2012-08-23</td>
			  </tr>
			  <tr>
			  <td>开本：16开</td>
			  <td>版次：${book.whichEdtion}</td>
			  </tr>
			  <tr>
			  <td>纸张:胶版纸</td><td>ISBN：${book.isbn}</td>
			  </tr>
			  <tr>
			   <td>包装：平装</td><td>定价：￥${product.fixedPrice }</td>
			  </tr>
			  <tr>
			   <td>当当价：￥${product.dangPrice }</td><td>节省：￥${product.fixedPrice-product.dangPrice }</td>
			  </tr>
			  <tr>
			  <td>内容简介:${product.description }</td><td>作者简介:${book.authorSummary }</td>
			  </tr>
			  <tr>
			    <td>目录:${book.catalogue }</td><td>媒体评论:好，非常畅销!难得的一本好书</td>
			  </tr>
			  <tr>
			  <td>印次：${book.printNumber}</td><td><a href="#" id="${id}" class="goumai"><img id="buy" src='../images/buttom_goumai.gif'/></a></td>
			  <td style="color:green"><span id="warn_${id}"></span></td>
			  </tr>
			</table>
			</div>
			<!--中栏结束-->
			<div class="clear"></div>
			
		</div>

		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
	</body>
</html>
