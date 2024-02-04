import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fd extends Actor
{
    public int k=0;
    /**
     *ich skaliere das Bild um den Faktor 2
     */
    public void act()
    {GreenfootImage myImage = getImage();
      k++;
      if(k< 3){
        myImage.scale(512*k,218*k);}
    }
}
