package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnLeftMove2();
        turnRightMove2();
        turnRight();
        pickandMove4();
        turnRightMove2();
        turnRight2Move2();
        putandMove4();
        turnRightMove2();
        turnRight2Move2();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void pickandMove4() {
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
    public void turnRightMove2() {
        turnRight();
        move();
        move();
    }
    public void turnRight2Move2() {
        turnRight();
        move();
        move();
        turnRight();
    }
    public void turnLeftMove2() {
        turnLeft();
        move();
        move();
    }
    public void putandMove4() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
}