<!-- RESOLVER VERIFICACAO NO RATIO. O ELEMENTO NAO ESTÁ SENDO VERIFICADO!!!!!!! --> 





<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">               
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Verificar relatórios</title>
    <link rel="stylesheet" href="style.css">
    
  
</head>

<body>
    <div class="container">   <!--Caixa inteira...-->
  
        <header class="header1">            
            <h1 class="tituloheader">PERFIL <br> DO <br> PROFESSOR</h1>
        </header>

        <div class="icone"><img style="height: 80px; width: 80px; padding-top: 20px;" src="iconprof.png"></div> <!--AVATAR-->

        <!--MENU-->
        <div class="MENU">
            <div class="item1_menu"><a href="relatorios.html">Verificar relatórios</a></div>
            <div class="item2_menu"><a href="listaalunos.html">Listar alunos</a></div>  
            <div class="item3_menu"><a href="novoaluno.html">Incluir novo aluno</a></div>
            <div class="item4_menu"><a href="novasatividades.html">Incluir novas atividades</a></div>
            <div class="item5_menu"><a href="notificacoes.html">Notificações</a></div>
            <div class="item6_menu"><a href="novoproj.html">Criar novo projeto</a></div>
            </div>

        <!--Tela direita - Formularios...-->
        <div class="Formulario">

            <h1 class="title1">Projeto 1</h1>
            <h1 class="title2">Relatórios</h1>

            <form class="form1">             
                    <div>  
                    <label for="alunos">Selecione o aluno:</label>
                    <select id="alunos">
                        <option value="aluno">Aluno 1</option>
                        <option value="aluno">Aluno 2</option>
                    </select>
                    </div>
                  
                    <div>
                    <label for="mes">Selecione o mês:</label>
                    <select id="mes">
                        <option value="mes">Janeiro</option>
                        <option value="mes">Fevereiro</option>
                    </select>
                    </div>
                </form>

                <form class="form2">

                    <p style="  font-size: 25px;" >  Janeiro</p>
                    
                    <div>  <label class="format2">Relatório.pdf</label>
                    <a href="path" download="arquivo.exemplo">
                    <button class="butao2" type="button">Fazer download</button>
                    </a>
                    </div>
                  
                    <div>      
                    <label for class="validarproj">Validar projeto?</label>
                    <div class="botoesvalidar"> <input class="validarsim" type="radio" name="validar" id="opcao"><label for="validarsim" class="sim">sim</label>
                    <input class="validarnao" type="radio" name="validar" id="opcao1"><label for="validarnao" class="nao">não</label></div>
                   
                    </div>
                           
                    <div><input class="butao" type="submit" value="Enviar"></div>
                </form>
             
           
            <!--Logo-->
           

        </div>
        
    <!--Logo-->
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