<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Css/Styles.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Gestion des Clients</h2>
<hr/>
<s:form action="save">
<s:textfield label="Code" name="code"></s:textfield>
<s:textfield label="Nom" name="nom"></s:textfield>
<s:textfield label="Prénom" name="prenom"></s:textfield>
<s:textfield label="Age" name="age"></s:textfield>
<s:textfield label="Ville" name="ville"></s:textfield>
<s:submit value="Enregistrer" class="compteButton"></s:submit>
</s:form>
<s:form action="update">
<s:textfield label="Code" name="code"></s:textfield>
<s:textfield label="Nom" name="nom"></s:textfield>
<s:textfield label="Prénom" name="prenom"></s:textfield>
<s:textfield label="Age" name="age"></s:textfield>
<s:textfield label="Ville" name="ville"></s:textfield>
<s:submit value="Modifier" class="compteButton"></s:submit>
</s:form>
<s:form action="delete">
<s:textfield label="Code" name="code"></s:textfield>
<s:submit value="Supprimer" class="compteButton"></s:submit>
</s:form>
</body>
</html>