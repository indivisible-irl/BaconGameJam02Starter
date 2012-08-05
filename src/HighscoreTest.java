
public class HighscoreTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Highscores hs = new Highscores();
		hs.setScore(0, 1000000);
		hs.setScore(1, 111111);
		hs.setScore(2, 22222);
		hs.setScore(3, 3333);
		hs.setScore(4, 444);
		
		hs.add(23456);
		
		for (int i=0; i<hs.getHighscores().length; i++){
			System.out.println(i+1 +": "+ hs.getHighscores()[i]);
		}
	}

}
