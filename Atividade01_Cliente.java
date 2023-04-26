package POO;

public class Atividade01_Cliente {
	
	//criação dos atributos:
	
	private String nome;
	private int idade;
	private String estado;
	private Boolean graduacao = true ;
	private Boolean casado = true;
	
	//alt shift S 
	// botão direito, Source - generate constructor using fields
	public Atividade01_Cliente(String nome, int idade, String estado, Boolean graduacao, Boolean casado) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.estado = estado;
		this.graduacao = graduacao;
		this.casado = casado;
	}
	
	//alt shift s - criação dos get e set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Boolean getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(Boolean graduacao) {
		this.graduacao = graduacao;
	}

	public Boolean getCasado() {
		return casado;
	}

	public void setCasado(Boolean casado) {
		this.casado = casado;
	}

	//método visualizar:
	//alt shif s - generate to String:
	
	public void visualizar() {
		
	}	
}
