package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class employee {
    private int id;
    private String name;
    private String address;
    private String office;
    private String sex;
    private Integer age;
    private String Status;
    private String respName;
    private int respAge;
    private String respParent; 

    Scanner sc = new Scanner(System.in);

    List <employee> funcionario = new ArrayList<>();

  
    public employee(){

    }


    public employee(int id, String name, String address, String office, String sex, int age, String status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.office = office;
        this.sex = sex;
        this.age = age;
        Status = status;
        
    }

    public employee(int id, String name, String address, String office, String sex, int age, String status,String respName, int respAge, String respParent) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.office = office;
        this.sex = sex;
        this.age = age;
        Status = status;
        this.respName = respName;
        this.respAge = respAge;
        this.respParent = respParent;
        
    }

    



    public String getRespName() {
        return respName;
    }




    public void setRespName(String respName) {
        this.respName = respName;
    }




    public int getRespAge() {
        return respAge;
    }




    public void setRespAge(int respAge) {
        this.respAge = respAge;
    }




    public String getRespParent() {
        return respParent;
    }




    public void setRespParent(String respParent) {
        this.respParent = respParent;
    }




    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }




    public String getAddress() {
        return address;
    }




    public void setAddress(String address) {
        this.address = address;
    }




    public String getOffice() {
        return office;
    }




    public void setOffice(String office) {
        this.office = office;
    }




    public String getSex() {
        return sex;
    }




    public void setSex(String sex) {
        this.sex = sex;
    }




    public int getAge() {
        return age;
    }




    public void setAge(int age) {
        this.age = age;
    }




    public String getStatus() {
        return Status;
    }




    public void setStatus(String status) {
        Status = status;
    }




    public void menorResponsaveis(){
    
       
        
       
        
        
       
    }
        
    public void opcoesDepartamento(){
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
    }
    public void cadastro(){
        System.out.println("============================");
        System.out.println("Cadastro de funcionario");
        System.out.println();
        System.out.print("Id do funcionario: ");
        int id_e = sc.nextInt();
        while (hasID(id_e) != false){
            System.out.println("o id que voce digitou ja existe tente novamente: ");
            id_e = sc.nextInt();
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
        String stats = sc.nextLine();
        if(idade < 18){
            System.out.println("Como o funcionario é menor de idade é preciso as informações do responsavel!");
            System.out.println();
            System.out.print("Digite o nome do responsavel: ");
            String respName = sc.nextLine();
        
            System.out.print("Digite a idade do responsavel: ");
            int respAge = sc.nextInt();
           
            System.out.print("parentesco (pai,mae,tio(a)...):  ");
            sc.nextLine();
            String RespParent = sc.nextLine();
            System.out.println();
            funcionario.add(new employee(id_e, nome, endereco, cargo, sexo, idade, stats, respName, respAge, RespParent));
        }
        else{
            funcionario.add(new employee(id_e, nome, endereco, cargo, sexo, idade, stats));
            System.out.println();
        }
    }
        
    
       
        
    
    public boolean hasID(int id) {
        boolean test = false; 
        for (employee employee : funcionario) {
            test = false;
            if(employee.getId() == id){
                test = true; 
            }
        }
        return test;
    }

    public void listagemFuncionarios(){    
       for (employee employee : funcionario) {
            System.out.println("Id:"+ employee.getId()+" "+"Nome:"+employee.getName()+" "+"Status:"+ employee.getStatus());
       }
    }

    public void buscaFuncionarios(String info){
        for (employee employee : funcionario) {
            if(employee.getName().equals(info) || employee.getStatus().equals(info) || employee.getOffice().equals(info) ){
                System.out.println("Id:"+ employee.getId()+" "+"Nome:"+employee.getName()+" "+"Status:"+ employee.getStatus());
                System.out.println();
            }
        }
        
    }
    public void detalharFuncionario(int id){
        for (employee employee : funcionario) {
            if(employee.getId() == id){
                System.out.println(employee.toString());
                if (employee.getAge() < 18) {
                    System.out.println("Informacoes do responsavel: ");
                    
                    System.out.println("Nome: " + employee.getRespName() + ", " + "Idade: " + employee.getRespAge() + ", " + "Parentesco: " + employee.getRespParent()); 
                    System.out.println();
                }
                }
                
            }
        }
    
    public void deletarFuncionario(){
        if (funcionario.size() == 0){
            System.out.println("voce nao pode realizar essa funçao ainda!");
            System.out.println();
        }else{
            for (employee employee : funcionario) {   
                if (funcionario.size() == 1){
                    System.out.println("Voce precisa de pelo menos dois funcionarios cadastrados para poder deletar um!");
                    System.out.println();
                }else{
                    System.out.print("Digite o id do funcionario que deseja excluir: ");
                    int id_func = sc.nextInt();
                    if(employee.getId() == id_func){
                        sc.nextLine();
                        System.out.print("Voce tem certeza que deseja excluir "+employee.getName()+" ? digite S/N para continuar: ");
                        String choice = sc.nextLine();
                        if(choice.equals("s")){
                            funcionario.remove(employee);
                            
                        }
                    }
                       
                    }
                    
                }
        }
        
        }
    public void editarFuncionario(){
        if (funcionario.size() == 0){
            System.out.println("voce nao pode realizar essa funçao ainda!");
            System.out.println();
        }else{
        
            System.out.print("digite o id do funcionario que deseja editar: ");
            int sts_id = sc.nextInt();
            for (employee employee : funcionario) {
                if(employee.getId() == sts_id){
                    sc.nextLine();
                    System.out.print("Digite o novo status para esse funcionario (Contratado ou demitido): ");
                    String sts_edit = sc.nextLine();
                    employee.setStatus(sts_edit);
                    System.out.println();
                }
        }}
        
        

    }
    public void pararProgama(){
        System.exit(0);
    }

    public String toString(){
        return "Id:" + getId()
        +" "+
        "Nome:" + getName()+" "
        +"Idade:" + getAge()+" "
        +"Sexo:" + getSex()+" "
        +"Endereço:" + getAddress()+" "
        +"Cargo:" + getOffice()+" "
        +"Status:"+ getStatus()+" ";

    }
}




