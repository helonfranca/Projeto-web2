package model;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

public class Banco{

	private static List <Aluno> listaAlunos = new ArrayList<>();
	private static List <ParticipacaoProjeto> listaProj = new ArrayList<>();

	private static HashMap<String, String> map = new HashMap<>(); 


	
	public void adiciona(Aluno aluno) {
		Banco.listaAlunos.add(aluno);	

	}

	public List<Aluno> getAlunos(){
		return Banco.listaAlunos;
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
		
		 

	
	
}

