package asrobots;

import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 * Created by adrian on 4/28/17.
 */
public class MyRobot extends Robot {

	public double getSinus() {
		return Math.sin(Math.toRadians(myVar));
	}
	private int myVar = 0;

	@Override
	public void run() {

		while (true) {

			ahead(50);
			double temp = 50 * getSinus();
			System.out.println(temp);

			turnRight(temp);
			turnRadarLeft(180);
			back(100);
			fire(3);
			turnRadarRight(180);

			myVar ++;
			if(myVar > 360)
				myVar = 0;
		}

	}
	public void onScannedRobot(ScannedRobotEvent event) {
		scan();
		System.out.println("Im in scanned metho");
		super.onScannedRobot(event);
	}


}