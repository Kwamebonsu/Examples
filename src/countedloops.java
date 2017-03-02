
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bonsk5852
 */
public class countedloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city

        City kw = new City();

        //create a robot

        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);

        //make a counter
        int counter = 0;
        //move 5 times using a condition
        while (counter < 5) {
            karel.move();
            //increase the counter
            counter = counter + 1;
            //or counter++;
            //or counter +=1;
            //or ++counter;
        }
        karel.turnAround();

        //using a for loop to count
        //define integer, create condition, change counter
        for (int i = 0; i < 5; i++) {
            karel.move();
        }


        //compound conditions
        // && <-AND statement - both must be true
        // || <-OR statement - one of them must be true
        //if(karel.frontIsClear()){
        //if(karel.countThingsInBackpack() == 5){
        //do something
        //}
        //}

        if (karel.frontIsClear() && karel.countThingsInBackpack() == 5) {
            //do something
        }
        
        if (!karel.frontIsClear() || karel.countThingsInBackpack() != 5) {
            //do something
        }

    }
}
