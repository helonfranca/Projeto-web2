package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Banco;
import model.ParticipacaoProjeto;
import model.Aluno;

import java.io.IOException;

/**
 * Servlet implementation class NovoProj
 */
public class NovoProj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//número do processo
		//data de início da participação
		//quantidade de horas semanais 
		//listas suas atribuições

		HttpSession session = request.getSession(true);

		Aluno dadosAluno = (Aluno) session.getAttribute("user");
		
		String numProjeto = request.getParameter("numero");
		String nomeProjeto = request.getParameter("nomeprojeto");
		String data_Inicio = request.getParameter("date");
		String hrs_semanais = request.getParameter("hrs_semanais");
		String lista_Atribuicoes = request.getParameter("atribuicoes");
		
		ParticipacaoProjeto projeto = new ParticipacaoProjeto();	
			
		projeto.setId(numProjeto);
		projeto.setNome_projeto(nomeProjeto);
		projeto.setInicio_participacao(data_Inicio);
		projeto.setProcesso_projeto("Em espera");
		projeto.setHrs_semanais(hrs_semanais);
		projeto.setAtribuicoes(lista_Atribuicoes);
		projeto.setAluno(dadosAluno.getNome());
		
		System.out.print(dadosAluno.getNome());
		
		dadosAluno.getParticipacaoProjetos().add(projeto);
		System.out.print(dadosAluno.getParticipacaoProjetos());
		
		Banco banco = new  Banco();
		
		banco.adiciona(projeto);
		
		String url = response.encodeRedirectURL("/ProjWeb2V/CriarProj.jsp");
		response.setStatus(302);
		response.setHeader("location", url);
		
	}
}
