package robot;

import lejos.nxt.*;

public class Sonic {

	private UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S2);
	
	public void rotate(int degree) {
		Motor.C.rotate(degree);
	}
	
	public boolean echo() {
		
		boolean echoRecieved = false;
		
		sonic.continuous();
		if(sonic.getDistance() != 255)
			echoRecieved = true;
		
		return echoRecieved;
		
	}

}
