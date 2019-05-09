/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a zebra danios fish.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Zebra1 extends Thread //creates a new class
{
    private Console c; //creates an instane variable

    public void zebra ()
    {
	//local colour variable for zebra danios
	Color zebraBody = new Color (102, 255, 0); //bright green
	//local colour variable for shadow fin
	Color zebraShadow = new Color (132, 222, 2); //alien armpit
	//local colour variable for stripes
	Color stripes = new Color (0, 127, 255); //azure
	//local colour variable for the erase
	Color fishTank = new Color (124, 185, 232); //aero
	
	//loop used to animate the zebra danios swimming left
	for (int x = 0 ; x < 350 ; x++)
	{
	    //array of local variable of x coordinates to the fishes lower tail
	    int zebraFinX[] = {80 + x, 60 + x, 85 + x};
	    //array of local variable of y coordinates to the fishes lower tail
	    int zebraFinY[] = {270, 285, 280};
	    //aray of local variable of x coordinates of the fishes upper tail
	    int zebraFin1X[] = {80 + x, 60 + x, 85 + x};
	    //array of local variable of y coordinates to the fishes upper tail
	    int zebraFin1Y[] = {280, 265, 270};
	    //aray of local variable of x coordinates of the fishes lower fin
	    int zebraLowerFinX[] = {93 + x, 103 + x, 110 + x};
	    //array of local variable of y coordinates to the fishes lower fin
	    int zebraLowerFinY[] = {282, 292, 282};
	    //aray of local variable of x coordinates of the fishes shadow fin
	    int zebraShadowX[] = {105 + x, 114 + x, 119 + x};
	    //array of local variable of y coordinates to the fishes shadow fin
	    int zebraShadowY[] = {282, 290, 282};
	    //aray of local variable of x coordinates of the fishes upper fin
	    int zebraUpX[] = {95 + x, 87 + x, 115 + x};
	    //array of local variable of y coordinates to the fishes upper fin
	    int zebraUpY[] = {268, 256, 268};

	    //erase
	    c.setColor (fishTank);
	    c.fillRect (59 + x, 255, 72, 38);

	    c.setColor (zebraShadow);
	    //shadow lower fin
	    c.fillPolygon (zebraShadowX, zebraShadowY, 3);

	    c.setColor (zebraBody);
	    //body
	    c.fillOval (80 + x, 265, 50, 20);
	    c.setColor (zebraBody);
	    //lower tail
	    c.fillPolygon (zebraFinX, zebraFinY, 3);
	    c.setColor (zebraBody);
	    //upper tail
	    c.fillPolygon (zebraFin1X, zebraFin1Y, 3);
	    c.setColor (zebraBody);
	    //lower fin
	    c.fillPolygon (zebraLowerFinX, zebraLowerFinY, 3);
	    c.setColor (zebraBody);
	    //upper fin
	    c.fillPolygon (zebraUpX, zebraUpY, 3);

	    c.setColor (Color.white);
	    //eyes
	    c.fillOval (117 + x, 270, 8, 10);

	    c.setColor (Color.black);
	    //black inside eye
	    c.fillOval (119 + x, 271, 6, 7);
	    //gills
	    c.setColor (Color.black);
	    c.drawArc (110 + x, 268, 5, 12, 130, 100);
	    c.setColor (Color.black);
	    c.drawArc (106 + x, 268, 5, 12, 130, 100);

	    c.setColor (stripes);
	    //stripes
	    c.drawLine (84 + x, 279, 102 + x, 279);
	    c.setColor (stripes);
	    c.drawLine (82 + x, 276, 100 + x, 276);
	    c.setColor (stripes);
	    c.drawLine (84 + x, 273, 102 + x, 273);
	    c.setColor (stripes);
	    c.drawLine (86 + x, 270, 104 + x, 270);

	    //delay
	    try
	    {
		sleep (28);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Zebra1 (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()
    {
	zebra ();
    }
}
