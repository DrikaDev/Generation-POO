package POO;

public class Automovel_2 {

	public static void main(String[] args) {

		// criação do objeto da classe Automovel1 - instanciando um objeto
		// o auto1 será um objeto da classe Automovel1

		Automovel_1 auto1 = new Automovel_1("Charles", "Audi Q8", "CHA1998", 2023);

		auto1.imprimirInfo();

		System.out.println("\n****Transferência de Proprietário****");

		auto1.setNomeProprietario("Cinthia");

		auto1.imprimirInfo();

		System.out.println("\nAlteração da placa do automóvel");

		auto1.setPlaca("CIN2A00");

		auto1.imprimirInfo();

	}
}
