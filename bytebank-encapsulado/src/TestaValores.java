
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		
		System.out.println(conta.getAgencia());
		conta.setAgencia(1231312);
		Conta conta2 = new Conta(1337, 16549);
		
		System.out.println(Conta.getTotal());

	}
}
