$(function(){
  $.ajax({
    type:"post",
    url:"selectNewsV",
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


          var text="（审核中）可撤回";
          //var text2="<a href='javascript:void(0);' onclick='test1("+i+")' >"+ text + "</a>";

          var text2="<a href='javascript:void(0);' onclick='test1("+i+")' >"+ text + "</a>";

        var unixTimestamp = new Date( arr[i].news_createdTime ) ;
        commonTime = unixTimestamp.toLocaleString();
        var j=i+1;
        mycars1[i]="<span id='news_id"+i+"' value='"+arr[i].news_id+"'></span>";
        str = "<tr align='center'><td>"
            +j
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







function test1(i) {

  test2="#news_id"+ i;
  var news_id=$(test2).attr('value');
  //sessionStorage.setItem('news_id',news_id);
  //window.location.href = 'newsxiangqing.html';
	$.ajax({
			url : "NewsChehui",
			type : "post",
			dataType : "json",
			async : false,
			scriptCharset : 'UTF-8',
			data : {
              news_id : news_id
			},
			success : function(responseText) {
				alert("撤回成功");
				// 	var Enroll_user = responseText;
				// 	sessionStorage.setItem('Enroll_user',Enroll_user);
               window.location.href = 'newsshenhe.html';


		}
	});

}

