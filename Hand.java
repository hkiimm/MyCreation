/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a hand moving fish food.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Hand extends Thread //creates a new class
{
    private Console c; //creates an instane variable

    public void hand ()
    {
	//local colour variable for the hand
	Color skin = new Color (255, 218, 185); //peach puff
	//local colour variable for the shadows
	Color lines = new Color (204, 153, 102); //brown yellow

	//loop used to animate the hand in
	for (int x = 0 ; x < 400 ; x++)
	{
	    //array of local variable of x coordinates to the diagonal section
	    int handX[] = {745 - x, 765 - x, 765 - x};
	    //array of local variable of y coordinates to the diagonal section
	    int handY[] = {40, 35, 50};

	    c.setColor (Color.white);
	    c.fillRect (739 - x, 19, 322, 112);

	    c.setColor (skin);
	    //hand
	    c.fillRect (745 - x, 40, 20, 75);
	    c.setColor (skin);
	    c.fillArc (740 - x, 40, 10, 75, 90, 180);
	    c.setColor (skin);
	    c.fillArc (745 - x, 110, 30, 10, 180, 180);
	    c.setColor (skin);
	    c.fillArc (755 - x, 100, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (755 - x, 80, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (755 - x, 60, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (755 - x, 35, 21, 24, 270, 180);
	    c.setColor (skin);
	    c.fillPolygon (handX, handY, 3);
	    //arm
	    c.setColor (skin);
	    c.fillRect (855 - x, 50, 210, 60);

	    c.setColor (lines);
	    //grooves on the hand
	    c.drawLine (742 - x, 95, 765 - x, 100);
	    c.setColor (lines);
	    c.drawLine (740 - x, 75, 765 - x, 80);
	    c.setColor (lines);
	    c.drawLine (742 - x, 55, 765 - x, 60);


	    //delay
	    try
	    {
		sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the hand up
	for (int x = 0 ; x < 30 ; x++)
	{
	    //array of local variable of x coordinates to the diagonal section
	    int handX[] = {345, 365, 365};
	    //array of local variable of y coordinates to the diagonal section
	    int handY[] = {40 - x, 35 - x, 50 - x};

	    c.setColor (Color.white);
	    c.fillRect (339, 19 - x, 322, 113);

	    c.setColor (skin);
	    //hand
	    c.fillRect (345, 40 - x, 20, 75);
	    c.setColor (skin);
	    c.fillArc (340, 40 - x, 10, 75, 90, 180);
	    c.setColor (skin);
	    c.fillArc (345, 110 - x, 30, 10, 180, 180);
	    c.setColor (skin);
	    c.fillArc (355, 100 - x, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355, 80 - x, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355, 60 - x, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355, 35 - x, 21, 24, 270, 180);
	    c.setColor (skin);
	    c.fillPolygon (handX, handY, 3);
	    //arm
	    c.setColor (skin);
	    c.fillRect (455, 50 - x, 210, 60);

	    c.setColor (lines);
	    //grooves on the hand
	    c.drawLine (342, 95 - x, 365, 100 - x);
	    c.setColor (lines);
	    c.drawLine (340, 75 - x, 365, 80 - x);
	    c.setColor (lines);
	    c.drawLine (342, 55 - x, 365, 60 - x);

	    //delay
	    try
	    {
		sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the hand down
	for (int x = 0 ; x < 30 ; x++)
	{
	    //array of local variable of x coordinates to the diagonal section
	    int handX[] = {345, 365, 365};
	    //array of local variable of y coordinates to the diagonal section
	    int handY[] = {10 + x, 5 + x, 20 + x};

	    c.setColor (Color.white);
	    c.fillRect (339, -11 + x, 322, 113);

	    c.setColor (skin);
	    //hand
	    c.fillRect (345, 10 + x, 20, 75);
	    c.setColor (skin);
	    c.fillArc (340, 10 + x, 10, 75, 90, 180);
	    c.setColor (skin);
	    c.fillArc (345, 80 + x, 30, 10, 180, 180);
	    c.setColor (skin);
	    c.fillArc (355, 70 + x, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355, 50 + x, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355, 30 + x, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355, 5 + x, 21, 24, 270, 180);
	    c.setColor (skin);
	    c.fillPolygon (handX, handY, 3);
	    //arm
	    c.setColor (skin);
	    c.fillRect (455, 20 + x, 210, 60);

	    c.setColor (lines);
	    //grooves on the hand
	    c.drawLine (342, 65 + x, 365, 70 + x);
	    c.setColor (lines);
	    c.drawLine (340, 45 + x, 365, 50 + x);
	    c.setColor (lines);
	    c.drawLine (342, 25 + x, 365, 30 + x);

	    //delay
	    try
	    {
		sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the hand out
	for (int x = 0 ; x < 400 ; x++)
	{
	    //array of local variable of x coordinates to the diagonal section
	    int handX[] = {345 + x, 365 + x, 365 + x};
	    //array of local variable of y coordinates to the diagonal section
	    int handY[] = {40, 35, 50};

	    c.setColor (Color.white);
	    c.fillRect (339 + x, 19, 322, 112);

	    c.setColor (skin);
	    //hand
	    c.fillRect (345 + x, 40, 20, 75);
	    c.setColor (skin);
	    c.fillArc (340 + x, 40, 10, 75, 90, 180);
	    c.setColor (skin);
	    c.fillArc (345 + x, 110, 30, 10, 180, 180);
	    c.setColor (skin);
	    c.fillArc (355 + x, 100, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355 + x, 80, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355 + x, 60, 21, 19, 270, 180);
	    c.setColor (skin);
	    c.fillArc (355 + x, 35, 21, 24, 270, 180);
	    c.setColor (skin);
	    c.fillPolygon (handX, handY, 3);
	    //arm
	    c.setColor (skin);
	    c.fillRect (455 + x, 50, 210, 60);

	    c.setColor (lines);
	    //grooves on the hand
	    c.drawLine (342 + x, 95, 365 + x, 100);
	    c.setColor (lines);
	    c.drawLine (340 + x, 75, 365 + x, 80);
	    c.setColor (lines);
	    c.drawLine (342 + x, 55, 365 + x, 60);

	    //delay
	    try
	    {
		sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Hand (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()
    {
	hand ();
    }
}
