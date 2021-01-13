<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Css/Styles.css"/>
<meta charset="ISO-8859-1">
<title>Inscription des lauréats</title>
</head>
<body>
<h2>Informations de lauréat</h2>
<fieldset>
	<s:form action="validerLaureat">
		<s:textfield label="Nom " name="nom"></s:textfield>
		<s:textfield label="Prénom " name="prenom"></s:textfield>
		<s:textfield label="Numéro téléphone " name="tel"></s:textfield>
		<s:textarea label="Adresse " name="adr" rows="5" cols="30"></s:textarea>
		<s:textfield label="Pays " name="pays"></s:textfield>
		<s:textfield label="Ville " name="ville"></s:textfield>
		<s:textarea label="Entreprise/organisme " name="entreprise" rows="5" cols="30"></s:textarea>
		<s:textarea label="Fonction  " name="fonction" rows="5" cols="30"></s:textarea>
		<s:textfield label="Email 1 " name="email"></s:textfield>
		<s:textfield label="Age " name="age"></s:textfield>
		<s:textfield label="Contact Facebook " name="contact"></s:textfield>
		<s:submit label="Valider" class="compteButton"></s:submit>
	</s:form>
	<s:form action="index">
		<s:submit value="Annuler" class="compteButton"></s:submit>
	</s:form>
</fieldset>
</body>
</html>