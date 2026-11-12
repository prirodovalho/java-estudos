package estudos.poo;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private double salario;
	
	
	public Funcionario(String nome, String cargo, double salario) {
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

	public double getSalario() {
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
        return getSalario() * 0.10;
    } 
    
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: R$ " + getSalario());
    }
}
