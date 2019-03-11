<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Minha primeira pagina</title>
</head>
<body>
<form method="post" action="contato">
	<label for = "nome">Nome:</label>
	<input type=text name="nome" title="Inserir o nome" required></input><br/>
	
	<label for = "nome">Email:</label>
	<input type=text name="email" title="Inserir o e-mail" required></input><br/>
	
	<input type=submit value="Inserir"></input>
	
</form>

</body>
</html>