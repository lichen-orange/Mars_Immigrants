$(function(){
  $.ajax({
    type:"post",
    url:"selectNewsOp",
    dataType:"json",
    data:{},
    success:function(responseText){
      var arr=responseText;
      var str = "";// 定义用于拼接的字符串

      //var text5="查看详细新闻";
      var mycars1=new Array(arr.length);
      var mycars2=new Array(arr.length);
     // var mycars3=new Array(arr.length);

      for(var i=0;i<arr.length;i++){

        if(arr[i].news_optionsStatus==3){
          var text2="申请撤回等待审核";
          //var text2="<a href='javascript:void(0);' onclick='test1("+i+")' >"+ text + "</a>";
        }else if(arr[i].news_optionsStatus==0){
          var text1="申请撤回";
          var text3="申请修改";
          var text2="<a href='javascript:void(0);' onclick='test1("+i+")' >"+ text1 + "</a>&nbsp;" +"<a href='javascript:void(0);' onclick='test3("+i+")' >"+ text3 + "</a>";
        }else if(arr[i].news_optionsStatus==1){
          var text2="申请撤回已通过"
        }else if(arr[i].news_optionsStatus==2){
          var text="上次申请撤回未通过";
          var text1="再次申请撤回";
          var text3="申请修改";
          var text2="<a href='javascript:void(0);' onclick='test1("+i+")' >"+ text1 + "</a>("+text +")&nbsp;<a href='javascript:void(0);' onclick='test3("+i+")' >"+ text3 + "</a>&nbsp;";
        }else if(arr[i].news_optionsStatus==4){
          var text="申请修改已通过";
          var text1="申请撤回";
          var text3="可修改";
          var text2="<a href='javascript:void(0);' onclick='test1("+i+")' >"+ text1 + "</a>" +"&nbsp;<a href='javascript:void(0);' onclick='test4("+i+")' >"+ text3 + "</a>("+text+")";
        }else if(arr[i].news_optionsStatus==5){
          var text="上次申请修改未通过";
          var text1="申请撤回";
          var text3="再次申请修改";
          var text2="<a href='javascript:void(0);' onclick='test1("+i+")' >"+ text1 + "</a>&nbsp;" +"<a href='javascript:void(0);' onclick='test3("+i+")' >"+ text3 + "</a>("+text+")";
        }else if(arr[i].news_optionsStatus==6){
          var text2="申请撤回等待审核";
        }
        var unixTimestamp = new Date( arr[i].news_createdTime ) ;
        commonTime = unixTimestamp.toLocaleString();
        mycars1[i]="<span id='news_id"+i+"' value='"+arr[i].news_id+"'></span>";
        str = "<tr align='center'><td>"
            +i
            +"</td><td>"
            + arr[i].news_title
            + "</td><td>"
            + commonTime+mycars1[i]
            + "</td><td>"
            + text2
            + "</td></tr>";
        // 追加到table中
        $("#tab").append(str);
      }
    }
  });

})





// function test(i) {
//   test2="#news_id"+ i;
//   var news_id=$(test2).attr('value');
//   sessionStorage.setItem('news_id',news_id);
//   window.location.href = 'newsxiangqing.html';
// }
function test4(i) {
  test2="#news_id"+ i;
  var news_id=$(test2).attr('value');
  sessionStorage.setItem('news_id',news_id);
  window.location.href = 'updatenews.html';
}
function test1(i) {

  test2="#news_id"+ i;
  var news_id=$(test2).attr('value');
  //sessionStorage.setItem('news_id',news_id);
  //window.location.href = 'newsxiangqing.html';
	$.ajax({
			url : "updateNewsOpDelete",
			type : "post",
			dataType : "json",
			async : false,
			scriptCharset : 'UTF-8',
			data : {
              news_id : news_id
			},
			success : function(responseText) {
				alert("123");
				// 	var Enroll_user = responseText;
				// 	sessionStorage.setItem('Enroll_user',Enroll_user);
               window.location.href = 'news.html';


		}
	});

}

function test3(i) {

  test2="#news_id"+ i;
  var news_id=$(test2).attr('value');
  //sessionStorage.setItem('news_id',news_id);
  //window.location.href = 'newsxiangqing.html';
  $.ajax({
    url : "updateNewsOpUp",
    type : "post",
    dataType : "json",
    async : false,
    scriptCharset : 'UTF-8',
    data : {
      news_id : news_id
    },
    success : function(responseText) {
      alert("456");
      // 	var Enroll_user = responseText;
      // 	sessionStorage.setItem('Enroll_user',Enroll_user);
      window.location.href = 'news.html';
    }
  });

}
