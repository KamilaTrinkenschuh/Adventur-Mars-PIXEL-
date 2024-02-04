import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flame extends Actor
{
    /**
     * Act - do whatever the flame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {//verändere einfach die Größe und den Winkel in der Welt
        GreenfootImage myImage = getImage();
        myImage.scale(150,200);
        setRotation(20);
    }
}
