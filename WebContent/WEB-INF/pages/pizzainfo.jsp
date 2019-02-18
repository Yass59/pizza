<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="ressources/css/users-info.css" >
<title>Insert title here</title>
</head>
<body>

<c:import url="menu.jsp"></c:import>


<h1>INFO DE LA PIZZA</h1>




<div id="conteneur">		

		<div id="intitule">

				<p>${ pizza.libelle }</p>

			

		</div>

		<div id="photo">				

				<img src= ${ pizza.photo }>	

		</div>		

		<a href="Pizza">Retour</a>

				<p>Description : ${ pizza.description }</p>					
  <div>
  <div>
				<p>Prix : ${pizza.prix}</p>
  				

  

  
  </div>
  
  
  <div>
  
 <a href="Supprimer?id=${pizza.id }">supprimer</a>
 <a href="Modifie?id=${pizza.id }">MODIFIER</a>
  <a  id = a href = "AjouterPizza">AJOUTER PIZZA</a>
  	<a href="Pizza">Retour</a>
  </div>
  
		</div>				

	</div>				
























</body>
</html>