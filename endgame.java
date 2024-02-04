import greenfoot.*;  // Importiert die Greenfoot-Bibliothek

/**
 * Die Klasse "endgame" repräsentiert eine Welt, die am Ende des Spiels erscheint.
 * 
 * @Kamila Trinkenschuh
 * @04.02.2024
 */
public class endgame extends World
{
    // Deklaration von Instanzvariablen
    public int g = 0; // Zählervariable für die act-Methode
    public int g1 = 20; // Wert, bei dem eine Aktion ausgelöst wird (hier: Text entfernen)
    IconicText text1 = new IconicText("press c"); // Erstellung eines Textobjekts

    /**
     * Konstruktor für Objekte der Klasse "endgame".
     * Hier wird eine neue Welt mit den angegebenen Dimensionen erstellt.
     * Verschiedene Objekte der Klassen walkastro, obt und text1 werden in die Welt eingefügt.
     */
    public endgame()
    {    
        super(1400, 700, 1); // Erstellt eine Welt mit den angegebenen Dimensionen
        addObject(new walkastro(), 100, 545); // Fügt ein Objekt der Klasse walkastro an den angegebenen Koordinaten in die Welt ein
        addObject(new obt(), 1200, 600); // Fügt ein Objekt der Klasse obt an den angegebenen Koordinaten in die Welt ein
        addObject(text1, 1300, 100); // Fügt das Textobjekt an den angegebenen Koordinaten in die Welt ein
    }

    /**
     * Act-Methode wird automatisch aufgerufen.
     * Hier wird der Zähler g erhöht, und wenn g den Wert g1 erreicht, wird das Textobjekt aus der Welt entfernt.
     */
    public void act(){
        g++;
        if (g == g1){
            removeObject(text1); // Entfernt das Textobjekt aus der Welt
        }
    }
}

