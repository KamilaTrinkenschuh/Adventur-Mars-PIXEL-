import greenfoot.*;

/**
 * Die Klasse "IcT" repräsentiert einen Schauspieler (Actor) für die Anzeige von Text mit einer Animation.
 * 
 * @author (Dein Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class IcT extends Actor {
    private String text; // Der vollständige Text, der angezeigt werden soll
    private int charIndex; // Der Index des aktuellen Zeichens im Text
    private GreenfootImage textImage; // Das Bild, das den Text darstellt
    private int timer = 0; // Zähler für die Aktualisierung des Texts
    private int spawnTime = 160; // Zeitpunkt, ab dem der Text angezeigt wird

    /**
     * Konstruktor für Objekte der Klasse "IcT".
     * Hier wird der Text initialisiert und das Bild für den Text erstellt.
     */
    public IcT(String text) {
        this.text = text;
        charIndex = 0;
        updateImage();
    }

    /**
     * Act-Methode wird automatisch aufgerufen.
     * Hier wird der Text animiert angezeigt, indem schrittweise Zeichen hinzugefügt werden.
     */
    public void act() {
        // Überprüfen, ob der Text noch nicht vollständig angezeigt wurde
        if (charIndex < text.length()) {
            charIndex++;
            updateImage(); // Aktualisiert das Bild mit dem neuen Text
        }
    }

    /**
     * Private Methode zur Aktualisierung des Bildes mit dem aktuellen Text.
     */
    private void updateImage() {
        GreenfootImage img = new GreenfootImage(700, 350); // Erstellt ein neues Bild mit den angegebenen Dimensionen
        img.setColor(Color.BLACK);
        img.fillRect(0, 0, 0, 0); // Füllt das Bild mit trasparenter Farbe
        img.setColor(Color.RED);
        img.setFont(new Font("SEAGULL HUNT", true, false, 100)); // Setzt die Schriftart und Größe
        img.drawString(text.substring(0, charIndex), 0, 300); // Zeichnet den Text bis zum aktuellen Index
        setImage(img); 
    }
}
