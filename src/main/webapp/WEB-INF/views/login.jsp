<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<!-- Global stylesheets(S) -->
	<link href="https://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900" rel="stylesheet" type="text/css">
	<link href="css/icons/icomoon/styles.css" rel="stylesheet" type="text/css">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/core.css" rel="stylesheet" type="text/css">
	<link href="css/components.css" rel="stylesheet" type="text/css">
	<link href="css/colors.css" rel="stylesheet" type="text/css">
	<!-- global stylesheets(E) -->

	<!-- Core JS files(S) -->
	<script type="text/javascript" src="js/core/libraries/jquery.min.js"></script>
	<script type="text/javascript" src="js/core/libraries/bootstrap.min.js"></script>
	<!-- core JS files(E) -->

	<!-- Theme JS files(S) -->
	<script type="text/javascript" src="js/core/app.js"></script>
	<!-- theme JS files(E) -->
	
	<!-- work script(S) -->
	<script type="text/javascript" src="js/login/login.js"></script>
	<!-- work script(E) -->
	
</head>
<body class="login-container">
<!-- Main navbar -->
<div class="navbar navbar-inverse">
	<div class="navbar-header">
		<a class="navbar-brand" href="index.html">LOGO</a>

		<ul class="nav navbar-nav pull-right visible-xs-block">
			<li><a data-toggle="collapse" data-target="#navbar-mobile"><i class="icon-tree5"></i></a></li>
		</ul>
	</div>

	<div class="navbar-collapse collapse" id="navbar-mobile">
		<ul class="nav navbar-nav navbar-right">
			<li>
				<a href="#">
					<i class="icon-display4"></i> <span class="visible-xs-inline-block position-right"> Go to website</span>
				</a>
			</li>

			<li>
				<a href="#">
					<i class="icon-user-tie"></i> <span class="visible-xs-inline-block position-right"> Contact admin</span>
				</a>
			</li>

			<li class="dropdown">
				<a class="dropdown-toggle" data-toggle="dropdown">
					<i class="icon-cog3"></i>
					<span class="visible-xs-inline-block position-right"> Options</span>
				</a>
			</li>
		</ul>
	</div>
</div>
<!-- /main navbar -->


<!-- Page container -->
<div class="page-container">

	<!-- Page content -->
	<div class="page-content">

		<!-- Main content -->
		<div class="content-wrapper">

			<!-- Content area -->
			<div class="content">

				<!-- Advanced login -->
				<form id="login_form">
					<div class="panel panel-body login-form">
						<div class="text-center">
							<div class="icon-object border-slate-300 text-slate-300"><i class="icon-reading"></i></div>
							<h5 class="content-group">Login to your account <small class="display-block">Your credentials</small></h5>
						</div>

						<div class="form-group has-feedback has-feedback-left">
							<input type="text" name="userName" class="form-control" placeholder="Username">
							<div class="form-control-feedback">
								<i class="icon-user text-muted"></i>
							</div>
						</div>

						<div class="form-group has-feedback has-feedback-left">
							<input type="password" name="password" class="form-control" placeholder="Password">
							<div class="form-control-feedback">
								<i class="icon-lock2 text-muted"></i>
							</div>
						</div>

						<div class="form-group login-options">
							<div class="row">
								<div class="col-sm-6">
									<label class="checkbox-inline">
										<input type="checkbox" class="styled" checked="checked">
										Remember
									</label>
								</div>

								<div class="col-sm-6 text-right">
									<a href="login_password_recover.html">Forgot password?</a>
								</div>
							</div>
						</div>

						<div class="form-group">
							<button id="login" type="button" class="btn bg-blue btn-block">Login <i class="icon-arrow-right14 position-right"></i></button>
						</div>

						<div class="content-divider text-muted form-group"><span>Don't have an account?</span></div>
						<a href="login_registration.html" class="btn btn-default btn-block content-group">Sign up</a>
					</div>
				</form>
				<!-- /advanced login -->


				<!-- Footer -->
				<div class="footer text-muted text-center">
					&copy; 2016. Business Support Service
				</div>
				<!-- /footer -->

			</div>
			<!-- /content area -->

		</div>
		<!-- /main content -->

	</div>
	<!-- /page content -->

</div>
<!-- /page container -->
</body>
</html>