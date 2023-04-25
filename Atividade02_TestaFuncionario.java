package POO;

public class Atividade02_TestaFuncionario {

	public static void main(String[] args) {
		
		Atividade02_Funcionario funcionario1 = new Atividade02_Funcionario("Adriana", 43, true, true, "São Paulo" );
		funcionario1.visualizarFuncionario();
		
		Atividade02_Funcionario funcionario2 = new Atividade02_Funcionario("Cassio", 45, true, true, "São Paulo");
		funcionario2.visualizarFuncionario();
	}
}