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
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Get a word from the user
        System.out.println("Please enter a word in lowercase.");
        String word = input.nextLine();

        //convert word to lowercase
        word = word.toLowerCase();

        int length = word.length();
        System.out.println("That word is " + length + " characters long!");

        //get a specific letter at a position
        char letter = word.charAt(0);
        //System.out.println("Character at  0 is " + letter);

        //print out each letter in the word
        for (int i = 0; i < length; i++) {
            char character = word.charAt(i);
            System.out.println(character);

            //see if charater is a vowel
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {

                //breaking up the string where the vowel is found
                String firsthalf = word.substring(0, i);
                String secondhalf = word.substring(i);

                //output the word in pig latin
                String tword = secondhalf + firsthalf + "ay";
                System.out.println("your word in pig latin is " + tword);
                break;
            }
        }


    }
}
