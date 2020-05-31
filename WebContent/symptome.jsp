<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gestion des symptomes</title>
</head>
<body>
 <h1>GESTION DES SYMPTOMES</h1>
	<form action="SymptomeController" method="post">
		<input type="text" name="name" placeholder="entrer le nom du symptome"/>
		<br>
		<input type="text" name="description" placeholder="entrer la description du symptome"/>
		<br>
		<input type="submit" value="ajouter">
	</form>
</body>
</html>