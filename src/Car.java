import org.newdawn.slick.Image;


public class Car extends Entity 
{
	public Car(Image image)
	{
		 super(image);
	}
	
	public double getScoreMultiplier(){
		return 1;
	}
}
