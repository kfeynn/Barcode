<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Mosaddek">
    <meta name="keyword" content="FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <link rel="shortcut icon" href="img/favicon.html">

    <title>修改送货单</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=basePath %>css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath %>css/bootstrap-reset.css" rel="stylesheet">
	<link href="<%=basePath %>css/bootstrap-table.css" rel="stylesheet"/>
    <!--external css-->
    <link href="<%=basePath %>assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="<%=basePath %>css/style.css" rel="stylesheet">
    <link href="<%=basePath %>css/style-responsive.css" rel="stylesheet" />
	<link href="<%=basePath %>css/style-custom.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body >
    <!-- page start-->
		  <div class="col-lg-12">
                      <section class="panel">
                          <header class="panel-heading">
                              修改送货单信息
                          </header>
						  <div class="panel-body">
							<form class="form-horizontal tasi-form">
							  <div class="form-group">
								  <label class="col-sm-1 control-label">送货单号</label>
								  <div class="col-sm-3">
									  <input class="form-control" id="dnnum" type="text" placeholder="Enter name" autofocus="autofocus">
								  </div>
								  <label class="col-sm-1 control-label">包装票号</label>
								  <div class="col-sm-3">
									  <input class="form-control" id="boxnum" type="text" placeholder="Enter name">
								  </div>
							  </div>
							  <div class="form-group">
								  <label class="col-sm-1 control-label">内标签号</label>
								  <div class="col-sm-3">
									  <input class="form-control" id="materId" type="text" placeholder="Enter name">
								  </div>
								  <label class="col-sm-1 control-label"></label>
								  <div class="col-sm-3">
									  
								  </div>
								  <div class="col-sm-2">
									  <button id="query" type="button" class="btn btn-info">查询</button>
									  <button id="reset" type="reset" class="btn btn-reset">重置</button>
								  </div>
								  <div class="col-sm-2">
									  <button id="submit" type="button" class="btn btn-warning">确认修改</button>
								  	  <button id="delete" type="button" class="btn btn-danger">确认删除</button>
								  </div>
							  </div>
							</form>
                          
						  </div>
                      </section>
                  </div>
				  
				  <div class="col-lg-12" id="pn_panel">
                      <!--user info table start-->
                      <section class="panel">
						
                          <div class="panel-body progress-panel">
							<div class="text-center">
							  <h3 class="timeline-title">送货单</h3>
						    </div>
							<div class="task-progress">
                                  <p class="t-info">送货单号：<strong name="dnnumText"></strong></p>
								  
                              </div>
							  <div class="task-option">
								  <div class="form-group">
									  <label class="col-sm-4 control-label">送货日期</label>
									  <div class="col-sm-8">
										  <input class="form-control" id="pmn33" type="text" placeholder="Enter name">
									  </div>
								  </div>
								</div>
                          </div>
                          <!-- <table class="table table-hover personal-task"> -->
						  <table class="table table-striped table-hover table-condensed" id="pn_table">
							
                          </table>
                      </section>
                      <!--user info table end-->
                  </div>
				  
                  
                  <div class="col-lg-12" id="box_panel">
                      <!--user info table start-->
                      <section class="panel">
                          <div class="panel-body progress-panel">
							<div class="text-center">
							  <h3 class="timeline-title">包装票</h3>
						    </div>
                          </div>
                          <table class="table table-striped table-hover table-condensed" id="box_table">
							
                          </table>
                      </section>
                      <!--user info table end-->
                  </div>
				  <!-- <div class="col-lg-12" id="mater_panel">
                      user info table start
                      <section class="panel">
                          <div class="panel-body progress-panel">
							<div class="text-center">
							  <h3 class="timeline-title">内标签</h3>
						    </div>
						    <div class="task-progress">
                                  <p class="t-info">送货单号：<strong name="dnnumText"></strong></p>
								  
                              </div>
                          </div>
                          <table class="table table-striped table-hover table-condensed" id="mater_table">
							
                          </table>
                      </section>
                      user info table end
                  </div>	 -->

						  
    <!-- js placed at the end of the document so the pages load faster -->
    <script src="<%=basePath %>js/jquery.js"></script>
    <script src="<%=basePath %>js/bootstrap.js"></script>
	<script src="<%=basePath %>js/bootstrap-table.js"></script>
	<script src="<%=basePath %>js/bootstrap-table-export.js"></script>
	<script src="<%=basePath %>js/bootstrap-table-toolbar.js"></script>
	<script src="<%=basePath %>js/tableExport.js"></script>
    <script src="<%=basePath %>js/jquery.scrollTo.min.js"></script>
    <script src="<%=basePath %>js/jquery.nicescroll.js" type="text/javascript"></script>
    


    <!--common script for all pages-->
    <script src="<%=basePath %>js/common-scripts.js"></script>

    <!--script for this page only-->
    

	<script src="<%=basePath %>js/receiving-manage/editdeliver.js"></script>
  </body>
</html>
