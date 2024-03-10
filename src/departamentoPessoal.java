import java.util.Scanner;

import entities.employee;

public class departamentoPessoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee funcionario = new employee();
        funcionario.opcoesDepartamento();
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
                    funcionario.opcoesDepartamento();
                    break;
                case 0:
                    funcionario.pararProgama();
                    break;
            
            
            } 
           
            
            
        }
       
        
       
    }
}
