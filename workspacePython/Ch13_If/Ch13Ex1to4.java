import java.util.*;


/**
 * Chapter 13 - Single-branch if Statements Programming Exercises 1-4
 * 
 * @author TODO Richard Cao
 * @version TODO 3/25
 * 
 * @author Period - TODO 6
 * @author Assignment - Ch13Ex1to4
 * 
 * @author Sources - TODO list collaborators
 */
public class Ch13Ex1to4
{
    Scanner scan;

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch13Ex1to4()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str input for the various methods
     */
    public Ch13Ex1to4( String str )
    {
        scan = new Scanner( str );
    }

    /**
     * TODO Description
     */
    public void internetDelicatessen()
    {
    	String item;
    	double price, shipping, total;
    	int overnight;
        System.out.println("Enter the item:");
        item = scan.nextLine();
        System.out.println("Enter the price:");
        price = scan.nextDouble()/100;
        System.out.println("Overnight delivery (0==no, 1==yes):");
        overnight = scan.nextInt();
        if (price < 10) {
        	shipping = 2.00;
        } else {
        	shipping = 3.00;
        }
        if (overnight == 1) {
        	shipping += 5.00;
        }
        total = price + shipping;
        System.out.println("Invoice:");
        System.out.println("  "+item+"\t"+price);
        System.out.println("  shipping\t"+shipping);
        System.out.println("  total\t\t"+total);
    }

    /**
     * TODO Description
     */
    public void steamEngineEfficiency()
    {
        int Tair, Tsteam;
        double efficiency;
        System.out.println("Enter the air temperature:");
        Tair = scan.nextInt();
        System.out.println("Enter the steam temperature:");
        Tsteam = scan.nextInt();
        if (Tsteam < 373) {
        	efficiency = 0;
        } else {
        	
        	efficiency = 1 - (double)Tair / Tsteam;
        }
        System.out.println("Maximum possible efficiency: "+efficiency);
    }

    /**
     * TODO Description
     */
    public void microwaveOven()
    {
        int items;
        double time;
        System.out.println("Enter the number of items:");
        items = scan.nextInt();
        System.out.println("Enter the single-item heating time:");
        time = scan.nextDouble();
        if (items == 1) {
        	System.out.println("The recommended heating time is "+time+".");
        }
        if (items == 2) {
        	time *= 1.5;
        	System.out.println("The recommended heating time is "+time+".");
        }
        if (items == 3) {
        	time *= 2;
        	System.out.println("The recommended heating time is "+time+".");
        }
        if (items > 3) {
        	System.out.println("Heating more than three items at once is not recommended.");
        }
    }

    /**
     * TODO Description
     */
    public void fantasyGame()
    {
        System.out.println("Welcome to HaveAtIt's Quest");
        int strength, health, luck;
        String name;
        System.out.println("Enter the name of your character:");
        name = scan.nextLine();
        System.out.println("Enter strength (1-10):");
        strength = scan.nextInt();
        System.out.println("Enter health (1-10):");
        health = scan.nextInt();
        System.out.println("Enter luck (1-10):");
        luck = scan.nextInt();
        if (strength + health + luck > 15) {
        	System.out.println("You have given your character too many points!");
        	System.out.println("Default values have been assigned:");
        	strength = 5;
        	health = 5;
        	luck = 5;
        }
        System.out.println(name+", strength: "+strength+", health: "+health+", luck: "+luck);
    }

    /**
     * Testing method: instantiates a Lesson15Exercises object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch13Ex1to4 exercise = new Ch13Ex1to4();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Internet Delicatessen" );
            System.out.println( "   (2) Steam Engine Efficiency" );
            System.out.println( "   (3) Microwave Oven" );
            System.out.println( "   (4) Fantasy Game" );
            System.out.println( "   (Q) Quit" );
            System.out.println();
            System.out.print( "Enter a choice:  " );
            String response = kbd.nextLine();

            if ( response.length() > 0 )
            {
                System.out.println();

                switch ( response.charAt( 0 ) )
                {
                    case '1':
                        exercise.internetDelicatessen();
                        break;
                    case '2':
                        exercise.steamEngineEfficiency();
                        break;
                    case '3':
                        exercise.microwaveOven();
                        break;
                    case '4':
                        exercise.fantasyGame();
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
