import java.util.*;

/**
 * Chapter 15 to 20
 * Selected problems with while loops and random number generation
 * 
 * @author TODO Richard Cao
 * @version TODO 3/28
 * @author Period - TODO 6
 * @author Assignment - Ch15Ex1to3
 * @author Sources - TODO list collaborators
 */

public class Ch15to20PS
{
    Scanner scan;
    Random rand = new Random();

    /**
     * Constructs a Scanner for input from the console.
     */
    public Ch15to20PS()
    {
        scan = new Scanner( System.in );
    }

    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     */
    public Ch15to20PS( String str )
    {
        scan = new Scanner( str );
    }
    
    /**
     * Constructs a Scanner to evaluate passed input (used for testing).
     * 
     * @param str  input for the various methods
     * @param seed  seed to use for random number generator
     */    
    public Ch15to20PS( String str, long seed )
    {
        scan = new Scanner( str );
        rand.setSeed( seed );
    }

    /**
     * TODO Description
     */
    public void repeatWord()
    {
    	String inputString;
    	int times, count;
        System.out.println("Enter a word:");
        inputString = scan.nextLine();
        times = inputString.length();
        count = 1;
        while(count <= times) {
        	System.out.println(inputString);
        	count += 1;
        }
    }

    /**
     * TODO Description
     */
    public void shippingCostCalc()
    {
        int weight = 1;
        double cost;
        while(weight != 0) {
        	System.out.println("Weight of Order:");
        	weight = scan.nextInt();
        	if(weight > 10) {
        		cost = 3 + 0.25 * (weight - 10);
        	} else {
        		cost = 3;
        	}
        	if(weight != 0) {
        		System.out.println("Shipping Cost: $"+cost);
        	}
        	System.out.println();
        }
        System.out.println("bye");
    }
    
    /**
     * TODO Description
     */
    public void randomWalk2D()
    {
        double X = 0.0, Y = 0.0, distance;
        int count = 1, moves;
        System.out.println("How many iterations?");
        moves = scan.nextInt();
        while(count <= moves) {
        	X += 2.0*rand.nextDouble() - 1;
        	Y += 2.0*rand.nextDouble() - 1;
        	count += 1;
        }
        System.out.println("After "+moves+" moves");
        System.out.println("X is now at "+X);
        System.out.println("Y is now at "+Y);
        distance = Math.sqrt(Math.pow(X, 2)+Math.pow(Y, 2));
        System.out.println("Distance from origin is "+distance);
        
    }
    
    /**
     * TODO Description
     */   
    public void furtherImprovedGuessingGame()
    {
    	int round = 1, randNum, guess, wins = 0, tries = 1;
    	boolean correct = false;
    	String rating;
        while(round <= 10) {
        	System.out.println("round "+round+":");
        	System.out.println();
        	System.out.println("I am thinking of a number from 1 to 10.");
        	System.out.println("You must guess what it is in three tries.");
        	
        	randNum = rand.nextInt(10)+1;
        	System.out.println("Enter a guess:");        	        	
        	while(correct == false && tries <= 3) {
        		guess = scan.nextInt();
        	    if(Math.abs(randNum - guess) >= 3) {
        	    	if(tries == 3) {
        	    		break;
        	    	}
        			System.out.println("cold");
        		} else if(Math.abs(randNum - guess) == 2) {
        			if(tries == 3) {
        	    		break;
        	    	}
        			System.out.println("warm");
        		} else if(Math.abs(randNum - guess) == 1) {
        			if(tries == 3) {
        	    		break;
        	    	}
        			System.out.println("hot");
        		} else {
        			System.out.println("RIGHT!");
        			correct = true;
        			wins += 1;
        		}
        		tries += 1;
        	}
        	if(correct == false) {
        		System.out.println("wrong");
        		System.out.println("The correct number was "+randNum);
        	}
        	System.out.println("You have won "+wins+" out of "+round+" rounds.");
        	System.out.println();
        	correct = false;
        	tries = 1;
        	round += 1;
        }
        if(wins <= 7) {
        	rating = "amateur";
        } else if(wins == 8) {
        	rating = "advanced";
        } else if(wins == 9) {
        	rating = "professional";
        } else {
        	rating = "hacker";
        }
        System.out.println("Your rating: "+rating+".");
    }

    /**
     * Testing method: instantiates a Ch15to20PS object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch15to20PS exercise = new Ch15to20PS();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Repeat Word" );
            System.out.println( "   (2) Shipping Cost Calculator" );
            System.out.println( "   (3) randomWalk2D" );
            System.out.println( "   (4) Further Improved Guessing Game" );
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
                        exercise.repeatWord();
                        break;
                    case '2':
                        exercise.shippingCostCalc();
                        break;
                    case '3':
                        exercise.randomWalk2D();
                        break;
                    case '4':
                        exercise.furtherImprovedGuessingGame();
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
