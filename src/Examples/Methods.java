/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author bonsk5852
 */
public class Methods {
    // Say hello

    public static void sayHello() {
        System.out.println("Hello!");
    }

    // Say hello to a specific person. This is called overloading
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    /**
     * Calculates the volume of a cylinder
     *
     * @param radius the radius of the cylinder
     * @param height the height of the cylinder
     * @return the volume of the cylinder given the radius and the height
     */
    public static double volumeOfCylinder(double radius, double height) {
        // Calculate the volume
        double rSquared = Math.pow(radius, 2);
        double volume = Math.PI * rSquared * height;
        return volume; // Returns back the answer
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calling the sayHello method
        String n = "Fred";
        sayHello();
        sayHello("Bob");
        sayHello(n);
        // System.out.println(volumeOfCylinder(10, 15));
        double answer = volumeOfCylinder(10, 15);
        System.out.println(answer);
    }
}
