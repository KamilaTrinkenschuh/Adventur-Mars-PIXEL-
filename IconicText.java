import greenfoot.*;

public class IconicText extends Actor {
    private String text;
    private int charIndex;
    private GreenfootImage textImage;
    private int timer = 0;
    private int spawnTime = 160;
    public IconicText(String text) {
        this.text = text;
        charIndex = 0;
        updateImage();
    }
    /**
     * Diese Klasse habe ich erzeugt, um das typische, oft verwendete Wiedergeben von einer Zeichenfolge auch in meinem Spiel möglich zu machen. 
     * Die Stringfolge text, welche man auf dem Bildschrim ausgeben lassen will, wird erst einmal in updateImage() initialisiert mit Farbe, Font, Größe, Positioin...
     * In act(), wenn charIndex == text.length(), dann ist das Wort fertig geschrieben, ansonsten wird das Wort Zeichen für Zeichen aufgeschreiben, bis nicht fertig
     * IcT ist gleich, nur habe ich dort die Farbe und Größe für eine andere Scene geändert
       */
    public void act() {
        if (charIndex < text.length()) {
            charIndex++;
            updateImage();
        }
    }

    private void updateImage() {
        GreenfootImage img = new GreenfootImage(500, 400);
        img.setColor(Color.BLACK);
        img.fillRect(0, 0, 0,0);
        img.setColor(Color.YELLOW);
        img.setFont(new Font("SEAGULL HUNT", true, false, 30));
        img.drawString(text.substring(0, charIndex), 0, 300);// Hier ist charIndex einer unserer Argumente, mit text.substring werden die Wörter in Zeichen (Tokens) aufgeteilt
        setImage(img);
    }
}