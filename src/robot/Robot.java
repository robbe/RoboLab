package robot;

import lejos.nxt.*;

public class Robot {
	
	boolean hasTouchedLeft = false, hasTouchedRight = false;
                                                                    
	private TouchSensor touchl = new TouchSensor(SensorPort.S1);
	private TouchSensor touchr = new TouchSensor(SensorPort.S4);
	private LightSensor light = new LightSensor(SensorPort.S3);
	private UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S1);
	
	public void travel() throws InterruptedException {
		
		Motor.A.setPower(30);
		Motor.B.setPower(30);
		
		Motor.A.forward();
		Motor.B.forward();
		
		Thread.sleep(100);
		
		Motor.A.stop();
		Motor.B.stop();
		
	}
	
	public void moveBack(int distance) {
		
		int degree = 0 - distance;	// Wieviel Drehung ergibt wieviel Weg?
		
		Motor.A.rotate(degree);
		Motor.B.rotate(degree);
		
	}
	
	public void searchLine(int searchDeg) {
		Thread.sleep(100); //damit er etwas über die Linie hinausschiesst, und nicht darauf stehen bleibt.
		Motor.A.stop();
		Motor.B.stop();
		
		// nur ein szenario - drehung beginnt immer mit links! -> sollte allgemeiner formuliert werden
		
		rotateLeft(searchDeg);		// TODO: es muss eine Zeitbegrenzung eingebaut werden, sodass
			if (rob.isOnline()) 	// er sich nicht um 180° dreht - zb Methode rotationTime(); 
			{
				rob.travel();
			}
			else while (!rob.isOnline)
				{
				 Motor.A.stop();
				 Motor.B.stop();
				 rotateRight(720);
				}
		
		
		
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
		if(touchr.isPressed())
			hasTouchedRight = true;
		return hasTouchedRight;
	}

	public boolean hasTouchedLeft() {
		if(touchl.isPressed())
			hasTouchedLeft = true;
		return hasTouchedLeft;
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
