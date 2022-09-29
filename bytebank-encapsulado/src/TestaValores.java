
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		// conta está inconsistente
		//conta.setAgencia(-50);
		//conta.setNumero(-350);
		
		System.out.println(conta.getAgencia());
		
	}
}
