<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, model.ParticipacaoProjeto"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listar projetos</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="container">   <!--Caixa inteira...-->
  
        <header class="header1">            
            <h1 class="tituloheader">PERFIL <br> DO <br> ALUNO</h1>
        </header>

        <div class="icone"><img style="height: 80px; width: 80px; padding-top: 20px;"></div> <!--AVATAR-->

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

            <div class="lista">
                <h1>Projetos</h1>
          
                
                   <ul>
    <%
        List<ParticipacaoProjeto> lista = (List<ParticipacaoProjeto>)request.getAttribute("projetos");
        for (ParticipacaoProjeto projeto : lista) { 
    %>
        <h3>Projeto <%= projeto.getNome_projeto() %></h3>
        <li>Número do projeto: <%= projeto.getProcesso_projeto() %></li>
        <%if(projeto.getAprovacao()){
    %>
        <li>Aprovacao:  Ok  </li>   
        <%}else{ %>        
                <li>Aprovacao:  Recusado  </li>   
             	
        	<%}%> 
    
    <%if(projeto.getFinalizada()){
    %>
        <li>Situação:  Ativo  </li>   
        <%}else{ %>        
                <li>Situação:  Encerrado  </li>   
             	
        	<%}%> 	
        
  <%} %>
    </ul>

            </div>
        </div>
    <!--Logo-->
    <!--INFERIOR DA TELA ESQUERDA--> 

        <!--Logo-->
        <div class="logoprincipal">  
            <div class = "dentro_logo">
                <img style="height: 100px; width: 100px;"  >  
                <p id="titulo">Portal <br> Projeto de <br>Extensão</p>
            </div>
        </div>
      
     

    </div>

</body>

</html>