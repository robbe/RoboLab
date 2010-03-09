package robot;

public class RobotControl {

	public static void main() throws InterruptedException {
		
		Robot rob = new Robot();
		
		/* Startet der Roboter auf der Linie? */
		if(!rob.isOnLine()) {
			/* Nein.
			 * Wir müssen die Linie suchen!
			 * 
			 * Ablauf:
			 *   Geradeausfahrten von 1/10 sec.
			 *   Nachsehen, ob die Linie erreicht wurde
			 *   ^ 10 mal wiederholen
			 *   
			 *   Drehen (welcher Winkel?!)
			 *   Alles wiederholen
			 * 
			 */
			while(!rob.isOnLine()) {
				for(int i = 0;i < 10; i++) {
					while(!rob.isOnLine())
						rob.travel();
				}
			
				rob.rotateLeft(90);
			}
			
		}
		
		/* Auf der Linie fahren. */
		while(rob.isOnLine() && !rob.hasTouchedRight() && !rob.hasTouchedLeft())
			rob.travel();
	
	}
	
}