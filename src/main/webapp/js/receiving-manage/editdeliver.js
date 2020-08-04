var opt = "<button class='btn btn-success btn-xs'><i class='icon-ok' title='启用'></i></button>"
		  + "<button class='btn btn-danger btn-xs'><i class='icon-remove' title='禁用'></i></button>"
		  + "<button class='btn btn-primary btn-xs'><i class='icon-pencil' title='修改'></i></button>"
		  + "<button class='btn btn-danger btn-xs'><i class='icon-trash' title='删除'></i></button>";

var tableData;
var isOK = 1;
var index = 1;

var ud = [], dd = [];	//更新数据，删除数据

$(function(){
	InitTable();
	
	$('#query').bind("click", InitTable);
	$('#reset').bind("click", resetInput);
	$('#submit').bind("click", submit);
	$('#delete').bind("click", deleteMaterList);
	
	$('#dnnum').on('keyup', function(event) {
        event.preventDefault();
        interLock($(this));
    });
	$('#boxnum').on('keyup', function(event) {
        event.preventDefault();
        interLock($(this));
    });
	$('#materId').on('keyup', function(event) {
        event.preventDefault();
        interLock($(this));
    });
	
	//$('#box_panel').hide();
	//$('#mater_panel').hide();
});

function numVerify(trigger){
	if(trigger.val() == null || trigger.val() == "" 
		|| trigger.val().replace(/\s+/g, "") == "" || trigger.val() == "0"){
		isOK = -1;
		trigger.val(0)
		trigger.select();
		trigger.css({"border": "1px solid #f00"});
		return;
	}
	
	if(!/^\+?[1-9][0-9]*$/.test(trigger.val())){
		isOK = -1;
		trigger.select();
		trigger.css({"border": "1px solid #f00"});
		return;
	}

	var tdArr = trigger.parents('tr').children();
	if(trigger.parents('table').attr('id') == "box_table"){
		var materId = tdArr.eq(5).html();
		var list = tableData.rows;
		for(var i = 0; i < list.length; i++){
			if(materId == list[i].id){
				if(trigger.val() > list[i].pmn20){
					//alert("数值超出原配送数量，请重新输入");
					isOK = -1;
					trigger.select();
					break;
				}else if(trigger.val() == list[i].pmn20)
					isOK = 0;
				else isOK = 1;
			}
		}
	}
	
	isOK > 0 ? trigger.css({"border": "1px solid #0f0"}) : (isOK == 0 ? trigger.css({"border": "1px solid #e2e2e4"}) : trigger.css({"border": "1px solid #f00"}));
}

function modifyCount(trigger){
	if(isOK < 0) return;
	
	var tdArr = trigger.parents('tr').children();
	if(trigger.parents('table').attr('id') == "box_table"){
		
		var pmm01 = tdArr.eq(1).html();
		var pmn02 = tdArr.eq(2).html();
		var boxnum = tdArr.eq(3).html();
		var materId = tdArr.eq(5).html();
		var count = trigger.val();
		
		if(isOK == 0){
			//判断是否改为原来数量，是则删除
			var materList = tableData.rows;
			for(var i = 0; i < materList.length; i++)
				if(materId == materList[i].id && count == materList[i].pmn20){
					for(var i = 0; i < ud.length; i++)
						if(materId == ud[i].id){
							ud.splice(i - 1, 1);
							break;
						}
					break;
				}
		}else{
			if(ud.length == 0)
				ud.push({pmm01 : pmm01, pmn02 : pmn02, boxnum : boxnum, id : materId, pmn20 : count});
			else
				for(var i = 0; i < ud.length; i++){
					var obj = ud[i];
					if(materId == obj.id)
						ud[i].pmn20 = count;
					else
						ud.push({pmm01 : pmm01, pmn02 : pmn02, boxnum : boxnum, id : materId, pmn20 : count});
				}
		}
	}
	console.log(ud);
}
//批量删除
function deleteMaterList() {
	//获取所有被选中的记录
	var rows = $("#box_table").bootstrapTable('getSelections');
	if (rows.length== 0) {
	    alert("请先选择要删除的记录!");
	    return;
	}
	var id = '', pmm01 = '', boxnum = '';
	var pmn02 = 0;
	var items = [];
	for (var i = 0; i < rows.length; i++) {
	    items.push({pmm01 : rows[i]['pmm01'], pmn02 : rows[i]['pmn02'], 
	    			boxnum : rows[i]['boxnum'], id : rows[i]['id']});
	}
	
	/*var ids = '';
	for (var i = 0; i < rows.length; i++) {
	    ids += rows[i]['id'] + ",";
	}
	ids = ids.substring(0, ids.length - 1);*/
	deleteMater(items);
}

function deleteMater(items){
	
	$.ajax({
		url: "delete.do",
		type: "POST",
		dataType: 'text',
	    async: false,
		data: JSON.stringify(items),
		contentType : 'application/json;charset=UTF-8',
		success: function(){
			console.log("success");
			InitTable();
			/*$('#dnnum').val(dnnum);
			$('#boxnum').val(null);
			$('#materId').val(null);
			
			$('#dnnum').removeAttr("disabled");
			$('#boxnum').attr("disabled", "disabled");
			$('#materId').attr("disabled", "disabled");
			
			fullTable();*/
		}
	});
}

function updateMater(){
	if (ud.length== 0) {
	    alert("请先修改数据!");
	    return;
	}
	
	
}

function submit(){
	
	if (ud.length== 0) {
	    alert("请先修改数据!");
	    return;
	}

	/*var data = {dnnum: dnnum, modifyList: JSON.stringify(ud)};
	console.log(JSON.stringify(data));*/
	$.ajax({
		url: "update.do",
		type: "POST",
		dataType: 'json',
	    async: false,
		data: JSON.stringify(ud),
		contentType : 'application/json;charset=UTF-8',
		success: function(){
			console.log("success");
			InitTable();
			/*$('#dnnum').val(dnnum);
			$('#boxnum').val(null);
			$('#materId').val(null);
			
			$('#dnnum').removeAttr("disabled");
			$('#boxnum').attr("disabled", "disabled");
			$('#materId').attr("disabled", "disabled");
			
			fullTable();*/
		}
	});
	
}

function interLock(trigger){
	var idArr = ["dnnum", "boxnum", "materId"];
	var value = trigger.val();
	if(value != null && value != ""){
		for(var i = 0; i < idArr.length; i++){
			if(trigger.attr("id") != idArr[i])
				$(('#' + idArr[i])).attr("disabled", "disabled");
			else
				index = (i + 1);
		}
	}else{
		for(var i = 0; i < idArr.length; i++){
			if(trigger.attr("id") != idArr[i])
				$(('#' + idArr[i])).removeAttr("disabled");
		}
	}
}

function resetInput(){
	$('#dnnum').removeAttr("disabled");
	$('#boxnum').removeAttr("disabled");
	$('#materId').removeAttr("disabled");
	$('#dnnum').attr("autofocus", "autofocus");
}

function fullTable(){
	
	var dnnum = $('#dnnum').val();
	var boxnum = $('#boxnum').val();
	var materId = $('#materId').val();
	var data, action;
	if(dnnum != null && dnnum != ""){
		data = {dnnum : dnnum};
		action = "p.do";
		index = 1;
	}
	
	if(boxnum != null && boxnum != ""){
		data = {boxnum : boxnum};
		action = "b.do";
		index = 2;
	}
	
	if(materId != null && materId != ""){
		data = {materId : materId};
		action = "m.do";
		index = 3;
	}
	
	$.ajax({
		type: "POST",
	    url: action,
	    dataType: 'json',
	    async: false,
	    data: data,
	    success: function (res) {
	    	console.log(res);
	    	tableData = res;
	    	
	    	$("strong[name='dnnumText'").text(res.pn.dnnum);
	    	$('#pmn33').val(res.pn.pmn33);
	    	
	    	if(index == 1){
	    		/*$('#pn_panel').show();
	    		$('#box_panel').hide();
	    		$('#mater_panel').hide();*/
	    		
	    		$('#pn_table').bootstrapTable("load", res.pnsubList);
		    	$('#pn_table').bootstrapTable("refresh");
		    	$('#box_table').bootstrapTable("load", res.bmList);
		    	//$('#box_table').bootstrapTable("refresh");
	    	}
	    	if(index == 2){
	    		$('#pn_panel').hide();
	    		$('#box_panel').show();
	    		$('#mater_panel').hide();
	    		
	    		$('#box_table').bootstrapTable("load", res.boxList);
		    	$('#box_table').bootstrapTable("refresh");
	    	}
	    	if(index == 3){
	    		$('#pn_panel').hide();
	    		$('#box_panel').hide();
	    		$('#mater_panel').show();
	    		
	    		$('#mater_table').bootstrapTable("load", res.materList);
		    	$('#mater_table').bootstrapTable("refresh");
	    	}
	    	
	    	var numToCountText = $("input[name='countText']");
	    	numToCountText.on('keyup', function(event) {
	            event.preventDefault();
	            numVerify($(this));
	        });
	    	
	    	numToCountText.on('change', function(event) {
	            event.preventDefault();
	            modifyCount($(this));
	        });
	    	
	    	$('button[name=deleteBtn]').on('click', function(event){
	    		event.preventDefault();
	    		deleteItem($(this));
	    	});
	    	
	    	ud = [];
	    	dd = [];
	    	
	    	/*$("#pn_table tr").each(function(){
	    		$("input[name='pnCountText']").keyup(function(){
	    			//  alert(1)
	    			alert($(this).parents("tr").html());
	          	});
	    	});*/
	    }
	});
}

function InitTable(){
	
	$('#pn_table').bootstrapTable("destroy");
	$('#box_table').bootstrapTable("destroy");
	//$('#mater_table').bootstrapTable("destroy");
	
	var params;
	var pnsubList, bmList;
	
	$('#pn_table').bootstrapTable({
		striped: true,						//是否显示行间隔色
		columns: [{
			field: 'pmm01',
			title: '采购单号'
		}, {
			field: 'pmn02',
			title: '项次'
		}, {
			field: 'pmn04',
			title: '物料'
		}, {
			field: 'pmn041',
			title: '品名'
		}, {
			field: 'ima021',
			title: '规格'
		}, {
			field: 'pmn20',
			title: '数量'
		}, {
			field: 'pmn86',
			title: '单位'
		}],
		data: pnsubList,
		formatNoMatches : function() {
			return '没有数据';
		}
	});
	
	$('#box_table').bootstrapTable({
		url: 'query.do',
		method : 'post',
		dataType: 'json',
		contentType : "application/x-www-form-urlencoded;charset=utf-8",
		cache: false,						//是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		striped: true,						//是否显示行间隔色
		pagination: true,       			//是否显示分页（*）
		sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
		pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
		pageSize: 100,                     	//每页的记录行数（*）
		pageList: [100],        //可供选择的每页的行数（*）
		queryParams : function (params) {
			var dnnum = $('#dnnum').val();
			var boxnum = $('#boxnum').val();
			var materId = $('#materId').val();
			
			var cur = {index: 0, content : ""};
			
			if(dnnum != null && dnnum != "")
				cur = {index: index, content : dnnum};
			
			if(boxnum != null && boxnum != "")
				cur = {index: index, content : boxnum};
			
			if(materId != null && materId != "")
				cur = {index: index, content : materId};
			
			//var cur = {index: "1", content : "S37-5105011807160001"};
			
			ud = [];
	    	dd = [];
			
			return cur;
		},
		columns: [{
			checkbox: true,  
			visible: true                  //是否显示复选框
		}, {
			field: 'pmm01',
			title: '采购单号',
			align : 'center',
			valign : 'middle'
		}, {
			field: 'pmn02',
			title: '项次'
		}, {
			field: 'boxnum',
			title: '包装票号',
			align : 'center',
			valign : 'middle'
		}, /*{
			field: 'lot',
			title: '批次'
		}, */{
			field: 'id',
			title: '内标签号'
		}, {
			field: 'pmn04',
			title: '物料'
		}, {
			field: 'pmn041',
			title: '品名'
		}, {
			field: 'pmn20',
			title: '数量',
			formatter: function (value, row, index) {
				return "<input class='form-control input-sm' name='countText' type='text' value='" + value + "' placeholder='Enter name' style='height:23px;'>";
			}
		}/*, {
			title: '操作',
			formatter: function(value, row, index){
				return "<button class='btn btn-danger btn-xs' name='deleteBtn'><i class='icon-remove' title='删除'></i></button>";
			}
		}*/],
		//data: bmList,
		onLoadSuccess: function (data) {
			/*var data = $('#box_table').bootstrapTable('getData', true);  
			// 合并单元格  
			var fieldList=["pmm01", "pmn02", "boxnum", "lot"];  
			mergeCells(data, "pmm01", 1, $('#box_table'), fieldList);*/ 
			
			if(data.pn == null || data.pnsubList == null || data.rows == null)
				return;
			
			tableData = data;
			
			$("strong[name='dnnumText'").text(data.pn.dnnum);
	    	$('#pmn33').val(data.pn.pmn33);
	    	
	    	$('#pn_table').bootstrapTable("load", data.pnsubList);
			
			var tData = $('#box_table').bootstrapTable('getData', true);
			//alert(tData);
            //合并单元格
            mergeCells(tData, "pmm01", 1, $('#box_table'));
            //mergeCells(tData, "pmn02", 1, $('#box_table'));
            mergeCells(tData, "boxnum", 1, $('#box_table'));
            //mergeCells(tData, "lot", 1, $('#box_table'));
            
            var numToCountText = $("input[name='countText']");
        	numToCountText.on('keyup', function(event) {
                event.preventDefault();
                numVerify($(this));
            });
        	
        	numToCountText.on('change', function(event) {
                event.preventDefault();
                modifyCount($(this));
            });
        	
        	$('button[name=deleteBtn]').on('click', function(event){
        		event.preventDefault();
        		deleteItem($(this));
        	});
        },
        onCheck: function (row, tr) {
        	//单行最前面的checkbox被选中
        	var input = tr.parents('tr').children().eq(8).children();
        	input.val(50);
        	input.attr("disabled", "disabled");
        	input.css({"border": "1px solid #e2e2e4"});
        	
        	var materId = tr.parents('tr').children().eq(5).html();
			for(var i = 0; i < ud.length; i++)
				if(materId == ud[i].id){
					ud.splice(i - 1, 1);
					break;
				}
    	},    
    	onUncheck: function (row, tr) {
    		//单行最前面的checkbox被取消
    		var input = tr.parents('tr').children().eq(8).children();
    		input.removeAttr("disabled");
		},    
		onCheckAll: function (row) {
			//最顶上的checkbox被选中
        	//alert("in3");
		},    
		onUncheckAll: function (row) {
			//最顶上的checkbox被取消
        	alert("in4");
		},
		formatNoMatches : function() {
			return '没有数据';
		}
	});
	
	
	
	/*$('#mater_table').bootstrapTable({
		striped: true,						//是否显示行间隔色
		columns: [{
			field: 'id',
			title: '内标签号'
		}, {
			field: 'pmn04',
			title: '物料'
		}, {
			field: 'pmn02',
			title: '批次'
		}, {
			field: 'pmn041',
			title: '品名'
		}, {
			field: 'pmn20',
			title: '数量',
			formatter: function (value, row, index) {
				return "<input class='form-control input-sm' name='countText' type='text' value='" + value + "' placeholder='Enter name' style='height:23px;'>";
			}
		}, {
			title: '操作',
			formatter: function(value, row, index){
				return "<button class='btn btn-danger btn-xs' name='deleteBtn'><i class='icon-remove' title='删除'></i></button>";
			}
		}],
		data: [],
		formatNoMatches : function() {
			return '没有数据';
		}
	});*/
}

/*function mergeCells(data,fieldName,colspan,target,fieldList){     
	// 声明一个map计算相同属性值在data对象出现的次数和  
	var sortMap = {};  
	for(var i = 0 ; i < data.length ; i++){  
	    for(var prop in data[i]){  
	        //例如people.unit.name  
	        var fieldArr=fieldName.split(".");                
	        getCount(data[i],prop,fieldArr,0,sortMap);  
	    }  
	}       
	var index = 0;      
	for(var prop in sortMap){  
	    var count = sortMap[prop];  
	    for(var i = 0 ; i < fieldList.length ; i++){  
	        $(target).bootstrapTable('mergeCells',{index:index, field:fieldList[i], colspan: colspan, rowspan: count});     
        }  
        index += count;          
    }  
}  

function getCount(data,prop,fieldArr,index,sortMap){      
    if(index == fieldArr.length-1){           
        if(prop == fieldArr[index]){  
            var key = data[prop];              
            if(sortMap.hasOwnProperty(key)){  
                sortMap[key] = sortMap[key]+ 1;  
            } else {  
                sortMap[key] = 1;  
            }   
        }          
        return;  
    }         
    if(prop == fieldArr[index]){  
        var sdata = data[prop];      
        index=index+1;  
        getCount(sdata,fieldArr[index],fieldArr,index,sortMap);  
    }   
      
} */

/**
 * 合并单元格
 * @param data  原始数据（在服务端完成排序）
 * @param fieldName 合并属性名称
 * @param colspan   合并列
 * @param target    目标表格对象
 */
function mergeCells(data, fieldName, colspan, target){
    //声明一个map计算相同属性值在data对象出现的次数和
    var sortMap = {};
    for(var i = 0 ; i < data.length ; i++){
        for(var prop in data[i]){
            if(prop == fieldName){
                var key = data[i][prop]
                if(sortMap.hasOwnProperty(key)){
                    sortMap[key] = sortMap[key] * 1 + 1;
                } else {
                    sortMap[key] = 1;
                }
                break;
            } 
        }
    }
    for(var prop in sortMap){
        console.log(prop,sortMap[prop])
    }
    var index = 0;
    for(var prop in sortMap){
        var count = sortMap[prop] * 1;
        $(target).bootstrapTable('mergeCells',{index:index, field:fieldName, colspan: colspan, rowspan: count});   
        index += count;
    }
}