$(function(){
  $("tbody tr").click(function(){
    $(this).addClass('selected').siblings().removeClass("selected");
    $(this).find(":radio").attr("checked",true);
  });
});