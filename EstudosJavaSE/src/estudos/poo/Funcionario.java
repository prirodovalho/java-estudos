package estudos.poo;

public class Funcionario {
	
	protected String nome;
	protected String cargo;
	protected double salario;
	
	
	public Funcionario(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        setSalario(salario);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException(
                "O salário deve ser maior que zero."
            );
        }

        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual <= 0) {
            throw new IllegalArgumentException(
                "O percentual deve ser maior que zero."
            );
        }

        setSalario(salario * (1 + percentual / 100));
    }
    
    public double calcularBonus() {
        return salario * 0.10;
    } 
    
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: R$ " + getSalario());
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario("Ana", "Analista de Sistemas", 7000.00);
		
		funcionario.exibirDados();
		
		funcionario.aumentarSalario(10);

        System.out.println("Salário após aumento: " + funcionario.getSalario());

	}

}
