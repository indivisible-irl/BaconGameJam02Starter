import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class IMAGES {
	
	public static final Image BACKGROUND = makeImage(GLOBAL.BACKGROUND);
	public static final Image CLOUDS = makeImage(GLOBAL.CLOUDS);
	public static final Image CRAP = makeImage(GLOBAL.CRAP);
	public static final Image SUN = makeImage(GLOBAL.SUN);
	

	public static final Image MENU_BACKGROUND = makeImage(GLOBAL.MENU_BACKGROUND);
	public static final Image MENU_ABOUTBACKGROUND = makeImage(GLOBAL.MENU_ABOUTBACKGROUND);
	public static final Image MENU_PLAY_BUTTON = makeImage(GLOBAL.MENU_PLAY_BUTTON);
	public static final Image MENU_ABOUT_BUTTON = makeImage(GLOBAL.MENU_ABOUT_BUTTON);
	public static final Image MENU_EXIT_BUTTON = makeImage(GLOBAL.MENU_EXIT_BUTTON);
	public static final Image MENU_HIGHSCORE_BUTTON = makeImage(GLOBAL.MENU_HIGHSCORE_BUTTON);
	
	public static final Image GAMEOVER_HELLYEAH_BUTTON = makeImage(GLOBAL.GAMEOVER_HELLYEAH_BUTTON);
	public static final Image GAMEOVER_CHICKENOUT_BUTTON = makeImage(GLOBAL.GAMEOVER_CHICKENOUT_BUTTON);
	public static final Image GAMEOVER_BACKGROUND = makeImage(GLOBAL.GAMEOVER_BACKGROUND);

	public static final Image DUDE_DEAD = makeImage(GLOBAL.DUDE_DEAD, GLOBAL.DUDE_SCALE);
	
	public static final Image TREE_1 =  makeImage(GLOBAL.TREE_1, GLOBAL.TREE_SCALE);
	public static final Image TREE_2 =  makeImage(GLOBAL.TREE_2, GLOBAL.TREE_SCALE);
	public static final Image POLE_1 =  makeImage(GLOBAL.POLE_1, GLOBAL.POLE_SCALE);
	
	public static final Image EGG_1 = makeImage(GLOBAL.EGG_1, GLOBAL.EGG_SCALE);
	public static final Image EGG_2 = makeImage(GLOBAL.EGG_2, GLOBAL.EGG_SCALE);
	public static final Image EGG_3 = makeImage(GLOBAL.EGG_3, GLOBAL.EGG_SCALE);
	public static final Image EGG_4 = makeImage(GLOBAL.EGG_4, GLOBAL.EGG_SCALE);
	public static final Image EGG_5 = makeImage(GLOBAL.EGG_5, GLOBAL.EGG_SCALE);
	
//	public static final Image SCORE_100 = makeImage(GLOBAL.SCORE_100, GLOBAL.SCORE_SCALE);
//	public static final Image SCORE_200 = makeImage(GLOBAL.SCORE_200, GLOBAL.SCORE_SCALE);
//	public static final Image SCORE_300 = makeImage(GLOBAL.SCORE_300, GLOBAL.SCORE_SCALE);
//	public static final Image SCORE_500 = makeImage(GLOBAL.SCORE_500, GLOBAL.SCORE_SCALE);
	
	///////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Get an array of unique Images for the evil bird
	 * @return
	 */
	public static Image[] getNewEnemy(){
		Image[] enemy = {
				makeImage(GLOBAL.BIRD_BROWN_1),
				makeImage(GLOBAL.BIRD_BROWN_2),
				makeImage(GLOBAL.BIRD_BROWN_3),
				makeImage(GLOBAL.BIRD_BROWN_4),
				makeImage(GLOBAL.BIRD_BROWN_5)
		};
		return enemy;
	}
	/**
	 * Get an array of unique Images for the birdy
	 * @return Image[]
	 */
	public static Image[] getNewBird(){
		Image[] bird = {
				makeImage(GLOBAL.BIRD_WHITE_1),
				makeImage(GLOBAL.BIRD_WHITE_2),
				makeImage(GLOBAL.BIRD_WHITE_3),
				makeImage(GLOBAL.BIRD_WHITE_4),
				makeImage(GLOBAL.BIRD_WHITE_5)
		};
		return bird;
	}
	/**
	 * Get an array of unique Images for the walking guy
	 * @return Image[]
	 */
	public static Image[] getNewDude(){
		Image[] dude = {
				makeImage(GLOBAL.DUDE_WALK_9, GLOBAL.DUDE_SCALE),
				makeImage(GLOBAL.DUDE_WALK_8, GLOBAL.DUDE_SCALE),
				makeImage(GLOBAL.DUDE_WALK_7, GLOBAL.DUDE_SCALE),
				makeImage(GLOBAL.DUDE_WALK_6, GLOBAL.DUDE_SCALE),
				makeImage(GLOBAL.DUDE_WALK_5, GLOBAL.DUDE_SCALE),
				makeImage(GLOBAL.DUDE_WALK_4, GLOBAL.DUDE_SCALE),
				makeImage(GLOBAL.DUDE_WALK_3, GLOBAL.DUDE_SCALE),
				makeImage(GLOBAL.DUDE_WALK_2, GLOBAL.DUDE_SCALE),
				makeImage(GLOBAL.DUDE_WALK_1, GLOBAL.DUDE_SCALE)
		};
		return dude;
	}
	/**
	 * Get an Image array of Egg images
	 * @return Image[]
	 */
	public static Image[] getNewEggs(){
		Image[] eggs = {
				EGG_1, EGG_2, EGG_3, EGG_4, EGG_5};
		return eggs;
	}
	/**
	 * Image array for the red flash when health lost
	 * @return Image[]
	 */
	public static Image[] getImpacts(){
		Image[] impacts = {
				makeImage(GLOBAL.IMPACT_92),
				makeImage(GLOBAL.IMPACT_85),
				makeImage(GLOBAL.IMPACT_75),
				makeImage(GLOBAL.IMPACT_60),
				makeImage(GLOBAL.IMPACT_45),
				makeImage(GLOBAL.IMPACT_30),
				makeImage(GLOBAL.IMPACT_15),
				makeImage(GLOBAL.IMPACT_60),
				makeImage(GLOBAL.IMPACT_45),
				makeImage(GLOBAL.IMPACT_30),
				makeImage(GLOBAL.IMPACT_15)
		};
		return impacts;
	}
	
	public static Image[] getScores100(){
		Image[] scores = {
				makeImage(GLOBAL.SCORE_100_100, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_90, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_80, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_70, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_60, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_50, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_40, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_30, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_20, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_100_10, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_00, GLOBAL.SCORE_SCALE)
		};
		return scores;
	}
	public static Image[] getScores200(){
		Image[] scores = {
				makeImage(GLOBAL.SCORE_200_100, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_90, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_80, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_70, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_60, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_50, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_40, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_30, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_20, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_200_10, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_00, GLOBAL.SCORE_SCALE)
		};
		return scores;
	}
	public static Image[] getScores300(){
		Image[] scores = {
				makeImage(GLOBAL.SCORE_300_100, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_90, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_80, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_70, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_60, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_50, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_40, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_30, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_20, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_300_10, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_00, GLOBAL.SCORE_SCALE)
		};
		return scores;
	}
	public static Image[] getScores500(){
		Image[] scores = {
				makeImage(GLOBAL.SCORE_500_100, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_90, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_80, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_70, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_60, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_50, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_40, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_30, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_20, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_500_10, GLOBAL.SCORE_SCALE),
				makeImage(GLOBAL.SCORE_00, GLOBAL.SCORE_SCALE)
		};
		return scores;
	}
//	/**
//	 * Get the set of score images
//	 * @return Image[]
//	 */
//	public static Image[] getScores(){
//		Image[] scores = {
//				makeImage(GLOBAL.SCORE_100, GLOBAL.SCORE_SCALE),
//				makeImage(GLOBAL.SCORE_200, GLOBAL.SCORE_SCALE),
//				makeImage(GLOBAL.SCORE_300, GLOBAL.SCORE_SCALE),
//				makeImage(GLOBAL.SCORE_500, GLOBAL.SCORE_SCALE)
//		};
//		return scores;
//	}
	
	///////////////////////////////////////////////////
	
	/**
	 * Method to create an Image object and return it
	 * @param fileLocation
	 * @return Image
	 */
	public static Image makeImage(String fileLocation){
		Image img = null;
		try {
			img = new Image(fileLocation);
		} catch (SlickException e) {
			System.out.println("Unable to create Image: " + fileLocation);
		}
		return img;
	}
	/**
	 * Method to create an Image object and return it
	 * @param fileLocation, imageScale
	 * @return Image
	 */
	public static Image makeImage(String fileLocation, float scale){
		Image img = null;
		try {
			img = new Image(fileLocation).getScaledCopy(scale);
		} catch (SlickException e) {
			System.out.println("Unable to create Image: " + fileLocation);
		}
		return img;
	}
}

