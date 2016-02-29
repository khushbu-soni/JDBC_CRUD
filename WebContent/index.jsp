<!DOCTYPE HTML>
<html>
<head>
<title>Simple Login Form</title>
<meta charset="UTF-8" />
<meta name="Designer" content="PremiumPixels.com">
<meta name="Author" content="$hekh@r d-Ziner, CSSJUNTION.com">
<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/structure.css">
</head>

<body>
<form class="box login">
	<fieldset class="boxBody">
	  <label>Username</label>
	  <input type="text" tabindex="1" placeholder="PremiumPixel" required>
	  <label><a href="#" class="rLink" id="name" tabindex="5">Forget your password?</a>Password</label>
	  <input type="password" id="password" tabindex="2" required>
	</fieldset>
	<footer>
	  <label><input type="checkbox" tabindex="3">Keep me logged in</label>
	  <input type="button" onclick='login()' class="btnLogin" value="Login" tabindex="4">
	</footer>
</form>
<footer id="main">
  <a href="http://wwww.cssjunction.com">Basic JDBC CRUD</a> | <a href="#">TEST</a>
</footer>
</body>
<script type='text/javascript' src='js/jquery-1.12.1.min.js'></script>

<script>
$('document').ready(function(){
	

});

function login(){
	var uname=$('#username').val();
	var pass=$('#password').val();
	$.ajax({
		Type:'POST',
		url:'LoginServlet',
		Data:{username:uname,password:pass},
		success:function(){
			alert(res);	
		},
	});	
		
}

</script>

</html>
