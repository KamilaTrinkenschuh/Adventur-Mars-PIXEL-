
import greenfoot.*;  // Importiert die Greenfoot-Bibliothek

/**
 * Die Klasse "aster" repräsentiert eine Welt, in der das Spiel mit Asteroiden stattfindet.
 * 
 * @Kamila Trinkenschuh
 * @04.02.2024
 */
public class aster extends World
{
    // Initialisierung von Instanzvariablen
    public int x = Greenfoot.getRandomNumber(600); // Zufällige X-Koordinate für das Erscheinen von Herzen
    heart h1 = new heart(); // Erstellung von drei Herz-Objekten
    heart h2 = new heart();
    heart h3 = new heart();
    
    /**
     * Act-Methode wird automatisch aufgerufen.
     * Hier wird überprüft, ob ein zufälliges Ereignis (Greenfoot.getRandomNumber(50)==2) eintritt, und wenn ja, wird ein neues Objekt der Klasse asas erstellt und der Welt hinzugefügt.
     */
    public void act(){
        if(Greenfoot.getRandomNumber(50) == 2){
            addObject(new asas(), 100, 670); // Fügt ein neues Objekt der Klasse asas mit festgelegten Koordinaten in die Welt ein
        }
    }
    
    /**
     * Konstruktor für Objekte der Klasse "aster".
     * Hier wird eine neue Welt mit den angegebenen Dimensionen erstellt.
     * Ein Objekt der Klasse "walkastro" wird an einer festgelegten Position in die Welt eingefügt.
     */
    public aster()
    {    
        super(1400, 700, 1); // Erstellt eine Welt mit den angegebenen Dimensionen
        addObject(new walkastro(), 1000, 545); // Fügt ein Objekt der Klasse walkastro an den angegebenen Koordinaten in die Welt ein
    }
}
