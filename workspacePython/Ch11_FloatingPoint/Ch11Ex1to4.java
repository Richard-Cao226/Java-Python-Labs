import java.util.Scanner;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO Richard Cao
   @version TODO 3/20

   @author  Period - TODO 6
   @author  Assignment - Ch11_FloatingPoint

   @author  Sources - TODO list collaborators
 */
public class Ch11Ex1to4
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch11Ex1to4()
    {
        scan = new Scanner( System.in );
    }


    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str input for the various methods
     */
    public Ch11Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * TODO Description
     */
    public void annualCost()
    {
    	double cents, year, cost;
        System.out.println("Enter cost per kilowatt-hour in cents");
        cents = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        year = scan.nextDouble();
        cost = cents / 100 * year;
        System.out.println("Annual cost: " + cost);
        
    }

    /**
     * TODO Description
     */
    public void fallingBrick()
    {
        double distance, time, g = 32.174;
        System.out.println("Enter the number of seconds: ");
        time = scan.nextDouble();
        distance = (0.5)*g*Math.pow(time, 2);
        System.out.println("The brick fell " + distance + " feet in " + time + " seconds.");
        System.out.println("Enter the distance: ");
        distance = scan.nextDouble();
        time = Math.sqrt(distance*2/g);
        System.out.println("The brick fell " + distance + " feet in " + time + " seconds.");
    }

    /**
     * TODO Description
     */
    public void base2Log()
    {
        double x, log;
        System.out.println("Enter a double: ");
        x = scan.nextDouble();
        log = Math.log(x)/Math.log(2);
        System.out.println("Base 2 log of " + x + " is " + log);
    }

    /**
     * TODO Description
     */
    public void harmonicMean()
    {
        double x, y, arith, harm;
        System.out.println("Enter X: ");
        x = scan.nextDouble();
        System.out.println("Enter Y: ");
        y = scan.nextDouble();
        arith = (x + y)/2;
        System.out.println("Arithmetic mean: " + arith);
        harm = 2/(1/x + 1/y);
        System.out.println("Harmonic   mean: " + harm);
    }

    /**
     * Testing method: instantiates a Ch11Ex1_4 object and then
     * invokes each method
     * 
     * @param args command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch11Ex1to4 exercise = new Ch11Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Annual Cost of Running an Appliance" );
            System.out.println( "    (2) Falling Brick" );
            System.out.println( "    (3) Base 2 Logarithm of a Number" );
            System.out.println( "    (4) Harmonic Mean" );
            System.out.println( "    (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.annualCost();
                        break;
                    case '2':
                        exercise.fallingBrick();
                        break;
                    case '3':
                        exercise.base2Log();
                        break;
                    case '4':
                        exercise.harmonicMean();
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                        {
                            done = true;
                        }
                        else
                        {
                            System.out.print( "Invalid Choice" );
                        }
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
