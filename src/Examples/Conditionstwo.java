/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author bonsk5852
 */
public class Conditionstwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        
       City kitchener = new City();
       // create the path
       new Thing(kitchener, 4, 2);
       
       new Thing(kitchener, 4, 3);
       new Thing(kitchener, 4, 3);
       
       new Thing(kitchener, 3, 3);
       
       new Thing(kitchener, 2, 3);
       new Thing(kitchener, 2, 3);
       new Thing(kitchener, 2, 3);
       new Thing(kitchener, 2, 3);
       
       //turn on the thing labels
       kitchener.showThingCounts(true);
       
       // create a Robot
       Robot Karel = new Robot(kitchener, 4, 1, Direction.EAST);
       
       //step onto the first part of the path
       Karel.move();
       
       //loop
       while(true){
      
       //if there are things
       //pick them all up
       while(Karel.canPickThing()){
           Karel.pickThing();
       }
       //if holding 1 thing, move
       if(Karel.countThingsInBackpack() == 1){
           //drop things
           Karel.putThing();
           
           //move
           Karel.move();
       }
       //if holding 2 things, turn left
       else if(Karel.countThingsInBackpack()==2){
           //put things down
           Karel.putThing();
           Karel.putThing();
           Karel.turnLeft();
           
           //move
           Karel.move();
       }
       //if holding 3 things turn right
       else if(Karel.countThingsInBackpack() == 3){
          //drop things
           Karel.putThing();
           Karel.putThing();
           Karel.putThing();
           
           //move
           Karel.turnLeft();
           Karel.turnLeft();
           Karel.turnLeft();
           Karel.move();
                   
       }
       //if holding 4 things stop
       else if(Karel.countThingsInBackpack()==4){
           //drop things
           Karel.putThing();
           Karel.putThing();
           Karel.putThing();
           
           //move
           Karel.turnLeft();
           Karel.turnLeft();
           Karel.turnLeft();
           Karel.move();
       }
          
       }
       
       
       
    }
    }
