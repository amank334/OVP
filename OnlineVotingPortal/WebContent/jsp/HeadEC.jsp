<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>OnlineVotingPortal | Main Admin</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.6 -->
<link rel="stylesheet" href="jsp/bootstrap/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="jsp/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" href="jsp/dist/css/skins/_all-skins.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<!-- ADD THE CLASS layout-top-nav TO REMOVE THE SIDEBAR. -->
<body class="hold-transition skin-blue layout-top-nav">
	<div class="wrapper">

		<header class="main-header"> <nav
			class="navbar navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<a href="#" class="navbar-brand"><b>OnlineVotingPortal</b></a>
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar-collapse">
					<i class="fa fa-bars"></i>
				</button>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<!-- /.navbar-collapse -->
			<!-- Navbar Right Menu -->
			<div class="navbar-custom-menu">
				<ul class="nav navbar-nav">
					<!-- User Account Menu -->
					<li class="dropdown user user-menu">
						<!-- Menu Toggle Button --> <a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> <!-- The user image in the navbar--> <img
							src="../../dist/img/user2-160x160.jpg" class="user-image"
							alt="User Image"> <!-- hidden-xs hides the username on small devices so only the image appears. -->
							<span class="hidden-xs">Alexander Pierce</span>
					</a>
						<ul class="dropdown-menu">
							<!-- The user image in the menu -->
							<li class="user-header"><img
								src="../../dist/img/user2-160x160.jpg" class="img-circle"
								alt="User Image">

								<p>
									Alexander Pierce - Web Developer <small>Member since
										Nov. 2012</small>
								</p></li>
							<!-- Menu Body -->

							<!-- Menu Footer-->
							<li class="user-footer">
								<div class="pull-left">
									<a href="#" class="btn btn-default btn-flat">Profile</a>
								</div>
								<div class="pull-right">
									<a href="#" class="btn btn-default btn-flat">Sign out</a>
								</div>
							</li>
						</ul>
					</li>
				</ul>
			</div>
			<!-- /.navbar-custom-menu -->
		</div>
		<!-- /.container-fluid --> </nav> </header>
		<!-- Full Width Column -->
		<div class="content-wrapper">
			<div class="container">
				<!-- Content Header (Page header) -->
				<section class="content-header">
				<h1>Main Admin</h1>

				</section>

				<!-- Main content -->
				<section class="content">
				<div class="box box-default">
					<div class="box-header with-border">
						<h1 class="box-title">
							<b>Welcome Election Controller!</b>
						</h1>
					</div>
					<div class="box-body">
						<div class="row">
							<div class="col-md-12">
								<!-- Custom Tabs -->
								<div class="nav-tabs-custom">
									<ul class="nav nav-tabs">
										<li class="active"><a href="#tab_1" data-toggle="tab"><b>Manage
													Election</b></a></li>
										<li><a href="#tab_2" data-toggle="tab"><b>Add
													State Admin</b></a></li>
										<li><a href="#tab_3" data-toggle="tab"><b>Add
													Party</b></a></li>
										<li><a href="#tab_4" data-toggle="tab"><b>Verify
													Party Details</b></a></li>
									</ul>
								</div>


							</div>



							<div class="tab-content">

								<div class="tab-pane active" id="tab_1">
									<form action="ManageElectionController">
										<div class="col-md-12">

											<h2>Election</h2>

										</div>
										<br> <br>

										<div class="col-md-3"></div>

										<div class="col-md-6">
											<div class="form-group">
												<label>Election Type</label> <select name="electiontype"
													class="form-control">
													<option>Loksabha</option>
													<option>VidhanSabha</option>
												</select>
											</div>
											<!-- Date -->
											<div class="form-group">
												<label>Date</label>

												<div class="input-group date">
													<div class="input-group-addon">
														<i class="fa fa-calendar"></i>
													</div>
													<input type="date" class="form-control pull-right"
														name="electionDate " id="datepicker">
												</div>
												<!-- /.input group -->
											</div>
											<div class="form-group">
												<label>Election State</label> <select
													class="form-control select2" name="electionstate"
													style="width: 100%;">
													<option value="">------------Select State------------</option>
													<option value="">None(For Whole Country Election)</option>
													<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
													<option value="Andhra Pradesh">Andhra Pradesh</option>
													<option value="Arunachal Pradesh">Arunachal Pradesh</option>
													<option value="Assam">Assam</option>
													<option value="Bihar">Bihar</option>
													<option value="Chandigarh">Chandigarh</option>
													<option value="Chhattisgarh">Chhattisgarh</option>
													<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
													<option value="Daman and Diu">Daman and Diu</option>
													<option value="Delhi">Delhi</option>
													<option value="Goa">Goa</option>
													<option value="Gujarat">Gujarat</option>
													<option value="Haryana">Haryana</option>
													<option value="Himachal Pradesh">Himachal Pradesh</option>
													<option value="Jammu and Kashmir">Jammu and Kashmir</option>
													<option value="Jharkhand">Jharkhand</option>
													<option value="Karnataka">Karnataka</option>
													<option value="Kerala">Kerala</option>
													<option value="Lakshadweep">Lakshadweep</option>
													<option value="Madhya Pradesh">Madhya Pradesh</option>
													<option value="Maharashtra">Maharashtra</option>
													<option value="Manipur">Manipur</option>
													<option value="Meghalaya">Meghalaya</option>
													<option value="Mizoram">Mizoram</option>
													<option value="Nagaland">Nagaland</option>
													<option value="Orissa">Orissa</option>
													<option value="Pondicherry">Pondicherry</option>
													<option value="Punjab">Punjab</option>
													<option value="Rajasthan">Rajasthan</option>
													<option value="Sikkim">Sikkim</option>
													<option value="Tamil Nadu">Tamil Nadu</option>
													<option value="Tripura">Tripura</option>
													<option value="Uttaranchal">Uttaranchal</option>
													<option value="Uttar Pradesh">Uttar Pradesh</option>
													<option value="West Bengal">West Bengal</option>

												</select>
											</div>
											<div class="col-md-9"></div>

											<div class="col-xs-3">
												<button type="submit" class="btn btn-block btn-success">Add</button>
											</div>


										</div>
									</form>
								</div>


								<!-- /.tab-pane -->
								<div class="tab-pane" id="tab_2">
									<form action="AddStateAdminController">
										<div class="col-md-12">
											<h2>State Admin</h2>

										</div>
										<br> <br>

										<div class="col-md-3"></div>

										<div class="col-md-6">
											<div class="form-group">
												<label>Select State</label> <select class="form-control" name="slist">
													<option value="">------------Select State------------</option>
													<option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
													<option value="Andhra Pradesh">Andhra Pradesh</option>
													<option value="Arunachal Pradesh">Arunachal Pradesh</option>
													<option value="Assam">Assam</option>
													<option value="Bihar">Bihar</option>
													<option value="Chandigarh">Chandigarh</option>
													<option value="Chhattisgarh">Chhattisgarh</option>
													<option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
													<option value="Daman and Diu">Daman and Diu</option>
													<option value="Delhi">Delhi</option>
													<option value="Goa">Goa</option>
													<option value="Gujarat">Gujarat</option>
													<option value="Haryana">Haryana</option>
													<option value="Himachal Pradesh">Himachal Pradesh</option>
													<option value="Jammu and Kashmir">Jammu and Kashmir</option>
													<option value="Jharkhand">Jharkhand</option>
													<option value="Karnataka">Karnataka</option>
													<option value="Kerala">Kerala</option>
													<option value="Lakshadweep">Lakshadweep</option>
													<option value="Madhya Pradesh">Madhya Pradesh</option>
													<option value="Maharashtra">Maharashtra</option>
													<option value="Manipur">Manipur</option>
													<option value="Meghalaya">Meghalaya</option>
													<option value="Mizoram">Mizoram</option>
													<option value="Nagaland">Nagaland</option>
													<option value="Orissa">Orissa</option>
													<option value="Pondicherry">Pondicherry</option>
													<option value="Punjab">Punjab</option>
													<option value="Rajasthan">Rajasthan</option>
													<option value="Sikkim">Sikkim</option>
													<option value="Tamil Nadu">Tamil Nadu</option>
													<option value="Tripura">Tripura</option>
													<option value="Uttaranchal">Uttaranchal</option>
													<option value="Uttar Pradesh">Uttar Pradesh</option>
													<option value="West Bengal">West Bengal</option>
												</select>
											</div>

											<div class="form-group has-feedback">
												<label>Email</label> <input type="email"
													name="stateAdminEmail" class="form-control"
													placeholder="Email"> <span
													class="glyphicon glyphicon-envelope form-control-feedback"></span>
											</div>

											<div class="col-md-9"></div>

											<div class="col-md-3">

												<button type="submit" class="btn btn-block btn-success">Add</button>
											</div>


										</div>


										<div class="col-md-12">
											<div class="box-body">
												<table class="table table-bordered">
													<tr>
														<th style="width: 10px">#</th>
														<th>Party Name</th>
														<th>Party symbol</th>

													</tr>
													<tr>
														<td>1.</td>
														<td>Bhartiya Janta Party</td>
														<td><img alt="" height="40px" width="50px"
															src="bjp.png"></td>
														<td>

															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" class="btn btn-block btn-info">Update!</button>

															</div>

															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" class="btn btn-block btn-danger">Delete!</button>

															</div>
														</td>

													</tr>
													<tr>
														<td>2.</td>
														<td>Party2</td>
														<td>Party symbol 2</td>
														<td>

															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" class="btn btn-block btn-info">Update!</button>
															</div>




															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" class="btn btn-block btn-danger">Delete!</button>

															</div>
														</td>
													</tr>
												</table>
											</div>
										</div>
								</div>



								<!-- /.tab-pane -->
								<div class="tab-pane" id="tab_3">
									<form action="AddPartyController">
										<div class="col-md-12">
											<h2>Party</h2>
										</div>

										<br> <br>

										<div class="col-md-3"></div>

										<div class="col-md-6">
											<div class="form-group">
												<label>Party Name</label> <input type="text"
													name="partyName" class="form-control" placeholder="Name">
											</div>

											<div class="form-group has-feedback">
												<label>Party Email</label> <input type="email"
													name="partyEmail" class="form-control" placeholder="Email">
												<span
													class="glyphicon glyphicon-envelope form-control-feedback"></span>
											</div>

											<div class="form-group">
											
												<label for="inputFile">Upload Party Symbol</label> <input
													type="file" id="inputFile" name="partyEmail">

												<p class="help-block">Upload Party Logo Here</p>
												<button type="submit" class="btn btn-block btn-success">Upload</button>
								
											</div>

											<div class="col-md-9"></div>
											<div class="col-md-3">

												<button type="submit" class="btn btn-block btn-success">Add</button>
											</div>

										</div>
										<div class="col-md-12">
											<div class="box-body">
												<table class="table table-bordered">
													<tr>
														<th style="width: 10px">#</th>
														<th>Party Name</th>
														<th>Party symbol</th>

													</tr>
													<tr>
														<td>1.</td>
														<td>Bhartiya Janta Party</td>
														<td><img alt="" height="40px" width="50px"
															src="bjp.png"></td>
														<td>

															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" value="Update" class="btn btn-block btn-info">Update!</button>

															</div>

															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" value="Update" class="btn btn-block btn-danger">Delete!</button>

															</div>
														</td>

													</tr>
													<tr>
														<td>2.</td>
														<td>Congress</td>
														<td><img alt="" height="40px" width="50px"
															src="congress.jpg"></td>
														<td>

															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" class="btn btn-block btn-info">Update!</button>
															</div>




															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" class="btn btn-block btn-danger">Delete!</button>

															</div>
														</td>
													</tr>
												</table>
											</div>
										</div>
								</div>

								<div class="tab-pane" id="tab_4">
									<form action="VerifyPartyController">
										<div class="col-md-12">
											<h2>Party Details</h2>
										</div>

										<br> <br>

										<div class="col-md-12">
											<div class="box-body">
												<table class="table table-bordered">
													<tr>
														<th style="width: 10px">#</th>
														<th>Party Name</th>


													</tr>
													<tr>
														<td>1.</td>
														<td>Party1</td>
														<td>

															<div class="col-xs-4"></div>
															<div class="col-xs-4">
																<button type="button" class="btn btn-block btn-info">View</button>

															</div>
														</td>
													</tr>
													<td>2.</td>
													<td>Party2</td>
													<td>
														<div class="col-xs-4"></div>
														<div class="col-xs-4">
															<button type="button" class="btn btn-block btn-info">View</button>
														</div>
													</td>
												</table>
											</div>
										</div>
								</div>
								<!-- /.tab-pane -->
							</div>
							<!-- /.tab-content -->
						</div>
						<!-- nav-tabs-custom -->
					</div>
				</div>
				<!-- /.box-body --> <!-- /.box --> </section>
				<!-- /.content -->
			</div>
			<!-- /.container -->
		</div>
		<!-- /.content-wrapper -->
		<footer class="main-footer">
		<div class="container">
			<div class="pull-right hidden-xs">
				<b>Version</b> 2.3.8
			</div>
			<strong>Copyright &copy; 2017 </strong> All rights reserved.
		</div>
		<!-- /.container --> </footer>
	</div>
	<!-- ./wrapper -->

	<!-- jQuery 2.2.3 -->
	<script src="jsp/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<!-- Bootstrap 3.3.6 -->
	<script src="jsp/bootstrap/js/bootstrap.min.js"></script>
	<!-- SlimScroll -->
	<script src="jsp/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<!-- FastClick -->
	<script src="jsp/plugins/fastclick/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="jsp/dist/js/app.min.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="jsp/dist/js/demo.js"></script>
</body>
</html>
