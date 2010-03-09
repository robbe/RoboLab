package robot;

import lejos.nxt.*;

public class Robot {

	/* Eventuell muessen hier noch die Sensoren angepasst werden. */
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
	
	/* TODO:
	 * 
	 * Die Rotationen lassen sich sicher einfacher und eleganter lšsen, indem man eine Methode 
	 * "rotate(int degree) {...}"
	 * erstellt und die Richtung durch positive || negative Werte bestimmt.
	 * 
	 */
	public void rotateLeft(int deg) throws InterruptedException {
		
		int time = deg * 10;	// Der Wert muss noch angepasst werden, eventuell durch Ausprobieren
								// Masochisten kšnnen sich ja mal am Ausrechnen versuchen. Wert sollte durch Radgrš§e, Radabstand und Motorrotationsgeschwindigkeit ermittelbar sein.
		Motor.A.setPower(100);
		Motor.B.setPower(100);
		
		Motor.A.backward();
		Motor.B.forward();
		
		Thread.sleep(time);
		
		Motor.A.stop();
		Motor.B.stop();
		
	}
	
	public void rotateRight(int deg) throws InterruptedException {
		
		int time = deg * 10;	// Der Wert muss noch angepasst werden, eventuell durch Ausprobieren
								// Masochisten kšnnen sich ja mal am Ausrechnen versuchen. Wert sollte durch Radgrš§e, Radabstand und Motorrotationsgeschwindigkeit ermittelbar sein.
		Motor.A.setPower(100);
		Motor.B.setPower(100);
		
		Motor.B.backward();
		Motor.A.forward();
		
		Thread.sleep(time);
		
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
