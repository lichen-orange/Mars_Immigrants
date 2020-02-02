$(function(){

    $("#news").empty();
    jQuery.ajax({
      type: "post",
      url: "/showAllnews",
      data: {},
      success: function (returnData) {
        var area = $("#news");
        jQuery.each(returnData.newsList, function (index, a) {
          area.append("<li class='anim anim-1'> <div class='imgs'><img src='./htmlimg/20190218031533157.jpg' alt=''></div>"+
              "<div class='i_about_r'>"+
              "<h3><a href='javascript:void(0);' onclick='test1("+a.news_id+")' >"+a.news_title+"</a></h3>"+
          "<em>"+timeStamp2String(a.news_createdTime)+"</em>"+
          "<div class='p'>"+
              "<a href=''><span class='news_more'>了解更多</span></a>"+
          "</div>"+
          "</li>");
        });
      }
    });
})

function getNews(pageNo) {
  $("#news").empty();
  jQuery.ajax({
    type: "post",
    url: "/showAllnews",
    data: {pageNo:pageNo},
    success: function (returnData) {
      var area = $("#news");
      jQuery.each(returnData.newsList, function (index, a) {
        area.append("<li class='anim anim-1'> <div class='imgs'><img src='./htmlimg/20190218031533157.jpg' alt=''></div>"+
            "<div class='i_about_r'>"+
            "<h3><a href='javascript:void(0);' onclick='test1("+a.news_id+")' >"+a.news_title+"</a></h3>"+
            "<em>"+timeStamp2String(a.news_createdTime)+"</em>"+
            "<div class='p'>"+
            "<a href=''><span class='news_more'>了解更多</span></a>"+
            "</div>"+
            "</li>");
      });
    }
  });
}
function test1(i) {

  var news_id=i;
  sessionStorage.setItem('news_id',news_id);
  window.location.href = 'newsxiangqing.html';
}
function timeStamp2String(time){
  var datetime = new Date();
  datetime.setTime(time);
  var year = datetime.getFullYear();
  var month = datetime.getMonth() + 1 < 10 ? "0" + (datetime.getMonth() + 1) : datetime.getMonth() + 1;
  var date = datetime.getDate() < 10 ? "0" + datetime.getDate() : datetime.getDate();
  var hour = datetime.getHours()< 10 ? "0" + datetime.getHours() : datetime.getHours();
  var minute = datetime.getMinutes()< 10 ? "0" + datetime.getMinutes() : datetime.getMinutes();
  var second = datetime.getSeconds()< 10 ? "0" + datetime.getSeconds() : datetime.getSeconds();
  return year + "-" + month + "-" + date;
}