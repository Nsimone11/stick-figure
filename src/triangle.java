import java.util.*;
import java.lang.Math;


public class triangle {

    public static void main(String[] args) {

        double base, height, area;
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the base of the triangle");
        base = reader.nextDouble();

        System.out.println("what is the height of the triangle?");
        height = reader.nextDouble();

        area = (double) 1 / 2 * (base * height);

        System.out.println("the area is " + area + ".");

    }
}
