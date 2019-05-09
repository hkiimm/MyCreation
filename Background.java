/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a fishtank background.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Background //creates a new class
{
    Console c; //creates an instane variable

    public Background ()  //class constructor
    {
	c = new Console ();
    }


    public void largeObjects ()
    {
	//local colour variable used for the water
	Color fishTank = new Color (124, 185, 232); //aero
	//local volour variable used for the table
	Color table = new Color (107, 68, 35); //brown-nose

	c.setColor (Color.white);
	//curtains open
	for (int x = 0 ; x <= 640 ; x = x + 1)
	{
	    c.fillRect (0, 0, x, 500);
	}

	c.setColor (fishTank);
	//set fish tank
	for (int x = 0 ; x < 300 ; x = x + 1)
	{
	    c.drawRect (20 + x, 150, 180, 270);
	}

	c.setColor (Color.black);
	//set black bar
	for (int x = 0 ; x < 300 ; x = x + 1)
	{
	    c.drawRect (20 + x, 140, 180, 10);
	}

	//set colour dark brown
	c.setColor (table);
	//set brown table
	for (int x = 0 ; x < 300 ; x = x + 1)
	{
	    c.drawRect (0 + x, 420, 220, 40);
	}

	//set brown table legs
	for (int x = 0 ; x < 60 ; x = x + 1)
	{
	    c.drawRect (0 + x, 460, 0, 40);
	    c.drawRect (460 + x, 460, 0, 40);
	}
    }


    public void detailObjects ()
    {
	//local colour variable used for the corals
	Color corals = new Color (248, 131, 121); //pink coral
	//local colour variable used for the outline for the corals
	Color coralOutline = new Color (205, 91, 96); //dark coral
	//local colour variable used for the plant stem
	Color plantStem = new Color (72, 60, 50); //dark lava
	//local colour variable used for the leaves
	Color plantLeaves = new Color (104, 40, 96); //palatinate purple
	//local colour variable used for the bubbles
	Color bubbles = new Color (179, 229, 238); //blue lagoon
	//local colour variable used for the rocks
	Color stone = new Color (128, 128, 128);  //grey
	//local colour variable used for the traingular corals
	Color seaPlant = new Color (171, 79, 39); //amaranth deep purple

	c.setColor (corals);
	//set corals
	for (int x = -20 ; x < 20 ; x = x + 1)
	{
	    //biggest coral on the left
	    c.drawArc (40 - x / 2, 300 - x / 2, x + 10, x + 120, 0, 180);
	    //smaller coral on the left
	    c.drawArc (30 - x / 2, 315 - x / 2, x, x + 80, 0, 180);

	    //biggest coral on the right
	    c.drawArc (450 - x / 2, 342 - x / 2, x - 2, x + 70, 0, 180);
	}

	c.setColor (coralOutline);
	//outline around corals
	//bigger coral outline
	c.drawArc (30, 290, 30, 140, 0, 137);
	//smaller coral outline
	c.drawArc (20, 305, 20, 100, 0, 180);
	//bigger coral on the right
	c.drawArc (440, 332, 18, 90, 0, 180);

	c.setColor (plantStem);
	//furthest leaf plant stem
	c.drawArc (60, 290, 20, 300, 20, 45);

	c.setColor (plantLeaves);
	//set plant furthest left
	for (int x = 0 ; x < 10 ; x = x + 1)
	{
	    //right
	    c.drawOval (79, 360 - x, x, x);
	    c.drawOval (79, 352 - x, x, x);
	    c.drawOval (78, 344 - x, x, x);
	    c.drawOval (78, 336 - x, x, x);
	    c.drawOval (78, 328 - x, x, x);
	    c.drawOval (77, 320 - x, x, x);
	    c.drawOval (76, 312 - x, x, x);
	    c.drawOval (75, 304 - x, x, x);
	    //left
	    c.drawOval (77 - x, 356 - x, x, x);
	    c.drawOval (77 - x, 348 - x, x, x);
	    c.drawOval (76 - x, 340 - x, x, x);
	    c.drawOval (76 - x, 332 - x, x, x);
	    c.drawOval (76 - x, 324 - x, x, x);
	    c.drawOval (75 - x, 316 - x, x, x);
	    c.drawOval (74 - x, 308 - x, x, x);
	    c.drawOval (73 - x, 300 - x, x, x);
	}

	//plant stem on the left stone
	c.drawArc (80, 290, 20, 300, 20, 25);
	//plant stem on the right stone
	c.drawArc (443, 290, 20, 300, 20, 25);

	//set plant on the left stone and the one on the right stone
	for (int x = 0 ; x < 7 ; x = x + 1)
	{
	    //right leaves
	    c.drawOval (99, 370 - x, x, x);
	    c.drawOval (99, 363 - x, x, x);
	    c.drawOval (98, 356 - x, x, x);
	    c.drawOval (98, 349 - x, x, x);
	    c.drawOval (98, 342 - x, x, x);
	    c.drawOval (97, 335 - x, x, x);
	    //left leaves
	    c.drawOval (98 - x, 366 - x, x, x);
	    c.drawOval (97 - x, 359 - x, x, x);
	    c.drawOval (97 - x, 352 - x, x, x);
	    c.drawOval (97 - x, 345 - x, x, x);
	    c.drawOval (96 - x, 338 - x, x, x);
	    c.drawOval (96 - x, 331 - x, x, x);

	    //right leaves
	    c.drawOval (461, 356 - x, x, x);
	    c.drawOval (461, 349 - x, x, x);
	    c.drawOval (461, 342 - x, x, x);
	    c.drawOval (460, 335 - x, x, x);
	    //left leaves
	    c.drawOval (460 - x, 359 - x, x, x);
	    c.drawOval (460 - x, 352 - x, x, x);
	    c.drawOval (460 - x, 345 - x, x, x);
	    c.drawOval (460 - x, 338 - x, x, x);
	    c.drawOval (459 - x, 331 - x, x, x);
	}

	c.setColor (seaPlant);
	//set triangular sea plant
	for (int x = 0 ; x < 12 ; x = x + 1)
	{
	    c.drawLine (471 + x, 330, 479, 370);
	    c.drawLine (484 + x, 325, 486, 370);
	}

	c.setColor (stone);
	//set stone
	for (int x = 0 ; x < 130 ; x = x + 1)
	{
	    //left rock
	    c.drawArc (-21 - x / 2, 418 - x / 2, x + 80, x, 0, 89);
	    //right rock layer 1
	    c.drawArc (488 - x / 2, 419 - x / 2, x + 20, x, 90, 90);
	    //right rock layer 2
	    c.drawArc (488 - x / 2, 419 - x / 2, x + 21, x + 1, 90, 90);
	    //right rock layer 3
	    c.drawArc (488 - x / 2, 419 - x / 2, x + 19, x - 1, 90, 90);
	}

	c.setColor (bubbles);
	//bubbles in the water
	c.drawOval (35, 267, 10, 10);
	c.drawOval (30, 282, 6, 6);
	c.drawOval (27, 292, 3, 3);
	c.drawOval (90, 302, 8, 8);
	c.drawOval (93, 315, 5, 5);
	c.drawOval (468, 306, 8, 8);
	c.drawOval (473, 319, 5, 5);
	c.drawOval (487, 296, 10, 10);
	c.drawOval (487, 312, 5, 5);

	c.setColor (Color.black);
	//black border around fish tank
	c.drawRect (20, 140, 479, 279);
    }


    public Background (Console con)
    {
	c = con;
	largeObjects ();
	detailObjects ();
    }
}
