package lab2;
import java.util.Random;
public class Robot {
	private long seed = System.currentTimeMillis();
	private Random rand = new Random(seed);
	private RobotHead robotHead;
	private RobotTorso robotTorso;
	private static int numRobots = 0;
	
	private String serialID;
	
	public Robot() {
		numRobots ++;
		int randomIDNum = rand.nextInt(100_000);
		this.serialID = "ArmyRobot" + randomIDNum;
		robotHead = new RobotHead();
		robotTorso = new RobotTorso();
		//System.out.println(serialID);
	}
	
	public Robot copy() {
		Robot robotCopy = new Robot();
		robotCopy.setSerialID(serialID);
		return robotCopy;
	}
	
	public boolean equals(Robot robot) {
		boolean isEqual = false;
		if (this.serialID.equals(robot.serialID)) {
			isEqual = true;
		}
		return isEqual;
	}
	
	
	public String toString() {
		String outputString = "Serial ID: " + this.serialID + ", " + this.robotHead.toString() + ", " + this.robotTorso.toString();
		return outputString;
	}
	
	public void setSerialID(String serialID) {
		this.serialID = serialID;
	}
	
	public String getSerialID() {
		return this.serialID;
	}
	
	public static int getNumRobots() {
		return numRobots;
	}
	
	
}
