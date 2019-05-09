/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a closing background.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Ending implements Runnable //creates a new class
{
    Console c; //creates an instane variable

    public void close ()
    {
	c.setColor (Color.black);
	//loop used to animate the closing
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.fillRect (0, 0, 0 + x, 500);

	    //delay
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setColor (Color.pink);
	c.setFont (new Font ("Calibri", 1, 50));
	c.drawString ("Thanks for watching...", 90, 220);
	c.drawString ("Lucas and his Fish Tank!", 80, 280);
    }


    public Ending (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()
    {
	close ();
    }
}
