/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.function.DoubleUnaryOperator;
import java.util.*;
public class Log {
    public static double log(double x) {
        return Math.log(x);
    }

    public static double factorial(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (x <= 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static double sine(double x) {
        return Math.sin(x);
    }

    public static double cosine(double x) {
        return Math.cos(x);
    }

    public static double tangent(double x) {
        return Math.tan(x);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num;
        int choice;
        System.out.println("enter a number");
                num=scanner.nextDouble();
        
         while(true){
             System.out.println("what do you want to do with this number"); 
            System.out.println("1. finding Logarism");
            System.out.println("2. factorial");
            System.out.println("3. sine");
            System.out.println("4. cosine");
            System.out.println("5. tangent");
             System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Log of "+num+": " + log((int)num));
                    break;
                case 2:
                     System.out.println("Factorial of" +num+": " + factorial(num));
                     break;
                case 3:
                    System.out.println("Sine of "+num+" degrees: " + sine(Math.toRadians(num)));
                    break;
                case 4:
                    System.out.println("Cosine of "+num+" degrees: " + cosine(Math.toRadians(num)));
                    break;
                case 5:
                     System.out.println("Tangent of" +num+" degrees: " + tangent(Math.toRadians(num)));
                     break;
                  
         }
        
          System.out.println("enter a number");
                num=scanner.nextDouble();
    }
}
}