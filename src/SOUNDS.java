import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;


public class SOUNDS {
	public static void playSound(String soundfile) throws SlickException{
		Sound theSound = new Sound(soundfile);
		theSound.play();
	}
	
	public static void playSound(Sound theSound) throws SlickException{
		theSound.play();
	}
	
	public static void loopSound(Sound theSound) throws SlickException{
		theSound.loop();
	}
	
	public static void stopSound(Sound theSound) throws SlickException{
		if(theSound.playing()){
			theSound.stop();
		}
	}
}
