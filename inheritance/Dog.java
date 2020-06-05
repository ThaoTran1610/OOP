package inheritance;

public class Dog extends Animal{

    public Dog() {

    }

    public Dog(int speed, String name, String type){
        this.speed=speed;
        this.name=name;
        this.type=type;
    }

    public void Run(){
        System.out.println("Speed: "+getSpeed());
    }
    public void Print(){
        System.out.println("DOG - Name: "+getName()+ " Type: "+getType());
    }

}

