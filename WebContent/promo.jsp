<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/bootstrap.css" />
<link rel="stylesheet" href="./css/main.css" />
<meta charset="UTF-8">
<title>Promo</title>
</head>
<body>
<div>
		<section class="container">
			<h1>Promotions</h1>
			<div>
				<form action="Servlet" method="POST" id="form-contact">

				

					<div class="form-group row">
						<label for="effectif">Effectif</label> <input id="effectif" class="form-control"
							placeholder="Saisir l'effectif de la Promo" type="number" name="effectif" value="${age}" required />
					</div>

					<div>
						<button type="submit" name="Ajouter" value="Ajouter">Ajouter</button>
					</div>
					
					<!--   <div>
						<button type="submit" name="Modifier" value="Modifier">Modifier</button>
					</div> -->
					<div class= "clearfix">
					</div> 

				</form>
			</div>

		</section>
		<section class="container">
		   <h1>Liste des Promos</h1>
			<table class="table">
				<thead>
					<tr>
						<th>IDPromo</th>
						<th>Effectif de la Promo</th>
						
						
					</tr>

				</thead>
				<tbody>
					<c:if test="${! empty promos}">
						<c:forEach items="${promos}" var="x">
							<tr>
								<td><c:out value="${x.idPromo}" /></td>
								<td><c:out value="${x.nomSession}" /></td>
								<td><c:out value="${x.effectif}" /></td>
								
								<td><a href="SupprimerPersonne?id=${x.idPromo}">supprimer</a></td>
								<td><a href="ModifierPersonne?id=${x.idPromo}">modifier</a></td>
							</tr>
						</c:forEach>

					</c:if>


				</tbody>
			</table>
		</section>
	</div>
</body>
</html>