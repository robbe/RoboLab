package robot;

import lejos.nxt.*;
import lejos.robotics.navigation.*;

public class Robot {

	static final float WHEEL_DIAM = 5.5f; 
	static final float TRACK_W = 12f;
	static Pilot pil = new Pilot(WHEEL_DIAM,TRACK_W,Motor.A,Motor.B);
	
	public void travel() {
		pil.travel(40);
		
		/* TODO:
		 * 
		 * ActionListener für Sensorik einbauen
		 * 
		 */
		
	}
	
	public boolean isOnLine() {
		boolean online = true;
		
		/* TODO:
		 * 
		 * Logik zur Abfrage ob sich der Roboter
		 * noch auf der Linie befindet.
		 * 
		 * Wenn er die Linie verlässt:
		 * online = false;
		 * 
		 */
		
		return online;
	}
	
	/* TODO:
	 * 
	 * ActionListener
	 * -- offlineAction
	 * -- touchAction
	 * -- ultrasonicAction
	 * 
	 */
	
}
