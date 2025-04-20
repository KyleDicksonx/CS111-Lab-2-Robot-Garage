/*
 * Kyle Dickson
 * 4/19/2025
 * Robot.java
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
package lab2;
import java.util.Random;

public class Robot {
	
	//random object with seed as current time in nano
	private long seed = System.nanoTime();
	private Random rand = new Random(seed);
	
	//vars for the robot objects
	private RobotHead robotHead;
	private RobotTorso robotTorso;
	
	//static counter for the number of robots
	private static int numRobots = 0;
	
	//string for the serialID of the robot
	private String serialID;
	
	//constructor method
	public Robot() {
		//increment numRobots
		numRobots ++;
		
		//pick a random number 0-100000 for the serialID
		int randomIDNum = rand.nextInt(100_000);
		
		//sets the serialID
		this.serialID = "ArmyRobot" + randomIDNum;
		
		//creates objects for head and torso
		robotHead = new RobotHead();
		robotTorso = new RobotTorso();
		//System.out.println(serialID);
	}
	
	//copy method
	public Robot copy() {
		//creates a new robot object
		Robot robotCopy = new Robot();
		//sets the serialID of the copy to be equal to that of the copied robot
		robotCopy.setSerialID(serialID);
		return robotCopy;
	}
	
	//equals method
	public boolean equals(Robot robot) {
		//defaults isEqual to false
		boolean isEqual = false;
		//uses String's .equals to check if this and input serialIDs are equal
		if (this.serialID.equals(robot.serialID)) {
			isEqual = true;
		}
		return isEqual;
	}
	
	//tostring method
	public String toString() {
		//creates a string consisting of the serialID and all the other toString methods
		String outputString = "Serial ID: " + this.serialID + ", " + this.robotHead.toString() + ", " + this.robotTorso.toString();
		return outputString;
	}
	
	//serialID setter
	public void setSerialID(String serialID) {
		this.serialID = serialID;
	}
	
	//serialID getter
	public String getSerialID() {
		return this.serialID;
	}
	
	//numRobots getter
	public static int getNumRobots() {
		return numRobots;
	}
	
	
}
