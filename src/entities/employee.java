package entities;

public class employee {
    private Integer id;
    private String name;
    private String address;
    private String office;
    private String sex;
    private int age;
    private String Status;
   
    public employee(){

    }

    public employee(Integer id, String name, String address, String office, String sex, int age, String status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.office = office;
        this.sex = sex;
        this.age = age;
        Status = status;
    }

    public employee(Integer id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
      
        
    }



    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
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

    public String minorAge(String name,String address,Integer age){
        return "Parent name: " + name + "address: " + address + age + " years";
        
    
    }
    public String toString(){
        return "Id:" + getId()
        +" "+
        "Nome: " + getName()
        +"Idade: " + getAge()
        +"Sexo: " + getSex()
        +"Endereço: " + getAddress()
        +"Cargo" + getOffice()
        +"Status: "+ getStatus();

    }

    }


