import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws Exception{
		String sentence;
		String modifiedSentence;
		

		String T = "throttle ";
		String B = "brake ";
		int throttle=0;
		int brake= 0;
		//BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

		Communicator server = new Communicator(7000);
		SpeedLimits limits = new SpeedLimits();
		
		boolean a = true;
		Car car = new Car();
		throttle = 100;
		
		while (a) {
			car.update(server.readLine(3));
			System.out.println(server.readLine());
			server.readLine();

			//System.out.println(car.distance + " " + car.speed +" "+car.time);
			System.out.println(car.distance);
			if (car.distance>400){
				throttle=0;
				brake =100;
			}
			
			server.writeLine(T + throttle);
			server.writeLine(B + brake);
		}
		server.close();

	}
	
}
