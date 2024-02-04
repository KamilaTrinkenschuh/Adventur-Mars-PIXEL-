import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exp extends Actor
{private int timer = 500; 
    private double fadeSteps = 0.01; 
    /**
     *siehe backfirst
     */
    public void act()
    {
        if (timer > 0) {
            fadeOverTime();// Exponentiell mit currentAlpha*0.99^n wird das Bild an der Intensität schwächer, falls die Zeit noch nicht abgelaufen ist 
        } else {
            getWorld().removeObject(this); 
        }
    }
    private void fadeOverTime() {
        double steps = fadeSteps;

        while (steps > 0 && timer > 0) {
            int currentAlpha = getImage().getTransparency(); 
            int newAlpha = (int) (currentAlpha * 0.99); //Um was für einen großen Anteil newAlpha schwächer wird
            getImage().setTransparency(newAlpha); //Während steps>0 wird die Transperenz immer wieder runtergesetzt, wodurch der Übergang entsteht

            if (newAlpha <= 0) {
                getWorld().removeObject(this); 
                return;
            }

            steps = steps - 0.02;
            timer--;
        }
    }
}
