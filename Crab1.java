/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This class is has 3 overloaded constructors.
The basic constructor creates the crab in a specific predetermined location.
The 2nd constructor allows a parameter pass to change the crabs color.
The 3rd constructor creates a crab with a specific color and a time delay to control the speed of its movement during the animation.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Crab1 extends Thread
{
    private Console c;
    private Color crabBody;
    private Color crabLegs;
    private int delay = 30;

    public void crabMoving ()
    {
	//local colour variable used for erase
	Color fishTank = new Color (124, 185, 232); //aero
	//local colour variable for the details
	Color detail = new Color (239, 187, 204); //cameo pink
	//local colour variable used for the rocks
	Color stone = new Color (128, 128, 128);  //grey

	//loop used to animate the crab
	for (int x = 0 ; x < 400 ; x++)
	{
	    //array of local variable of x coordinates to the crabs left long leg
	    int leftX[] = {441 - x, 438 - x, 448 - x};
	    //array of local variable of y coordinates to the crabs left long leg
	    int leftY[] = {402, 420, 402};
	    //array of local variable of x coordinates to the crabs right long leg
	    int rightX[] = {494 - x, 497 - x, 487 - x};
	    //array of local variable of y coordinates to the crabs right long leg
	    int rightY[] = {402, 420, 402};
	    //array of local variable of x coordinates to the crabs left long leg
	    int left1X[] = {445 - x, 442 - x, 451 - x};
	    //array of local variable of y coordinates to the crabs left long leg
	    int left1Y[] = {407, 420, 407};
	    //array of local variable of x coordinates to the crabs right short leg
	    int right1X[] = {490 - x, 493 - x, 484 - x};
	    //array of local variable of y coordinates to the crabs right short leg
	    int right1Y[] = {407, 420, 407};
	    //array of local variable of x coordinates to the crabs left arm
	    int armLX[] = {448 - x, 453 - x, 443 - x, 438 - x};
	    //array of local variable of y coordinates to the crabs left arm
	    int armLY[] = {395, 395, 385, 385};
	    //array of local variable of x coordinates to the crabs right arm
	    int armRX[] = {487 - x, 482 - x, 492 - x, 497 - x};
	    //array of local variable of y coordinates to the crabs right arm
	    int armRY[] = {395, 395, 385, 385};

	    c.setColor (fishTank);
	    //erase
	    c.fillRect (437 - x, 379, 62, 40);

	    c.setColor (crabLegs);
	    //left short legs
	    c.fillRect (448 - x, 407, 10, 5);
	    c.setColor (crabLegs);
	    c.fillPolygon (left1X, left1Y, 3);
	    //right short legs
	    c.setColor (crabLegs);
	    c.fillRect (478 - x, 407, 10, 5);
	    c.setColor (crabLegs);
	    c.fillPolygon (right1X, right1Y, 3);

	    c.setColor (crabBody);
	    //left arm
	    c.fillPolygon (armLX, armLY, 4);
	    c.setColor (crabBody);
	    //right arm
	    c.fillPolygon (armRX, armRY, 4);
	    c.setColor (crabBody);
	    //left long leg
	    c.fillRect (441 - x, 402, 12, 5);
	    c.setColor (crabBody);
	    c.fillPolygon (leftX, leftY, 3);
	    c.setColor (crabBody);
	    //right long leg
	    c.fillRect (482 - x, 402, 12, 5);
	    c.setColor (crabBody);
	    c.fillPolygon (rightX, rightY, 3);
	    c.setColor (crabBody);
	    //body of the crab
	    c.fillArc (448 - x, 375, 40, 40, 180, 180);
	    c.setColor (crabBody);
	    c.fillArc (448 - x, 390, 40, 15, 0, 180);

	    c.setColor (Color.white);
	    //eyes
	    c.fillOval (456 - x, 385, 10, 12);
	    c.setColor (Color.white);
	    c.fillOval (470 - x, 385, 10, 12);
	    c.setColor (Color.white);
	    //left claw
	    c.fillArc (438 - x, 380, 10, 10, 160, 280);
	    c.setColor (Color.white);
	    //right claw
	    c.fillArc (488 - x, 380, 10, 10, 100, 280);

	    c.setColor (Color.black);
	    //black inside eye
	    c.fillOval (457 - x, 387, 8, 10);
	    c.setColor (Color.black);
	    c.fillOval (471 - x, 387, 8, 10);
	    c.setColor (Color.black);
	    //mouth
	    c.drawArc (464 - x, 400, 6, 5, 180, 180);

	    c.setColor (detail);
	    //detail on cheeks
	    c.fillOval (451 - x, 395, 5, 5);
	    c.setColor (detail);
	    c.fillOval (481 - x, 395, 5, 5);

	    c.setColor (stone);
	    //left rock
	    c.fillArc (-83, 354, 208, 130, 0, 90);
	    c.setColor (stone);
	    //right rock
	    c.fillArc (424, 356, 150, 126, 90, 90);

	    //delay
	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //basic crab
    public Crab1 (Console con)
    {
	c = con;
	crabBody = new Color (255, 40, 0); //ferrari red
	crabLegs = new Color (206, 32, 41); //fire engine red
    }


    //crab with a Color parameter
    public Crab1 (Console con, Color n, Color m)
    {
	c = con;
	crabBody = n;
	crabLegs = m;
    }


    //crab with a Color parameter and a new delay time
    public Crab1 (Console con, Color n, Color m, int t)
    {
	c = con;
	crabBody = n;
	crabLegs = m;
	delay = t;
    }


    public void run ()
    {
	crabMoving ();
    }
}


