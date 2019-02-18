<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" href="ressources/css/users.css" >
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="menu.jsp"></c:import>



	<h1>Pizz'Yass</h1>
	
	
	
	
	
	
	
	
	<div id="conteneur">




<c:forEach items = "${pizza }" var = "pizza">



    <div class="block_produit">

       

 <a href="PizzainfoServlet?id=${pizza.id }">

                    <img src="${pizza.photo }">

                    </a>
                    



 <div class="description"> Numero :<label>${ pizza.numero}</label></div>
  <div class="description"> Libelle: <label>${pizza.libelle }</label></div>
       

        <div class="description">  Reference :${pizza.reference}</div>
 <div class="description">  Prix :${pizza.prix} $</div>

   <div > Description :${pizza.description}</div>
   
   
    </div>

</c:forEach>
</div>
<div>



</div>





















</body>
</html>