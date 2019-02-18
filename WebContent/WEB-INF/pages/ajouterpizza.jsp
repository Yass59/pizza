<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel = "stylesheet" href="ressources/css/ajout.css" >
<title>AJOUT PIZZA</title>
</head>
<body>


<c:import url="menu.jsp"></c:import>

<h1>AJOUT D'UNE PIZZA DE VOTRE CHOIX</h1>
<div> <img id ="images" alt="users" src="https://img.freepik.com/vecteurs-libre/pizza-modele-conception-logo_1051-1483.jpg?size=338&ext=jpg"></div>




<form  method="post" class="color">
    <fieldset>
        <legend>Votre Pizza</legend>
        
        <br>
        <br>
		<label>Le numero :</label>
        <br>
        <br>
        <input type="text" name="numero" class="dim_block2" id="colorBlock">
        <br>
        <label>La photo :</label>
        <br>
        <br>
        <input type="text" name="photo" class="dim_block2" id="colorBlock">
        <br>
        <br>
        <label>Le nom de votre pizza :</label>
        <br>
        <input type="text" name="libelle"  class="dim_block2" id="colorBlock">
        <br>
       
     <br>
        <label>La reference</label>
        <br>
        <input type="text" name="reference" class="dim_block2" id="colorBlock">
        <br>
        
        <br>
        <label>La description:</label>
        <br>
        <input type="text" name="description"  class="dim_block2" id="colorBlock">
        <br>
        <br>
        <label>Le prix :</label>
        <br>
        <input type="text" name="prix"  class="dim_block2" id="colorBlock">
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