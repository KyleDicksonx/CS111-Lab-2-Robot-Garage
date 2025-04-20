/*
 * Kyle Dickson
 * 4/19/2025
 * RobotHead.java
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */

package lab2;
import java.util.Random;

public class RobotHead {
	
	//random object with seed as current time in nano
	private long seed = System.nanoTime();//NOTE: millis wern't fast enough and all my "random" numbers ended up the same
	private Random rand = new Random(seed);
	
	//eye color var
	private String eyeColor;
	
	//constructor method
	public RobotHead() {
		
		//random number 0-5 to choose eye color
		int randomEyeColorNumber = rand.nextInt(5);
		
		//sets eye color to one of the following
		//red,green,blue,yellow,pink,rainbow,debug message
		switch (randomEyeColorNumber) {
			case(0):
				this.eyeColor = "red";
				break;
			case(1):
				this.eyeColor = "green";
				break;
			case(2):
				this.eyeColor = "blue";
				break;
			case(3):
				this.eyeColor = "yellow";
				break;
			case(4):
				this.eyeColor = "pink";
				break;
			case(5):
				this.eyeColor = "rainbow";
				break;
			default:
				this.eyeColor = "Check for logic errors in eyeColor.";//note, this was in fact useful
		}
	}
	
	//tostring method
	public String toString() {
		//creates a string of eyeColor
		String outputString = "Eye color : " + this.eyeColor;
		//returns the eyeColor string
		return outputString;
	}
}
