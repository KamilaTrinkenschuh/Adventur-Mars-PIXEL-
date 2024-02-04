import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class down here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class down extends Actor
{
    /**
    *nur, um die scene zu wechseln
     */
    public void act()
    {
        GreenfootImage myImage = getImage();
        myImage.scale(200,200);    
        if(Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new MyWorld());
        }
    
    }
        
}
