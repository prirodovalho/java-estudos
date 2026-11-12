package estudos.poo;

public class AnalistaDados extends Funcionario{

	public AnalistaDados(String nome, String cargo, Double salario) {
		super(nome, cargo, salario);
	}
	
	@Override
	public double calcularBonus() {
	    return getSalario() * 0.12;
	}
	
}
