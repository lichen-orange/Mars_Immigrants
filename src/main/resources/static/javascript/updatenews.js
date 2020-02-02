$(function(){
  $.ajax({
    type:"post",
    url:"selectNewsOpById",
    dataType:"json",
    data:{news_id:sessionStorage.getItem("news_id")},
    success:function(responseText){
      var news=responseText;

      $('#title').val(news.news_title);
      $('#demo').val(news.news_content);
  }

     




})