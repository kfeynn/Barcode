<%@ page language="java" import="java.util.*,java.net.*" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Mosaddek">
    <meta name="keyword" content="FlatLab, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <link rel="shortcut icon" href="<%=basePath %>img/favicon.html">

    <title>FlatLab - Flat & Responsive Bootstrap Admin Template</title>

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

  <body class="login-body">

    <div class="container">

      <form class="form-signin" action="" method="post">
        <h2 class="form-signin-heading">sign in now</h2>
        <div class="login-wrap">
            <input type="text" id="username" class="form-control" placeholder="User ID" autofocus>
            <input type="password" id="password" class="form-control" placeholder="Password">
            <label class="checkbox">
                <input type="checkbox" value="remember-me"> Remember me
                <span class="pull-right"> <a href="#"> Forgot Password?</a></span>
            </label>
            <button id="login" class="btn btn-lg btn-login btn-block" type="button">Sign in</button>
            <p>or you can sign in via social network</p>
            <div class="login-social-link">
                <a href="index.html" class="facebook">
                    <i class="icon-facebook"></i>
                    Facebook
                </a>
                <a href="index.html" class="twitter">
                    <i class="icon-twitter"></i>
                    Twitter
                </a>
            </div>
        </div>
      </form>
    </div>

	<!-- Javascript -->
    <script src="<%=basePath %>js/common/jquery/jquery1.8.3.min.js"></script>
    <script src="<%=basePath %>js/common/MD5.js"></script>
    <script src="<%=basePath %>js/common/supersized.3.2.7.min.js"></script>
    <%-- <script src="<%=basePath %>js/common/supersized-init.js"></script> --%>
	<script src="<%=basePath %>js/common/layer/layer.js"></script>
    <script >
		jQuery(document).ready(function() {
			try{
				var _href = window.location.href+"";
				if(_href && _href.indexOf('?kickout')!=-1){
					layer.msg('您已经被踢出，请重新登录！');
				}
			}catch(e){
				
			}
			//回车事件绑定
			document.onkeydown=function(event){
				var e = event || window.event || arguments.callee.caller.arguments[0];
				if(e && e.keyCode==13){ 
					$('#login').click();
				}
			}; 
		
			//登录操作
		    $('#login').click(function(){
		    	
		        var username = $('#username').val();
		        var password = $('#password').val();
		        if(username == '') {
		            $('.error').fadeOut('fast', function(){
		                $('.error').css('top', '27px').show();
		            });
		            $('.error').fadeIn('fast', function(){
		                $('#username').focus();
		            });
		            return false;
		        }
		        if(password == '') {
		            $('.error').fadeOut('fast', function(){
		                $('.error').css('top', '96px').show();
		            });
		            $(this).find('.error').fadeIn('fast', function(){
		                $('#password').focus();
		            });
		            return false;
		        }
		        var pswd = MD5(username + "#" + password),
		        	data = {pswd:password,email:username,rememberMe:$("#rememberMe").is(':checked')};
		        var load = layer.load();
		        
		        $.ajax({
		        	url:"<%=basePath%>/u/submitLogin.do",
		        	data:data,
		        	type:"post",
		        	dataType:"json",
		        	beforeSend:function(){
		        		layer.msg('开始登录，请注意后台控制台。');
		        	},
		        	success:function(result){
			        	layer.close(load);
			    		if(result && result.status != 200){
			    			layer.msg(result.message,function(){});
			    			$('.password').val('');
			    			return;
			    		}else{
			    			layer.msg('登录成功！');
			    			setTimeout(function(){
			    				//登录返回
				    			window.location.href= result.data || "<%=basePath%>/";
			    			},1000);
			    		}
		        	},
		        	error:function(e){
		        		console.log(e,e.message);
		        		layer.msg('请看后台Java控制台，是否报错，确定已经配置数据库和Redis',new Function());
		        	}
		        });
		    });
		    $('.page-container form .username, .page-container form .password').keyup(function(){
		        $(this).parent().find('.error').fadeOut('fast');
		    });
		    //注册
		    $("#register").click(function(){
		    	window.location.href="register.do";
		    });
		});
     </script>

  </body>
</html>
