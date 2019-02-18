<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="ressources/css/ajout.css" >
<title>Insert title here</title>
</head>
<body>

<c:import url="menu.jsp"></c:import>





<h1>MODIFIE UNE PIZZA DE VOTRE CHOIX</h1>
<div> <img id ="images" alt="users" src="https://img.freepik.com/vecteurs-libre/pizza-modele-conception-logo_1051-1483.jpg?size=338&ext=jpg"></div>




<form  method="post" class="color">
    <fieldset>
        <legend>Votre Pizza</legend>
        
        
        <label></label>
   
       
        <input type="text" name="id" class="dim_block2" id="colorBlock" value = "${pizza.id }" hidden>
        <br>
        <br>
		<label>Le numero :</label>
        <br>
        <br>
        <input type="text" name="numero" class="dim_block2" id="colorBlock" value = "${pizza.numero }">
        <br>
        <label>La photo :</label>
        <br>
        <br>
        <input type="text" name="photo" class="dim_block2" id="colorBlock" value = "${pizza.photo }">
        <br>
        <br>
        <label>Le nom de votre pizza :</label>
        <br>
        <input type="text" name="libelle"  class="dim_block2" id="colorBlock" value = "${pizza.libelle }">
        <br>
       
     <br>
        <label>La reference</label>
        <br>
        <input type="text" name="reference" class="dim_block2" id="colorBlock" value = "${pizza.reference }">
        <br>
        
        <br>
        <label>La description:</label>
        <br>
        <input type="text" name="description"  class="dim_block2" id="colorBlock" value = "${pizza.description }">
        <br>
        <br>
        <label>Le prix :</label>
        <br>
        <input type="text" name="prix"  class="dim_block2" id="colorBlock" value = "${pizza.prix }">
        <br>
        <br>
        
        
        

       
       <input type="submit"  value="Envoyer"  id="colorBlock">

  
       
    </fieldset>
    <br>
    
  
  
</form>
<a href="Pizza">
    Retour
</a>
</body>




























</body>
</html>