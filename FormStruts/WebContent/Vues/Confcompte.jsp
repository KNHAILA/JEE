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
<caption>Les informations du compte</caption>
<tr><th>Nom :</th><td><s:property value="nom"/></td></tr>
<tr><th>Prénom :</th><td><s:property value="prenom"/></td></tr>
<tr><th>Courriel :</th><td><s:property value="courriel"/></td></tr>
</table>
</body>
</html>