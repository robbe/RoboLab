package robot;

import lejos.nxt.*;
import lejos.robotics.navigation.*;

public class Robot {

	static final float WHEEL_DIAM = 5.6f; 
	static final float TRACK_W = 13f;
	static Pilot pil = new Pilot(WHEEL_DIAM, TRACK_W, Motor.A, Motor.B);
	
}
