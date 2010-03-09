package robot;

import lejos.nxt.*;

public class Robot {

	private TouchSensor touchl = new TouchSensor(SensorPort.S1);
	private TouchSensor touchr = new TouchSensor(SensorPort.S2);
	private LightSensor light = new LightSensor(SensorPort.S3);
	private UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S4);
	
	public void travel() throws InterruptedException {
		
		Motor.A.setPower(30);
		Motor.B.setPower(30);
		
		Motor.A.forward();
		Motor.B.forward();
		
		Thread.sleep(100);
		
		Motor.A.stop();
		Motor.B.stop();
		
	}
	
	public boolean isOnLine() {
		boolean online = true;
		
		if(light.getLightValue() >= 50)
			online = false;
		
		return online;
	}
	
	public boolean hasTouchedRight() {
		return touchr.isPressed();
	}

	public boolean hasTouchedLeft() {
		return touchl.isPressed();
	}
	
	public boolean hasSonicEcho() {
		
		/* TODO:
		 * 
		 * SuperSonic KungFoo
		 * 
		 */
		
		return false;
	}
	
}
