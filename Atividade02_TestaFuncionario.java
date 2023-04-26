package POO;

public class Atividade02_TestaFuncionario {

	public static void main(String[] args) {
		
		Atividade02_Funcionario gerente1 = new Atividade02_Gerente("Adriana", 43, true, true, "São Paulo", true );
		gerente1.visualizar();
		
		Atividade02_Funcionario gerente2 = new Atividade02_Gerente("Jorge", 28, false, false, "São Paulo", false);
		gerente2.visualizar();
		
		Atividade02_Funcionario vendedor1 = new Atividade02_Vendedor("Cassio", 45, true, true, "São Paulo", true);
		vendedor1.visualizar();
		
		Atividade02_Funcionario vendedor2 = new Atividade02_Vendedor("Maria", 23, false, false, "Rio de Janeiro", false);
		vendedor2.visualizar();
	}
}