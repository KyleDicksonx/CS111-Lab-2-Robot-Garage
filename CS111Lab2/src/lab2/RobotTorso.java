/*
 * Kyle Dickson
 * 4/19/2025
 * RobotTorso.java
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */

package lab2;
import java.util.Random;

public class RobotTorso {
	
	//random object with seed as current time in nano
	private long seed = System.nanoTime();//NOTE: millis wern't fast enough and all my "random" numbers ended up the same
	private Random rand = new Random(seed);
	
	//the number of arms on the robot
	private int numArms;
	
	//constructor method
	public RobotTorso() {
		//sets the number of arms to a random number between 0 and 10
		this.numArms = rand.nextInt(10);	
	}
	
	//toString method
	public String toString() {
		//creates a new string stating the number of arms
		String outputString = "Number of arms : " + this.numArms;
		//returns the output string
		return outputString;
	}
}
