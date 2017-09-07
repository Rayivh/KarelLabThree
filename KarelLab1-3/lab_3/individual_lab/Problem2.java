package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        for(int i = 0; i < 9; i++){
            Mainloop();
        }
    }
    public void moveUntilObstacle(){
        while(frontIsClear()){
            move();
        }
    }
    public void resetForNextAvenue(){
        while(!facingSouth()){
            turnLeft();
        }
        while(frontIsClear()){
                move();
        }
        turnLeft();
        move();
    }
    public void CheckForRoom(){
        if(!frontIsClear()){
            turnLeft();
            if(!frontIsClear()){
                turnLeft();
                turnLeft();
                if(!frontIsClear()){
                    putBeeper();
                }   
            }
        }
    }
    public void Mainloop(){
        turnLeft();
        for(int i = 0; i < 5; i++){
            if(frontIsClear()){
                move();
                if(!frontIsClear()){
                    CheckForRoom();
                }
            }
        }
        resetForNextAvenue();
    }
}
