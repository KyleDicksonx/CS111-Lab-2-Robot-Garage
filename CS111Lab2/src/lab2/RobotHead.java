package lab2;
import java.util.Random;
public class RobotHead {
	private long seed = System.currentTimeMillis();
	private Random rand = new Random(seed);
	
	private String eyeColor;
	
	public RobotHead() {
		int randomEyeColorNumber = rand.nextInt(5);
		
		switch (randomEyeColorNumber) {
			case(0):
				this.eyeColor = "red";
			case(1):
				this.eyeColor = "green";
			case(2):
				this.eyeColor = "blue";
			case(3):
				this.eyeColor = "yellow";
			case(4):
				this.eyeColor = "pink";
			case(5):
				this.eyeColor = "rainbow";
			default:
				this.eyeColor = "Check for logic errors in eyeColor.";//note, this was in fact useful somehow
		}
	}
	public String toString() {
		String outputString = "Eye color : " + this.eyeColor;
		return outputString;
	}
}
