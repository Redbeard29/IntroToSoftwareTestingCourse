package Week1;

import java.util.Scanner;

public class SecondDemo {

    public static void main(String[] args){
        double rad, area, circum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        rad = scanner.nextDouble();
        circum = 2 * Math.PI * rad;
        area = Math.PI * Math.pow(rad, 2);

        System.out.println("For a circle with radius " + rad + ",");
        System.out.println(" the circumference is " + circum);
        System.out.println(" and the area is " + area + ".");

        scanner.close();
    }

}
