import greenfoot.*;  // Importiert die Greenfoot-Bibliothek

/**
 * Die Klasse "obt" repräsentiert einen Charakter, der sich horizontal über die Welt bewegt und Leben hat.
 * 
 * @author (Dein Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class obt extends Actor
{
    // Deklaration von Instanzvariablen
    private GreenfootImage[] animationFrames;
    private int currentFrame;
    private GreenfootImage[] animationFrames1;
    private int currentFrame1;
    private int c = 6; // Anzahl der Leben
    private int h = 0; // Variable, die nicht verwendet wird
    private heartobt h1 = new heartobt(); // Instanzen der Klasse heartobt, die die Leben darstellen
    private heartobt h2 = new heartobt();
    private heartobt h3 = new heartobt();
    private heartobt h4 = new heartobt();
    private heartobt h5 = new heartobt();
    private heartobt h6 = new heartobt();
    private GreenfootSound backgroundMusic; // Hintergrundmusik

    // Bewegungseigenschaften
    public int x = 10;
    public int x1 = -1;
    public boolean movingLeft;
    public boolean movingRight;

    /**
     * Act-Methode wird automatisch aufgerufen.
     * Hier werden die Leben dargestellt, der Charakter bewegt sich horizontal, kollidiert mit dem Ball und verliert Leben.
     */
    public void act()
    {
        backgroundMusic = new GreenfootSound("gun.mp3"); // Hintergrundmusik für die Ball-Kollision
        getWorld().addObject(h6, 50, 80); // Fügt Leben der Welt hinzu
        getWorld().addObject(h5, 150, 80);
        getWorld().addObject(h4, 250, 80);
        getWorld().addObject(h3, 350, 80);
        getWorld().addObject(h2, 450, 80);
        getWorld().addObject(h1, 550, 80);
        mov(); // Ruft die Methode für die horizontale Bewegung und Kollision auf
    }

    /**
     * Private Methode für die horizontale Bewegung und Kollision mit dem Ball.
     */
    public void mov(){
        if(isTouching(ball.class)){
            removeTouching(ball.class);
            c -= 1; // Verringert die Anzahl der Leben
            backgroundMusic.play(); // Spielt die Hintergrundmusik ab
            getWorld().addObject(new exp(), getX(), getY()); // Fügt eine Explosion der Welt hinzu
        }

        // Überprüft die Anzahl der Leben und entfernt die entsprechenden Leben von der Welt
        if(c == 5){
            getWorld().removeObject(h1);
        }
        if(c == 4){
            getWorld().removeObject(h1);
            getWorld().removeObject(h2);
        }
        if(c == 3){
            getWorld().removeObject(h1);
            getWorld().removeObject(h2);
            getWorld().removeObject(h3);
        }
        if(c == 2){
            getWorld().removeObject(h1);
            getWorld().removeObject(h2);
            getWorld().removeObject(h3);
            getWorld().removeObject(h4);
        }
        if(c == 1){
            getWorld().removeObject(h1);
            getWorld().removeObject(h2);
            getWorld().removeObject(h3);
            getWorld().removeObject(h4);
            getWorld().removeObject(h5);
        }
        if(c == 0){
            getWorld().removeObject(h1);
            getWorld().removeObject(h2);
            getWorld().removeObject(h3);
            getWorld().removeObject(h4);
            getWorld().removeObject(h5);
            getWorld().removeObject(h6);
        }

        // Horizontale Bewegung
        if (movingLeft == true || movingRight == false){
            currentFrame = (currentFrame + 1) % animationFrames.length;
            setImage(animationFrames[currentFrame]);
            move(-25);
            if(getX() == 0){
                movingLeft = false;
                movingRight = true;
            }
        } else {
            currentFrame1 = (currentFrame1 + 1) % animationFrames1.length;
            setImage(animationFrames1[currentFrame1]);
            move(25);

            if (getX() == 1300) {
                movingLeft = true;
                movingRight = false;
            }
        }
    }

    /**
     * Konstruktor für Objekte der Klasse "obt".
     * Hier werden die Animationen für den Charakter initialisiert.
     */
    public obt() {
        // Animationen für den Charakter laden
        animationFrames = new GreenfootImage[3]; 
        for (int i = 0; i < 3; i++) {
            animationFrames[i] = new GreenfootImage("teslabot" + (i + 1) + ".png");
        }
        currentFrame = 0;
        setImage(animationFrames[currentFrame]);
        
        animationFrames1 = new GreenfootImage[3]; 
        for (int i = 0; i < 3; i++) {
            animationFrames1[i] = new GreenfootImage("teslabot" + (i + 1) + " - Kopie.png");
        }
        currentFrame1 = 0;
        setImage(animationFrames1[currentFrame1]);
    }
}


