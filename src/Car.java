import java.nio.DoubleBuffer;

public class Car {
	public double speed;
	public double distance;
	public double time;
	int throttle;
	int brake;
	private final static String T = "throttle ";
	private final static String B = "brake ";
	
	public String getThrottle() {
		return T + throttle;
	}

	public void setThrottle(int throttle) {
		this.throttle = throttle;
	}

	public String getBrake() {
		return B + brake;
	}

	public void setBrake(int brake) {
		this.brake = brake;
	}

	public void update (String [] attributes){
		speed = Double.parseDouble(attributes[0].split(" ")[1]);
		distance = Double.parseDouble(attributes[1].split(" ")[1]);
		time = Double.parseDouble(attributes[2].split(" ")[1]);
	}
	
}
