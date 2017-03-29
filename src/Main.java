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
		
		int oldLimit = 0;
		
		while (a) {
			car.update(server.readLine(3));
			//System.out.println(server.readLine());
			limits.update(server.readLine());
			server.readLine();

			if (oldLimit!=limits.currentLimit){
				System.out.println(limits.currentLimit);
				oldLimit = (int)limits.currentLimit;
			}
			int optimal  = car.getThottle(limits.currentLimit,limits.nextLimit,limits.distance);
			
			server.writeLine(T + (optimal>0?optimal:0));
			server.writeLine(B + (optimal<0?-optimal:0));
		}
		server.close();

	}
	
}
