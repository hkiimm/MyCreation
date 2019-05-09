/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a neon tetra fish.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class NeonTetra extends Thread //creates a new class
{
    Console c; //creates an instane variable

    public NeonTetra ()  //class constructor
    {
	c = new Console ();
    }


    //Colours
    Color body = new Color (125, 249, 255);  //electric blue
    Color stripes = new Color (255, 40, 0); //ferrari red

    public void tetra ()
    {
	//array of local variable of x coordinates to the fishes lower fin
	int lowerFinX[] = {344, 367, 360};
	//array of local variable of y coordinates to the fishes lower fin
	int lowerFinY[] = {368, 378, 368};
	//array of local variable of x coordinates to the fishes upper fin
	int upperFinX[] = {344, 370, 360};
	//array of local variable of y coordinates to the fishes upper fin
	int upperFinY[] = {355, 340, 355};
	//aray of local variable of x coordinates of the fishes upper tail
	int fin1X[] = {372, 402, 382};
	//array of local variable of y coordinates to the fishes upper tail
	int fin1Y[] = {353, 350, 363};
	//aray of local variable of x coordinates of the fishes lower tail
	int fin2X[] = {372, 402, 382};
	//array of local variable of y coordinates to the fishes lower tail
	int fin2Y[] = {366, 368, 356};
	//aray of local variable of x coordinates of the fishes red stripe
	int stripeX[] = {372, 402, 372};
	//array of local variable of y coordinates to the fishes red stripe
	int stripeY[] = {366, 368, 360};

	c.setColor (body);
	//body
	c.fillOval (325, 350, 60, 20);
	//upper tail
	c.fillPolygon (fin1X, fin1Y, 3);
	//lower tail
	c.fillPolygon (fin2X, fin2Y, 3);
	//lower fin
	c.fillPolygon (lowerFinX, lowerFinY, 3);
	//upper fin
	c.fillPolygon (upperFinX, upperFinY, 3);

	c.setColor (Color.white);
	//eyes
	c.fillOval (335, 355, 9, 11);

	c.setColor (Color.black);
	//black inside eye
	c.fillOval (335, 357, 6, 7);

	//gills
	c.drawArc (344, 354, 5, 12, 310, 100);
	c.drawArc (349, 354, 5, 12, 310, 100);

	c.setColor (stripes);
	//stripes
	c.fillPolygon (stripeX, stripeY, 3);
	c.fillRect (364, 361, 8, 7);
	c.fillArc (360, 361, 10, 8, 90, 180);
    }


    public NeonTetra (Console con)
    {
	c = con;
	tetra ();
    }
}
