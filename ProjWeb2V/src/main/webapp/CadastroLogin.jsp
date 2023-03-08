<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="cadastro.css">
        <title> Portal Projeto de Extensão </title>
    </head>

    <body>
        <div class="container">
            <div class = "logo">
                <div class="dentro_logo">
                    <p id="titulo"> Portal <br> Projeto de <br> Extensão</p>
                    
                </div>
            </div>

            <div class="fora_login">
                <form class="form" action="LoginCadastro" method="POST">
                    <div class="loginform">   
                        <h2 id="cads">Novo Cadastro</h2>
                        <div class="campos">
                            <label>Nome Completo:</label>       <input type="text" name="nome" id="nome" required>
                            <label>Login:</label>               <input type="text" name="login" id="login" required>
                            <label>E-mail:</label>              <input type="email" name ="email" id="email" required>
                            <label>Criar Senha:</label>         <input type="text" id="senha" required>
                            <label>Repita Senha:</label>        <input type="text" name="senha" id="repsenha"  required>

                            <div id="botton_center"> 
                                <a ><button style=" width: 60px; height: 25px;" href = "../index.php" name="novoCadastro" type="submit" onclick="verificanull()">Enviar</button></a>
                            </div>
                        </div>
                    </div>
                </form>
            </div>  
        </div>
    </body>
</html>