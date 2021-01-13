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
<div class="index">
<s:form action="compte">
	<s:submit value="Création d'un compte" class="indexButton"></s:submit>
</s:form>
<s:form action="inscrire">
	<s:submit value="Inscription d'un lauréat" class="indexButton"></s:submit>
</s:form>
</div>
</body>
</html>