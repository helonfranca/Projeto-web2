<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Criar novo projeto</title>
    <link rel="stylesheet" href="style.css">
    <script type="text/javascript" src="valida.js"></script>
</head>
<body>
    <div class="container">   <!--Caixa inteira...-->
        <!--TELA ESQUERDA--------------------------------------------->
        <header class="header1">            
            <h1 class="tituloheader">PERFIL <br> DO <br> ALUNO</h1>
        </header>

        <div class="icone"><img style="height: 80px; width: 80px; padding-top: 20px;" src="iconprof.png"></div> <!--AVATAR-->

        <!--MENU-->
        <div class="MENU">
                <div class="item1_menu"><a href="relatorios.html"></a></div>
            <div class="item2_menu"><a href="listaprojetos">Listar projetos</a></div>  
            <div class="item3_menu"><a href="novoaluno.html">EncerrarParticipação</a></div>
            <div class="item4_menu"><a href="novasatividades.html">Enviar Documentos</a></div>
            <div class="item5_menu"><a href="notificacoes.html">Enviar Horas</a></div>
            <div class="item6_menu"><a href="CriarProj.jsp">Criar novo projeto</a></div>
            </div>


        <!--Tela direita - Formularios...-->
        <div class="Formulario">

            <h1 class="title new project">Criar novo projeto</h1>
            <form class="form3" action="novoproj" method="post">
                    <div>  
                    <label>Nome do projeto</label>                    
                    <input class="box1" type="text" id="nome projeto" name="nome" required>
                    </div>                  
                   
                    <div>
                        <label>Numero do projeto</label>                                        
                        <input class="box2" type="text" id="resumo projeto" name="numero" required>
                    </div>
                    
                    <div>
                        <input class="butao" type="submit" value="Enviar">
                    </div>
            </form>     

        </div>   

       <!--INFERIOR DA TELA ESQUERDA--> 

        <!--Logo-->
        <div class="logoprincipal">  
            <div class = "dentro_logo">
                <img style="height: 100px; width: 100px;"  src="logo.png">  
                <p id="titulo">Portal <br> Projeto de <br>Extensão</p>
            </div>
        </div>
                     

           
       

    </div>
    
</body>
</html>
