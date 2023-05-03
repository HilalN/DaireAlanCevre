import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //define variables
        int r;
        double pi = 3.14, area, circum;

        //get radius from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = input.nextInt();

        //do the math
        circum = 2 * pi * r;
        area = pi * r * r;

        //print outs
        System.out.println("Circumference of the circle: " + circum);
        System.out.println("Area of the circle: " + area);
    }
}