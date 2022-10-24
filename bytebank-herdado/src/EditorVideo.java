//Gerente é um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario{
	//Atributos
	
	//gets e Sets
	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}

}
