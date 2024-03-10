import java.util.Scanner;

import entities.employee;

public class departamentoPessoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee funcionario = new employee();
        System.out.println("================================");
        System.out.println("Sistema de departamento pessoal");
        System.out.println("================================");
        System.out.println("digite: 1 - cadastro de funcionarios");
        System.out.println("digite: 2 - Listagem de funcionarios");
        System.out.println("digite: 3 - Busca de funcionarios");
        System.out.println("digite: 4 - Detalhes do funcionario");
        System.out.println("digite: 5 - Excluir funcionario");
        System.out.println("digite: 5 - Editar funcionario");
        System.out.println("digite: 6 - mostrar comandos");
        System.out.println("============================");
        System.out.println();
        while (true) {
            
            System.out.print("Digite a opção desejada: ");
            Integer choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    funcionario.cadastro();

                   
                    break;
            
                case 2:
                    funcionario.listagemFuncionarios();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("busca de funcionarios digite o Cargo ou Status: ");
                    sc.nextLine();
                    String info = sc.nextLine();
                    funcionario.buscaFuncionarios(info);
                    break;
                case 4:
                    System.out.print("digite o id do funcionario para ver informacoes detalhadas: ");
                    int id_employee = sc.nextInt();
                    funcionario.detalharFuncionario(id_employee); 
                    break;   
                case 5:
                    funcionario.deletarFuncionario();
                    break;
                
                case 6:
                    funcionario.editarFuncionario();
                    break;
                case 7:
                    System.out.println("================================");
                    System.out.println("Sistema de departamento pessoal");
                    System.out.println("================================");
                    System.out.println("digite: 1 - cadastro de funcionarios");
                    System.out.println("digite: 2 - Listagem de funcionarios");
                    System.out.println("digite: 3 - Busca de funcionarios");
                    System.out.println("digite: 4 - Detalhes do funcionario");
                    System.out.println("digite: 5 - Excluir funcionario");
                    System.out.println("digite: 6 - Editar funcionario");
                    System.out.println("digite: 7 - mostrar comandos");
                    System.out.println("============================");
                    System.out.println();
                    break;
                case 0:
                    funcionario.pararProgama();
                    break;
            
            
            } 
           
            
            
        }
       
        
       
    }
}
