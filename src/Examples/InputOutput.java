/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name.");
        String name = input.nextLine();

        System.out.println("Hello " + name);


        System.out.println("Please enter a number.");
        double number1 = input.nextDouble();
        System.out.println("Please enter another number.");
        double number2 = input.nextDouble();
        double sum = number1 + number2;
        System.out.println("The sum of these number is " + sum + ". Nice!");



    }
}
