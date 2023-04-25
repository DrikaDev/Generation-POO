package POO;

import java.text.NumberFormat;

public class Empregado_1 {
	
	// criação/declaração dos atributos da classe
	
	private String nome;
	private double salario;
	
	// criação do método construtor
	
	public Empregado_1(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public Empregado_1(double salario) {
		super();
		this.salario = salario;
	}

	//criação dos get e set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//getCurrencyInstance pega a moeda padrão do país no nosso caso o R$
		nf.setMinimumFractionDigits(2);
		//e no parâmetro estabelece o número de casas depois da virgula
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome+"\t"+" Salário: "+this.formatarMoeda());
	}
}
