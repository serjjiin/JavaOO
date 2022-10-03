//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Gerente extends Funcionario{
	//Atributos
	private int senha;

	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	//gets e Sets
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

}
