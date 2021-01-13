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
<h2>Création d'un compte</h3>
<hr/>
<s:form action="saveCompte">
<s:textfield label="Nom" name="nom"></s:textfield>
<s:textfield label="Prénom" name="prenom"></s:textfield>
<s:textfield label="Courriel" name="courriel"></s:textfield>
<s:password label="Mot de passe" name="password"></s:password>
<s:password label="Corfirmation" name="password"></s:password>
<s:submit value="Créer mon compte" class="compteButton"></s:submit>
</s:form>
<s:form action="index">
<s:submit value="Reset" class="compteButton"></s:submit>
</s:form>
</body>
</html>