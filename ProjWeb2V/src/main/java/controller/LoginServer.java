package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Banco;


public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco dados = new Banco();
		
		System.out.println("Login: " + request.getParameter("login"));
		System.out.println("Senha: " + request.getParameter("password"));
		
		HttpSession session = request.getSession(true);
		
		dados.adddata();
		
		for(int i = 0; i < dados.aluno.size(); i++) {	
			if(request.getParameter("login").equals(dados.aluno.get(i).getLogin())) {
				if(request.getParameter("password").equals(dados.aluno.get(i).getSenha())) {
					session.setAttribute("user", dados.aluno.get(i));
				    String url = response.encodeRedirectURL("/ProjWeb2V/CriarProj.jsp");
					response.setStatus(302);
					response.setHeader("location", url);
					
				}
			}
			
		}
		
		
		//dados.aluno.stream()
		 // .filter(aluno -> request.getParameter("login").equals(aluno.getLogin()))
		  //.filter(aluno -> request.getParameter("password").equals(aluno.getSenha()))
		 // .findFirst()
		//  .ifPresent(aluno -> {
		 //   session.setAttribute("Nome", aluno.getNome());
		 //   String url = response.encodeRedirectURL("/CriarProj.jsp");
		  //  response.setStatus(HttpServletResponse.SC_FOUND);
		 //   response.setHeader("location", url);
		 // });
	}
}
