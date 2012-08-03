
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
 
public class SimpleGame extends BasicGame
{
	Image background = null;
	
    public SimpleGame()
    {
        super("Bird Poop!");
    }
 
    @Override
    public void init(GameContainer gc) 
			throws SlickException 
	{
    	background = new Image("resources/BackgroundSample.jpg");
    }
 
    @Override
    public void update(GameContainer gc, int delta) 
			throws SlickException     
    {
 
    }
 
    public void render(GameContainer gc, Graphics g) 
			throws SlickException 
    {
    	background.draw(0, 0);
    }
 
    public static void main(String[] args) 
			throws SlickException
    {
    	System.out.print("Hello World");
    	
         AppGameContainer app = 
			new AppGameContainer(new SimpleGame());
 
         app.setDisplayMode(800, 600, false);
         app.start();
    }
}