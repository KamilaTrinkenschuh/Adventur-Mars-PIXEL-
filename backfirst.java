import greenfoot.*;  // Importiert die Greenfoot-Bibliothek
import java.util.Timer;
import java.util.TimerTask;

/**
 * Die Klasse "backfirst" repräsentiert einen Hintergrund, der über die Zeit verblassen kann.
 * Diese Klasse habe ich aus dem Internet, also author !=Kamila Trinkenschuh :)
 */
public class backfirst extends Actor
{
    private int timer = 500; // Die Anfangszeit, nach der das Bild verblassen soll
    private double fadeSteps = 0.01; // Der Schritt, mit dem die Transparenz des Bildes verringert wird

    /**
     * Act-Methode wird automatisch aufgerufen.
     * Hier wird das Bild des Akteurs skaliert und über die Zeit verblassen gelassen.
     */
    public void act() {
        GreenfootImage myImage = getImage();
        myImage.scale(1300,700); // Skaliert das Bild auf die gewünschten Dimensionen

        if (timer > 0) {
            fadeOverTime(); // Ruft die Methode auf, um das Bild über die Zeit verblassen zu lassen
        } else {
            getWorld().removeObject(this); // Entfernt den Akteur aus der Welt, wenn die Zeit abgelaufen ist
        }
    }

    /**
     * Private Methode, um das Bild über die Zeit zu verblassen.
     */
    private void fadeOverTime() {
        double steps = fadeSteps;

        while (steps > 0 && timer > 0) {
            int currentAlpha = getImage().getTransparency(); // Aktuelle Transparenz des Bildes
            int newAlpha = (int) (currentAlpha * 0.99); // Neuer Transparenzwert, um das Bild zu verblassen
            getImage().setTransparency(newAlpha); // Setzt die Transparenz des Bildes entsprechend

            if (newAlpha <= 0) {
                getWorld().removeObject(this); // Entfernt den Akteur aus der Welt, wenn die Transparenz vollständig ist
                return;
            }

            steps = steps - 0.02; // Verringert die Schritte für den nächsten Durchlauf
            timer--; // Verringert die verbleibende Zeit
        }
    }
}

