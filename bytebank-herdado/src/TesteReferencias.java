
public class TesteReferencias {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		String nome = g1.getNome();
		
		g1.autentica(2222); 
		
		System.out.println(nome);

	}

}