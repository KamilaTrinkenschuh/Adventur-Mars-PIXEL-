import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {//rotiert um die eigene Achse und bewegt sich von rechts nach links
        setLocation(getX()+15, getY());
        turn(10);
        setLocation(getX()+15, getY());
    }
}
