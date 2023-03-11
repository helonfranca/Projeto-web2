package model;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

public class Banco{
	public ArrayList<Aluno> aluno = new ArrayList<>();
	public ArrayList<Coordenacao> coordenacao = new ArrayList<>();
	private static List <Aluno> listaAlunos = new ArrayList<>();
	private static List <Usuario> listaUsuarios = new ArrayList<>();
	private static List <ParticipacaoProjeto> listaProj = new ArrayList<>();

	private static HashMap<String, String> map = new HashMap<>(); 


	
	public void adicionaAlunos(Aluno aluno) {
		Banco.listaAlunos.add(aluno);	

	}

	public List<Aluno> getAlunos(){
		return Banco.listaAlunos;
	}
	
	public void adicionaUsuario(Usuario usuario) {
		Banco.listaUsuarios.add(usuario);	

	}

	public List<Usuario> getUsuarios(){
		return Banco.listaUsuarios;
	}
	
	public void adiciona(ParticipacaoProjeto partproj) {
		Banco.listaProj.add(partproj);	

	}

	public List<ParticipacaoProjeto> getProjetos(){
		return Banco.listaProj;
	}
	
	
	
	public void addmapa(String senha, String nome) {
		Banco.map.put(senha, nome);	
	}
	
	 public HashMap<String, String> getDados(){
			return Banco.map;
	
	}
	 
	 public void adddata() {
			Aluno aluno1 = new Aluno("Lucas", "lucas123", "123");
			Aluno aluno2 = new Aluno("Milena", "milena123", "123");
			aluno.add(aluno1);
			aluno.add(aluno2);
			
			Coordenacao c1 = new Coordenacao("Cleber", "cleber123", "123");
			Coordenacao c2 = new Coordenacao("Juliana", "juliana123", "123");
			coordenacao.add(c1);
			coordenacao.add(c2);
			
			ParticipacaoProjeto p1 = new ParticipacaoProjeto("Projeto 1", "123", "02/05/2020","PHP, Phyton e JavaWeb", "Milena", "23");
            ParticipacaoProjeto p2 = new ParticipacaoProjeto("Projeto 2", "456", "02/04/2020","C++, Phyton e JavaWeb", "Milena", "30");
            ParticipacaoProjeto p3 = new ParticipacaoProjeto("Projeto 3", "789", "02/04/2020","Java, Phyton e JavaWeb", "Lucas", "40");
            listaProj.add(p1);
            listaProj.add(p2);
            listaProj.add(p3);
			
			
			
		}
	 
	
		
	
	
}

