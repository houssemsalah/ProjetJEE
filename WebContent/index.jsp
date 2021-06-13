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
        <div class="col-sm-12">
            <section class="panel">
              <header class="panel-heading wht-bg">
                <h3 class="gen-case">  Liste des Modéle </h3>
				<a class="btn btn-theme03" href="listeModele" >Ajouter un modèle</a>
              </header>
              <div class="panel-body minimal">                
				
				<div class="table-inbox-wrap ">
                  <table class="table table-inbox table-hover">
					<thead><tr><th></th><th>Titre</th><th>Climatisation</th><th>Nbre de places</th>
					           <th>Coffre</th><th>Boite</th><th>Prix</th><th></th><th></th></tr> </thead>
                    <tbody>
                    <c:forEach items="${mode}" var="lv">
                      <tr >
                        <td class="">
                         <img src="img/${lv.id}" width="95%" />
                        </td>                        
                        <td class="view-message  ">${lv.titre}</td>
                        <td class="view-message ">${lv.climatisation}</td>
                         <td class="view-message ">${lv.nbre_places}</td> 
                        <td class="view-message  ">${lv.coffre}</td>
						<td class="view-message  ">${lv.boite}</td>
						<td class="view-message  ">${lv.prix}</td>
						<td> <a class="btn btn-theme02 btn-sm" href="listeVoiture" >Liste des voitures associées</a></td>
						<td>
						<a href="ModifierModele" class="btn btn-danger btn-sm"><i class="fa fa-trash-o "></i></a> 
                          <a href="DeleteModele?id=${lv.id}" class="btn btn-primary btn-sm"><i class="fa fa-pencil"></i></a>
                            
						</td>
                      </tr>
                       
					  </c:forEach>
					    
				  </tbody>
                  </table>
                </div>
              </div>
            </section>
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