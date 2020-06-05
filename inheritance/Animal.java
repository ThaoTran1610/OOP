package inheritance;

public class Animal {
    int speed;
    String name;
    String type;

    public Animal() {

    }

    public Animal(int speed, String name, String type){
        this.speed=speed;
        this.name=name;
        this.type=type;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setType(String type){
        this.type=type;
    }

    public int getSpeed(){
        return this.speed;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public void Run(){
        System.out.println("Speed: "+getSpeed());
    }
    public void Print(){
        System.out.println("Name: "+getName()+ " Type: "+getType());
    }

}
