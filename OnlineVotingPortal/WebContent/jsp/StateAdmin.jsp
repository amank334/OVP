<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>OnlineVotingPortal | Voter Profile</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">

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

  <header class="main-header">
    <nav class="navbar navbar-static-top">
      <div class="container">
        <div class="navbar-header">
          <a href="../../index2.html" class="navbar-brand"><b>Online Voting Portal</b></a>
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse">
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
              <!-- Menu Toggle Button -->
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                <!-- The user image in the navbar-->
                <img src="../../dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                <!-- hidden-xs hides the username on small devices so only the image appears. -->
                <span class="hidden-xs">Alexander Pierce</span>
              </a>
              <ul class="dropdown-menu">
                <!-- The user image in the menu -->
                <li class="user-header">
                  <img src="../../dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
					<p>
                    Alexander Pierce - Web Developer
                    <small>Member since Nov. 2012</small>
                  </p>
                </li>
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
      <!-- /.container-fluid -->
    </nav>
  </header>
  <!-- Full Width Column -->
  <div class="content-wrapper">
    <div class="container">
      <!-- Content Header (Page header) -->
      <section class="content-header">
        <h1>
          State Admin
        </h1>
      </section>
      <!-- Main content -->
      <section class="content">
        <div class="box box-default">
          <div class="box-header with-border">
            <h1 class="box-title"><b>Welcome Election Controller of state!</b></h1>
          </div>
          <div class="box-body">
           <div class="row">
        <div class="col-md-12">
          <!-- Custom Tabs -->
          <div class="nav-tabs-custom">
            <ul class="nav nav-tabs">
              <li class="active"><a href="#tab_1" data-toggle="tab"><b>Add constituency</b></a></li>
              <li><a href="#tab_2" data-toggle="tab"><b>Add Candidates</b></a></li>
              <li><a href="#tab_3" data-toggle="tab"><b>Display Result</b></a></li>
              <li><a href="#tab_4" data-toggle="tab"><b>Manage Tempered List</b></a></li>
              </ul>
              </div>
             </div>
			<div class="tab-content">
			<div class="tab-pane active" id="tab_1">
			<div class="col-md-12">
			<h2>Constituency</h2>
			</div>
			<br><br>
			<div class="col-md-3">
             </div>
			<div class="col-md-6">
             <div class="form-group">
                <label>
                      <input type="radio" name="electiontype" id="election1"checked>
                      <b>Lok Sabha</b></label>  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
 					<label>
                      <input type="radio" name="electiontype" id="election2">
                      <b>Vidhan Sabha</b></label>
                      </div>
              <div class="form-group">
				<br><br><label>Constituency Name</label>
                  <input type="text" class="form-control" name="constname" placeholder="Name">
                  </div>
                  <div class="form-group">
                  <label>Constituency State</label>
                   <select class="form-control select2" style="width: 100%;">
                  <option id="1">Bihar</option>
                  <option id="2">Madhya Pradesh</option>
                  <option id="3">Uttar Pradesh</option>
                  </select>
                </div>
				<div class="col-md-9">
                  </div>
				<div class="col-xs-3">
                    <button type="button" class="btn btn-block btn-success">Add</button>
                 </div>

                  </div>

                  <div class="col-md-12">
               <div class="box-body">
              <table class="table table-bordered">
                <tr>
                  <th style="width: 10px">#</th>
                  <th>Constituency Name</th>
                  <th>Constituency state </th>
                  
                </tr>
                <tr>
                  <td>1.</td>
                  <td>Narela</td>
                   <td>Madhaya Pradesh</td>
                  <td>
                 
                  <div class="col-xs-4" >
                    </div>
                  <div class="col-xs-4" >
                    <button type="button" class="btn btn-block btn-info">Update!</button>
                  
                   </div>
                 
                    <div class="col-xs-4" >
                    </div>
                  <div class="col-xs-4" >
                    <button type="button" class="btn btn-block btn-danger">Delete!</button>
                  
                   </div>
                    </td>
                   
                                 </tr>
                                 <tr>
                  <td>2.</td>
                  <td>Dhoraiya</td>
                  <td>Bihar</td>
                  <td>
                    
                    <div class="col-xs-4" >
                    </div>
                  <div class="col-xs-4" >
                    <button type="button" class="btn btn-block btn-info">Update!</button>
                    </div>
                    
                    
                    
                 
                 <div class="col-xs-4" >
                    </div>
                  <div class="col-xs-4" >
                    <button type="button" class="btn btn-block btn-danger">Delete!</button>
                  
                   </div>
                    </td>
                    </tr>
                              </table>
            </div> 
</div>

                 </div>
              


              <!-- /.tab-pane -->
              <div class="tab-pane" id="tab_2">
              <div class="col-md-12">
            
              <h2>Candidates</h2>

             </div>
<br><br>
<div class="col-md-3">
             </div>
             
             <div class="col-md-6">
                <label>
                      <input type="radio" name="electiontype" id="election1"  checked>
                      <b>Lok Sabha</b></label>  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
 <!-- Date --> <label>
                      <input type="radio" name="electiontype" id="election2" value="option2">
                      <b>Vidhan Sabha</b></label>
 </div>


              
                   <div class="col-md-12">
               <div class="box-body">
               <br><br><br>
              <table class="table table-bordered">
                <tr>
                  <th style="width: 10px">#</th>
                  <th>Party Name</th>
                  <th>Party symbol </th>
                  
                </tr>
                <tr>
                  <td>1.</td>
                  <td>Party1</td>
                   <td>Party symbol 1</td>
                  <td>
                 
                  <div class="col-xs-4" >
                    </div>
                  <div class="col-xs-4" >
                    <button type="button" class="btn btn-block btn-info">Inspect!</button>
                  
                   </div>
                 
                    
                    </td>
                   
                                 </tr>
                                 <tr>
                  <td>2.</td>
                  <td>Party2</td>
                  <td>Party symbol 2</td>
                  <td>
                    
                    <div class="col-xs-4" >
                    </div>
                  <div class="col-xs-4" >
                    <button type="button" class="btn btn-block btn-info">Inspect!</button>
                    </div>
                    
                    
                    
                 
                 
                    </td>
                    </tr>
                              </table>
            </div> 
</div>

</div>



              <!-- /.tab-pane -->
              <div class="tab-pane" id="tab_3">
              <div class="col-md-12">
            
              
               <h2>Result</h2>
               </div>
                
<br><br>
<div class="col-md-3">
             </div>
             
             <div class="col-md-6">
<div class="form-group">
              
                  <label>Election Id</label>
                   <select class="form-control select2" style="width: 100%;">
                  <option>Option1</option>
                  <option>Option2</option>
                  <option>Option3</option>
                  
                </select>
                </div>
                
               <div class="col-md-6">
                  </div>

                   <div class="col-xs-3">
                    <button type="button" class="btn btn-block btn-info">View</button>
                 </div>
                 <div class="col-xs-3">
                    <button type="button" class="btn btn-block btn-success">Generate</button>
                 </div>
</div>
                </div>

               <div class="tab-pane" id="tab_4">
               <div class="col-md-12">
            
              
               <h2>Tempered List</h2>
               </div>
                
<br><br>



<div class="col-md-3">
             </div>
             
             <div class="col-md-6">
<div class="form-group">
              
                  <label>Election Id</label>
                   <select class="form-control select2" style="width: 100%;">
                  <option>Option1</option>
                  <option>Option2</option>
                  <option>Option3</option>
                  
                </select>
                </div>
<br><br>
                <label>
                      <input type="radio" name="vinauth" id="error1" value="option1" checked>
                      <b>Incorrect VIN</b></label>  <br>
 <!-- Date --> <label>
                      <input type="radio" name="vinauth" id="error2" value="option3">
                      <b>Reverse VIN</b></label><br>
              

                     </div> 

                  <div class="col-md-12">
                  <br><br>
               <div class="box-body">
              <table class="table table-bordered">
                <tr>
                  <th style="width: 10px">#</th>
                  <th>Voter Name</th>
                  <th>Voter Mobile</th>
                  <th>VIN Time</th>
                  <th>Voter Constituency</th>
                </tr>
                <tr>
                  <td>1.</td>
                  <td>Bittu Sharma</td>
                   <td>8359467895</td>
                    <td>dd-mm-yyyy</td>
                     <td>Narela</td>
                  <td>
                 
<div class="col-xs-4" >
                    </div>
                  <div class="col-xs-4" >
                    <button type="button" class="btn btn-block btn-info">Update!</button>
                  
                   </div>
                 
                    <div class="col-xs-4" >
                    </div>
                  <div class="col-xs-4" >
                    <button type="button" class="btn btn-block btn-danger">Delete!</button>
                  
                   </div>
                    </td>
                   
                                 </tr>
                  
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
          <!-- /.box-body -->
        
        <!-- /.box -->
      </section>
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
      <strong>Copyright &copy; 2017.</strong> All rights
      reserved.
    </div>
    <!-- /.container -->
  </footer>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.2.3 -->
<script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- SlimScroll -->
<script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="dist/js/demo.js"></script>
</body>
</html>
