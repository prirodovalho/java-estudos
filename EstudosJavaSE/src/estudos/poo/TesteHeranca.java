package estudos.poo;

public class TesteHeranca {

    public static void main(String[] args) {

        Funcionario[] funcionarios = {
            new Desenvolvedor("Ana", "Analista de Sistemas", 7000.00, "Java"),
            new Gerente("Carlos", "Gerente", 10000.00, "Tecnologia"),
            new AnalistaDados("Maria", "Analista de Dados", 8000.00)
        };

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
            System.out.println("Bônus: R$ " + funcionario.calcularBonus());
            System.out.println("-------------------------");
        }
    }
}
