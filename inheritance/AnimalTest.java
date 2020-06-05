package inheritance;

import CollectionsEx.Computer;

import java.util.ArrayList;
import java.util.Scanner;
public class AnimalTest {
    static int quantityDog,quantityCat;
    static ArrayList<Animal> listAnimal = new ArrayList();
    static ArrayList<Animal> newlistAnimal = new ArrayList();

    public static void Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input quantity of Dogs:");
        quantityDog = input.nextInt();
        System.out.print("Input quantity of Dogs:");
        quantityCat = input.nextInt();

        //Input Dog
        for (int i = 1; i <= quantityDog; i++) {
            System.out.print("Name of Dog "+i+" is: ");
            input.skip("\\n+");
            String name= input.nextLine();
            System.out.print("Type of Dog "+i+" is: ");
            String type= input.nextLine();
            System.out.print("Speed of Dog "+i+" is:");
            int speed =input.nextInt();

            listAnimal.add(new Dog(speed,name,type));
        }

        //Input Cats
        for (int i = 1; i <= quantityCat; i++) {
            System.out.print("Name of Cat "+i+" is: ");
            input.skip("\\n+");
            String name= input.nextLine();
            System.out.print("Type of Cat "+i+" is: ");
            String type= input.nextLine();
            System.out.print("Speed of Cat "+i+" is:");
            int speed =input.nextInt();

            listAnimal.add(new Cat(speed,name,type));
        }


        for (int i = 0; i < listAnimal.size(); i++) {
            Animal animals = listAnimal.get(i);
            animals.Print();
            animals.Run();
        }
    }
    public static void main(String[] args) {
        Input();
    }

}
