package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Banco;
import model.ParticipacaoProjeto;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class ListarProjetosC
 */
public class ListarProjetosC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarProjetosC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    Banco banco = new Banco();
	    List<ParticipacaoProjeto> lista = banco.getProjetos();

	    request.setAttribute("projetos", lista);

	    RequestDispatcher rd = request.getRequestDispatcher("/ListarProjetoC.jsp");
	    rd.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}