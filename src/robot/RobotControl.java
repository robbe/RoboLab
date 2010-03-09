package robot;

public class RobotControl {

	public static void main() throws InterruptedException {
		
		Robot trash_E = new Robot();
		
		while(trash_E.isOnLine() && !trash_E.hasTouchedRight() && !trash_E.hasTouchedLeft()) {
			trash_E.travel();
		}
	
	}
	
}