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




    public String minorAge(String name,String address,int age){
        return "Parent name: " + name + "address: " + address + age + " years";
        
    
    }
    public void cadastro(int id, String name, String address, String office, String sex, int age, String status){
            funcionario.add(new employee(id, name, address, office, sex, age, status));
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
                System.out.println();
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
                    int id = sc.nextInt();
                    if(employee.getId() == id){
                        sc.nextLine();
                        System.out.print("Voce tem certeza que deseja excluir "+employee.getName()+" ? digite S/N para continuar: ");
                        String choice = sc.nextLine();
                        if(choice.equals("s")){
                            funcionario.remove(employee);
                            System.out.println(funcionario.size());
                        }
                    }
                       
                    }
                    
                }
        }
        
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




