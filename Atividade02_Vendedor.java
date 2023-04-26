package POO;

public class Atividade02_Vendedor extends Atividade02_Funcionario{
	
	private Boolean ensinoMedio = true;

	public Atividade02_Vendedor(String nome, int idade, Boolean casado, Boolean filho, String estado,
			Boolean ensinoMedio) {
		super(nome, idade, casado, filho, estado);
		this.ensinoMedio = ensinoMedio;
	}

	public Boolean getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(Boolean ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}
	
	public void visualizar() {
		System.out.println("\n*** Ficha do Vendedor: ***\n");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Casado: " + getCasado());
		System.out.println("Filho: " + getFilho());
		System.out.println("Estado: " + getEstado());
		System.out.println("Ensino Médio: " + true);
	}
}
