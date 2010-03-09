import lejos.nxt.*;
import lejos.robotics.navigation.Pilot;

public class RobotRun {
	 
public static void main(String[] args) 
{
	Roboter myRobo = new Roboter();
	
	SensorPort.S3.activate();
	int schwarz = SensorPort.S3.readValue();
	
	while (myRobo.aufLinie() == true)
	{
		myRobo.move();
	}
	
	if (SensorPort.S3.readValue() > schwarz)
	{
		myRobo.stop();
		rotate(360);
		if (SensorPort.S3.readValue() > schwarz)
		{
			myRobo.stop();
			myRobo.move();
		}
		else{
			rotate(-360);
			if(SensorPort.S3.readValue() > schwarz){
				myRobo.stop
			}
		}
		
			
                               
	}
}
}
