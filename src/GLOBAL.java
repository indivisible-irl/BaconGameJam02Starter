import org.newdawn.slick.Color;
//import org.newdawn.slick.Image;
//import org.newdawn.slick.SlickException;

/*
 * Reddit BaconGameJam - Aug 2012
 * Team maeT
 * 04/08/2012
 * 
 * Class to hold static global variables
 */

public class GLOBAL {
	// screen size
	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;

	// timing, when to increase the game's difficulty and score multiplier (ms)
	public static int DIFFICULTY_INCREASE_PERIOD = 80000; // 80 secs??
	
	// 
	public static final long ENTITY_DELAY = 2000;
	public static final long ENTITY_INCREMENT = 200;

	// Each frequency should be bigger than the previous and sum should equal 0
	//		The difference between is the weighting it gets
	public static final int HUMAN_FREQUENCY = 25;		// 25
	public static final int CAT_FREQUENCY = 45;			// 20
	public static final int BIRD_FREQUENCY = 70;		// 25
	public static final int CAR_FREQUENCY = 90;			// 20
	public static final int DO_NOTHING = 120;			// 30
	public static final int RANDOM_MAX = 120;			// max for random num gen			
	
	// images:
	public static final Color chromakey = new Color(255, 0, 255);
	
	public static final String BACKGROUND = "resources/background.png";
	public static final String CRAP = "resources/poop.png";
	
	public static final String BIRD_WHITE_1 = "resources/bird/white/01.png";
	public static final String BIRD_WHITE_2 = "resources/bird/white/02.png";
	public static final String BIRD_WHITE_3 = "resources/bird/white/03.png";
	public static final String BIRD_WHITE_4 = "resources/bird/white/04.png";
	public static final String BIRD_WHITE_5 = "resources/bird/white/05.png";
	
	public static final String BIRD_BROWN_1 = "resources/bird/brown/01.png";
	public static final String BIRD_BROWN_2 = "resources/bird/brown/02.png";
	public static final String BIRD_BROWN_3 = "resources/bird/brown/03.png";
	public static final String BIRD_BROWN_4 = "resources/bird/brown/04.png";
	public static final String BIRD_BROWN_5 = "resources/bird/brown/05.png";
	
	public static final String DUDE_WALK_1 = "resources/dude/walk/01.png";
	public static final String DUDE_WALK_2 = "resources/dude/walk/02.png";
	public static final String DUDE_WALK_3 = "resources/dude/walk/03.png";
	public static final String DUDE_WALK_4 = "resources/dude/walk/04.png";
	public static final String DUDE_WALK_5 = "resources/dude/walk/05.png";
	public static final String DUDE_WALK_6 = "resources/dude/walk/06.png";
	public static final String DUDE_WALK_7 = "resources/dude/walk/07.png";
	public static final String DUDE_WALK_8 = "resources/dude/walk/08.png";
	public static final String DUDE_WALK_9 = "resources/dude/walk/09.png";
	
	public static final String CAR_RED = "resources/cars/red.png";
	public static final String CAR_RED_WRECK = "resources/cars/red-wrecked.png";
	public static final String CAR_BLUE = "resources/cars/blue.png";
	public static final String CAR_BLUE_WRECK = "resources/cars/blue-wrecked.png";
	public static final String CAR_GREEN = "resources/cars/green.png";
	public static final String CAR_GREEN_WRECK = "resources/cars/green-wrecked.png";
	public static final String CAR_PURPLE = "resources/cars/purple.png";
	public static final String CAR_PURPLE_WRECK = "resources/cars/purple-wrecked.png";
	
	public static final String TREE_1 = "resources/static/tree1.png";
	public static final String TREE_2 = "resources/static/tree2.png";
	public static final String POLE_1 = "resources/static/pole.png";
	
	// scores:
	public static final double BASE_SCORE = 0.2;
	public static double MULTIPLIER_MULTIPLIER = 0.02;
}
