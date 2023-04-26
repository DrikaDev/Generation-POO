package POO;

public class Atividade02_Funcionario {
	
	//criação dos atributos:
	
	private String nome;
	private int idade;
	private Boolean casado = true;
	private Boolean filho = true;
	private String estado;
	
	//criação do construtor:
	
	public Atividade02_Funcionario(String nome, int idade, Boolean casado, Boolean filho, String estado) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.casado = casado;
		this.filho = filho;
		this.estado = estado;
	}
	
	//criação dos get e set:

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

	public Boolean getCasado() {
		return casado;
	}

	public void setCasado(Boolean casado) {
		this.casado = casado;
	}

	public Boolean getFilho() {
		return filho;
	}

	public void setFilho(Boolean filho) {
		this.filho = filho;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	//criação do método visualizar:
	public void visualizar() {

	}
}
