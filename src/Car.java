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

	public int getThottle(double speedLimit,double nextSpeedLimit, double distance){
		if (nextSpeedLimit==0)
			nextSpeedLimit=speedLimit;
		if (distance==0){
			distance =1000;
		}
		if (distance<(speed-nextSpeedLimit)*(speed-nextSpeedLimit)/3.6/3.6*5.833 + (speed) * 0.2/1.05/*speedLimit*2/3*/)
			if (speed>nextSpeedLimit)
				return -100;
			else {
				System.out.println("Distance remaining:" + distance);
				return 0;//((int)nextSpeedLimit - (int)speed)/3;
			}
		
		if (speedLimit-speed>speedLimit/60){
			if (speedLimit>50)
				if (speed<50 )
					return 75;
				else {
					return 18;
				}
				else
			return 20;
		}
		return ((int)speedLimit - (int)speed)/10;
	}
	
	public void update (String [] attributes){
		speed = Double.parseDouble(attributes[0].split(" ")[1]);
		distance = Double.parseDouble(attributes[1].split(" ")[1]);
		time = Double.parseDouble(attributes[2].split(" ")[1]);
	}
	
}
