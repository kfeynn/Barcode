<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <title>个人信息</title>

    <!-- Bootstrap core CSS -->
    <link href="<%=basePath %>css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=basePath %>css/bootstrap-reset.css" rel="stylesheet">
    <!--external css-->
    <link href="<%=basePath %>assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="<%=basePath %>css/style.css" rel="stylesheet">
    <link href="<%=basePath %>css/style-responsive.css" rel="stylesheet" />

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
					 个人信息
				  </header>
				  <div class="panel-body">
					  <form class="form-horizontal tasi-form" method="post">
						  <div class="form-group">
							  <label class="col-sm-2 control-label">姓名</label>
							  <div class="col-sm-4">
								  <input class="form-control" id="name" type="text" value="${user.gen02 }" placeholder="Enter name" disabled>
							  </div>
							  <label class="col-sm-2 control-label">性别</label>
							  <div class="col-sm-4">
								  <input class="form-control" id="sex" type="text" placeholder="Enter sex" disabled>
							  </div>
						  </div>
						  <div class="form-group">
							  <label class="col-sm-2 control-label">工号</label>
							  <div class="col-sm-4">
								  <input class="form-control" id="empid" type="text" placeholder="Enter employee id" disabled>
							  </div>
							  <label class="col-sm-2 control-label">电子邮箱</label>
							  <div class="col-sm-4">
								  <input class="form-control" id="email" type="text" placeholder="Enter email" disabled>
							  </div>
						  </div>
						  <div class="form-group">
							  <label class="col-sm-2 control-label">部门</label>
							  <div class="col-sm-10">
								  <input class="form-control" id="dept" type="text" placeholder="Enter dept" disabled>
							  </div>
						  </div>
						  <div class="form-group">
							  <label class="col-sm-2 control-label">职位</label>
							  <div class="col-sm-10">
								  <input class="form-control" id="position" type="text" placeholder="Enter position" disabled>
							  </div>
						  </div>
					  </form>
				  </div>
			  </section>
			  
		  </div>
    <!-- js placed at the end of the document so the pages load faster -->
    <script src="<%=basePath %>js/jquery.js"></script>
    <script src="<%=basePath %>js/bootstrap.min.js"></script>
    <script src="<%=basePath %>js/jquery.scrollTo.min.js"></script>
    <script src="<%=basePath %>js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="<%=basePath %>js/common-scripts.js"></script>


  </body>
</html>
