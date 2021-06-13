<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="chaker">
  <title>Admin ESSAT</title>

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

<body onload="">
  <section id="container">
    <!--header start-->
    <header class="header black-bg">
      <%@ include file="entete.jsp" %>
    </header>
    <!--header end-->    
	
	<!--sidebar start-->
    <aside>
      <%@ include file="menu.jsp" %>
    </aside>
    <!--sidebar end-->	
    
	<!--main content start-->    
	<section id="main-content">
      <section class="wrapper">
        <!-- page start-->
		<br>
        <div class="row mt">
          <div class="col-lg-12">
            <div class="form-panel">
              <h4 class="mb"><i class="fa fa-angle-right"></i> Ajouter un modèle</h4>
              <c:if test="${sessionScope.erreur !=null }">
      		     	 <div class="alert alert-danger">
      		      	<p>${sessionScope.erreur} </p>
      		      	<c:remove var="erreur" scope="session"></c:remove>
      		      	</div>
      		      </c:if>
              <form class="form-horizontal style-form" method="get" action="AddModele">
                <div class="form-group">
                
                  <label class="col-sm-2 col-sm-2 control-label">Titre</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control">
                  </div>
                </div>
				<div class="form-group">
                  <label class="col-sm-2 col-sm-2 control-label">Climatisation</label>
                  <div class="col-sm-10">
                   <label class="checkbox-inline">
						<input type="checkbox"  value="option1"> Oui
				   </label>
				   <label class="checkbox-inline">
						<input type="checkbox"  value="option1"> Non
				   </label>
                  </div>
                </div>
				<div class="form-group">
                  <label class="col-sm-2 col-sm-2 control-label">Nbre de places</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control">
                  </div>
                </div>
				<div class="form-group">
                  <label class="col-sm-2 col-sm-2 control-label">Coffre</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control">
                  </div>
                </div>
				<div class="form-group">
                  <label class="col-sm-2 col-sm-2 control-label">Boite</label>
                  <div class="col-sm-10">
                    <label class="checkbox-inline">
						<input type="checkbox"  value="option1"> Automatique
				   </label>
				   <label class="checkbox-inline">
						<input type="checkbox"  value="option1"> Manuelle
				   </label>
                  </div>
                </div>
				<div class="form-group">
                  <label class="col-sm-2 col-sm-2 control-label">Prix</label>
                  <div class="col-sm-10">
                    <input type="text" class="form-control">
                  </div>
                </div>
				
               <button type="submit" class="btn btn-theme">Ajouter </button>
			   
			  </form>
            </div>
          </div>
          <!-- col-lg-12-->
        </div>
		
      </section>
      <!-- /wrapper -->
    </section>
    <!-- /MAIN CONTENT -->
    <!--main content end-->
	
	
	
    <!--footer start-->
    <%@ include file="footer.jsp" %>
    <!--footer end-->
	
	
  </section>
  <!-- js placed at the end of the document so the pages load faster -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
  <script src="lib/jquery.scrollTo.min.js"></script>
  <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
  <!--common script for all pages-->
  <script src="lib/common-scripts.js"></script>
  <!--script for this page-->

</body>

</html>