package estudos.poo;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Maria", 30);

        pessoa.apresentar();
    }
}