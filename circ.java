import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class circ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class circ extends Actor
{
    /**
     * Act - do whatever the circ wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(200,200);
    }
}
