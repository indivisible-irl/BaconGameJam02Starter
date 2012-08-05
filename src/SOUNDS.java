import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;


public class SOUNDS {
	public static final Sound BIRD = makeSound("resources/sounds/bird.ogg");
	public static final Sound CAR = makeSound("resources/sounds/car.ogg");
	public static final Sound HUMAN = makeSound("resources/sounds/human.ogg");
	public static final Sound TREE = makeSound("resources/sounds/tree.ogg");
	
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
		
	public static Sound makeSound(String soundfile){
		Sound newsound = null;
		try {
			newsound = new Sound(soundfile);
		} catch (SlickException e) {
			e.printStackTrace();
		}
		return newsound;
	}
}
