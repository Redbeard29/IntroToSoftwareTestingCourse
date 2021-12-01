package Week1;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side: ");
        int side_1 = scanner.nextInt();

        System.out.println("Enter second side: ");
        int side_2 = scanner.nextInt();

        System.out.println("Enter third side: ");
        int side_3 = scanner.nextInt();

        if(isTriangle(side_1, side_2, side_3)){
            System.out.println("This is a triangle");
        }
        else{
            System.out.println("This is not a triangle");
        }

        scanner.close();
    }
    public static boolean isTriangle(double a, double b, double c){
        if ((a + b > c)&&
            (a + c > b) &&
            (b + c > a)){
                return true;
        }
        return false;
    }
}
