package model;

public class ParticipacaoProjeto {

	
	private String id;
	
	private String nome_projeto;
	
	private String processo_projeto;

	private String inicio_participacao;
	
	private String atribuicoes;
	
	private String aluno;
	
	private String hrs_semanais;
	private Boolean aprovacao = false;   
	
	private Boolean finalizada = false;
	
	public ParticipacaoProjeto() {
		
	}

	public ParticipacaoProjeto(String nome_projeto, String processo_projeto, String inicio_participacao, String atribuicoes, String aluno, String hrs_semanais){
		this.nome_projeto = nome_projeto;         
		this.processo_projeto = processo_projeto;         
		this.inicio_participacao = inicio_participacao;         
		this.atribuicoes = atribuicoes;         
		this.aluno = aluno;         
		this.hrs_semanais = hrs_semanais;     
	}
	
	public Boolean getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(Boolean aprovacao) {
        this.aprovacao = aprovacao;
    }

    public Boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(Boolean finalizada) {
        this.finalizada = finalizada;
    }
	
	public String getId() {
		return id;
	}

	public void setId(String numProjeto) {
		this.id = numProjeto;
	}

	public String getNome_projeto() {
		return nome_projeto;
	}

	public void setNome_projeto(String nome_projeto) {
		this.nome_projeto = nome_projeto;
	}

	public String getProcesso_projeto() {
		return processo_projeto;
	}

	public void setProcesso_projeto(String processo_projeto) {
		this.processo_projeto = processo_projeto;
	}

	
	public String getInicio_participacao() {
		return inicio_participacao;
	}

	public void setInicio_participacao(String inicio_participacao) {
		this.inicio_participacao = inicio_participacao;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String string) {
		this.aluno = string;
	}


	public String getAtribuicoes() {
		return atribuicoes;
	}

	public void setAtribuicoes(String atribuicoes) {
		this.atribuicoes = atribuicoes;
	}

	public String getHrs_semanais() {
		return hrs_semanais;
	}

	public void setHrs_semanais(String hrs_semanais) {
		this.hrs_semanais = hrs_semanais;
	}
	
}
