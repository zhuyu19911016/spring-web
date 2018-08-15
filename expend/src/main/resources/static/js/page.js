
var pageHead="<a id=\"pageUp\" onclick=\"pageUp()\" href=\"javascript:void(0)\">&lt;</a>";
var pageEnd="<a id=\"pageDown\" onclick=\"pagedown()\" href=\"javascript:void(0)\">&gt;</a>\
		<a class=\"eu_turnPage_txt\" style=\"margin-left:10px;\">跳转到</a>\
		<a class=\"eu_turnPage_input\"><input id=\"txtPageIndex\" type=\"text\" value=\"\" /></a>\
		<a class=\"eu_turnPage_go\"><input  style=\"cursor: pointer;\" type=\"button\" onclick=\"goPage()\" value=\"GO\"/></a>";

function ykhPage(options){
	var defaults = {
		pageCount : 5,
		pageIndex : 1
    };
    var options = $.extend(defaults, options);
	this.initPage(options);
}

ykhPage.prototype = {
	initPage : function(options){
		//console.log(options);
		this.options = options;
		var pageItem="";
		
		if(this.options.pageCount<=10){//无省略部分
			for(i=1;i<= this.options.pageCount;i++){
				if(i==1){//第一页
						pageItem+="<a class=\"red_bg\" href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else{
						pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
			}
		}
		else{
			for(i=1;i<=this.options.pageCount;i++){
				if(i<=8){//前8页
					if(i==1){//第一页
						pageItem+="<a class=\"red_bg\" href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else{
						pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					
				}
				else{//第8页之后
					if(this.options.pageCount-i==1){//倒数第二页
						pageItem+="<a class=\"eu_turnPage_txt\">&hellip;</a><a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else if(this.options.pageCount-i==0){//最后一页
						pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else{
						continue;
					}
				}
			}
		}
		if(this.options.pageCount>1){//大于一页
			pageItem=pageHead+pageItem+pageEnd;
		}
		else{
			pageItem="";
		}
		$(".eu_turnPage").html(pageItem);
		this.updown();
	},
	choicePage : function(obj){ //选择页码
		var pageItem="";
		this.options.pageIndex=$(obj).text();//当前页码
		if(this.options.pageIndex-1<=4){//第一面
			for(i=1;i<=this.options.pageCount;i++){
				if(i<=8){//前8页
					if(this.options.pageIndex==i){//当前页
						pageItem+="<a class=\"red_bg\" href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else{
						pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
				}
				else{//第8页之后
					if(this.options.pageCount-i==1){//倒数第二页
						pageItem+="<a class=\"eu_turnPage_txt\">&hellip;</a><a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else if(this.options.pageCount==i){//最后一页
						pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else{
						continue;
					}
				}
			}
		}
		else if(this.options.pageCount-this.options.pageIndex<=5){//最后一面
			for(i=1;i<=this.options.pageCount;i++){
				if(i==1){//第一页
					pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a><a class=\"eu_turnPage_txt\">&hellip;</a>";
				}
				else if(this.options.pageCount-i<=8){//要显示的最后8个
					if(this.options.pageIndex==i){
						pageItem+="<a class=\"red_bg\" href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else{
						pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
				}
				else{
					continue;
				}
			}
		}
		else{//中间页码
			for(i=1;i<=this.options.pageCount;i++){
				if(i==1){//第一页
					pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a><a class=\"eu_turnPage_txt\">&hellip;</a>";
				}
				else if(this.options.pageCount-i==1){//倒数第二页
						pageItem+="<a class=\"eu_turnPage_txt\">&hellip;</a><a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
				else if((this.options.pageIndex-i<=3&&this.options.pageIndex-i>=0)||(i-this.options.pageIndex<=3&&i-this.options.pageIndex>=0)||i==this.options.pageCount){
					if(this.options.pageIndex==i){
						pageItem+="<a class=\"red_bg\" href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
					else{
						pageItem+="<a href=\"javascript:\" onclick=\"choicePage(this)\">"+i+"</a>";
					}
				}
				else{
					continue;
				}
			}
		}
		
		pageItem=pageHead+pageItem+pageEnd;
		$(".eu_turnPage").html(pageItem);
		this.updown();
	},
	updown : function(){//上下箭头初始化
		this.options.pageIndex=$(".eu_turnPage a.red_bg").text();//当前页码
		if(this.options.pageIndex==1){//第一页
			$("#pageUp").hide();//上一页隐藏
			$("#pageDown").show();//下一页显示
		}
		else if(this.options.pageIndex==this.options.pageCount){//最后一页
			$("#pageUp").show();//上一页显示
			$("#pageDown").hide();//下一页隐藏
		}
		else{
			$("#pageUp").show();//上一页显示
			$("#pageDown").show();//下一页显示
		}
	},
	pageUp : function(){//上一页
		var current=$(".eu_turnPage a.red_bg");
		current.prev().addClass("red_bg");
		current.removeClass("red_bg");
		this.choicePage($(".eu_turnPage a.red_bg")[0]);
	},
	pagedown : function(){//下一页
		var current=$(".eu_turnPage a.red_bg");
		current.next().addClass("red_bg");
		current.removeClass("red_bg");
		this.choicePage($(".eu_turnPage a.red_bg")[0]);
	},
	goPage : function(){ ////跳转到
		this.options.pageIndex=$("#txtPageIndex").val();
		/*if(isNaN(this.options.pageIndex)){
			console.log("a1");
			return;
		}*/
		if(this.options.pageIndex<1||this.options.pageIndex>this.options.pageCount){
			console.log("a2");
			return;
		}
		this.choicePage("<a >"+this.options.pageIndex+"</a>");
	},
	getPageIndex : function(){
		return this.options.pageIndex;
	},
	getPageCount : function(){
		return this.options.pageCount;
	},
	getLocationCount : function(){
		return $("#txtPageIndex").val();
	},
	initPageCount : function(totalCount,pageSize){
		//初始化页码
		var pageCount = Math.ceil(totalCount / pageSize);
		this.initPage({
			pageCount : pageCount,
			pageIndex : 1
	    })
	}
};

