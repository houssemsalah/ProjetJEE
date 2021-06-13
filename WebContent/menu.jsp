<c:if test="${sessionScope.user == null}">
<c:set var="message" value="accees non autorisé" scope="session"></c:set>
<c:set var="type" value="info" scope="session"></c:set>

<c:redirect url="Principale"></c:redirect>

</c:if>
<div id="sidebar" class="nav-collapse ">
        <!-- sidebar menu start-->
        <ul class="sidebar-menu" id="nav-accordion">
          <p class="centered"><a href="Accueil"><img src="img/ui-sam.jpg" class="img-circle" width="80"></a></p>
          <h5 class="centered">${sessionScope.user.nom}</h5>
          <li class="sub-menu">
            <a href="ListeVoiture">
              <i class="fa fa-dashboard"></i>
              <span>Liste des Modèles </span>
              </a>
          </li>
		  
		  <li class="sub-menu">
            <a href="ListeVoiture">
              <i class="fa fa-tasks"></i>
              <span>Liste des Voitures </span>
              </a>
          </li>
		  
		  <li class="sub-menu">
            <a href="ListeClient">
              <i class="fa fa-book"></i>
              <span>Liste des Clients </span>
              </a>
          </li>
		  		  
		  <li class="sub-menu">
            <a href="ListeReservation">
              <i class="fa fa-cogs"></i>
              <span>Etats des locations </span>
              </a>
          </li>
		  
		  <li class="sub-menu">
            <a href="ListePromotion">
              <i class="fa fa-desktop"></i>
              <span>Les Promotions </span>
              </a>
          </li>  
         
		 
        </ul>
        <!-- sidebar menu end-->
      </div>