package robot;

import lejos.nxt.*;

public class RobotControl {

	final static Robot trash_E = new Robot();
	
	/* So sollte es ablaufen:
	 * 
	 * 
	 * 
	 * Main {
	 *   Wenn trash_E.getLichtSensorWert() < Grenzwert {
	 *     trash_E ist online
	 *   }
	 *   Wenn trash_E.getLichtSensorWert() > Grenzwert {
	 *     trash_E ist offline
	 *     finde die Linie
	 *   }
	 *   Folge der Linie
	 *   
	 * }
	 */
	
}
