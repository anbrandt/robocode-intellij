package asrobots;

import robocode.AdvancedRobot;
import robocode.Robot;
import robocode.TurnCompleteCondition;

/**
 * Created by adrian on 4/28/17.
 */
public class MySecondRobot extends AdvancedRobot {

	@Override
	public void run() {

		while (true) {

			while (true) {
				// Tell the game we will want to move ahead 40000 -- some large number
				setAhead(40000);

				// Tell the game we will want to turn right 90
				setTurnRight(90);
				// At this point, we have indicated to the game that *when we do something*,
				// we will want to move ahead and turn right.  That's what "set" means.
				// It is important to realize we have not done anything yet!
				// In order to actually move, we'll want to call a method that
				// takes real time, such as waitFor.
				// waitFor actually starts the action -- we start moving and turning.
				// It will not return until we have finished turning.
				waitFor(new TurnCompleteCondition(this));
				// Note:  We are still moving ahead now, but the turn is complete.
				// Now we'll turn the other way...
				setTurnLeft(180);
				// ... and wait for the turn to finish ...
				waitFor(new TurnCompleteCondition(this));
				// ... then the other way ...
				setTurnRight(180);
				// .. and wait for that turn to finish.
				waitFor(new TurnCompleteCondition(this));
				// then back to the top to do it all again
			}



		}
	}
}
