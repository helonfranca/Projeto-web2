package controller;

import jakarta.servlet.ServletException;
import model.Aluno;
import model.Banco;
import model.ParticipacaoProjeto;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class EncerrarParticipacao
 */
public class EncerrarParticipacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EncerrarParticipacao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		Aluno aluno = new Aluno();
		ParticipacaoProjeto participacao = new ParticipacaoProjeto();
		
		
		
		
		
	}

}
