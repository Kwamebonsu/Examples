/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author bonsk5852
 */
public class Conditions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Karel goes to retrieve his newspaper then returns to his bed
        
        City kitchener = new City();
        new Wall(kitchener, 1, 5, Direction.EAST);
        new Thing(kitchener, 0, 1);
        
        Robot Karel = new Robot(kitchener, 1, 1, Direction.EAST);
        while (true){
            while(Karel.frontIsClear()){
            Karel.move();
            if(!Karel.frontIsClear()){
            break;
        }
            }
        //Karel.turnLeft();
        
        if (Karel.canPickThing());{
        Karel.pickThing();
       
        }
        
        
        }
    }
}

    

        
    

