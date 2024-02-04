import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    public double x = 10;
    private int timer = 0;
    private int spawnTime = 20;
    public IconicText label0 = new IconicText("some time");
    public IconicText label1 = new IconicText("after lift off...");
    public IconicText label2 = new IconicText("You have reached");
    public IconicText label3 = new IconicText("THE STRATOSPHERE");
    public IconicText label4 = new IconicText("........");
    public IconicText label5 = new IconicText("THE MESOSPHERE!");
    public IconicText label6 = new IconicText("THE THEEERMOSPHERE!!!");
    public IconicText label7 = new IconicText("THE EXOSPHEREEEEEEE");
    public IconicText label8 = new IconicText("2ND COSMIC SPEED");
    public IconicText label9 = new IconicText("SUCCESFULL LAUNCH");
    public IconicText label10 = new IconicText("YOU DID NOT DIE!!!!!!!!");
    public IconicText label11 = new IconicText("YET......");
    public troll troll1 = new troll();
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        if (Greenfoot.isKeyDown("space")){
            getWorld().addObject(new flame(), 620, 660);

        }
        timer++;

        if (timer == spawnTime+20){
            getWorld().addObject(label0,1100,150);

        }
        if (timer == spawnTime+40){

            getWorld().removeObject(label0);

        }
        if (timer == spawnTime+60){
            getWorld().addObject(label1,1100,150);

        }
        if (timer == spawnTime+80){

            getWorld().removeObject(label1);

        }   
        if (timer == spawnTime+100){
            getWorld().addObject(label2,1100,150);

        }
        if (timer == spawnTime+120){

            getWorld().removeObject(label2);

        }
        if (timer == spawnTime+140){
            getWorld().addObject(label3,1100,150);

        }
        if (timer == spawnTime+160){

            getWorld().removeObject(label3);
            getWorld().addObject(new sonde(), 100, 0);
        }
        if(timer == spawnTime +180){
            getWorld().addObject(label4,1100,150);

        }
        if(timer == spawnTime +220){
            getWorld().removeObject(label4);
            getWorld().addObject(label4,1100,150);

        }
        if(timer == spawnTime +240){
            getWorld().removeObject(label4);
            getWorld().addObject(label5,1100,150);
            getWorld().addObject(new meteor(), 1330, 1);
        }
        if(timer == spawnTime +300){
            getWorld().removeObject(label5);
            getWorld().addObject(label4,1100,150);

        }
        if(timer == spawnTime +340){
            getWorld().removeObject(label4);
            getWorld().addObject(label6,1100,150);
            getWorld().addObject(new sat3(), 1100, 0);
            getWorld().addObject(troll1, 1100, 350);
        }
        if(timer == spawnTime +350){
        getWorld().removeObject(troll1);
        }
        if(timer == spawnTime +360){
            getWorld().removeObject(label6);
            getWorld().addObject(label4, 1100, 150);
            
            
            
    }
    if(timer == spawnTime +400){
        getWorld().removeObject(label4);
            getWorld().addObject(label7,1100,150);
            getWorld().addObject(new sat2(), 1000, 0);
            
            
            
    }
    if(timer == spawnTime +410){
            
            getWorld().addObject(new sat1(), 300, 0);
            
            
            
    }
    if(timer == spawnTime +430){
            getWorld().addObject(label7,1100,150);
            getWorld().addObject(new sat4(), 400, 0);
            
            
            
    }
    if(timer == spawnTime +450){
        getWorld().removeObject(label7);
        getWorld().addObject(label8,1100,150);
            
            
            
            
    }

    if(timer == spawnTime +620){
        getWorld().removeObject(label8);
        getWorld().addObject(label9,1100,150);
            
            
            
            
    }
    if(timer == spawnTime +640){
        getWorld().removeObject(label9);
        getWorld().addObject(label10,1100,150);
            
            
            
            
    }
    if(timer == spawnTime +660){
        getWorld().removeObject(label10);
        getWorld().addObject(label4,1100,150);
            
            
            
            
    }
    if(timer == spawnTime +680){
        getWorld().removeObject(label4);
        getWorld().addObject(label11,1100,150);
            Greenfoot.setWorld(new scene2());
            
            
            
    }
}}
