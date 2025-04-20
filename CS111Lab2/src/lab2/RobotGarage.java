/*
 * Kyle Dickson
 * 4/19/2025
 * RobotGarage.java
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
package lab2;

public class RobotGarage {
	public static void main(String[] args) {
		
		//array of 3 robot objects
		Robot[] robotList = new Robot[3];
		
		//creates new random robots for [0] and [1]
		robotList[0] = new Robot();
		robotList[1] = new Robot();
		
		//creates a copy of [1] and sets it as [2]
		robotList[2] = robotList[1].copy();
		
		//to string methods for [0] [1] [2] and output to console
		System.out.println(robotList[0].toString());
		System.out.println(robotList[1].toString());
		System.out.println(robotList[2].toString());
		
		//calls the getter for numRobots and output to console
		System.out.println("Total robot count : " + Robot.getNumRobots());
		
		//checks to see if any robots are equal to one another and prints the result to console if any are equal
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
