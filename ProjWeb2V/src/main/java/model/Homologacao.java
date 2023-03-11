package model;

public class Homologacao {

	private Integer id_homologacao;	
	private Coordenacao homologador;
	private Aluno aluno;
	private String timestamp_homologacao;
	private Documento documentacao_comprobatoria;
	private ParticipacaoProjeto participacao_relacionada;
	private Integer qtde_horas;
	
	public Integer getId_homologacao() {
		return id_homologacao;
	}

	public void setId_homologacao(Integer id_homologacao) {
		this.id_homologacao = id_homologacao;
	}

	public Coordenacao getHomologador() {
		return homologador;
	}

	public void setHomologador(Coordenacao homologador) {
		this.homologador = homologador;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getTimestamp_homologacao() {
		return timestamp_homologacao;
	}

	public void setTimestamp_homologacao(String timestamp_homologacao) {
		this.timestamp_homologacao = timestamp_homologacao;
	}

	public Documento getDocumentacao_comprobatoria() {
		return documentacao_comprobatoria;
	}

	public void setDocumentacao_comprobatoria(Documento documentacao_comprobatoria) {
		this.documentacao_comprobatoria = documentacao_comprobatoria;
	}

	public Integer getQtde_horas() {
		return qtde_horas;
	}

	public void setQtde_horas(Integer qtde_horas) {
		this.qtde_horas = qtde_horas;
	}

	public ParticipacaoProjeto getParticipacao_relacionada() {
		return participacao_relacionada;
	}

	public void setParticipacao_relacionada(ParticipacaoProjeto participacao_relacionada) {
		this.participacao_relacionada = participacao_relacionada;
	}
	
	
		
}