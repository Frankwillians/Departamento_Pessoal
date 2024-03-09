import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.employee;

public class departamentoPessoal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List <employee> emp = new ArrayList<>();
        System.out.println("================================");
        System.out.println("Sistema de departamento pessoal");
        System.out.println("================================");
        System.out.println("digite: 1 - Cadastro de funcionarios");
        System.out.println("digite: 2 - Listagem de funcionarios");
        System.out.println("digite: 3 - Busca de funcionarios");
        System.out.println("digite: 4 - Detalhes do funcionario");
        System.out.println("digite: 5 - Excluir funcionario");
        System.out.println("digite: 5 - Editar funcionario");
        System.out.println("digite: 0 - Encerrar o progama");
        System.out.println("================================");
        System.out.println("O que você quer fazer? ");

        int choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Digite quantos funcionarios deseja cadastrar: ");
            int quant = sc.nextInt();
            for(int i = 0 ; i < quant; i++){
                System.out.println("Digite o identificador do funcionario (Apenas números): ");
                int id = sc.nextInt();
                System.out.print("Digite o nome do funcionario: ");
                sc.next();
                System.out.print("Digite a idade do funcionario: ");
                int age = sc.nextInt();
                String name = sc.nextLine();
                System.out.print("Digite o sexo do funcionario: ");
                String sex = sc.nextLine();

                
                for(employee x: emp){
                    if (x.getAge() < 18){
                        System.out.print("Parent name: ");
                        String pName = sc.nextLine();
                        System.out.print("Parent address: ");
                        String pAdress = sc.nextLine();
                        System.out.print("Parent Age: ");
                        int pAge = sc.nextInt();
                        x.minorAge(pName, pAdress, pAge);
                    }}
                   

                System.out.print("Digite o endereço do funcionario: ");
                String adress = sc.nextLine();
                System.out.print("Digite o cargo do funcionario: ");
                String office = sc.nextLine();
                System.out.print("Digite o Status do funcionario: (1 - Contratado, 2 - Demitido, 3 - Quase Demitido ):  ");
                int status = sc.nextInt();
                if (status == 1){
                    new employee().setStatus("contratado");
                }
                if (status == 2){
                    
                    new employee().setStatus("demitido");

                }
                if (status == 3){
                    new employee().setStatus("quase_Demitido");
                }
                emp.add(new employee(id, name, adress, office, sex, age, office));           
                            
                    
                        
                    
                    
                

                }
        System.out.print("O que deseja fazer agora ? ");
        choice = sc.nextInt();
                    
        }if (choice == 2){
            for (employee x: emp){
                System.out.println("Id:" + x.getId()+" " + "Name: " + x.getName()+ ", Idade: " + x.getAge());
            }

        }if (choice == 3){
            System.out.print("tipo de busca: 1 - nome ; 2 - id ; 3 - status ");
                int inf = sc.nextInt();
                if (inf == 1){
                    sc.nextLine();
                    System.out.print("Digite o nome do funcionario: ");
                    String name = sc.nextLine();
                    for (employee x : emp){
                        if(x.getName() == name){
                            System.out.println(x);
                        }
                        }
                    
                }
            }
        if (choice == 4){

        }if (choice == 5){

        }else if(choice == 0){
            
        }
        sc.close();
        
    }   
    
    }