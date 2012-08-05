//import java.io.Serializable;


public class Highscores{

	private long[] scores = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	private int greaterThanThis;
	
	///////////////////////////////////////////////////////////////
	
	public long[] getHighscores(){
		return this.scores;
	}
	public void setHighscores(long[] scores){
		this.scores = scores;
	}
	
	///////////////////////////////////////////////////////////////
	
	private boolean compare(long num){
		Boolean isGreaterThan = false;
		greaterThanThis = -1;
		for (int i=0; i<scores.length; i++){
			if (num > scores[i]){
				greaterThanThis = i;
				isGreaterThan = true;
				System.out.println("HS: Greater than: " +greaterThanThis);
				break;
			}
		}
		return isGreaterThan;
	}
	
	private void addScore(long score){
		boolean firstRun = true;
		long lastNum = -1;
		for (int i=scores.length; i<greaterThanThis; i--){
			if (i == greaterThanThis){
				System.out.println("HS: Reached greater than: " +scores[i]);
				scores[i] = score;
			}
			if (firstRun){
				System.out.println("HS: First Run: " + scores[i]);
				lastNum = scores[i];
				firstRun = false;
				continue;
			} else {
				scores[i+1] = lastNum;
				lastNum = scores[i];
				System.out.println("HS: scores[i]: " +scores[i]+ "\n\tLastNum: " +lastNum);
			}
		}
	}
	
	public void add(long score){
		if(compare(score)){
			System.out.println("HS: compared and bigger");
			addScore(score);
		}
	}
	
	public void setScore(int index, long score){
		this.scores[index] = score;
	}
	
	////////////////////////////////////////////////////////////
	
	public Highscores(){
		
	}

}
