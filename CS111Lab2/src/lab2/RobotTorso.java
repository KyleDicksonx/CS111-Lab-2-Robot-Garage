

package lab2;
import java.util.Random;
public class RobotTorso {
	private long seed = System.currentTimeMillis();
	private Random rand = new Random(seed);
	private int numArms;
	public RobotTorso() {
		this.numArms = rand.nextInt(10);	
	}
	public String toString() {
		String outputString = "Number of arms : " + this.numArms;
		return outputString;
	}
}
