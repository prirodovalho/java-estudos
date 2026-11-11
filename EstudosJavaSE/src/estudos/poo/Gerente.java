package estudos.poo;

public class Gerente extends Funcionario{

	private String departamento;

	public Gerente(String nome, String cargo, Double salario, String departamento) {
		super(nome, cargo, salario);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void exibirLinguagem() {
        System.out.println("Departamento: " + departamento);
    }
	
	@Override
	public double calcularBonus() {
	    return getSalario() * 0.20;
	}
	
}
