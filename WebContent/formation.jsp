<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/bootstrap.css" />
<link rel="stylesheet" href="./css/main.css" />
<meta charset="UTF-8">
<title>Formation</title>
</head>
<body>
<div>
		<section class="container">
			<h1>Formation</h1>
			<div>
				<form action="Servlet" method="POST" id="form-contact">

					<div class="form-group row">
						
						<label for="nomFormation">Nom de la Formation</label> <input id="nomFormation" class="form-control"
							placeholder="Saisir la formation" type="text" name="nomFormation" value="${nomFormation}" required />
					</div>


					<div>
						<button type="submit" name="Ajouter" value="Ajouter">Ajouter</button>
					</div>
					
					<!--  <div>
						<button type="submit" name="Modifier" value="Modifier">Modifier</button>
					</div> -->
					<div class= "clearfix"></div>

				</form>
			</div>

		</section>
		<section class="container">
		   <h1>Liste des formations</h1>
			<table class="table">
				<thead>
					<tr>
						<th>IDFormation</th>
						<th>Nom de la Formation</th>
						
						
					</tr>

				</thead>
				<tbody>
					<c:if test="${! empty formations}">
						<c:forEach items="${formations}" var="x">
							<tr>
								<td><c:out value="${x.idFormation}" /></td>
								<td><c:out value="${x.nomFormation}" /></td>
								
								<td><a href="SupprimerFormation?id=${x.idFormation}">supprimer</a></td>
								<td><a href="ModifierFormation?id=${x.idFormation}">modifier</a></td>
							</tr>
						</c:forEach>

					</c:if>


				</tbody>
			</table>
		</section>
	</div>
</body>
</html>