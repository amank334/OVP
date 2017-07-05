<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
  <title>OnlineVotingPoratl</title>
  
  
  <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>

      <link rel="stylesheet" href="form/css/style.css">

  
</head>

<body>
  <div class="login-form">
     <h1>ADMIN LOGIN</h1>
     <form action="/OnlineVotingPortal/AdminLoginController" method="post">
    <div class="form-group">
      <label class="control-label">Login as :</label> <p></p>
              <div>
                <label> <input class="radio" id="usertype" name="usertype"
                  type="radio" checked="checked" value="mainadmin"> <span>Main Admin</span>
                </label> <label> <input class="radio" id="usertype" name="usertype" 
                  type="radio" value="stateadmin"> <span>State Admin</span>
                </label>
              </div>
            </div>
            <div class="form-group ">
       <input type="email" class="form-control" name="username" placeholder="Username " id="UserName">
       <i class="fa fa-user"></i>
     </div>
     <div class="form-group log-status">
       <input type="password" class="form-control" name="password" placeholder="Password" id="Passwod">
       <i class="fa fa-lock"></i>
     </div>
      <span class="alert">Invalid Credentials</span>
      <a class="link" href="#">Lost your password?</a>
     <button type="submit" class="log-btn" >Log in</button>
    </form> 
    
   </div>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

    <script src="form/js/index.js"></script>

</body>
</html>
