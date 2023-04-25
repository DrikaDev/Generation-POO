package POO;

public class Empregado_2 {

public static void main(String[] args) {
		
		Empregado_1[] lista = new Empregado_1[3];
		
		lista[0] = new Empregado_1 ("Vinicius Almeida",8000);
		lista[1] = new Empregado_1 ("Caique Ramos",8500);
		lista[2] = new Empregado_1 ("Thayna",15000);
		
		for(Empregado_1 roda:lista) {
			
			roda.imprimir();
		}
		
		System.out.println("\n**************************************************");
		
		for(Empregado_1 roda:lista) {
			
			roda.aumentarSalario(10);
			roda.imprimir();
		}	
	}
}