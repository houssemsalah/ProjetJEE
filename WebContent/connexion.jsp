<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="Dashboard">
  <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
  <title>ESSAT ADMIN</title>

  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Bootstrap core CSS -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!--external css-->
  <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet">
  <link href="css/style-responsive.css" rel="stylesheet">

</head>

<body>
  

  <div id="login-page">
    <div class="container">
      <form class="form-login" action="Verif" method="Post">
        <h2 class="form-login-heading">ESSAT ADMIN</h2>
        <div class="login-wrap">
          <input type="email" class="form-control" id="Email" name="Email" placeholder="Email" autofocus>
          <br>
          <input type="password" class="form-control" id="password" name="password" placeholder="Password">
          <label class="checkbox">
          
          <button class="btn btn-theme btn-block" type="submit" id="_submit" name="_submit">
		        <i class="fa fa-lock"></i> Se Connnecter
		   </button>
         
         
        </div>
       
      </form>
      <c:if test="${sessionScope.message !=null }">
      		     	 <div class="alert alert-${sessionScope.type }">
      		      	<p>${sessionScope.message} </p>
      		      	<c:remove var="message" scope="session"></c:remove>
      		      	</div>
      		      </c:if>
    </div>
  </div>


  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  

</body>

</html>>