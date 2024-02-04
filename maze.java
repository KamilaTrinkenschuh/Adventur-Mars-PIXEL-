import greenfoot.*;  // Importiert die Greenfoot-Bibliothek

/**
 * Die Klasse "maze" repräsentiert eine Welt für ein Spiel mit einem Countdown und einem Raketenstart.
 * 
 * @author (Dein Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class maze extends World
{
    // Deklaration von Instanzvariablen
    private int timer = 0; // Zählervariable für die act-Methode
    private int spawnTime = 20; // Zeitpunkt, ab dem verschiedene Aktionen gestartet werden
    private GreenfootSound backgroundMusic; // Hintergrundmusik für den Countdown
    private GreenfootSound back; // Soundeffekt für den Raketenstart

    /**
     * Konstruktor für Objekte der Klasse "maze".
     * Hier wird eine neue Welt mit den angegebenen Dimensionen erstellt.
     */
    public maze()
    {    
        super(1400, 700, 1); // Erstellt eine Welt mit den angegebenen Dimensionen
    }

    /**
     * Act-Methode wird automatisch aufgerufen.
     * Hier wird der Zähler timer erhöht, und je nach dessen Wert werden verschiedene Aktionen ausgeführt, wie das Anzeigen eines Countdowns und das Starten einer Rakete.
     */
    public void act(){
        timer++;

        if (timer == spawnTime){
            addObject(new IcT("Chapeter 1"), getWidth() / 2, getHeight() / 2); // Fügt einen Text "Chapeter 1" in die Welt ein
            backgroundMusic = new GreenfootSound("clock-tick.mp3"); // Initialisiert die Hintergrundmusik für den Countdown
            back = new GreenfootSound("ninjaghinisound.mp3"); // Initialisiert den Soundeffekt für den Raketenstart
            backgroundMusic.play(); // Spielt die Hintergrundmusik ab
        }

        // Countdown von 10 bis 1 mit jeweiliger Entfernung des vorherigen Countdown-Textes
        if (timer == spawnTime + 20){
            addObject(new IcT("10"), getWidth() / 2, getHeight() / 2);
            IcT label3 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label3);
        }
        // Wiederholen Sie den obigen Prozess für die Countdown-Zahlen 9 bis 1
       
        if (timer == spawnTime+20){
            
            addObject(new IcT("10"),getWidth() / 2, getHeight() /2);
            IcT label3 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label3);
        }
        if (timer == spawnTime+40){
            addObject(new IcT("9"),getWidth() / 2, getHeight() /2);
            IcT label4 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label4);
        }
        if (timer == spawnTime+60){
            addObject(new IcT("8"),getWidth() / 2, getHeight() /2);
            IcT label5 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label5);

        }
        if (timer == spawnTime+80){
            addObject(new IcT("7"),getWidth() / 2, getHeight() /2);
            IcT label6 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label6);
        }
        if (timer == spawnTime+100){
            addObject(new IcT("6"),getWidth() / 2, getHeight() /2);
            IcT label7 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label7);
        }
        if (timer == spawnTime+120){
            addObject(new IcT("5"),getWidth() / 2, getHeight() /2);
            IcT label8 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label8);
        }
        if (timer == spawnTime+140){
            addObject(new IcT("4"),getWidth() / 2, getHeight() /2);
            IcT label9 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label9);
        }
        if (timer == spawnTime+160){
            addObject(new IcT("3"),getWidth() / 2, getHeight() /2);
            IcT label10 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label10);
        }
        if (timer == spawnTime+180){
            addObject(new IcT("2"),getWidth() / 2, getHeight() /2);
            IcT label11 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label11);
        }
        if (timer == spawnTime+200){
            addObject(new IcT("1"),getWidth() / 2, getHeight() /2);
            IcT label12 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label12);
        }
         // Rakete und Aufforderung zum Drücken der Leertaste anzeigen
        if (timer == spawnTime + 220){
            IcT label12 = (IcT)getObjects(IcT.class).get(0);
            removeObject(label12);
            addObject(new rocket(), 700, 350);
            addObject(new IconicText("press space"), 1100, 150);
            back.play(); // Spielt den Soundeffekt für den Raketenstart ab
        }

        // Entfernen Sie die Aufforderung zum Drücken der Leertaste
        if (timer == spawnTime + 240){
            IconicText label13 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label13);
        }
    }
}
