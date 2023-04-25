package POO;

public class Atividade01_TestaCliente {

	public static void main(String[] args) {
	
		Atividade01_Cliente cliente1 = new Atividade01_Cliente("Adriana", 43, "São Paulo", true, true);
		
		cliente1.visualizarCliente();
		System.out.println();
		
		Atividade01_Cliente cliente2 = new Atividade01_Cliente("Nicolas", 06, "São Paulo", false, false);
		
		cliente2.visualizarCliente();
		System.out.println();
		
	}
}
