package estudos.poo;

public class Desenvolvedor extends Funcionario{

	private String linguagem;

	public Desenvolvedor(String nome, String cargo, Double salario, String linguagem) {
		super(nome, cargo, salario);
		this.linguagem = linguagem;
	}
	
	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public void exibirLinguagem() {
        System.out.println("Linguagem: " + linguagem);
    }
	
	@Override
	public double calcularBonus() {
	    return getSalario() * 0.15;
	}
	/**
	 * @param args
	 */
	
}
