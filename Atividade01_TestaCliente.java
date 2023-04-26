package POO;

public class Atividade01_TestaCliente {

	public static void main(String[] args) {
		
		Atividade01_Cliente[] lista = new Atividade01_Cliente [4];
		
		lista[0] = new Atividade01_PessoaFisica("Adriana", 43, "São Paulo", true, true, "20.111.000-9", "112.446.788-00");
		lista[1] = new Atividade01_PessoaFisica("Nicolas", 06, "São Paulo", false, false, "30.278.564-5", "123.456.789-90");
		lista[2] = new Atividade01_PessoaJuridica("Adriana", 0, "São Paulo", null, null, "5.123.456./10000-90");
		lista[3] = new Atividade01_PessoaJuridica("Nicolas", 0, "São Paulo", null, null, "5.123.456./10000-90");
		
		for (Atividade01_Cliente clientes: lista ) {
			clientes.visualizar();
		}
	}
}
