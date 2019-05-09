/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output food dropping.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class FoodDrop implements Runnable //creates a new class
{
    private Console c; //creates an instance variabe

    public void drop ()
    {
	//local colour variable for the fish food
	Color fishFood = new Color (131, 105, 83); //pastel brown
	//local colour variable for the erase
	Color fishTank = new Color (124, 185, 232); //aero
	
	//loop used to animate the food
	for (int x = 0 ; x < 51 ; x++)
	{
	    c.setColor (fishTank);
	    //erase
	    c.fillRect (409, 141 + x, 9, 9);

	    c.setColor (fishFood);
	    //fish food in the middle
	    c.fillOval (410, 142 + x, 7, 7);

	    c.setColor (Color.black);
	    //redraw background
	    c.fillRect (408, 140, 11, 11);

	    //delay
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the food
	for (int x = 0 ; x < 132 ; x++)
	{ 
	    c.setColor (fishTank);
	    //erase
	    c.fillRect (429, 141 + x, 9, 9);

	    c.setColor (fishFood);
	    //fish food on the right
	    c.fillOval (430, 142 + x, 7, 7);

	    c.setColor (Color.black);
	    //redraw background
	    c.fillRect (428, 140, 11, 11);

	    //delay
	    try
	    {
		Thread.sleep (22);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public FoodDrop (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drop ();
    }
}


