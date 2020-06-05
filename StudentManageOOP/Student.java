package StudentManageOOP;

public class Student {
    String id;
    String name;
    int age;
    String address;
    double gpa;

    public Student(){

    }
    public Student(String id, String name, int age, String address,Double gpa ){
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.gpa=gpa;
    }
    //ID
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return this.id;
    }
    //Name
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    //Age
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    //Address
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }
    //GPA
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    public double getGpa(){
        return this.gpa;
    }
    public int compare(Object object){
        int result =0;
        result =  (this.getGpa() < (( Student) object).getGpa() ? -1 : (this.getGpa() == ( (Student )object).getGpa() ? 0 : 1));
        return  result;
    }
    //Outpput
    public void Output() {
            System.out.println("ID: "+getId()+" , Name: "+getName()+" , Age: "+getAge()+" , Address "+getAddress()+" , GPA: "+getGpa());
    }
}
