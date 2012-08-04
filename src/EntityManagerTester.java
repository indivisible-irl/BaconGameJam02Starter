import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
 
public class EntityManagerTester extends BasicGame
{
	static final int SCREEN_HEIGHT = 800;
	static final int SCREEN_WIDTH = 600;
	
	Background background = null;
	Bird bird;
	Human dude;
	Human otherDude;
	EntityManager entityManager;
	
    public EntityManagerTester()
    {
        super("Entity Manager Tester!");
    }
 
    @Override
    public void init(GameContainer gc) 
			throws SlickException 
	{
    	
    	background = new Background(new Image("resources/background.png"), new Image("resources/background.png"));
    	Color chromakey = new Color(255, 0, 255);
    	
    	Image[] ibird = {
    			new Image("resources/bird/white/01.png", chromakey), 
    			new Image("resources/bird/white/02.png", chromakey), 
    			new Image("resources/bird/white/03.png", chromakey), 
    			new Image("resources/bird/white/04.png", chromakey), 
    			new Image("resources/bird/white/05.png", chromakey)
    			};
    	bird = new Bird(ibird);   	
    	
    	
    	Image[] idude = {
    			new Image("resources/dude/walk/07.png", chromakey).getScaledCopy(1.7f), 
    			new Image("resources/dude/walk/06.png", chromakey).getScaledCopy(1.7f), 
    			new Image("resources/dude/walk/05.png", chromakey).getScaledCopy(1.7f),
    			new Image("resources/dude/walk/04.png", chromakey).getScaledCopy(1.7f),
    			new Image("resources/dude/walk/03.png", chromakey).getScaledCopy(1.7f),
    			new Image("resources/dude/walk/02.png", chromakey).getScaledCopy(1.7f),
    			new Image("resources/dude/walk/01.png", chromakey).getScaledCopy(1.7f)
    			};
    	dude = new Human(idude);
    	
    	otherDude = Human.getRandomlyPlacedHuman();
    	
    	entityManager = new EntityManager(bird);
    	entityManager.addEntity(dude);
    	entityManager.addEntity(otherDude);  
    	entityManager.addEntity(Human.getRandomlyPlacedHuman());
    }
 
    @Override
    public void update(GameContainer gc, int delta) 
			throws SlickException     
    {
    	Input input = gc.getInput();
    	
    	if(input.isKeyDown(Input.KEY_H)){
    		entityManager.addEntity(Human.getRandomlyPlacedHuman());
    	}
    	
    	background.update(delta);
    	entityManager.update(input, delta);
    	//bird.update(input, delta);
    	//dude.update(input, delta);
    	//otherDude.update(input, delta);
    }
    
    @Override
    public void render(GameContainer gc, Graphics g) 
			throws SlickException 
    {
    	background.draw();
    	entityManager.draw();
    	//bird.draw();
    	//dude.draw();
    	//otherDude.draw();
    }
 
    public static void main(String[] args) 
			throws SlickException
    {    	
         AppGameContainer app = new AppGameContainer(new EntityManagerTester());
 
         app.setDisplayMode(SCREEN_HEIGHT, SCREEN_WIDTH, false);
         app.setTargetFrameRate(60);
         app.start();
    }
}