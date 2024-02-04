import greenfoot.*;  // Importiert die Greenfoot-Bibliothek

/**
 * Die Klasse "scene1" repräsentiert eine Welt, die eine Erzählung von Elon Musk enthält und dann zu einer anderen Welt (maze) wechselt.
 * 
 * @author (Dein Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class scene1 extends World
{
    // Deklaration von Instanzvariablen
    private GreenfootSound backgroundMusic;
    private int timer = 0; // Zählervariable für die act-Methode
    private int spawnTime = 20; // Zeitpunkt, ab dem verschiedene Aktionen gestartet werden

    /**
     * Konstruktor für Objekte der Klasse "scene1".
     * Hier wird eine neue Welt mit den angegebenen Dimensionen erstellt, ein Hintergrundbild gesetzt, ein Charakter hinzugefügt und Hintergrundmusik abgespielt.
     */
    public scene1()
    {    
        super(1300, 700, 1); // Erstellt eine Welt mit den angegebenen Dimensionen
        
        GreenfootImage image1 = new GreenfootImage("space.png"); // Hintergrundbild
        image1.scale(1300, 700);
        setBackground(new GreenfootImage(image1));
        
        addObject(new elonmusk1sc(), 1300, 500); // Fügt ein Objekt der Klasse elonmusk1sc an den angegebenen Koordinaten in die Welt ein
        backgroundMusic = new GreenfootSound("we-call-him-elon-musk (1).mp3"); // Hintergrundmusik
        backgroundMusic.play(); // Spielt die Hintergrundmusik ab
    }

    /**
     * Act-Methode wird automatisch aufgerufen.
     * Hier wird der Zähler timer erhöht, und je nach dessen Wert werden verschiedene Textnachrichten eingeblendet und entfernt, bis schließlich zu einer anderen Welt (maze) gewechselt wird.
     */
    public void act(){
        timer++;

        if (timer == spawnTime){
            addObject(new IconicText("Hello"), 900, 150); // Fügt einen Text "Hello" an den angegebenen Koordinaten in die Welt ein
        }

        // Wiederholen Sie den Prozess für verschiedene Textnachrichten und deren Entfernung
      
        if (timer == spawnTime+20){
            IconicText label1 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label1);
            
        }
        if (timer == spawnTime+40){
            addObject(new IconicText("My name is Elon Musk"),900, 150);

        }
        if (timer == spawnTime+60){

            IconicText label3 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label3);
        }
        if (timer == spawnTime+80){
            addObject(new IconicText("I made SpaceX"),900, 150);

        }
        if (timer == spawnTime+100){

            IconicText label4 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label4);
        }
        if (timer == spawnTime+120){
            addObject(new IconicText("And the rocket... "),900, 150);

        }
        if (timer == spawnTime+140){

            IconicText label5 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label5);
        }
        if (timer == spawnTime+160){
            addObject(new IconicText("You will fly ..."),900, 150);

        }
        if (timer == spawnTime+180){

            IconicText label6 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label6);
        }
        if (timer == spawnTime+200){
            addObject(new IconicText("to mars "),900, 150);

        }
        if (timer == spawnTime+220){

            IconicText label7 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label7);
        }
        if (timer == spawnTime+240){
            addObject(new IconicText("It's the Year 2035"),900, 150);

        }
        if (timer == spawnTime+260){

            IconicText label8 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label8);
        }
        if (timer == spawnTime+280){
            addObject(new IconicText("We are the first..."),900, 150);

        }
        if (timer == spawnTime+300){

            IconicText label9 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label9);
        }
        if (timer == spawnTime+320){
            addObject(new IconicText("to send humans to mars"),900, 150);

        }
        if (timer == spawnTime+340){

            IconicText label10 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label10);
        }
        if (timer == spawnTime+360){
            addObject(new IconicText("so you were choosen"),900, 150);

        }
        if (timer == spawnTime+380){

            IconicText label10 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label10);
        }
        if (timer == spawnTime+400){
            addObject(new IconicText("to be the first"),900, 150);

        }
        if (timer == spawnTime+420){

            IconicText label11 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label11);
        }
        if (timer == spawnTime+440){
            addObject(new IconicText("to step on..."),900, 150);

        }
        if (timer == spawnTime+460){

            IconicText label12 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label12);
        }
        if (timer == spawnTime+480){
            addObject(new IconicText("the surface of mars"),900, 150);

        }
        if (timer == spawnTime+500){

            IconicText label13 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label13);
        }
        if (timer == spawnTime+520){
            addObject(new IconicText("Let's begin!"),900, 150);

        }
        // Wechsel zur nächsten Welt (maze)
        if (timer == spawnTime + 540){
            IconicText label14 = (IconicText)getObjects(IconicText.class).get(0);
            removeObject(label14);
            Greenfoot.setWorld(new maze()); // Wechselt zur Welt "maze"
        }
    }
}

