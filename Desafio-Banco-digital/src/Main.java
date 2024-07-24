
public class Main {

	public static void main(String[] args) {
		Cliente Joice = new Cliente();
		Joice.setNome("Joice");
		
		Conta cc = new ContaCorrente(Joice);
		Conta poupanca = new ContaPoupanca(Joice);

		cc.depositar(1000);
		cc.transferir(1000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}