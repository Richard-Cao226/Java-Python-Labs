import java.util.*;
import java.io.*;

/**
   Chapter 49C - Two-Dimensional Arrays Exercises 1-5

   @author TODO Richard Cao
   @version TODO 4/26

   @author Period - TODO 6
   @author Assignment - Ch49C_2DArrays

   @author Sources - TODO list collaborators
 */
public class Ch49C_2DArrays_Ex1to5
{
    Scanner scan;

    public Ch49C_2DArrays_Ex1to5()
    {
        scan = new Scanner( System.in );
    }

    /**
      TODO Description
     */
    public int sumOfAllArrayElements( int[][] data )
    {
        int sum = 0;
        
        for ( int row = 0; row < data.length; row++ )
        {
            for ( int col = 0; col < data[row].length; col++ )
            {
            	sum += data[row][col];
            }
        }

        System.out.println(sum);
        
        return sum;
    }

    /**
       TODO Description
     */
    public int[] sumOfEachRow( int[][] data )
    {
        int [] rowSums = new int[data.length];

        for ( int row = 0; row < data.length; row++ )
        {
            int sum = 0;
            
            for ( int col = 0; col < data[row].length; col++ )
            {
            	sum += data[row][col];
            }
            
            rowSums[row] = sum;
            System.out.println(sum);
        }
        
        return rowSums;
    }

    /**
     * TODO Description
     */
    public int[] sumOfEachColumn( int[][] data )
    {
        int longestRow = 0;
        for(int row = 0; row < data.length; row++) {
        	if(data[row].length > longestRow) {
        		longestRow = data[row].length;
        	}
        }
        
        int [] colSums = new int[longestRow]; // longestRow = # col
        
        for(int col = 0; col < longestRow; col++) {
        	int sum = 0;
        	for(int row = 0; row < data.length; row++) {
        		if(col <= data[row].length-1) {
        			sum += data[row][col];
        		}
        	}
        	colSums[col] = sum;
        	
        }
        
        return colSums;
    }

    /**
       TODO Description
     */
    public int[] maxAndMinElements( int[][] data )
    {
        int max = data[0][0];
        int min = data[0][0];
        
        for ( int row = 0; row < data.length; row++ )
        {
            for ( int col = 0; col < data[row].length; col++ )
            {
            	if(data[row][col] > max) {
            		max = data[row][col];
            	}
            	if(data[row][col] < min) {
            		min = data[row][col];
            	}
            }
        }

        System.out.println("Max: "+max+" Min: "+min);
        
        int[] result = { max, min };
        return result;
    }

    /**
       TODO Description
     */
    public int[] largestElements( int[][] data )
    {
        int[] largestInRow = new int[data.length];
        
        for(int row = 0; row < data.length; row++) {
        	int largest = data[row][0];
        	for(int col = 0; col < data[row].length; col++) {
        		if(data[row][col] > largest) {
        			largest = data[row][col];
        		}
        	}
        	largestInRow[row] = largest;
        }
        
        return largestInRow;
    }

    /**
      Testing method: instantiates a Lesson49C Exercises object and
      then invokes each method

      @param args command line parameters (not used)
     */
    public static void main( String[] args )
    {
        Scanner kbd = new Scanner( System.in );
        boolean done = false;

        Ch49C_2DArrays_Ex1to5 exercise = new Ch49C_2DArrays_Ex1to5();

        do
        {
            System.out.println();
            System.out.println();
            System.out.println( "Make a selection" );
            System.out.println();
            System.out.println( "   (1) Sum of All Array Elements");
            System.out.println( "   (2) Sum of Each Row");
            System.out.println( "   (3) Sum of Each Column");
            System.out.println( "   (4) Maximum and Minimum Elements");
            System.out.println( "   (5) Largest Elements");
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
                        int[][] dataEx1 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int sum = exercise.sumOfAllArrayElements(dataEx1);
                        break;
                    case '2':
                        int[][] dataEx2 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] rowSums = exercise.sumOfEachRow(dataEx2);
                        break;
                    case '3':
                        int[][] dataEx3 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] colSums = exercise.sumOfEachColumn( dataEx3 );
                        break;
                    case '4':
                        int[][] dataEx4 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] maxMin = exercise.maxAndMinElements( dataEx4 );
                        break;
                    case '5':
                        int[][] dataEx5 = { { 3, 2, 5 },
                            { 1, 4, 4, 8, 13 },
                            { 9, 1, 0, 2 },
                            { 0, 2, 6, 3, -1, -8 } };
                        int[] largestInRow = exercise.largestElements( dataEx5 );
                        break;
                    default:
                        if ( response.toLowerCase().charAt( 0 ) == 'q' )
                            done = true;
                        else
                            System.out.print( "Invalid Choice" );
                        break;
                }
            }
        } while ( !done );
        System.out.println( "Goodbye!" );
    }
}
