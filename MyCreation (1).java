/*
Hannah Kim
October 22, 2018
Ms. Krasteva
This program will output a little boy feeding his fish.
*/


//MyCreation class
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class MyCreation extends Thread
{
    Console c; //output console

    //adds the Curtains thread to MyCreation
    public void curtains ()
    {
	//creates the thread
	Curtains a = new Curtains (c);
	//starts the thread
	a.run ();

    }


    //adds the Background thread to MyCreation
    public void background ()
    {
	Background b = new Background (c);
    }


    //adds the Goldfish1 thread to MyCreation
    public void goldfish ()
    {
	//creates the thread
	Goldfish1 g = new Goldfish1 (c);
	//starts the thread
	g.start ();
    }


    //adds the ZebraDanios1 thread to MyCreation
    public void zebraFish ()
    {
	//creates the thread
	Zebra1 z = new Zebra1 (c);
	//starts the thread
	z.start ();
    }


    //adds the NeonTetra1 thread to MyCreation
    public void neonFish ()
    {
	//creates the thread
	Neon1 n = new Neon1 (c);
	//starts the thread
	n.start ();
	try
	{
	    n.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the FoodDrop thread to MyCreation
    public void drop ()
    {
	//creates the thread
	FoodDrop f = new FoodDrop (c);
	//starts the thread
	f.run ();
    }


    //adds the Hand thread to MyCreation
    public void hand ()
    {
	//creates the thread
	Hand h = new Hand (c);
	//starts the thread
	h.start ();
    }


    //adds the FoodContainer thread to MyCreation
    public void food ()
    {
	//creates the thread
	FoodContainer f = new FoodContainer (c);
	//starts the thread
	f.start ();
    }


    //adds the Crab1 thread to MyCreation
    public void crab ()
    {
	//creates the crab thread
	Crab1 r = new Crab1 (c);
	//starts the thread
	r.start ();
	//delay
	try
	{
	    sleep (5000);
	}
	catch (Exception e)
	{
	}

	Crab1 r1 = new Crab1 (c, new Color (73, 151, 208), new Color (0, 114, 187));
	//starts the thread
	r1.start ();

	Crab1 r2 = new Crab1 (c, new Color (204, 153, 255), new Color (150, 123, 182), 50);
	//starts the thread
	r2.start ();
	try
	{
	    r2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the Ending thread to MyCreation
    public void close ()
    {
	//creates the thread
	Ending f = new Ending (c);
	//starts the thread
	f.run ();
    }


    public MyCreation ()
    {
	c = new Console ("Fish Tank");
    }


    public static void main (String[] args)
    {
	MyCreation m = new MyCreation ();
	m.curtains ();
	m.background ();
	m.food ();
	m.hand ();
	m.goldfish ();
	m.zebraFish ();
	m.neonFish ();
	m.drop ();
	m.crab ();
	m.close ();
    }
}


