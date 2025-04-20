package lab2;

public class RobotGarage {
	public static void main(String[] args) {
		Robot[] robotList = new Robot[3];
		
		robotList[0] = new Robot();
		robotList[1] = new Robot();
		robotList[2] = robotList[1].copy();
		
		System.out.println(robotList[0].toString());
		System.out.println(robotList[1].toString());
		System.out.println(robotList[2].toString());
		
		System.out.println("Total robot count : " + Robot.getNumRobots());
		
		if(robotList[0].equals(robotList[1])){
			System.out.println("Robot 1 and 2 are the same.");
		}
		if(robotList[1].equals(robotList[2])){
			System.out.println("Robot 2 and 3 are the same.");
		}
		if(robotList[0].equals(robotList[2])){
			System.out.println("Robot 1 and 3 are the same.");
		}
		
	}
}
