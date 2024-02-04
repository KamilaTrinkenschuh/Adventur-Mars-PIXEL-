import greenfoot.*;  // Importiert die Greenfoot-Bibliothek

/**
 * Die Klasse "end" repräsentiert eine Welt, die am Ende des Spiels erscheint.
 * 
 * @Kamila Trinkenschuh
 * @04.02.2024
 */
public class end extends World
{
    // Deklaration von Instanzvariablen
    private GreenfootSound backgroundMusic;

    /**
     * Konstruktor für Objekte der Klasse "end".
     * Hier wird eine neue Welt mit den angegebenen Dimensionen erstellt.
     * Verschiedene Objekte der Klassen fd, circ, up, down werden in die Welt eingefügt.
     * Hintergrundmusik wird gestartet.
     */
    
    public end()
    {    
        super(1400, 700, 1); // Erstellt eine Welt mit den angegebenen Dimensionen
        addObject(new fd(), getWidth()/2, getHeight()/2); // Fügt ein Objekt der Klasse fd in die Mitte der Welt ein
        addObject(new circ(), 200, 350); // Fügt ein Objekt der Klasse circ an den angegebenen Koordinaten in die Welt ein
        addObject(new circ(), 1200, 350); // Fügt ein weiteres Objekt der Klasse circ an den angegebenen Koordinaten in die Welt ein
        addObject(new up(), 1200, 350); // Fügt ein Objekt der Klasse up an den angegebenen Koordinaten in die Welt ein
        addObject(new down(), 200, 350); // Fügt ein Objekt der Klasse down an den angegebenen Koordinaten in die Welt ein
        
        backgroundMusic = new GreenfootSound("mission-failed-well-get-em-next-time_n5JntMK.mp3"); // Initialisiert die Hintergrundmusik
        backgroundMusic.play(); // Spielt die Hintergrundmusik ab
    }
}

