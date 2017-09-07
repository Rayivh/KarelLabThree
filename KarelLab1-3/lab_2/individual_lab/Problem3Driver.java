package lab_2.individual_lab;


/**
 * Write a description of class Problem3Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import kareltherobot.*;
import java.awt.Color;

public class Problem3Driver implements Directions
{
    public static void main(String args[])  {
        Problem3 karel = new Problem3(1, 5, North, 16);
        karel.sayHello();
        karel.turnOff();
    } 
    public void sayHello(){
        //
    }

    static {
        World.reset(); 
        World.readWorld("worlds/wideworld.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}