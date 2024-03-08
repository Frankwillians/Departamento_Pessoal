import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.employee;

public class departamentoPessoal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List <employee> emp = new ArrayList<>();
        System.out.println("================================");
        System.out.println("Sistema de departamento pessoal");
        System.out.println("================================");
        System.out.println();
        System.out.println("================================");
        System.out.println("O que você quer fazer? ");
        System.out.println("================================");
        System.out.println("digite: 1 - Cadastro de funcionarios");
        System.out.println("digite: 2 - Listagem de funcionarios");
        System.out.println("digite: 3 - Busca de funcionarios");
        System.out.println("digite: 4 - Detalhes do funcionario");
        System.out.println("digite: 5 - Excluir funcionario");
        System.out.println("digite: 5 - Editar funcionario");
        System.out.println("digite: 0 - Encerrar o progama");
        System.out.println("================================");

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

                emp.add(new employee(id, name, sex,age));
                for(employee x: emp){
                    if (x.getAge() < 18){
                        System.out.print("Parent name: ");
                        String pName = sc.nextLine();
                        System.out.print("Parent address: ");
                        String pAdress = sc.nextLine();
                        int pAge = sc.nextInt();
                        x.minorAge(pName, pAdress, pAge);
                    }
                    else{

                        for(employee a : emp){
                            System.out.print("Digite o endereço do funcionario: ");
                            sc.nextLine();
                            String adress = sc.nextLine();
                            System.out.print("Digite o cargo do funcionario: ");
                            String office = sc.nextLine();
                            a.setAddress(adress);
                            a.setAge(age);
                            a.setOffice(office);
                            System.out.print("Digite o Status do funcionario: (1 - Contratado, 2 - Demitido, 3 - Quase Demitido ):  ");
                            int status = sc.nextInt();
                            if (status == 1){
                                a.setStatus("contratado");
                            }
                            if (status == 2){
                                a.setStatus("demitido");
        
                            }
                            if (status == 3){
                                a.setStatus("quase_Demitido");
                            }

                            }

                           
                            
                    }
                        
                    }
                    
                

                }
        System.out.print("O que deseja fazer agora ? ");
        choice = sc.nextInt();
                    
        }if (choice == 2){
            for (employee x: emp){
                System.out.println("Id: " + x.getId() + "Name: " + x.getName()+ ", Idade: " + x.getAge());
            }

        }if (choice == 3){

        }if (choice == 4){

        }if (choice == 5){

        }else if(choice == 0){
            
        }
        sc.close();
        
    }   
    
    }

