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

    <title>条码系统</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-reset.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
    <link rel="stylesheet" href="css/owl.carousel.css" type="text/css">
    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
      <script src="js/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

  <section id="container" class="">
      <!--header start-->
      <header class="header white-bg">
            <div class="sidebar-toggle-box">
                <div data-original-title="Toggle Navigation" data-placement="right" class="icon-reorder tooltips"></div>
            </div>
            <!--logo start-->
            <a href="index.html" class="logo">格兰达<span>条码系统</span></a>
            <!--logo end-->
            <div class="nav notify-row" id="top_menu">
                <!--  notification start -->
                <ul class="nav top-menu">
                    <!-- settings start -->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <i class="icon-tasks"></i>
                           
                        </a>
                        <ul class="dropdown-menu extended tasks-bar">
                            <div class="notify-arrow notify-arrow-green"></div>
                            <li>
                                <p class="green">You have 6 pending tasks</p>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">Dashboard v1.3</div>
                                        <div class="percent">40%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">Database Update</div>
                                        <div class="percent">60%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">Iphone Development</div>
                                        <div class="percent">87%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 87%">
                                            <span class="sr-only">87% Complete</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">Mobile App</div>
                                        <div class="percent">33%</div>
                                    </div>
                                    <div class="progress progress-striped">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 33%">
                                            <span class="sr-only">33% Complete (danger)</span>
                                        </div>
                                    </div>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <div class="task-info">
                                        <div class="desc">Dashboard v1.3</div>
                                        <div class="percent">45%</div>
                                    </div>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar"  role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
                                            <span class="sr-only">45% Complete</span>
                                        </div>
                                    </div>

                                </a>
                            </li>
                            <li class="external">
                                <a href="#">See All Tasks</a>
                            </li>
                        </ul>
                    </li>
                    <!-- settings end -->
                    <!-- inbox dropdown start-->
                    <li id="header_inbox_bar" class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <i class="icon-envelope-alt"></i>
                           
                        </a>
                        <ul class="dropdown-menu extended inbox">
                            <div class="notify-arrow notify-arrow-red"></div>
                            <li>
                                <p class="red">You have 5 new messages</p>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="img/avatar-mini.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Jonathan Smith</span>
                                    <span class="time">Just now</span>
                                    </span>
                                    <span class="message">
                                        Hello, this is an example msg.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="img/avatar-mini2.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Jhon Doe</span>
                                    <span class="time">10 mins</span>
                                    </span>
                                    <span class="message">
                                     Hi, Jhon Doe Bhai how are you ?
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="img/avatar-mini3.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Jason Stathum</span>
                                    <span class="time">3 hrs</span>
                                    </span>
                                    <span class="message">
                                        This is awesome dashboard.
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="photo"><img alt="avatar" src="img/avatar-mini4.jpg"></span>
                                    <span class="subject">
                                    <span class="from">Jondi Rose</span>
                                    <span class="time">Just now</span>
                                    </span>
                                    <span class="message">
                                        Hello, this is metrolab
                                    </span>
                                </a>
                            </li>
                            <li>
                                <a href="#">See all messages</a>
                            </li>
                        </ul>
                    </li>
                    <!-- inbox dropdown end -->
                    <!-- notification dropdown start-->
                    <li id="header_notification_bar" class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">

                            <i class="icon-bell-alt"></i>
                            
                        </a>
                        <ul class="dropdown-menu extended notification">
                            <div class="notify-arrow notify-arrow-yellow"></div>
                            <li>
                                <p class="yellow">You have 7 new notifications</p>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-danger"><i class="icon-bolt"></i></span>
                                    Server #3 overloaded.
                                    <span class="small italic">34 mins</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-warning"><i class="icon-bell"></i></span>
                                    Server #10 not respoding.
                                    <span class="small italic">1 Hours</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-danger"><i class="icon-bolt"></i></span>
                                    Database overloaded 24%.
                                    <span class="small italic">4 hrs</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-success"><i class="icon-plus"></i></span>
                                    New user registered.
                                    <span class="small italic">Just now</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-info"><i class="icon-bullhorn"></i></span>
                                    Application error.
                                    <span class="small italic">10 mins</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">See all notifications</a>
                            </li>
                        </ul>
                    </li>
                    <!-- notification dropdown end -->
                </ul>
                <!--  notification end -->
            </div>
            <div class="top-nav ">
                <!--search & user info start-->
                <ul class="nav pull-right top-menu">
                    <li>
                        <input type="text" class="form-control search" placeholder="Search">
                    </li>
                    <!-- user login dropdown start-->
                    <li class="dropdown">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                           
                            <span class="username">管理员</span>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu extended logout">
                            <div class="log-arrow-up"></div>
                            <li><a href="#"><i class=" icon-suitcase"></i>修改密码</a></li>
                            <li><a href="#"><i class="icon-cog"></i> 设置</a></li>
                            <li><a href="#"><i class="icon-bell-alt"></i> 个人信息</a></li>
                            <li><a href="login.html"><i class="icon-key"></i> 退出</a></li>
                        </ul>
                    </li>
                    <!-- user login dropdown end -->
                </ul>
                <!--search & user info end-->
            </div>
        </header>
      <!--header end-->
      <!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">
                  <li class="active">
                      <a class="" href="index.html">
                          <i class="icon-dashboard"></i>
                          <span>主页</span>
                      </a>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-book"></i>
                          <span>基础管理</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <!--<li><a class="" href="mailto:abc-lal@gmail.com?subject=加班&cc=bcn-lal@gmail.com&body=内容&nbsp;nimei" target="menuFrame">物料信息</a></li>-->
						  <li><a class="" href="views/base-manage/partlist.html" target="menuFrame">物料信息</a></li>
                          <li><a class="" href="views/base-manage/supplierlist.html" target="menuFrame">供应商信息</a></li>
                          <li><a class="" href="views/base-manage/clientlist.html" target="menuFrame">客户信息</a></li>
                          
                      </ul>
                  </li>
                  
                  <%-- 采购管理 --%>
                  <shiro:hasAnyRoles name="888888,100001">
                  	<li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-cogs"></i>
                          <span>采购管理</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="views/purchase-manage/orderlist.html" target="menuFrame">订单信息</a></li>
                      </ul>
                  	</li>
                  </shiro:hasAnyRoles>
                  
                  <%-- 收货管理 --%>
                  <shiro:hasAnyRoles name="888888,288888,200001">
                  	<li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-tasks"></i>
                          <span>收货管理</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="test/5.html" target="menuFrame">未收货物料</a></li>
                          <li><a class="" href="test/6.html" target="menuFrame">已接受物料</a></li>
                          <li><a class="" href="test/7.html" target="menuFrame">退货物料</a></li>
                      </ul>
                  	</li>
                  </shiro:hasAnyRoles>
                  
                  <%-- 仓库管理 --%>
                  <shiro:hasAnyRoles name="888888,388888,300001">
                  	<li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-tasks"></i>
                          <span>仓库管理</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
					  <li><a class="" href="test/19.html" target="menuFrame">物料入库</a></li>
                          <li><a class="" href="test/8.html" target="menuFrame">产品入库</a></li>
						  <li><a class="" href="test/9.html" target="menuFrame">物料领料</a></li>
                          <li><a class="" href="test/10.html" target="menuFrame">产品出库</a></li>
						  <li><a class="" href="test/11.html" target="menuFrame">委外发料</a></li>
                          <li><a class="" href="test/12.html" target="menuFrame">仓库盘点</a></li>
                      </ul>
                  	</li>
                  </shiro:hasAnyRoles>
                  
                  <%-- 质检管理 --%>
                  <shiro:hasAnyRoles name="888888,488888,400001">
                  	<li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-th"></i>
                          <span>质检管理</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="test/13.html" target="menuFrame">入库未检物料</a></li>
                          <li><a class="" href="test/14.html" target="menuFrame">不合格物料</a></li>
                      </ul>
                  	</li>
                  </shiro:hasAnyRoles>
                  
                  <%-- 出货管理 --%>
                  <shiro:hasAnyRoles name="888888,588888,500001">
                  	<li class="sub-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-th"></i>
                          <span>出货管理</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub">
                          <li><a class="" href="views/shipping-manage/shippinglist.html" target="menuFrame">成品出货</a></li>
                      </ul>
                  	</li>
                  </shiro:hasAnyRoles>
				  
                  
                  <li class="sub-sidebar-menu">
                      <a href="javascript:;" class="">
                          <i class="icon-glass"></i>
                          <span>用户管理</span>
                          <span class="arrow"></span>
                      </a>
                      <ul class="sub-sidebar" style="display: none;">
						<li class="sub-menu">
						  <a href="javascript:;" class="">
							  <i class="icon-glass"></i>
							  <span>信息管理</span>
							  <span class="arrow"></span>
						  </a>
						  <ul class="sub" style="display: none;">
							<li><a class="" href="views/user-manage/userinfo.html" target="menuFrame">个人信息</a></li>
						  
							<li><a class="" href="views/user-manage/modifypwd.html" target="menuFrame">修改密码</a></li>
							<li><a class="" href="views/user-manage/permission.html" target="menuFrame">我的权限</a></li>
						  </ul>
						</li>
						
						<shiro:hasAnyRoles name="888888,588888">
						  <li class="sub-menu">
						    <a href="javascript:;" class="">
							  <i class="icon-glass"></i>
							  <span>用户管理</span>
							  <span class="arrow"></span>
							</a>
							<ul class="sub" style="display: none;">
							  <li><a class="" href="views/user-manage/userlist.html" target="menuFrame">用户列表</a></li>
							  <shiro:hasRole name="888888">
							  	<li><a class="" href="views/user-manage/onlinelist.html" target="menuFrame">在线用户</a></li>
							  </shiro:hasRole>
							</ul>
						  </li>
						</shiro:hasAnyRoles>
						
						<shiro:hasAnyRoles name="888888,588888">
						  <li class="sub-menu">
						    <a href="javascript:;" class="">
							  <i class="icon-glass"></i>
							  <span>权限管理</span>
							  <span class="arrow"></span>
						    </a>
						    <ul class="sub" style="display: none;">
							  <li><a class="" href="views/user-manage/rolelist.html" target="menuFrame">角色列表</a></li>
							  <li><a class="" href="views/user-manage/rolealloc.html" target="menuFrame">角色分配</a></li>
						  
							  <li><a class="" href="views/user-manage/permissionlist.html" target="menuFrame">权限列表</a></li>
							  <li><a class="" href="views/user-manage/permissionalloc.html" target="menuFrame">权限分配</a></li>
						    </ul>
						  </li>
						</shiro:hasAnyRoles>
                      </ul>
                  </li>
                 
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      <!--main content start-->
      <section id="main-content" >
          <section class="wrapper">
			<div class="row" >
				<!-- <iframe id="menuFrame" name="menuFrame" src="main.html"
					scrolling="yes" frameborder="no" style="width:100%;height:100%; "
					></iframe> -->

			</div>
          </section>
      </section>
      <!--main content end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="js/jquery.js"></script>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollTo.min.js"></script>
    <script src="js/jquery.nicescroll.js" type="text/javascript"></script>
    <script src="js/jquery.sparkline.js" type="text/javascript"></script>
    <script src="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.js"></script>
    <script src="js/owl.carousel.js" ></script>
    <script src="js/jquery.customSelect.min.js" ></script>

    <!--common script for all pages-->
    <script src="js/common-scripts.js"></script>

    <!--script for this page-->
    <script src="js/sparkline-chart.js"></script>
    <script src="js/easy-pie-chart.js"></script>

  <script>

      //owl carousel

      $(document).ready(function() {
          $("#owl-demo").owlCarousel({
              navigation : true,
              slideSpeed : 300,
              paginationSpeed : 400,
              singleItem : true

          });
      });

      //custom select box

      $(function(){
          $('select.styled').customSelect();
      });

  </script>

  </body>
</html>
