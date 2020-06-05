package inheritance;

public class Cat extends Dog {

    public Cat() {

    }
    public Cat(int speed, String name, String type){
        this.speed=speed;
        this.name=name;
        this.type=type;
    }
    public void Run(){
        System.out.println("Speed: "+getSpeed());
    }
    public void Print(){
        System.out.println("CAT - Name: "+getName()+ " Type: "+getType());
    }

}
