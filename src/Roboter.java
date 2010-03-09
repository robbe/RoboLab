import lejos.nxt.Motor;
import lejos.nxt.SensorPort;


public class Roboter {
	private int schwarz;
	
	public void move()
	{
		Motor.A.forward();
		Motor.B.forward();	
	}
	
	public void stop()
	{
		Motor.A.stop();
		Motor.B.stop();
	}
		
	
	
	public boolean aufLinie() 		// Ueberprüfung ob Lichtsensor die Linie sieht
	{
		return SensorPort.S3.readValue() <= schwarz;
	}

}
