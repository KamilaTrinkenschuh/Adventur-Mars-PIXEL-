import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sat2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sat2 extends Actor
{
    /**
     * Act - do whatever the sat2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int k;
    public void act() 
    {
        k++;
        setLocation(getX(), getY()+k);
        if(isAtEdge()){
        getWorld().removeObject(this);
        
        }
    }    
}
