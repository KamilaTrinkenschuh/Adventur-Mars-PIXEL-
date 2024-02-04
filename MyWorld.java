import greenfoot.*;  // Importiert die Greenfoot-Bibliothek

/**
 * Die erste World-Klasse; in meinem Fall ein Screen, wo man erst einmal eine grobe Vorstellung vom Spiel bekommt. 
 * Man kann auf einen Button klicken und das Spiel somit starten.
 * Kamila Trinkenschuh
 * @04.02.2024
 */
public class MyWorld extends World
{
    // Deklaration von Variablen
    private GreenfootImage backgroundimg = new GreenfootImage("mars.png");
    private GreenfootSound backgroundMusic;
    private int timer = 0;
    private int spawnTime = 160;

    /**
     * Konstruktor: Initialisiert die Welt.
     * Setzt die Welt auf 1400*700 Pixel, fügt ein Objekt der Klasse backfirst hinzu.
     * Setzt ein Hintergrundbild und startet das Spiel automatisch mit Hintergrundmusik.
     */
    public MyWorld()
    {    
        super(1400, 700, 1); // Erstellt eine Welt mit den angegebenen Dimensionen
        addObject(new backfirst(), getWidth() / 2, getHeight() / 2); // Fügt ein Objekt der Klasse backfirst in die Mitte der Welt ein
        GreenfootImage image = new GreenfootImage(backgroundimg);
        image.scale(1400, 700); 
        setBackground(new GreenfootImage(image)); // Setzt das Hintergrundbild
        Greenfoot.start(); // Startet das Spiel
        backgroundMusic = new GreenfootSound("gpard.wav"); // Initialisiert die Hintergrundmusik
        backgroundMusic.play(); // Spielt die Hintergrundmusik ab
        timer++; // Erhöht die Zeit, und wenn timer == spawnTime, wird ein Startbutton in die Welt gesetzt
        if (timer == spawnTime){
            addObject(new starttt(this), getWidth() / 3, getHeight() / 4);
        }
    }

    /**
     * Act-Methode wird automatisch aufgerufen.
     * Hier wird der Timer erhöht, und wenn timer == spawnTime, werden ein Startbutton und eine Zeichenfolge in die Welt gesetzt.
     */
    public void act(){
        timer++;
        if (timer == spawnTime){
            addObject(new starttt(this), 250, 300); // Fügt einen Startbutton in die Welt ein
            addObject(new startlog(), getWidth() / 2, getHeight() / 2); // Fügt eine Zeichenfolge "Adventure Mars" in die Welt ein
        }
    }

    /**
     * Stoppt die Hintergrundmusik, wenn die Methode aufgerufen wird.
     */
    public void stopMusic() {
        if (backgroundMusic != null) {
            backgroundMusic.stop(); // Stoppt die Hintergrundmusik
        }
    }
}
