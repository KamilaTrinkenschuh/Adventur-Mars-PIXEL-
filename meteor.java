import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meteor extends Actor
{
    /**
     * Act - do whatever the meteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int k1;
    public void act()
    {//verwende eine lineare Funktion, damit das Object von einem Ende des Bildschrims diagonal zum anderen Ende "fliegt". 
        k1++;
        setLocation(getX()-k1*2, getY()+k1);
        if(isAtEdge()){
        
        
        getWorld().removeObject(this);}
    }
}
