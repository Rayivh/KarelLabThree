package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void setField() {
        setPins();
        makeTop();
    }
    public void makeTop() {
        turnRight();
        move();
        turnRight();
        move();
        turnLeft();
        setline3();
        setline2();
        turnRight();
        move();
        move();
        move();
        putBeeper();
        movedown8();
     
    }    
    
    /*
    public void setField(){
        /*
        move();
        putBeeper();
        staggerLeft();
        staggerLeft();
        staggerLeft();
        staggerRight();
        staggerRight();
        staggerRight();
        turnLeft();
        turnLeft();
        staggerLeft();
        staggerLeft();
        staggerLeft();
        staggerRight();
        staggerRight();
        move();
        turnRight();
        move();
        turnRight();
        move();
        move();
        move();
        turnRight();
        move();
        turnLeft();
        staggerLeftNoReset();
        staggerLeftNoReset();
        staggerLeftNoReset();
        staggerLeftNoReset();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        turnRight();
        turnRight();
        move();
        turnRight();
       
       
    
       */
      
public void staggerLeft(){
        move();
        turnLeft();
        move();
        putBeeper();
        turnRight();
    }
    public void staggerLeftNoReset(){
        move();
        turnLeft();
        move();
        putBeeper();
    }
    public void movedown8(){
        turnRight();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
    }
    public void staggerRight(){
        move();
        turnRight();
        move();
        putBeeper();
        turnLeft();
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
