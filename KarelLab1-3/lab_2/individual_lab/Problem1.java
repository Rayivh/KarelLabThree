package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        setline1();
        setline2();
        setline3();
        setline4();
    }
    public void setline1(){
        move();
        putBeeper();
        reset1();
    }
    public void setline2(){
        turnRight();
        move2PutBeeper();
        move2PutBeeper();
        reset2();
    }
    public void setline3(){
        turnRight();
        move();
        putBeeper();
        move2PutBeeper();
        move2PutBeeper();
        reset3();
    }
    public void setline4(){
        turnRight();
        putBeeper();
        move2PutBeeper();
        move2PutBeeper();
        move2PutBeeper();
        reset4();
    }
    public void reset1(){
        turnLeft();
        move2();
        move();
        turnRight();
        move();
    }
    public void reset2(){
        turnLeft();
        turnLeft();
        move2();
        move2();
        turnRight();
        move();
    }
    public void reset3(){
        turnLeft();
        turnLeft();
        move2();
        move2();
        move();
        turnRight();
        move();
    }
    public void reset4(){
        turnLeft();
        turnLeft();
        move2();
        move2();
        move2();
        move();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move2PutBeeper(){
        move();
        move();
        putBeeper();
    }
    public void move2(){
        move();
        move();
    }
}
