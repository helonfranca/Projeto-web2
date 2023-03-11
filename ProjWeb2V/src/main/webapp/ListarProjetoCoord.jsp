<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List, model.ParticipacaoProjeto"%>
   <%@page import="model.Aluno" %>
      <%@page import="model.Coordenacao" %>
   
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listar projetos</title>
    <link rel="stylesheet" href="style.css">
    <% Coordenacao coordenacao =(Coordenacao)session.getAttribute("user"); %>
</head>

<body>
    <div class="container">   <!--Caixa inteira...-->
  	
        <header class="header1">            
            <h1 class="tituloheader">PERFIL <br> DO <br> COORDENADOR</h1>

        </header>

        <div style="display: flex align-items: center;flex-direction: column;">
        	<h4>Bem vindo Coordenador(a) </h4>
        	<button >logout</button>
        </div> <!--AVATAR-->
        <script>
		    function redirecionar() {
		        window.location.href = "logout.jsp";
		    }
		</script>

        <!--MENU-->
        <div class="MENU">

            <div class="item2_menu"><a href="listaprojetos">Listar projetos</a></div>  
            <div class="item3_menu"><a href="novoaluno.html">EncerrarParticipação</a></div>
            <div class="item4_menu"><a href="novasatividades.html">Validar Participação</a></div>
            <div class="item5_menu"><a href="notificacoes.html">Listar Alunos</a></div>
            <div class="item6_menu"><a href="CriarProj.jsp">Listar Horas</a></div>
        </div>

        <!--Tela direita - Formularios...-->
       
    <!--Logo-->
    <!--INFERIOR DA TELA ESQUERDA--> 
		<div class="Formulario">
		    <div class="lista">
		        <h1>Alunos</h1>
	                   <ul>
    <%
        List<ParticipacaoProjeto> lista = (List<ParticipacaoProjeto>)request.getAttribute("projetos");
        String aux = "x";
    		for (ParticipacaoProjeto projeto : lista) { 
        
        	
        	
    %>
    	 <%if(projeto.getAluno() != aux){
    %>
    	<h1>Aluno <%= projeto.getAluno() %></h1>
    	
    	<%} %>
        <h3> <%= projeto.getNome_projeto() %></h3>
        <li>Número do projeto: <%= projeto.getProcesso_projeto() %></li>
        <li>Atribuicoes: <%= projeto.getAtribuicoes() %></li>
         <li>Horas: <%= projeto.getHrs_semanais() %></li>
         <li>Inicio da participação: <%= projeto.getInicio_participacao() %></li>
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
        
  <% aux = projeto.getAluno();} %>
    </ul>
		    </div>
		</div>
        <!--Logo-->
        <div class="logoprincipal">  
            <div class = "dentro_logo">
                <img style="height: 100px; width: 100px;" src="logo.png"  >  
                <p id="titulo">Portal <br> Projeto de <br>Extensão</p>
            </div>
        </div>
      
     

    </div>

</body>

</html>