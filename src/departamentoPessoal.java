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
                    sc.nextLine();
                    System.out.println("============================");
                    System.out.println("Cadastro de funcionario");
                    System.out.println();
                    System.out.print("Id do funcionario: ");
                    int id = sc.nextInt();
                    while (funcionario.hasID(id) != false){
                        System.out.println("o id que voce digitou ja existe tente novamente: ");
                        id = sc.nextInt();
                    }
                    sc.nextLine();
                    System.out.print("Nome do funcionario: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade do funcionario: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Sexo do funcionario: ");
                    String sexo = sc.nextLine();
                    System.out.print("Endereço do funcionario: ");
                    String endereco = sc.nextLine();
                    System.out.print("Cargo do funcionario: ");
                    String cargo = sc.nextLine();
                    System.out.print("Status do funcionario (Contratado ou Demitido): ");
                    String status = sc.nextLine();
                
                    funcionario.cadastro(id, nome, endereco, cargo, sexo, idade, status);

                   
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
                    break;
                case 0:
                    break;
            
            
            } 
           
            
            
        }
       
        
       
    }
}
