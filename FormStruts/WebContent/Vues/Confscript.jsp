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
<table border="2">
<caption>Les informations du lauréat</caption>
<tr><th>Nom :</th><td><s:property value="nom"/></td></tr>
<tr><th>Prénom :</th><td><s:property value="prenom"/></td></tr>
<tr><th>Numéro de téléphone :</th><td><s:property value="tel"/></td></tr>
<tr><th>Adresse :</th><td><s:property value="adr"/></td></tr>
<tr><th>Pays :</th><td><s:property value="pays"/></td></tr>
<tr><th>Ville :</th><td><s:property value="ville"/></td></tr>
<tr><th>Entreprise/Organisme :</th><td><s:property value="entreprise"/></td></tr>
<tr><th>Fonction :</th><td><s:property value="fonction"/></td></tr>
<tr><th>Email 1 :</th><td><s:property value="email"/></td></tr>
<tr><th>Age :</th><td><s:property value="age"/></td></tr>
<tr><th>Contact Facebook :</th><td><s:property value="contact"/></td></tr>
</table>
</body>
</html>