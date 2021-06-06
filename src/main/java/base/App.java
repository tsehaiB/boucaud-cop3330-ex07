package base;
import java.util.Scanner;

public class App {
    Scanner inp = new Scanner(System.in);
    final static double feetToMeters = 0.09290304;
    public static void main(String args[]){
        App myApp = new App();

        int length = myApp.readIn("length");
        int width = myApp.readIn("width");
        int area = myApp.calcArea(length, width);

        System.out.println("You entered the dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is");
        System.out.println(area + " square feet");
        System.out.printf("%.3f square meters\n", myApp.convert(area));
    }
    private int readIn(String word){
        System.out.print("What is the " + word + " of the room in feet? ");
        return Integer.parseInt(inp.nextLine());
    }
    private int calcArea(int x, int y){
        return x * y;
    }
    private double convert(int z){
        return z * feetToMeters;
    }
}
