package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class RecTest {

    static int quantityRec;
    static ArrayList<Rectangle> listRectangle = new ArrayList();

    public static void Input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input quantity of Rectangles: ");
        quantityRec = input.nextInt();

        //Input Length and Width of Rectangle
        for (int i = 1; i <= quantityRec; i++) {
            System.out.print("Length of Rectangle " + i + " is: ");
            Float length = input.nextFloat();
            System.out.print("Width of Rectangle " + i + " is:");
            Float width = input.nextFloat();

            listRectangle.add(new Rectangle(length, width));
        }
        float max=0;
        for (int i = 0; i < listRectangle.size(); i++) {
            Rectangle rectangles = listRectangle.get(i);
            System.out.println("Rectangle " + i + " has length: " + rectangles.getLength() + ", width: " + rectangles.getWidth() + ", area: " + rectangles.recArea());
            if (rectangles.recArea()>max){
                max=rectangles.recArea();
            }

        }
        System.out.println("Rectangle is largest area: "+max);
    }

    public static void main(String[] args) {
        Input();
    }
}
