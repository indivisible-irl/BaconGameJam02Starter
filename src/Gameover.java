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
		
		TryAgain = new MouseOverArea(game, IMAGES.MENU_PLAY_BUTTON, 100, 100);
		Menu = new MouseOverArea(game, IMAGES.MENU_PLAY_BUTTON, 200, 200);
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
				
			}else{
				
			}
		}
	}
	
	public void draw()
	{
		TryAgain.render(currentgame, currentgame.getGraphics());
		Menu.render(currentgame, currentgame.getGraphics());
	}
	
}
