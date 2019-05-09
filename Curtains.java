/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a an opening screen.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Curtains extends Thread //creates a new class
{
    Console c; //creates an instane variable

    public void open ()  
    {
	c.setColor (Color.black);
	//curtains open
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 0, x, 500);
	}

	c.setColor (Color.pink);
	c.setFont (new Font ("Calibri", 1, 50));
	c.drawString ("Lucas and his Fish Tank!", 80, 250);
	c.setFont (new Font ("Calibri", 1, 20));
	c.drawString ("By: Hannah Kim", 260, 300);

	//delay
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
    }


    public Curtains (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()
    {
	open ();
    }
}


