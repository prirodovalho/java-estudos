package estudos.poo;

public class TesteHeranca {

    public static void main(String[] args) {

        Funcionario[] funcionarios = {
            new Desenvolvedor("Ana", "Analista de Sistemas", 7000.00, "Java"),
            new Gerente("Carlos", "Gerente", 10000.00, "Tecnologia")
        };

        for (Funcionario funcionario : funcionarios) {

            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("Bônus: R$ " + funcionario.calcularBonus());

            System.out.println("-------------------------");
        }
    }
}
