<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="formulario.css">
        <title> Portal Projeto de Extensao </title>
    </head>

    <body>
        <div class="container">
            <div class = "logo">
                <div class="dentro_logo">
                    <img style="height:150px; width:150px;" src="logo.png">
                    <p id="titulo"> Portal <br> Projeto de <br> Extensão</p>
                    
                </div>
            </div>
           
            <div class="fora_login">
                <div class="loginform">
                     <h2>Faça seu Login</h2>
                     <form action="loginserver" method="POST">                  
		                    <div>
		                    	<h3>Usuario:</h3>
		                    	<input type="text" id="login" name="login">
		                    </div>
		                    <br>
		                    <div>
		                    	<h3>Senha:</h3>
		                    	<input type="password" id="pass" name="password">
		                    </div>
		                    <br></br>
		               		<button type="submit">Entrar</button>
               		 </form> 
                </div>  
            </div>
        </div>
    </body>
</html>
   