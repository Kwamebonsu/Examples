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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a scanner for user input
        Scanner input = new Scanner(System.in);

        // create a list of 5 numbers
        double[] marks = new double[5];

        //scan in some marks
        System.out.println("Please enter in 5 marks");

        //wrong way
        //marks[0] = input.nextDouble();
        //and so on

        //better way

        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();

        }
        //use loop to determine sum
        //start with an accumulator
        double sum = 0;
        //for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //find the total sum
            sum = sum + marks[i];
        }
        //divide the sum by the length
        System.out.println("The average is: " + sum / marks.length);
    }
}
