<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/bootstrap.css" />
<link rel="stylesheet" href="./css/main.css" />
<meta charset="UTF-8">
<title>Stagiaire</title>
</head>
<body>
<div>
		<section class="container">
			<h1>Stagiaire</h1>
			<div>
				<form action="Servlet" method="POST" id="form-contact">

					<div class="form-group row">
						
						<label for="nom">Nom</label> <input id="nom" class="form-control"
							placeholder="Saisir votre nom" type="text" name="nom" value="${nom}" required />
					</div>

					<div class="form-group row">
						<label for="prenom">Prenom</label> <input id="prenom"
							class="form-control" placeholder="Saisir votre Prenom"
							type="text" name="prenom" value="${prenom}" required />
					</div>

					<div class="form-group row">
						<label for="age">Age</label> <input id="age" class="form-control"
							placeholder="Saisir votre Age" type="number" name="age" value="${age}" required />
					</div>

					<div>
						<button type="submit" name="Ajouter" value="Ajouter">Ajouter</button>
					</div>
					
					<!--  <div>
						<button type="submit" name="Modifier" value="Modifier">Modifier</button>
					</div>-->
					<div class= "clearfix">
					</div>

				</form>
			</div>

		</section>
		<section class="container">
		   <h1>Liste des stagiaires</h1>
			<table class="table">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nom</th>
						<th>Prenom</th>
						<th>Age</th>
						
						
					</tr>

				</thead>
				<tbody>
					<c:if test="${! empty stagiaires}">
						<c:forEach items="${stagiaires}" var="x">
							<tr>
								<td><c:out value="${x.idStagiaire}" /></td>
								<td><c:out value="${x.nom}" /></td>
								<td><c:out value="${x.prenom}" /></td>
								<td><c:out value="${x.age}" /></td>
								<td><a href="SupprimerPersonne?id=${x.idStagiaire}">supprimer</a></td>
								<td><a href="ModifierPersonne?id=${x.idStagiare}">modifier</a></td>
							</tr>
						</c:forEach>

					</c:if>


				</tbody>
			</table>
		</section>
	</div>

</body>
</html>