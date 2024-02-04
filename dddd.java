import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dddd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dddd extends World
{private GreenfootSound backgroundMusic;

    /**
     * Constructor for objects of class dddd.
     * 
     */
    public dddd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400, 700, 1);
        
        backgroundMusic = new GreenfootSound("hhh.mp3");
        backgroundMusic.play();
    }
}
