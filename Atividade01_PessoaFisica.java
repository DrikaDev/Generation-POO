package POO;

public class Atividade01_PessoaFisica extends Atividade01_Cliente{
	
	private String cpf;
	private String rg;
	
	public Atividade01_PessoaFisica(String nome, int idade, String estado, Boolean graduacao, Boolean casado,
			String cpf, String rg) {
		super(nome, idade, estado, graduacao, casado);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	//get e set

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	} 
	
	//metodo:
	
	public void visualizar(){
		System.out.println("\nPessoa Fisica\n");
		
		System.out.println("Cliente " + getNome());
		System.out.println("Idade " + getIdade());
		System.out.println("Estado: " + getEstado() );
		System.out.println("Graduacao: " + getGraduacao() );
		System.out.println("Casado: " + getCasado());
		System.out.println("RG: " + rg);
		System.out.println("CPF: " + cpf);
	}
}
