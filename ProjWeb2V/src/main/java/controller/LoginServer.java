package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Banco;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;


/**
 * Servlet implementation class LoginServer
 */
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeLogin = request.getParameter("login");
		String senhaLogin = request.getParameter("password");

		
		Banco banco = new  Banco();
		
		HashMap<String, String> mapDados = banco.getDados();
		
		//PrintWriter out = response.getWriter();
		//out.println("<html><body>");
		
		int n;
		n=0;

		for (Entry<String, String> Dados : mapDados.entrySet()) {
			
			if(nomeLogin.equals(Dados.getValue())){
				n=n+1;			
				if(senhaLogin.equals(Dados.getKey())) {
					request.setAttribute("usuario", nomeLogin);
					  RequestDispatcher xx = request.getRequestDispatcher("/CriarProj.jsp");
					     xx.forward(request, response);
					//out.println("<h1>Olá " + nomeLogin + "!</h1>"); 	
					     
					}else {					
					   RequestDispatcher xx = request.getRequestDispatcher("/Index.jsp");
					     xx.forward(request, response);						 
				}			
		     }		
		}
		
		if(n==0) {
			System.out.println("o valor de n é" + n);
			 RequestDispatcher xx = request.getRequestDispatcher("/CadastroLogin.jsp");
		     xx.forward(request, response);	
			
		}
		
		
			
	}

}
