package estudos.collections;

import java.util.ArrayList;
import java.util.List;
import estudos.poo.Funcionario;
import java.util.Comparator;
	

public class TesteArrayList {
	
	public static void pesquisarFuncionario(
			List<Funcionario> funcionarios, String nomeBusca){
		
		boolean encontrado = false;
		
		 for (Funcionario funcionario : funcionarios) {
	        	if (funcionario.getNome().equalsIgnoreCase(nomeBusca)){
	        		encontrado = true;
	        		funcionario.aumentarSalario(10);
		            funcionario.exibirDados();
		            System.out.println("----------------");
	        	}
	        }
	        
	        if (!encontrado){
	        	System.out.println("Funcionário não encontrado!");
	        }
		
	}
	
	public static void exibirFuncionarios(
			List<Funcionario> funcionarios){
		
	
		 for (Funcionario funcionario : funcionarios) {
		            funcionario.exibirDados();
		            System.out.println("----------------");
	        	}
		 
		 funcionarios.sort(
				    Comparator.comparingDouble(Funcionario::getSalario)
				);
		 
		 for (Funcionario funcionario : funcionarios) {
	            funcionario.exibirDados();
	            System.out.println("----------------");
     	}
		
	}
	
    public static void main(String[] args) { 
    	
    	String nomeBusca = "MARIA";
    	    	

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Ana", "Analista", 7000.00));
        funcionarios.add(new Funcionario("Carlos", "Gerente", 10000.00));
        funcionarios.add(new Funcionario("Maria", "Analista de Dados", 8000.00));
        
        exibirFuncionarios(funcionarios);
        
       // pesquisarFuncionario(funcionarios, nomeBusca);
        
       // System.out.println("----------------");

       // System.out.println("Funcionários cadastrados:");

       

       /* System.out.println("Quantidade: " + funcionarios.size());

        System.out.println("\nFuncionário do índice 1:");
        funcionarios.get(1).exibirDados();

        funcionarios.remove(2);

        System.out.println("\nQuantidade após remoção: " + funcionarios.size());*/
    }
}