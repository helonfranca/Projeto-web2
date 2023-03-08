package controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Banco;
import model.ParticipacaoProjeto;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class NovoProj
 */
public class NovoProj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numProjeto = request.getParameter("numero");
		String nomeProjeto = request.getParameter("nome");

		ParticipacaoProjeto projeto = new ParticipacaoProjeto();	
		
		projeto.setNome_projeto(nomeProjeto);
		
		projeto.setProcesso_projeto(numProjeto);
		
		Banco banco = new  Banco();
		banco.adiciona(projeto);
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Projeto " + numProjeto + " - " + nomeProjeto  + " cadastrado com sucesso!</body></html>");

	}

}
