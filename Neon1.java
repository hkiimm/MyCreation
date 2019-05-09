/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a neon tetra fish.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Neon1 extends Thread  //creates a new class
{
    private Console c; //creates an instane variable

    public void tetra ()
    {
	//local colour variable for the neon tetra
	Color body = new Color (125, 249, 255);  //electric blue
	//local colour variable for the detail stripe
	Color stripes = new Color (255, 40, 0); //ferrari red
	//local colour variable for the erase
	Color fishTank = new Color (124, 185, 232); //aero

	//loop used to animate the neon tetra swimming left
	for (int x = 0 ; x < 200 ; x++)
	{
	    //array of local variable of x coordinates to the fishes lower fin
	    int lowerFinX[] = {344 - x, 367 - x, 360 - x};
	    //array of local variable of y coordinates to the fishes lower fin
	    int lowerFinY[] = {368, 378, 368};
	    //array of local variable of x coordinates to the fishes upper fin
	    int upperFinX[] = {344 - x, 370 - x, 360 - x};
	    //array of local variable of y coordinates to the fishes upper fin
	    int upperFinY[] = {355, 340, 355};
	    //aray of local variable of x coordinates of the fishes upper tail
	    int fin1X[] = {372 - x, 402 - x, 382 - x};
	    //array of local variable of y coordinates to the fishes upper tail
	    int fin1Y[] = {353, 350, 363};
	    //aray of local variable of x coordinates of the fishes lower tail
	    int fin2X[] = {372 - x, 402 - x, 382 - x};
	    //array of local variable of y coordinates to the fishes lower tail
	    int fin2Y[] = {366, 368, 356};
	    //aray of local variable of x coordinates of the fishes red stripe
	    int stripeX[] = {372 - x, 402 - x, 372 - x};
	    //array of local variable of y coordinates to the fishes red stripe
	    int stripeY[] = {366, 368, 360};

	    //erase
	    c.setColor (fishTank);
	    c.fillRect (324 - x, 340, 78, 40);

	    c.setColor (body);
	    //body
	    c.fillOval (325 - x, 350, 60, 20);
	    c.setColor (body);
	    //upper tail
	    c.fillPolygon (fin1X, fin1Y, 3);
	    c.setColor (body);
	    //lower tail
	    c.fillPolygon (fin2X, fin2Y, 3);
	    c.setColor (body);
	    //lower fin
	    c.fillPolygon (lowerFinX, lowerFinY, 3);
	    c.setColor (body);
	    //upper fin
	    c.fillPolygon (upperFinX, upperFinY, 3);

	    c.setColor (Color.white);
	    //eyes
	    c.fillOval (335 - x, 355, 9, 11);

	    c.setColor (Color.black);
	    //black inside eye
	    c.fillOval (335 - x, 357, 6, 7);
	    //gills
	    c.setColor (Color.black);
	    c.drawArc (344 - x, 354, 5, 12, 310, 100);
	    c.setColor (Color.black);
	    c.drawArc (349 - x, 354, 5, 12, 310, 100);

	    c.setColor (stripes);
	    //stripes
	    c.fillPolygon (stripeX, stripeY, 3);
	    c.setColor (stripes);
	    c.fillRect (364 - x, 361, 8, 7);
	    c.setColor (stripes);
	    c.fillArc (360 - x, 361, 10, 8, 90, 180);

	    //delay
	    try
	    {
		sleep (19);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Neon1 (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()
    {
	tetra ();
    }
}


