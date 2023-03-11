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
        	<h4>Bem vindo Coordenador(a) <%= coordenacao.getNome()%></h4>
        	<button onclick="redirecionar()">logout</button>
        </div> <!--AVATAR-->
        <script>
		    function redirecionar() {
		        window.location.href = "logout.jsp";
		    }
		</script>

        <!--MENU-->
        <div class="MENU">
            <div class="item1_menu"><a href="relatorios.html"></a></div>
            <div class="item2_menu"><a href="ListarProjetoCoord.jsp">Listar projetos</a></div>  
            <div class="item3_menu"><a href="novoaluno.html">EncerrarParticipação</a></div>
            <div class="item4_menu"><a href="novasatividades.html">Enviar Documentos</a></div>
            <div class="item5_menu"><a href="notificacoes.html">Enviar Horas</a></div>
            <div class="item6_menu"><a href="CriarProj.jsp">Criar novo projeto</a></div>
        </div>

        <!--Tela direita - Formularios...-->
       
    <!--Logo-->
    <!--INFERIOR DA TELA ESQUERDA--> 
		<div class="Formulario">
		    <div class="lista">
		        <h1>Projetos</h1>
					<ul>
				    <% 
				        for (ParticipacaoProjeto projeto : Aluno.getParticipacaoProjetos() ) { 
				    %>
				        <h3>Projeto: <%= projeto.getNome_projeto() %></h3>
				        <li>Número do projeto: <%= projeto.getId() %></li>
				        <% if (projeto.getProcesso_projeto().equals("Em espera")) { %>
				            <li>Aprovação: Em andamento</li>
				        <% } else { %>
				            <li>Aprovação: OK</li>
				        <% } %>
				    <% } %>
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