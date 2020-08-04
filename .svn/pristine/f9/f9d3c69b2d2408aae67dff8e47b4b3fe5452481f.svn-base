var opt = "<button class='btn btn-success btn-xs'><i class='icon-ok' title='启用'></i></button>"
		  + "<button class='btn btn-danger btn-xs'><i class='icon-remove' title='禁用'></i></button>"
		  + "<button class='btn btn-primary btn-xs'><i class='icon-pencil' title='修改'></i></button>"
		  + "<button class='btn btn-danger btn-xs'><i class='icon-trash' title='删除'></i></button>";
		
$(function(){
	$('#role_table').bootstrapTable({
		url: '',
		method : 'get',
		cache: false,						//是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		//height: 350,
		striped: true,						//是否显示行间隔色
		pagination: true,       			//是否显示分页（*）
		clickToSelect: true,
		showPaginationSwitch: false, 		//显示分页切换按钮  
		sortable: true,                     //是否启用排序
		sortOrder: "asc",                   //排序方式
		sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
		pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
		pageSize: 10,                     	//每页的记录行数（*）
		pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
		//toolbar: "#toolbar",
		search: true,                      //是否显示表格搜索
		strictSearch: true,
		showColumns: false,                  //是否显示所有的列（选择显示的列）
		showRefresh: false,                  //是否显示刷新按钮
		minimumCountColumns: 2,             //最少允许的列数
		clickToSelect: true,                //是否启用点击选中行
		//height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
		uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
		showToggle: false,                   //是否显示详细视图和列表视图的切换按钮
		cardView: false,                    //是否显示详细视图
		detailView: false,                  //是否显示父子表
		//得到查询的参数
		queryParams : function (params) {
			//这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
			var temp = {   
				rows: params.limit,                         //页面大小
				page: (params.offset / params.limit) + 1,   //页码
				sort: params.sort,      					//排序列名
				sortOrder: params.order 					//排位命令（desc，asc）
			};
			return temp;
		},
		columns: [{
			field: 'Name',
			title: '用户名',
			sortable: true
		}, {
			field: 'Id',
			title: 'SessionID'
		}, {
			field: 'Status',
			title: '状态',
			sortable: true
		}, {
			field: 'LoginTime',
			title: '登入时间',
			sortable: true
		}, {
			field: 'ActiveTime',
			title: '活动时间',
			sortable: true
		}, {
			field: 'opt',
			title: '操作',
			formatter: function(value, row, index){
			return "<button class='btn btn-danger btn-xs'><i class='icon-remove' title='踢出'></i></button>";
			}
				
				
		}],
		data: [{"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt},
			   {"Name":"张三","Email":"123@qq.com","Age":"32","Date":"2018-08-08","opt":opt}],
		onLoadSuccess: function () {
		},
		onLoadError: function () {
			showTips("数据加载失败！");
		},
		onDblClickRow: function (row, $element) {
			var id = row.ID;
			EditViewById(id, 'view');
		}
	});
});