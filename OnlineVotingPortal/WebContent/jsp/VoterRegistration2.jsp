<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>OnlineVotingPortal | Registration Page</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="jsp/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="jsp/dist/css/AdminLTE.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="jsp/plugins/iCheck/square/blue.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

</head>
<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo">
    <a href="../../index2.html"><b>OnlineVotingPortal</b></a>
  </div>

  <div class="register-box-body">
    <p class="login-box-msg"><b>Register To Caste Vote !!!!</b></p>
    

    <form action="/OnlineVotingPortal/RegistrationServlet2" method="post">
      <div class="form-group has-feedback">
        <input type="text" class="form-control" name="voterVcardNo" value=" ${requestScope.voterVcardNo}" placeholder="VoterCard Number">
        
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="text" class="form-control" name="voterAdharNo" value= ${requestScope.voterAdharNo} placeholder="AadharCard Number">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="text" class="form-control" name="voterName" value= ${requestScope.voterName} placeholder="Name">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="text" class="form-control" name="voterMob" placeholder="Mobile Number">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="email" class="form-control" name="voterEmail" placeholder="Email">
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" name="voterPassword" placeholder="Password">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" name="confirm" placeholder="Confirm Password">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="text" class="form-control" name="voterAddress" placeholder="Full Address">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
       <div class="form-group has-feedback">
        <div class="box-body">
          <div class="row">
            <div class="col-md-12">
              <div class="form-group">
                <label>State</label>
                <select class="form-control select2" style="width: 100%;">
                <option selected="selected">MadhyaPradesh</option>
                <option>MadhyaPradesh</option>				
                  <option>UttarPradesh</option>	
                  <option>Bihar</option>	
                  <option>AndhraPradesh</option>	
                  <option>Maharashtra</option>	
                  <option>WestBengal</option>	
                  <option>Uttrakhand</option>	
                </select>
              </div>
               </div>
          </div>
        </div>
        <div class="form-group has-feedback">
        <div class="box-body">
          <div class="row">
            <div class="col-md-12">
              <div class="form-group">
                <label>Constituency</label>
                <select class="form-control select2" style="width: 100%;">
                 <option selected="selected">ValmikiNagar</option>
                <option>RamNagar</option>				
                  <option>Sheopur</option>	
                  <option>VijayPur</option>	
                  <option>AgraCantt.</option>	
                  <option>AgraNorth</option>	
                  </select>
              </div>
               </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-xs-8">
         </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" align = "center" class="btn btn-block btn-primary">Register</button>
        </div>
        
        <!-- /.col -->
      </div>
    </form>
    <br>
    <a href="voterlogin.html" class="text-center">Already Registered ! </a>
  </div>
  <!-- /.form-box -->
</div>
<!-- /.register-box -->

<!-- jQuery 2.2.3 -->
<script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="plugins/iCheck/icheck.min.js"></script>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
  });
</script>
</body>
</html>
