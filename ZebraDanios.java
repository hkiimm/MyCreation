/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a zebra danios fish.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class ZebraDanios extends Thread//creates a new class
{
    Console c; //creates an instane variable

    public ZebraDanios ()  //class constructor
    {
	c = new Console ();
    }


    //Colours
    Color zebraBody = new Color (102, 255, 0); //bright green
    Color zebraShadow = new Color (132, 222, 2); //alien armpit
    Color stripes = new Color (0, 127, 255); //azure

    public void zebra ()
    {
	//array of local variable of x coordinates to the fishes lower tail
	int zebraFinX[] = {80, 60, 85};
	//array of local variable of y coordinates to the fishes lower tail
	int zebraFinY[] = {270, 285, 280};
	//aray of local variable of x coordinates of the fishes upper tail
	int zebraFin1X[] = {80, 60, 85};
	//array of local variable of y coordinates to the fishes upper tail
	int zebraFin1Y[] = {280, 265, 270};
	//aray of local variable of x coordinates of the fishes lower fin
	int zebraLowerFinX[] = {93, 103, 110};
	//array of local variable of y coordinates to the fishes lower fin
	int zebraLowerFinY[] = {282, 292, 282};
	//aray of local variable of x coordinates of the fishes shadow fin
	int zebraShadowX[] = {105, 114, 119};
	//array of local variable of y coordinates to the fishes shadow fin
	int zebraShadowY[] = {282, 290, 282};
	//aray of local variable of x coordinates of the fishes upper fin
	int zebraUpX[] = {95, 87, 115};
	//array of local variable of y coordinates to the fishes upper fin
	int zebraUpY[] = {268, 256, 268};

	c.setColor (zebraShadow);
	//shadow lower fin
	c.fillPolygon (zebraShadowX, zebraShadowY, 3);

	c.setColor (zebraBody);
	//body
	c.fillOval (80, 265, 50, 20);
	//tail
	c.fillPolygon (zebraFinX, zebraFinY, 3); //lower
	c.fillPolygon (zebraFin1X, zebraFin1Y, 3); //upper
	//lower fin
	c.fillPolygon (zebraLowerFinX, zebraLowerFinY, 3);
	//upper fin
	c.fillPolygon (zebraUpX, zebraUpY, 3);

	c.setColor (Color.white);
	//eyes
	c.fillOval (117, 270, 8, 10);

	c.setColor (Color.black);
	//black inside eye
	c.fillOval (119, 271, 6, 7);

	//gills
	c.drawArc (110, 268, 5, 12, 130, 100);
	c.drawArc (106, 268, 5, 12, 130, 100);

	c.setColor (stripes);
	//stripes
	c.drawLine (84, 279, 102, 279);
	c.drawLine (82, 276, 100, 276);
	c.drawLine (84, 273, 102, 273);
	c.drawLine (86, 270, 104, 270);
    }


    public ZebraDanios (Console con)
    {
	c = con;
	zebra ();
    }
}
