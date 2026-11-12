package estudos.poo;

public class TesteFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Ana", "Analista de Sistemas", 7000.00);
		
		funcionario.exibirDados();
		
		funcionario.aumentarSalario(10);

        System.out.println("Salário após aumento: " + funcionario.getSalario());

	}

}
