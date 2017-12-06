<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<link href="../css/book.css" rel="stylesheet" type="text/css" />
		<link href="../css/second.css" rel="stylesheet" type="text/css" />
		<link href="../css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="../css/animate.css" rel="stylesheet" type="text/css" />
	    <script type="text/javascript"  src="../js/jquery-1.4.3.js"></script>
		<script type="text/javascript">
		//	$(function(){
			//   $("#new").load("news.action",{"size":8});
		//	    $("#recommend").load("recommend.action");
		//	    $("#hot").load("hot.action");
		//	});			
			  $(function(){
			     $('#num li').mouseenter(function(){
			     //获得光标指向的li的下标
			        var index = $('#num li').index(this);
			     //滚动图片
			      showImage(index);  
			     }).eq(0).mouseenter();
			     var i= 0;
			     var taskId;
			      $('#d1').hover(function(){
			        //光标进入，停止滚动
			        clearInterval(taskId);  
			      },function(){
			       // 光标离开时，开始滚动
			       taskId = setInterval(function(){
			         showImage(i);
			         i++;
			         if(i==5){
			         i=0;
			         }
            },2000);
        }).mouseleave();
      });
      // 滚动函数
	   function showImage(index){
	   // stop(true)：清空之前累积的动画。
	      $('#adv').stop(true).animate({'top':-177*index},1000);
	      $('#num li').eq(index).addClass('on').siblings().removeClass('on');
	   }  
		</script>
	</head>
	
	<body>
		&nbsp;
		<!-- 头部开始 -->
		<%@include file="../common/head.jsp"%>
		<!-- 头部结束 -->
		<div style="width: 962px; margin: auto;">
			<a href="/dangdang/main/main.jsp" target="_blank"><img
					src="../images/default/book_banner_081203.jpg" border="0" /> </a>
		</div>

		<div class="book">

			<!--左栏开始-->
			<div id="left" class="book_left">
			  <s:action name="category" namespace="/main" executeResult="true"></s:action>
			</div>
			<!--左栏结束-->

			<!--中栏开始-->
			<div class="book_center">
 <div id="d1">
    <ul id="adv">
       <li><img src="../images/animate/13.jpg"></li>
       <li><img src="../images/animate/2.jpg"></li>
       <li><img src="../images/animate/4.jpg"></li>
       <li><img src="../images/animate/12.jpg"></li>
       <li><img src="../images/animate/5.jpg"></li>
    </ul>
    <ul id="num">
			<li>1</li>
			<li>2</li>
			<li>3</li>
			<li>4</li>
			<li>5</li>
		</ul>
  </div>

				<!--推荐图书开始-->
				<div class=second_c_border1 id="recommend">
				  <s:action name="recommend" namespace="/main" executeResult="true"></s:action>
				   <!-- <img src="../images/window_loading.gif"/>正加载数据... -->
				</div>
				<!--推荐图书结束-->

				<!--热销图书开始-->
				<div class="book_c_border2" id="hot">
				 <s:action name="hot" namespace="/main" executeResult="true"></s:action>
				</div>
				<!--热销图书结束-->

				<!--最新上架图书开始-->
				<div class="book_c_border2" id="new">
				<s:action name="news" namespace="/main" executeResult="true"></s:action>
				</div>

				<!--最新上架图书结束-->
				<div class="clear">
				</div>
			</div>
			<!--中栏结束-->
			<!--右栏开始-->
			<div class="book_right">
				<div class="book_r_border2" id="__XinShuReMai">
					<div class="book_r_b2_1x" id="new_bang">
						<h2 class="t_xsrm">
							新书热卖榜
						</h2>
						<div id="NewProduct_1_o_t" onmouseover="">
							<h3 class="second">							
								<span class="dot_r">
							    <a href="#">伟人的故事</a>
							    </span>
							     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;			    
							    <a href="http://www.dangdang.com" target="_blank" type="redirect" style="right: 100px">					 
							    更多&gt;&gt;</a><br/>
							    <a href="#">名人的故事</a><br/>
							    <a href="#">毛泽东的故事</a><br/>
							    <a href="#">周恩来的故事</a><br/>
							    <a href="#">邓小平的故事</a><br/>
							    <a href="#">朱德的故事</a><br/>
							    <a href="#">彭德怀的故事</a><br/>
							    <a href="#">林彪的故事</a><br/>
								<a href="#">关浩的故事</a><br/>
							    <a href="#">张帅的故事</a><br/>							 
							</h3>
						</div>
					</div>
				</div>
			</div>
			<!--右栏结束-->
			<div class="clear"></div>
		</div>

		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
	</body>
</html>
