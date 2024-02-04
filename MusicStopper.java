import greenfoot.*;

public class MusicStopper extends Actor {

    private GreenfootSound backgroundMusic;

    public MusicStopper(GreenfootSound music) {
        this.backgroundMusic = music;
    }

    public void act() {
        if (Greenfoot.mouseClicked(starttt.class)) {
            // Wenn die Musik vorhanden ist oder noch gespielt wird, soll sie mit moseClick von starttt stoppen
            if (backgroundMusic != null && backgroundMusic.isPlaying()) {
                backgroundMusic.stop();
            }
        }
    }
}
