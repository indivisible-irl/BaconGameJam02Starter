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
	
	public Menu(GameContainer game)
	{
		setActive(true);
		
		Game = game;
		
		Play = new MouseOverArea(game, IMAGES.MENU_PLAY_BUTTON, 100, 100);
		Highscore = new MouseOverArea(game, IMAGES.MENU_HIGHSCORE_BUTTON, 200, 200);
		About = new MouseOverArea(game, IMAGES.MENU_ABOUT_BUTTON, 300, 300);
		Exit = new MouseOverArea(game, IMAGES.MENU_EXIT_BUTTON, 400, 400);
		
		Play.setMouseOverColor(new Color(255, 0, 255));
		Highscore.setMouseOverColor(new Color(255, 0, 255));
		About.setMouseOverColor(new Color(255, 0, 255));
		Exit.setMouseOverColor(new Color(255, 0, 255));
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
		if(input.isMousePressed(0)){
			if(Play.isMouseOver()){
				setStartgame(true);
			}else if(Highscore.isMouseOver()){
				
			}else if(About.isMouseOver()){
				
			}else if(Exit.isMouseOver()){
				
			}else{
				
			}
		}
	}
	
	public void draw()
	{
		Play.render(Game, Game.getGraphics());
		Highscore.render(Game, Game.getGraphics());
		About.render(Game, Game.getGraphics());
		Exit.render(Game, Game.getGraphics());
	}
	
	
}
