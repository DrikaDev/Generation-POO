package POO;

public class Atividade02_Gerente extends Atividade02_Funcionario{

	private Boolean bacharelado = true;

	public Atividade02_Gerente(String nome, int idade, Boolean casado, Boolean filho, String estado,
			Boolean bacharelado) {
		super(nome, idade, casado, filho, estado);
		this.bacharelado = bacharelado;
	}

	public Boolean getBacharelado() {
		return bacharelado;
	}

	public void setBacharelado(Boolean bacharelado) {
		this.bacharelado = bacharelado;
	}
	
	public void visualizar() {
		System.out.println("\n*** Ficha do Gerente: ***\n");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Casado: " + getCasado());
		System.out.println("Filho: " + getFilho());
		System.out.println("Estado: " + getEstado());
		System.out.println("Bacharelado: " + true);
	}
}
