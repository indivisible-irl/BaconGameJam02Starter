import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.gui.MouseOverArea;


public class Menu {
	private GameContainer Game;
	private boolean active;
	private boolean startgame;
	
	private MouseOverArea Play;
	private MouseOverArea Highscore;
	private MouseOverArea About;
	private MouseOverArea Exit;
	private MouseOverArea Back;
	
	private int whichscreen;
	
	public Menu(GameContainer game)
	{
		setActive(true);
		
		Game = game;
		
		Play = new MouseOverArea(game, IMAGES.MENU_PLAY_BUTTON, 270, 230);
		Highscore = new MouseOverArea(game, IMAGES.MENU_HIGHSCORE_BUTTON, 270, 320);
		About = new MouseOverArea(game, IMAGES.MENU_ABOUT_BUTTON, 270, 410);
		Exit = new MouseOverArea(game, IMAGES.MENU_EXIT_BUTTON, 270, 500);
		Back = new MouseOverArea(game, IMAGES.MENU_BACK_BUTTON, 560, 500);
		
		Play.setMouseOverColor(new Color(255, 0, 255));
		Highscore.setMouseOverColor(new Color(255, 0, 255));
		About.setMouseOverColor(new Color(255, 0, 255));
		Exit.setMouseOverColor(new Color(255, 0, 255));
		Back.setMouseOverColor(new Color(255, 0, 255));
		
		whichscreen = GLOBAL.MAIN_MENU;
	}
	
	/**
	 * @return active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the startgame
	 */
	public boolean getStartgame() {
		return startgame;
	}

	/**
	 * @param startgame set stargame
	 */
	public void setStartgame(boolean startgame) {
		this.startgame = startgame;
	}

	public void update(Input input, int delta)
	{
		if(whichscreen == GLOBAL.MAIN_MENU){
			if(input.isMousePressed(0)){
				if(Play.isMouseOver()){
					setStartgame(true);
				}else if(Highscore.isMouseOver()){
					
				}else if(About.isMouseOver()){
					whichscreen = GLOBAL.ABOUT_MENU;
				}else if(Exit.isMouseOver()){
					Game.exit();
				}else if(Back.isMouseOver()){
					whichscreen = GLOBAL.MAIN_MENU;
					System.out.println("BACK");
				}
			}
		}else if(whichscreen == GLOBAL.ABOUT_MENU){
			if(input.isMousePressed(0)){
				if(Back.isMouseOver()){
					whichscreen = GLOBAL.MAIN_MENU;
					System.out.println("BACK");
				}
		}
	}
	}
	
	public void draw()
	{
		if(whichscreen == GLOBAL.MAIN_MENU){
		IMAGES.MENU_BACKGROUND.draw(0, 0);
		
		Play.render(Game, Game.getGraphics());
		Highscore.render(Game, Game.getGraphics());
		About.render(Game, Game.getGraphics());
		Exit.render(Game, Game.getGraphics());
		}else if(whichscreen == GLOBAL.ABOUT_MENU){
			IMAGES.MENU_ABOUTBACKGROUND.draw(0, 0);
			Back.render(Game, Game.getGraphics());
		}
	}
	
	
}
