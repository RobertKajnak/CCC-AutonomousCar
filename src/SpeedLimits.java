import java.nio.DoubleBuffer;

public class SpeedLimits {
	double currentLimit;
	double distance;
	double nextLimit;
	
	public void update(String attributes) {
			currentLimit = Double.parseDouble(attributes.split(" ")[1]);
			distance = Double.parseDouble(attributes.split(" ")[2]);
			nextLimit = Double.parseDouble(attributes.split(" ")[3]);
		
	}
}
