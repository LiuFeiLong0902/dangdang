<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<style type="">
    #tips{
       position:absolute;
    }
</style>
<script type="text/javascript" src="../js/jquery-1.4.3.js"></script>
<script type="text/javascript">
   $(function(){
     $('a.big').hover(function(e){																
      //光标进入时，创建一个div
      var $div = $("<div id='tips'><img src='"+this.href+"' width='180' height='240'/></div>");
      $('body').append($div);
      $('#tips').css('left',e.pageX+10).css('top',e.pageY+10);
     },function(){
     // 光标离开的时候
     $('#tips').remove();
     }).mousemove(function(e){
       // 光标移动时
        $('#tips').css('left',e.pageX+10).css('top',e.pageY+10);
     });
   });
</script>
<h2>
	<span class="more"><a href="#" target="_blank">更多&gt;&gt;</a></span>热销图书
</h2>
<div class="book_c_04">

	<!--热销图书A开始-->
<s:iterator value="products">	
	<div class="second_d_wai">
		<div class="img">
			<a href="../productImages/bigPic/${productPic}" target='_blank' class="big"><img src="../productImages/${productPic}" border=0 /> </a>
		</div>
		<div class="shuming">
			<a href="productDetail.action?id=${id}">${productName}</a><a href="#" target="_blank"></a>
		</div>
		<div class="price">
			定价：￥${fixedPrice}
		</div>
		<div class="price">
			<span class="red">当当价：￥${dangPrice}</span>
		</div>
	</div>
	<div class="book_c_xy_long"></div>
	<!--热销图书A结束-->
</s:iterator>
</div>
<div class="clear"></div>