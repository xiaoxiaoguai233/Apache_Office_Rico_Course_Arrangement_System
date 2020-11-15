<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <title>Synadmin - Bootstrap4 Admin Template</title>
    <!--favicon-->
    <link rel="icon" href="../assets/images/favicon-32x32.png" type="image/png"/>
	<!-- loader-->
    <link href="../assets/css/pace.min.css" rel="stylesheet"/>
    <script src="../assets/js/pace.min.js"></script>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css" />
    <!-- Icons CSS -->
    <link rel="stylesheet" href="../assets/css/icons.css" />
    <!-- App CSS -->
    <link rel="stylesheet" href="../assets/css/app.css" />
	<link rel="stylesheet" href="../assets/css/dark-style.css" />
  </head>

  <body>
    <!-- wrapper -->
    <div class="wrapper">
	 <div class="section-authentication">
	   <div class="container-fluid">
	    <div class="card mb-0" style="border-radius: 20px;">
	     <div class="card-body p-0">
		  <div class="row no-gutters">
			<div class="col-12 col-lg-6 col-xl-8 d-flex align-items-stretch">
				<div class="card mb-0 shadow-none bg-transparent login-card w-100 rounded-0">
					<div class="card-body p-md-5">
					  <div class="text-center"><img src="../assets/images/login-images/picture1.png" class="img-fluid" alt=""/></div>
					</div>
				</div>
			</div>
			<div class="col-12 col-lg-6 col-xl-4 d-flex align-items-stretch">
			  <div class="card mb-0 shadow-none bg-transparent w-100 rounded-0">
				  <!--  action="{pageContext.request.contextPath}/user/login" method="POST"  -->
			     <form class="card-body p-md-5" style="margin-top: 60px">
				  <img src="../assets/images/Apache.png" height="80px" width="200px"  alt=""/>
					 <h4 class="mt-5"><strong>欢迎登陆</strong></h4>
					 <div class="form-group mt-4">
					   <label>登录账号</label>
					   <input type="text" class="form-control" name="username"  id="username"  placeholder="请输入你的登陆账号"/>
					 </div>
					 <div class="form-group">
					   <label>登录密码</label>
					   <input type="password" class="form-control" name="password" id="password"  placeholder="请输入你的登录密码"/>
					 </div>
					 <div class="form-row">
					   <div class="form-group col">
					   </div>
					 </div>
					 <input type="button" onclick="login()" class="btn btn-primary btn-block mt-3" value="登录" />
					 <div class="text-center mt-4">
						<br> <br> <br>
						<p class="card-text" style="font-size: 15px;font-weight: 400;">欢迎使用睿科选课排课系统</p>
						<p class="card-text" style="font-size: 15px;font-weight: 400;">湖北师范大学-黄石创意网络科技有限公司</p>
						<p class="card-text" style="font-size: 15px;font-weight: 400;">Apache工作室</p>
					 </div>
				 </form>
			  </div>
			</div>
			
		    </div>
		    </div>
		   </div>
		 </div>
	  </div>
      
    </div>
    <!-- end wrapper -->
	
	
	<!--start switcher-->
    <div class="switcher-wrapper">
	       <div class="switcher-btn">
		       <i class='bx bx-cog bx-spin'></i>
		   </div>
		   <div class="switcher-body">
		      <h5 class="mb-0 text-uppercase">Theme Customizer</h5>
			  <hr/>
			  <h6 class="mb-0">Theme Styles</h6>
			  <hr/>
			  <div class="custom-control custom-radio">
				  <input type="radio" id="darkmode" name="customRadio" class="custom-control-input">
				  <label class="custom-control-label" for="darkmode">Dark Mode</label>
			  </div>
			  <hr/>
			  <div class="custom-control custom-radio">
			    <input type="radio" id="lightmode" name="customRadio" checked class="custom-control-input">
			    <label class="custom-control-label" for="lightmode">Light Mode</label>
			  </div>
		   </div>
	   </div>
    <!--end switcher-->

	 <!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="../assets/js/jquery.min.js"></script>

	<script>
        //  action="$pageContext.request.contextPath}/user/login" method="POST"
		function login() {
			var data = {
				username: document.getElementById("username").value,
				password: document.getElementById("password").value
			}
			//console.log(data);

			$.ajax({
				url: "/user/login",
				type:"POST",
				data: data,
				datatype: 'json',
				success: function(res) {
					console.log(res.map.code)
                    if ( res != null ){
                    	if (res.map.code == "200"){
							location.href = "/admin/index";
						}
                    }
				}
			})
		}

	
		$(".switcher-btn").on("click", function () {
			$(".switcher-wrapper").toggleClass("switcher-toggled");
		});

		$("#darkmode").on("click", function () {
			$("html").addClass("dark-theme");
		});

		$("#lightmode").on("click", function () {
			$("html").removeClass("dark-theme");
		});
	</script>
	 
	 
  </body>
</html>
