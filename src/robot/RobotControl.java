package robot;

public class RobotControl {

	public static void main() throws InterruptedException {
		
		Robot rob = new Robot();
		
		while(true) {	// Achtung: Endlosschleife!
			
			/* Auf der Linie fahren. */
			while(rob.isOnLine() && !rob.hasTouchedRight() && !rob.hasTouchedLeft())
				rob.travel();
			
			/* Robot stoppt - was soll getan werden? */
			if(!rob.isOnLine()) {
				
				// Tue etwas, damit der Roboter auf die Linie zurückfindet
				
			} else if(rob.hasTouchedLeft) {
				
				rob.rotateRight(90);
				
				// Hier kommt der Ultraschallsensor ins Spiel
				// Hindernis muss umfahren werden 
				
			} else if(rob.hasTouchedRight) {
				
				rob.rotateLeft(90);
				
				// Hier kommt der Ultraschallsensor ins Spiel
				// Hindernis muss umfahren werden 
				
			}
			
		}
	
	}

}