import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.gui.MouseOverArea;


public class Gameover {
	GameContainer currentgame;
	Score currentscore;
	private boolean startgame;
	private boolean gotomenu;
	
	private MouseOverArea TryAgain;
	private MouseOverArea Menu;
	
	public Gameover(GameContainer game, Score score){
		currentgame = game;
		currentscore = score;
		
		TryAgain = new MouseOverArea(game, IMAGES.GAMEOVER_HELLYEAH_BUTTON, 150, 450);
		Menu = new MouseOverArea(game, IMAGES.GAMEOVER_CHICKENOUT_BUTTON, 400, 450);
		
		TryAgain.setMouseOverColor(new Color(255, 0, 255));
		Menu.setMouseOverColor(new Color(255, 0, 255));
	}
	
	/**
	 * @return the startgame
	 */
	public boolean getStartgame() {
		return startgame;
	}

	/**
	 * @param startgame the startgame to set
	 */
	public void setStartgame(boolean startgame) {
		this.startgame = startgame;
	}

	/**
	 * @return the gotomenu
	 */
	public boolean getGotomenu() {
		return gotomenu;
	}

	/**
	 * @param gotomenu the gotomenu to set
	 */
	public void setGotomenu(boolean gotomenu) {
		this.gotomenu = gotomenu;
	}

	public void update(Input input, int delta)
	{
		if(input.isMousePressed(0)){
			if(TryAgain.isMouseOver()){
				setStartgame(true);
			}else if(Menu.isMouseOver()){
				setGotomenu(true);
			}else{
				
			}
		}
	}
	
	public void draw()
	{
		IMAGES.GAMEOVER_BACKGROUND.draw(0, 0);
		
		currentgame.getGraphics().drawString(currentscore.getScorePrintable(), GLOBAL.SCREEN_WIDTH - 500, 250);
		
		TryAgain.render(currentgame, currentgame.getGraphics());
		Menu.render(currentgame, currentgame.getGraphics());
	}
	
}
