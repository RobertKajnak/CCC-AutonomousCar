import java.nio.DoubleBuffer;

public class SpeedLimits {
	double currentLimit;
	double distance;
	double nextLimit;
	
	public void update(String[] attributes) {
			currentLimit = Double.parseDouble(attributes[0].split(" ")[1]);
			distance = Double.parseDouble(attributes[1].split(" ")[1]);
			nextLimit = Double.parseDouble(attributes[2].split(" ")[1]);
		
	}
}
