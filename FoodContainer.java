/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a fish food container.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*; //to access Thread class

public class FoodContainer extends Thread //creates a new class
{
    private Console c; //creates an instane variable

    public void food ()
    {
	//local colour variable for the food container
	Color container = new Color (191, 175, 178); //black shadows
	//local variable for the label
	Color label = new Color (196, 30, 58); //cardinal
	//local variable for the fish on the container
	Color fish = new Color (30, 133, 255); //dodger blue
	//local colour variable for the fish food
	Color fishFood = new Color (131, 105, 83); //pastel brown

	//loop used to animate the food container
	for (int x = 0 ; x < 400 ; x++)
	{
	    //array of local variable of x coordinates to the fish upper tail
	    int upX[] = {832 - x, 832 - x, 845 - x};
	    //array of local variable of y coordinates to the fish upper tail
	    int upY[] = {88, 100, 85};
	    //array of local variable of x coordinates to the fish lower tail
	    int bottomX[] = {832 - x, 832 - x, 845 - x};
	    //array of local variable of y coordinates to the fish lower tail
	    int bottomY[] = {90, 102, 105};

	    c.setColor (container);
	    //container
	    c.fillRect (775 - x, 20, 80, 110);

	    c.setColor (label);
	    //label
	    c.fillRect (775 - x, 45, 80, 20);

	    c.setColor (Color.black);
	    c.setFont (new Font ("Calibri", 1, 15));
	    //letters
	    c.drawString ("FISH FOOD", 775 - x, 60);

	    c.setColor (Color.white);
	    //mouth
	    c.fillArc (794 - x, 90, 10, 9, 220, 280);

	    c.setColor (fish);
	    //fish body
	    c.fillOval (800 - x, 80, 35, 30);
	    //fish tail
	    c.setColor (fish);
	    c.fillPolygon (upX, upY, 3);
	    c.setColor (fish);
	    c.fillPolygon (bottomX, bottomY, 3);

	    c.setColor (Color.white);
	    //eye
	    c.fillOval (805 - x, 85, 17, 17);

	    c.setColor (Color.black);
	    //inner eye
	    c.fillOval (808 - x, 92, 6, 6);

	    c.setColor (fishFood);
	    //food
	    c.fillOval (788 - x, 92, 5, 5);
	    c.setColor (fishFood);
	    c.fillOval (785 - x, 87, 5, 5);
	    c.setColor (fishFood);
	    c.fillOval (782 - x, 96, 5, 5);

	    //delay
	    try
	    {
		sleep (7);
	    }
	    catch (Exception e)
	    {
	    }

	}

	//loop used to animate the fish food container going down
	for (int x = 0 ; x < 30 ; x++)
	{
	    //array of local variable of x coordinates to the fish upper tail
	    int upX[] = {432, 432, 445};
	    //array of local variable of y coordinates to the fish upper tail
	    int upY[] = {88 - x, 100 - x, 85 - x};
	    //array of local variable of x coordinates to the fish lower tail
	    int bottomX[] = {432, 432, 445};
	    //array of local variable of y coordinates to the fish lower tail
	    int bottomY[] = {90 - x, 102 - x, 105 - x};

	    c.setColor (container);
	    //container
	    c.fillRect (375, 20 - x, 80, 110);

	    c.setColor (label);
	    //label
	    c.fillRect (375, 45 - x, 80, 20);

	    c.setColor (Color.black);
	    c.setFont (new Font ("Calibri", 1, 15));
	    //letters
	    c.drawString ("FISH FOOD", 382, 60 - x);

	    c.setColor (Color.white);
	    //mouth
	    c.fillArc (394, 90 - x, 10, 9, 220, 280);

	    c.setColor (fish);
	    //fish body
	    c.fillOval (400, 80 - x, 35, 30);
	    //fish tail
	    c.setColor (fish);
	    c.fillPolygon (upX, upY, 3);
	    c.setColor (fish);
	    c.fillPolygon (bottomX, bottomY, 3);

	    c.setColor (Color.white);
	    //eye
	    c.fillOval (405, 85 - x, 17, 17);

	    c.setColor (Color.black);
	    //inner eye
	    c.fillOval (408, 92 - x, 6, 6);

	    c.setColor (fishFood);
	    //food
	    c.fillOval (388, 92 - x, 5, 5);
	    c.setColor (fishFood);
	    c.fillOval (385, 87 - x, 5, 5);
	    c.setColor (fishFood);
	    c.fillOval (382, 96 - x, 5, 5);

	    //delay
	    try
	    {
		sleep (7);
	    }
	    catch (Exception e)
	    {
	    }

	}

	//loop used to animate the fish food going down
	for (int x = 0 ; x < 30 ; x++)
	{
	    //array of local variable of x coordinates to the fish upper tail
	    int upX[] = {432, 432, 445};
	    //array of local variable of y coordinates to the fish upper tail
	    int upY[] = {58 + x, 70 + x, 55 + x};
	    //array of local variable of x coordinates to the fish lower tail
	    int bottomX[] = {432, 432, 445};
	    //array of local variable of y coordinates to the fish lower tail
	    int bottomY[] = {60 + x, 72 + x, 75 + x};

	    c.setColor (container);
	    //container
	    c.fillRect (375, -10 + x, 80, 110);

	    c.setColor (label);
	    //label
	    c.fillRect (375, 15 + x, 80, 20);

	    c.setColor (Color.black);
	    c.setFont (new Font ("Calibri", 1, 15));
	    //letters
	    c.drawString ("FISH FOOD", 382, 30 + x);

	    c.setColor (Color.white);
	    //mouth
	    c.fillArc (394, 60 + x, 10, 9, 220, 280);

	    c.setColor (fish);
	    //fish body
	    c.fillOval (400, 50 + x, 35, 30);
	    //fish tail
	    c.setColor (fish);
	    c.fillPolygon (upX, upY, 3);
	    c.setColor (fish);
	    c.fillPolygon (bottomX, bottomY, 3);

	    c.setColor (Color.white);
	    //eye
	    c.fillOval (405, 55 + x, 17, 17);

	    c.setColor (Color.black);
	    //inner eye
	    c.fillOval (408, 62 + x, 6, 6);

	    c.setColor (fishFood);
	    //food
	    c.fillOval (388, 62 + x, 5, 5);
	    c.setColor (fishFood);
	    c.fillOval (385, 57 + x, 5, 5);
	    c.setColor (fishFood);
	    c.fillOval (382, 66 + x, 5, 5);

	    //delay
	    try
	    {
		sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//loop used to animate the fish food container going out
	for (int x = 0 ; x < 400 ; x++)
	{
	    //array of local variable of x coordinates to the fish upper tail
	    int upX[] = {432 + x, 432 + x, 445 + x};
	    //array of local variable of y coordinates to the fish upper tail
	    int upY[] = {88, 100, 85};
	    //array of local variable of x coordinates to the fish lower tail
	    int bottomX[] = {432 + x, 432 + x, 445 + x};
	    //array of local variable of y coordinates to the fish lower tail
	    int bottomY[] = {90, 102, 105};

	    c.setColor (container);
	    //container
	    c.fillRect (375 + x, 20, 80, 110);

	    c.setColor (label);
	    //label
	    c.fillRect (375 + x, 45, 80, 20);

	    c.setColor (Color.black);
	    c.setFont (new Font ("Calibri", 1, 15));
	    //letters
	    c.drawString ("FISH FOOD", 382 + x, 60);

	    c.setColor (Color.white);
	    //mouth
	    c.fillArc (394 + x, 90, 10, 9, 220, 280);

	    c.setColor (fish);
	    //fish body
	    c.fillOval (400 + x, 80, 35, 30);
	    //fish tail
	    c.setColor (fish);
	    c.fillPolygon (upX, upY, 3);
	    c.setColor (fish);
	    c.fillPolygon (bottomX, bottomY, 3);

	    c.setColor (Color.white);
	    //eye
	    c.fillOval (405 + x, 85, 17, 17);

	    c.setColor (Color.black);
	    //inner eye
	    c.fillOval (408 + x, 92, 6, 6);

	    c.setColor (fishFood);
	    //food
	    c.fillOval (388 + x, 92, 5, 5);
	    c.setColor (fishFood);;
	    c.fillOval (385 + x, 87, 5, 5);
	    c.setColor (fishFood);
	    c.fillOval (382 + x, 96, 5, 5);

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



    public FoodContainer (Console con)  //class constructor
    {
	c = con;
    }


    public void run ()
    {
	food ();
    }
}
