package controller;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map.Entry;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Banco;



/**
 * Servlet implementation class LoginCadastroServer
 */
@WebServlet("/LoginCadastro")
public class LoginCadastroServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeLogin = request.getParameter("nome");
		String senhaLogin = request.getParameter("senha");		
		
		Banco banco = new  Banco();
		banco.addmapa(senhaLogin, nomeLogin);
		
		HashMap<String, String> mapDados = banco.getDados();
		
		for (Entry<String, String> Dados : mapDados.entrySet()) {
		     System.out.println(Dados); 
		}
		
		for (Entry<String, String> Dados : mapDados.entrySet()) {
		     System.out.println(Dados.getValue()); 
		}
		
		for (String Dados : mapDados.values()) {
		     System.out.println(Dados); 
		}
		
		 RequestDispatcher xx = request.getRequestDispatcher("/Index.jsp");
	     xx.forward(request, response);	
		
	
	}

}
