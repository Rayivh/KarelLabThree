package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        move();
        complete2rightturnmove();
        complete2leftturnmove();
        complete2leftturnmove();
        reducedrightturnmove();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void complete2rightturnmove() {
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
    }
    public void complete2leftturnmove() {
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
    }
        public void reducedrightturnmove() {
        turnRight();
        move();
        move();
        turnRight();
        move();
    }
}