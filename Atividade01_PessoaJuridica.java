package POO;

public class Atividade01_PessoaJuridica extends Atividade01_Cliente {

	private String cnpj;

	public Atividade01_PessoaJuridica(String nome, int idade, String estado, Boolean graduacao, Boolean casado,
			String cnpj) {
		super(nome, idade, estado, graduacao, casado);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar(){
		System.out.println("\nPessoa Jurídica\n");
		
		System.out.println("Cliente " + getNome());
		System.out.println("Estado: " + getEstado() );
		System.out.println("CNPJ: " + cnpj);
	}
}
