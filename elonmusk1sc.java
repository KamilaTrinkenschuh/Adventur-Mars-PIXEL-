import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class elonmusk1sc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elonmusk1sc extends Actor
{
    /**
     * Act - do whatever the elonmusk1sc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    List<String> myList = new ArrayList<String>();
    public int s = 7; 
    public void act()
    {
        
        myList.add("1Hello");
        myList.add("2My name is Elon Musk");
        myList.add("3I'm the cofounder and CEO of Tesla");
        myList.add("4It's the Year 2035");
        myList.add("5... and my biggest dream has come true");
        myList.add("6because of the initiatve of spaceX we are sending the first humans to mars");
        myList.add("7so you were choosen to be the first human on mars");
        if (getX() != 650 || getY() != 500) {
            // Move towards the target coordinates
            setLocation(650, 500);
        }
        deleteItems();
        
    }

    private void deleteItems() {
        
        
        
        
        
        
        
    
    
}
}