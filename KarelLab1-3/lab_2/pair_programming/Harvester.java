package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        //Complete this method, using the methods you create below so that all rows are harvested
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    ///**
     //* Precondition: Robot is facing east, one block away from a beeper
     //* Post-condition: Robot is facing east, two treets above where it started.
     //*/
    public void harvestTwoRows() {
        //Complete this method, using the methods you create below so that all rows are harvested
        repositionRight();
        repositionRight();
    }
    public void repositionRight() {
        //Complete this method, using the methods you create below so that all rows are harvested
        move();
        harvestOneRow();
        turnLeft();
        move();
        turnLeft();
        harvestOneRow();
        move();
        turnRight();
        move();
        turnRight();
        
    }
    public void harvestOneRow() {
        //Complete this method, using the methods you create below so that all rows are harvested
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void turnRight() {
        //Complete this method, using the methods you create below so that all rows are harvested
        turnLeft();
        turnLeft();
        turnLeft();
    }
    //your met//your methods go below
}

