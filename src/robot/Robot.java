package robot;

import lejos.nxt.*;

public class Robot {

	public void move() {
		Motor.A.forward();
		Motor.B.forward();
	}
	
	public boolean isOnLine() {
		boolean onLine = true;
		LightSensor light = new LightSensor(SensorPort.S1);
		
		return onLine;
	}
	
}
