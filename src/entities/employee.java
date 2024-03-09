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
            System.out.println(funcionario);
       }
    }

    public void buscaFuncionarios(String info){
        String result;
        for (employee employee : funcionario) {
            if(employee.getName().equals(info) || employee.getStatus().equals(info) || employee.getOffice().equals(info) ){
                result = employee.getAddress();
                System.out.println(employee.toString());
                
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

    }}




