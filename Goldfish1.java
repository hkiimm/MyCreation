/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a goldfish.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class Goldfish1 extends Thread //creates a new class
{
    private Console c; //creates an instane variable

    public void goldfish ()
    {
	//local colour variable for the goldfish
	Color body = new Color (255, 127, 0); //orange crayola
	//local colour variable for the erase
	Color fishTank = new Color (124, 185, 232); //aero

	//loop used to animate the goldfish
	for (int x = 0 ; x < 70 ; x++)
	{
	    //array of local variable of x coordinates to the fishes mouth
	    int mouthX[] = {405 - x * 2, 398 - x * 2, 405 - x * 2};
	    //array of local variable of y coordinates to the fishes mouth
	    int mouthY[] = {253 - x, 262 - x, 271 - x};
	    //array of local variable of x corodinates to the fishes upper fin
	    int finX[] = {403 - x * 2, 422 - x * 2, 449 - x * 2, 430 - x * 2};
	    //array of local variable of y corodinates to the fishes upper fin
	    int finY[] = {255 - x, 240 - x, 240 - x, 255 - x};
	    //array of local variable of x corodinates to the fishes upper tail
	    int upperX[] = {435 - x * 2, 465 - x * 2, 438 - x * 2};
	    //array of local variable of y corodinates to the fishes upper tail
	    int upperY[] = {255 - x, 250 - x, 270 - x};
	    //array of local variable of x corodinates to the fishes lower tail
	    int lowerX[] = {435 - x * 2, 465 - x * 2, 435 - x * 2};
	    //array of local variable of y corodinates to the fishes lower tail
	    int lowerY[] = {255 - x, 275 - x, 270 - x};

	    c.setColor (fishTank);
	    //erase
	    c.fillRect (397 - x * 2, 239 - x, 69, 52);

	    c.setColor (body);
	    //body
	    c.fillOval (400 - x * 2, 250 - x, 40, 25);
	    c.setColor (body);
	    //tip of mouth
	    c.fillPolygon (mouthX, mouthY, 3);
	    c.setColor (body);
	    //lower fin
	    c.fillOval (415 - x * 2, 265 - x, 15, 25);
	    c.setColor (body);
	    //upper fin
	    c.fillPolygon (finX, finY, 4);
	    c.setColor (body);
	    //upper tail
	    c.fillPolygon (upperX, upperY, 3);
	    c.setColor (body);
	    //lower tail
	    c.fillPolygon (lowerX, lowerY, 3);

	    c.setColor (Color.white);
	    //eyes
	    c.fillOval (405 - x * 2, 255 - x, 9, 11);
	    //fin detailing
	    c.setColor (Color.white);
	    c.drawLine (409 - x * 2, 252 - x, 424 - x * 2, 240 - x);
	    c.setColor (Color.white);
	    c.drawLine (414 - x * 2, 252 - x, 429 - x * 2, 240 - x);
	    c.setColor (Color.white);
	    c.drawLine (419 - x * 2, 252 - x, 434 - x * 2, 240 - x);
	    c.setColor (Color.white);
	    c.drawLine (424 - x * 2, 252 - x, 439 - x * 2, 240 - x);
	    c.setColor (Color.white);
	    c.drawLine (429 - x * 2, 252 - x, 444 - x * 2, 240 - x);

	    c.setColor (Color.black);
	    //black inside eye
	    c.fillOval (405 - x * 2, 258 - x, 6, 7);
	    //gills
	    c.setColor (Color.black);
	    c.drawArc (415 - x * 2, 255 - x, 5, 12, 310, 100);
	    c.setColor (Color.black);
	    c.drawArc (420 - x * 2, 255 - x, 5, 12, 310, 100);
	    //delay
	    try
	    {
		Thread.sleep (35);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the goldfish
	for (int x = 0 ; x < 118 ; x++)
	{
	    //array of local variable of x coordinates to the fishes mouth
	    int mouthX[] = {265 - x, 258 - x, 265 - x};
	    //array of local variable of y coordinates to the fishes mouth
	    int mouthY[] = {183, 192, 201};
	    //array of local variable of x corodinates to the fishes upper fin
	    int finX[] = {263 - x, 282 - x, 309 - x, 290 - x};
	    //array of local variable of y corodinates to the fishes upper fin
	    int finY[] = {185, 170, 170, 185};
	    //array of local variable of x corodinates to the fishes upper tail
	    int upperX[] = {295 - x, 325 - x, 298 - x};
	    //array of local variable of y corodinates to the fishes upper tail
	    int upperY[] = {185, 180, 200};
	    //array of local variable of x corodinates to the fishes lower tail
	    int lowerX[] = {295 - x, 325 - x, 295 - x};
	    //array of local variable of y corodinates to the fishes lower tail
	    int lowerY[] = {185, 205, 200};

	    c.setColor (fishTank);
	    //erase
	    c.fillRect (257 - x, 169, 69, 52);

	    c.setColor (body);
	    //body
	    c.fillOval (260 - x, 180, 40, 25);
	    c.setColor (body);
	    //tip of mouth
	    c.fillPolygon (mouthX, mouthY, 3);
	    c.setColor (body);
	    //lower fin
	    c.fillOval (275 - x, 195, 15, 25);
	    c.setColor (body);
	    //upper fin
	    c.fillPolygon (finX, finY, 4);
	    c.setColor (body);
	    //upper tail
	    c.fillPolygon (upperX, upperY, 3);
	    c.setColor (body);
	    //lower tail
	    c.fillPolygon (lowerX, lowerY, 3);

	    c.setColor (Color.white);
	    //eyes
	    c.fillOval (265 - x, 185, 9, 11);
	    //fin detailing
	    c.setColor (Color.white);
	    c.drawLine (269 - x, 182, 284 - x, 170);
	    c.setColor (Color.white);
	    c.drawLine (274 - x, 182, 289 - x, 170);
	    c.setColor (Color.white);
	    c.drawLine (279 - x, 182, 294 - x, 170);
	    c.setColor (Color.white);
	    c.drawLine (284 - x, 182, 299 - x, 170);
	    c.setColor (Color.white);
	    c.drawLine (289 - x, 182, 304 - x, 170);

	    c.setColor (Color.black);
	    //black inside eye
	    c.fillOval (265 - x, 188, 6, 7);
	    //gills
	    c.setColor (Color.black);
	    c.drawArc (275 - x, 185, 5, 12, 310, 100);
	    c.setColor (Color.black);
	    c.drawArc (280 - x, 185, 5, 12, 310, 100);

	    //delay
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the goldfish
	for (int x = 0 ; x < 220 ; x++)
	{
	    //array of local variable of x coordinates to the fishes mouth
	    int mouthX[] = {200 + x, 207 + x, 200 + x};
	    //array of local variable of y coordinates to the fishes mouth
	    int mouthY[] = {183, 192, 201};
	    //array of local variable of x corodinates to the fishes upper fin
	    int finX[] = {200 + x, 181 + x, 154 + x, 173 + x};
	    //array of local variable of y corodinates to the fishes upper fin
	    int finY[] = {185, 170, 170, 185};
	    //array of local variable of x corodinates to the fishes upper tail
	    int upperX[] = {173 + x, 143 + x, 170 + x};
	    //array of local variable of y corodinates to the fishes upper tail
	    int upperY[] = {185, 180, 200};
	    //array of local variable of x corodinates to the fishes lower tail
	    int lowerX[] = {173 + x, 143 + x, 170 + x};
	    //array of local variable of y corodinates to the fishes lower tail
	    int lowerY[] = {185, 205, 200};

	    c.setColor (fishTank);
	    //erase
	    c.fillRect (142 + x, 169, 65, 52);

	    c.setColor (body);
	    //body
	    c.fillOval (165 + x, 180, 40, 25);
	    c.setColor (body);
	    //tip of mouth
	    c.fillPolygon (mouthX, mouthY, 3);
	    c.setColor (body);
	    //lower fin
	    c.fillOval (181 + x, 195, 15, 25);
	    c.setColor (body);
	    //upper fin
	    c.fillPolygon (finX, finY, 4);
	    c.setColor (body);
	    //upper tail
	    c.fillPolygon (upperX, upperY, 3);
	    c.setColor (body);
	    //lower tail
	    c.fillPolygon (lowerX, lowerY, 3);
	    c.setColor (body);

	    c.setColor (Color.white);
	    //eyes
	    c.fillOval (190 + x, 185, 9, 11);
	    //fin detailing
	    c.setColor (Color.white);
	    c.drawLine (193 + x, 182, 178 + x, 170);
	    c.setColor (Color.white);
	    c.drawLine (188 + x, 182, 173 + x, 170);
	    c.setColor (Color.white);
	    c.drawLine (183 + x, 182, 168 + x, 170);
	    c.setColor (Color.white);
	    c.drawLine (178 + x, 182, 163 + x, 170);
	    c.setColor (Color.white);
	    c.drawLine (173 + x, 182, 158 + x, 170);

	    c.setColor (Color.black);
	    //black inside eye
	    c.fillOval (192 + x, 188, 6, 7);
	    //gills
	    c.setColor (Color.black);
	    c.drawArc (185 + x, 185, 5, 12, 130, 100);
	    c.setColor (Color.black);
	    c.drawArc (180 + x, 185, 5, 12, 130, 100);

	    //delay
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }




    public Goldfish1 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	goldfish ();
    }
}


