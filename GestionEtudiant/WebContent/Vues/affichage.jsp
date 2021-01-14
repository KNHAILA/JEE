<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib prefix="sp" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Affichage</title>
</head>
<body>
<table border="1">
<caption>La liste des étudiants</caption>
<tr><th>Code</th><th>Nom</th><th>Prénom</th><th>Age</th><th>Ville</th><th>Action</th></tr>
<sp:forEach items="${list}" var="lE">
<tr><td>${lE.code}</td><td>${lE.nom}</td><td>${lE.prenom}</td><td>${lE.age}</td><td>${lE.ville}</td>
<td><a href="delete.html?code=${lE.code}">Supprimer</a></td>
</tr>
</sp:forEach>
</table>
<form action="recherche.html">
Code :</th><td><input type="text" name="code">
<input type="submit" value="Rechercher">
</form>
</body>
</html>