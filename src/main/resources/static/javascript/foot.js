function g(o){return document.getElementById(o);}
//window.onload=function()
//{
//
//	$(".top_search").find("em").click(function(){
//		if($(".search_con").css("display")=="none")
//		{
//			$(".search_con").css("display","block");
//			$(".search_con").animate({"height":"42px"},"fast");
//		}
//		else
//		{$(".search_con").css("display","none");	
//		$(".search_con").animate({"height":"0px"},"fast");
//		}
//	});
//	
//
//}
$(window).scroll(function(){
		//if($(window).scrollTop()<260){
//			$("body").removeClass("tpos");
//			
//		}else{
//			$("body").addClass("tpos");
//		}
		 if( $(window).scrollTop() >$(window).height() ){
			  $(".additional-features .db").removeClass("opa-0");//pc返回顶部
		}else if($(window).scrollTop() <= $(window).height()){
			$(".additional-features .db").addClass("opa-0");//pc返回顶部
		}
	});


function onesrc(obj,url)
{
	$(obj).find("img").attr("src",url);
}

//回到顶部
function goTop(){
	$('html,body').animate({'scrollTop':0},600);
}


function hoverlia4(t_n, t_n2, n, k,className) {
    for (var i = 1; i <= k; i++) {
        g(t_n2 + i).className = 'divhidden';
        g(t_n + i).className = '';
    }
    g(t_n2 + n).className = '';
    g(t_n + n).className = className;
	

}