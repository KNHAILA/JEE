<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="saisir.html">
		<table>
			<caption>Saisir un nouveau étudiant</caption>
			<tr><th>Code :</th><td><input type="text" name="code"></td></tr>
			<tr><th>Nom :</th><td><input type="text" name="nom"></td></tr>
			<tr><th>Prénom :</th><td><input type="text" name="prenom"></td></tr>
			<tr><th>Age :</th><td><input type="number" name="age"></td></tr>
			<tr><th>Ville :</th><td><input type="text" name="ville"></td></tr>
			<tr><td><input type="submit" value="Enregistrer"></td></tr>
		</table>
	</form>
	<hr />
	<form action="affichage.html">
<input type="submit" value="Afficher la liste des étudiants">
</form>
<br/>
<form action="index.html">
<input type="submit" value="Revenir à la page d'acceuil">
</form>
	
	<hr />
</body>
</html>