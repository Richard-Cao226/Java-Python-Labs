import java.util.Scanner;

/**
    TODO Scanner exercises
    TODO Follow it with additional details about its purpose, what abstraction
    it represents, and how to use it.
    
    @author  TODO Richard Cao
    @version TODO 3/19
    
    @author   Period - TODO 6
    @author   Assignment - Ch10_IO
    
    @author   Sources - TODO list collaborators
 */
public class Ch10Ex1thru4
{
    Scanner scan;

    /**
     *  Constructs a Scanner for input from the console.
     */
    public Ch10Ex1thru4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * @param str input for the various methods
     */
    public Ch10Ex1thru4( String str )
    {
        scan = new Scanner( str );
        
    }

    /**
      TODO Calculates the area of a circle. 
     */
    public void areaOfACircle()
    {
    	int radius;
        double area;
        System.out.println("Input the radius: ");
        radius = scan.nextInt();
        area = Math.PI * Math.pow(radius,2);
        System.out.println("The radius is: " + radius + " The area is: " + area);
    }

    /**
      TODO Converts cents to dollars 
     */
    public void centsToDollars()
    {
    	int dollars,cents;
        System.out.println("Input the cents: ");
        cents = scan.nextInt();
        dollars = cents / 100;
        cents = cents % 100;
        System.out.println("That is " + dollars + " dollars and " + cents + " cents.");
    }

    /**
      TODO Calculates change. 
     */
    public void correctChange()
    {
    	int cents, dollars, quarters, dimes, nickels;
        System.out.println("Input the cents: ");
    	cents = scan.nextInt();
    	dollars = cents / 100;
    	quarters = cents % 100 / 25;
    	dimes = cents % 100 % 25 / 10;
    	nickels = cents % 100 % 25 % 10 / 5;
    	cents = cents - (100*dollars + 25*quarters + 10*dimes + 5*nickels);
    	System.out.println("Your change is: " + dollars + " dollar, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + cents + " cents.");
        
    }

    /**
      TODO Calculates current based on voltage and resistance. 
     */
    public void ohmsLaw()
    {
        int V, R;
        double I;
        System.out.println("Input the voltage: ");
        V = scan.nextInt();
        System.out.println("Input the resistance: ");
        R = scan.nextInt();
        I = (V+0.0)/R;
        System.out.println(I);
    }

    /**
      Testing method: instantiates a Lesson10Exercises object and then invokes
      each method.

      @param args  command-line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch10Ex1thru4 exercise = new Ch10Ex1thru4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "    (1) Area of a Circle" );
            System.out.println( "    (2) Cents to Dollars" );
            System.out.println( "    (3) Correct Change" );
            System.out.println( "    (4) Ohm's Law" );
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
                        exercise.areaOfACircle();
                        break;
                    case '2':
                        exercise.centsToDollars();
                        break;
                    case '3':
                        exercise.correctChange();
                        break;
                    case '4':
                        exercise.ohmsLaw();
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
