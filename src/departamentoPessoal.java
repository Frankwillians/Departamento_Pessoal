import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.employee;

public class departamentoPessoal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        employee funcionario = new employee();
        while (true) {
            System.out.println("================================");
            System.out.println("Sistema de departamento pessoal");
            System.out.println("================================");
            System.out.println("digite: 1 - cadastro de funcionarios");
            System.out.println("digite: 2 - Listagem de funcionarios");
            System.out.println("digite: 3 - Busca de funcionarios");
            System.out.println("digite: 4 - Detalhes do funcionario");
            System.out.println("digite: 5 - Excluir funcionario");
            System.out.println("digite: 5 - Editar funcionario");
            System.out.println("digite: 0 - Encerrar o progama");
            System.out.println("============================");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            Integer choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("============================");
                    System.out.println("Cadastro de funcionario");
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
                    break;

                case 3:
                    System.out.println("Digite alguma informação do funcionario (Nome,Cargo ou Status): ");
                    sc.nextLine();
                    String info = sc.nextLine();
                    funcionario.buscaFuncionarios(info);
                    break;
                case 4:
                    System.out.print("Digite o id do funcionario que deseja excluir: ");
                    id = sc.nextInt();
                    funcionario.deletarFuncionario(id);
                
            
            
            } 
           
            
            
        }
       
        
       
    }
}
