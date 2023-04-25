package POO;

public class Automovel_1 {

	// criação/declaração dos atributos da classe

	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;

	// criação do método construtor
	
	public Automovel_1(String nomeProprietario, String modelo, String placa, int ano) {
		super();
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	//sobrecarga:

	public Automovel_1(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}

	public Automovel_1() {
		super();
	}
	
	// criação dos get e set
	// botão direito - source - generate getters and setters

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	// método para imprimir os atributos da classe:

	public void imprimirInfo() {
		System.out.println(nomeProprietario + " possui um automóvel " 
				+ modelo + " com placa: " + placa + " e ano: " + ano);
	}
}