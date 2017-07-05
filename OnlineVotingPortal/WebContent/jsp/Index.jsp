<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
<title>Online Voting Portal</title>

<!-- BOOTSTRAP CORE STYLE  -->
<link href="jsp/assets/css/bootstrap.css" rel="stylesheet" />
<!-- FONT AWESOME STYLE  -->
<link href="jsp/assets/css/font-awesome.css" rel="stylesheet" />
<!-- ANIMATE STYLE  -->
<link href="jsp/assets/css/animate.css" rel="stylesheet" />
<!-- FLEXSLIDER STYLE  -->
<link href="jsp/assets/css/flexslider.css" rel="stylesheet" />
<!-- CUSTOM STYLE  -->
<link href="jsp/assets/css/style.css" rel="stylesheet" />
<!-- GOOGLE FONTS  -->
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />

</head>
<body>

	<div class="navbar navbar-inverse set-radius-zero" style="background-color: #3c8dbc"; >
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">

                    <img src="jsp/assets/img/logo.png" />
                </a>

            </div>
            
          
        </div>
    </div>
    <!-- LOGO HEADER END-->
    <section class="menu-section">
        <div class="container">
            <div class="row ">
                <div class="col-md-12">
                    <div class="navbar-collapse collapse ">
                        <ul id="menu-top" class="nav navbar-nav navbar-right">
                            <li><a href="#" class="menu-top-active" >HOME</a></li>
                            <li><a href="#">ABOUT US</a></li>
                             <li><a href="#" >FAQs</a></li>
                            <li><a href="#contact">CONTACT</a></li>
                            <li><a href="jsp/PartyLogin.jsp">PARTY LOGIN</a></li>
                        </ul>
                    </div>
                </div>

            </div>
        </div>
    </section>
     <!-- MENU SECTION END-->
    <div id="slideshow-sec">
        <div id="carousel-div" class="carousel slide" data-ride="carousel" >
                   
                    <div class="carousel-inner">
                        <div class="item active">

                            <img src="jsp/assets/img/0.jpg" alt="" />
                            <div class="carousel-caption">
                          <h2>No Line Go Online !!!!</h2>
                                    <p ><b>"
		The difference between a democracy and a dictatorship is that in a
		democracy you vote first and take orders later; in a dictatorship you
		don't have to waste your time voting." » Charles Bukowski
		</b>
		</p>
		<a class="btn btn-primary btn-lg" href="jsp/VoterRegistration1.jsp">Register</a>
		&emsp;&emsp;&emsp; <a class="btn btn-primary btn-lg"
			href="jsp/VoterLogin.jsp">Login</a>
	</div>

	</div>
	<div class="item">
		<img src="jsp/assets/img/1.jpg" alt="" />
		<div class="carousel-caption">
			<h2>Your Vote , Your Choice !!!!</h2>
			<p style="color: #0c0c0c;">
				<b>"Bad officials are elected by good citizens who do not vote."
					» George Jean Nathan</b>
			</p>
			<a class="btn btn-primary btn-lg" href="jsp/VoterRegistrarion1.jsp">Register</a>
			&emsp;&emsp;&emsp; <a class="btn btn-primary btn-lg"
				href="jsp/VoterLogin.jsp">Login</a>
		</div>
	</div>
	<div class="item">
		<img src="jsp/assets/img/2.jpg" alt="" />
		<div class="carousel-caption">
			<h2>Vote ! Its Your Right !!!!</h2>
			<p>
				<b>"Voting is the most precious right of every citizen, and we
					have a moral obligation to ensure the integrity of our voting
					process." » Hillary Clinton</b>
			</p>
			<a class="btn btn-primary btn-lg" href="jsp/VoterRegistrarion1.jsp">Register</a>
			&emsp;&emsp;&emsp; <a class="btn btn-primary btn-lg"
				href="jsp/VoterLogin.jsp">Login</a>
		</div>
	</div>
	<div class="item">
		<img src="jsp/assets/img/3.jpg" alt="" />
		<div class="carousel-caption">
			<h2>Shape Tommorow By Voting Today !!!!</h2>
			<p style="color: grey">
				<b>"An election is a moral horror, as bad as a battle except for
					the blood; a mud bath for every soul concerned in it." » George
					Bernard Shaw</b>
			</p>
			<a class="btn btn-primary btn-lg" href="jsp/VoterRegistrarion1.jsp">Register</a>
			&emsp;&emsp;&emsp; <a class="btn btn-primary btn-lg"
				href="jsp/VoterLogin.jsp">Login</a>
		</div>

	</div>
	</div>
	<!--INDICATORS-->
	<ol class="carousel-indicators">
		<li data-target="#carousel-div" data-slide-to="0" class="active"></li>
		<li data-target="#carousel-div" data-slide-to="1"></li>
		<li data-target="#carousel-div" data-slide-to="2"></li>
		<li data-target="#carousel-div" data-slide-to="3"></li>
	</ol>
	<!--PREVIUS-NEXT BUTTONS-->
	<a class="left carousel-control" href="#carousel-div" data-slide="prev">
		<span class="glyphicon glyphicon-chevron-left"></span>
	</a>
	<a class="right carousel-control" href="#carousel-div"
		data-slide="next"> <span class="glyphicon glyphicon-chevron-right"></span>
	</a>
	</div>
	</div>

	<div class="container">

		<!-- TAG HOME SECTION END-->

		<div class="container">

			<div class="row pad-set">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="just-txt-div">
						<h2>What Is Online Voting Portal ???</h2>
						<br />
						<p>OVP is an online web application that provides an interface
							for citizens who are above 18 years of age to vote through
							online. A centralized database is maintained by election
							commission of India where citizens information is maintained
							whenever citizen is using online voting system.</p>

					</div>

				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="just-txt-div">
						<br />
						<iframe class="vedio-style"
							src="http://www.youtube.com/embed/b9e6-aBG3H0"></iframe>
					</div>
				</div>
			</div>
		</div>

		<!--VEDIO SECTION END-->

		<div class="below-slideshow">
			<div class="container">
				<div class="row">

					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="txt-block">


						<a name="contact" style="color: #ffffff">	<h1 class="head-line">Contact Us Now</h1></a>

						</div>
					</div>
				</div>

			</div>
		</div>
		<!-- BELOW SLIDESHOW SECTION END-->
		<div class="container">

			<!-- TAG HOME SECTION END-->
			<div name="contact" class="just-sec">


				<div class="container">

					<div class="row">
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
							<div class="just-txt-div">


								<h2>Contact Address :</h2>
								<p>
									110-A Indrapuri ,Bhopal India, <br /> Pin: 462021
								</p>
								<p>
									<strong> Call: </strong> +91 8359946369
								</p>
								<p>
									<strong> E-mail: </strong> onlinevotingportl@gmail.com
								</p>

							</div>
						</div>
						<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
							<div class="just-txt-div">



								<form name="queryform"  method="post" action="QueryController">
									<div class="form-group">
										<label>Enter Your Name</label> <input class="form-control"
											type="text" name="name"/>
									</div>
									<div class="form-group">
										<label>Enter Your Email</label> <input class="form-control"
											type="text" name="email"/>
									</div>
									<div class="form-group">
										<label>Enter Subject </label> <input class="form-control"
											type="text" name="subject"/>
									</div>
									<div class="form-group">
										<label>Enter query/Feedback</label>
										<textarea class="form-control" rows="5" name="message"></textarea>
									</div>

									<button type="submit" class="btn btn-success btn-lg">SEND
										QUERY</button>
								</form>
							</div>
						</div>

					</div>

				</div>
			</div>
			<!--SET-DIV SECTION END-->

			<div class="footer-sec">
				<div class="container">


					<div class="row">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">

							<div style="text-align: right; padding: 5px;">
								&copy;2017 |
								<p>
									<b>Designed By: </b>
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--FOOTER SECTION END-->
			<!-- WE PUT SCRIPTS AT THE END TO LOAD PAGE FASTER-->
			<!--CORE SCRIPTS PLUGIN-->
			<script src="jsp/assets/js/jquery-1.11.1.min.js"></script>
			<!--BOOTSTRAP SCRIPTS PLUGIN-->
			<script src="jsp/assets/js/bootstrap.js"></script>
			<!--WOW SCRIPTS PLUGIN-->
			<script src="jsp/assets/js/wow.js"></script>
			<!--FLEXSLIDER SCRIPTS PLUGIN-->
			<script src="jsp/assets/js/jquery.flexslider.js"></script>
			<!--CUSTOM SCRIPTS -->
			<script src="jsp/assets/js/custom.js"></script>
</body>

</html>