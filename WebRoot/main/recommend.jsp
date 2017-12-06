<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
	编辑推荐
</h2>
<div id=__bianjituijian/danpin>
 <!-- 编辑推荐开始--> 
      <s:iterator value="books">
	<div class=second_c_02>
		<div class=second_c_02_b1>
			<div class=second_c_02_b1_1 id="img">
				<a href='../productImages/bigPic/${productPic}' target='_blank' class="big"><img src="../productImages/${productPic}" width=70 border=0 /></a>
           </div>
			<div class=second_c_02_b1_2>
				<h3>
					<a href='productDetail.action?id=${id}' title='书名'>${productName}</a>
				</h3>
				<h4>				
					作者:${author} 著
					<br />
					出版社：${publishing}&nbsp;&nbsp;&nbsp;&nbsp;出版时间：${publishTime}
				</h4>
				<h5>
					作者简介：${authorSummary}
				</h5>
				<h6>
					定价：￥${fixedPrice}&nbsp;&nbsp;&nbsp;&nbsp;<span class="red">当当价：￥${dangPrice}</span>
				</h6>
				<div class=line_xx></div>
			</div>
		</div>	
	</div>
	<!-- 编辑推荐结束 -->	
	</s:iterator>
</div>
