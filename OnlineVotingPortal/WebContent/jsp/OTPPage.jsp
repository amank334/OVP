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
  <link rel="stylesheet" href="/OnlineVotingPortal/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/OnlineVotingPortal/jsp/assets/css/AdminLTE.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="/OnlineVotingPortal/plugins/iCheck/square/blue.css">

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
    <p class="login-box-msg"><b>Enter 6 digit OTP send to your Registered Mobile Number</b></p>

    <form action="#" method="post">
      <div class="form-group has-feedback">
        <input type="text" class="form-control" placeholder="OTP">
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">
         </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit"  class="btn btn-block btn-primary">Submit</button>
        </div>
        
        <!-- /.col -->
      </div>
    </form>
    
  </div>
  <!-- /.form-box -->
</div>
<!-- /.register-box -->

<!-- jQuery 2.2.3 -->
<script src="/OnlineVotingPortal/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="/OnlineVotingPortal/bootstrap/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="/OnlineVotingPortal/plugins/iCheck/icheck.min.js"></script>
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
