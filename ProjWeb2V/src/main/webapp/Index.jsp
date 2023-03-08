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
                   
                    <p id="titulo"> Portal <br> Projeto de <br> Extensão</p>
                    
                </div>
            </div>
           
            <div class="fora_login">
                <div class="loginform">
                     <h2>Faca seu Login</h2>
                     
                     <form action="loginserver" method="POST">                  
                
		                    <div>Usuario:
		                    <input type="text" id="login" name="login">
		                    </div>
		                    </br>
		                    <div>Senha:
		                    <input type="password" id="pass" name="password">
		                    </div>
		                    <br></br>
		                    
		               			<button type="submit">Entrar</button>
               		 </form> 
               		
                    <br></br>
                    <a href = "CadastroLogin.jsp"><button>Criar nova conta</button></a> 
                	
                	  
                    
                </div>  
            </div>
        </div>
    </body>
</html>
   