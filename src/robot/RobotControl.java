package robot;

public class RobotControl {

	public static void main() throws InterruptedException {
		
		Robot rob = new Robot();
		Sonic son = new Sonic();
		
		while(true) {	// Achtung: Endlosschleife!
			
			/* Auf der Linie fahren. */
			while(rob.isOnLine() && !rob.hasTouched())
				rob.travel();
			
			/* Robot stoppt - was soll getan werden? */
			/* Stopp, weil nicht auf der Linie */
			if(!rob.isOnLine()) {
				
				// Tue etwas, damit der Roboter auf die Linie zurückfindet
				// Hier muss ein bisschen KungFoo rein, damit wir die gestrichelte
				// Linie schaffen ...
				
			/* Stopp, weil Hindernis */
			} else if(rob.hasTouched) {
				
				rob.moveBack(200);			// ca. 4cm rueckwaerts bewegen
				rob.rotateRight(90);		// 90° Drehung des Roboters nach rechts
				
				son.rotate(-90);			// 90° Drehung des USonic-Sensors nach links
				while(!rob.isOnLine()) {	// Sonlange er die Linie nicht gefunden hat
					
					while(son.echo()) {		// ... aber ein Echo erhält
						rob.travel();		// faehrt er geradeaus
					}
											// Kein Echo?
					rob.rotateLeft(5);		// 5° Drehung des Roboters nach links
											// Suche nach neuem Echo oder Linie
				}
				
			}
			
		}
	
	}

}