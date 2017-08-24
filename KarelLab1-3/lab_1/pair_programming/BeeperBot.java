package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  Dr. Apple
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        pickBeeper();
        move();
        move();
        move();
        pickBeeper();
        turnLeft();
        move();
        move();
        move();
    
        pickBeeper();
        turnLeft();
        move();
        move();
        move();
        pickBeeper();
        move();
        move();
    }
    public void turnRight() {
        
    }
}