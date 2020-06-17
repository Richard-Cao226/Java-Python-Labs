import java.io.*;

/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 * 
 * @author TODO Richard Cao
 * @version TODO 4/10
 * 
 * @author Period - TODO 6
 * @author Assignment - Chapter 48 Arrays as Parameters Exercises 1-3
 * 
 * @author Sources - TODO your sources
 */
public class Weight
{
    private int[] data;

    /**
     * Constructs a Weight object that contains an array of the weight
     * of an individual taken on successive days for one month.
     * 
     * @param init  array of weights for one month
     */
    public Weight(int[] init)
    {
        data = new int[init.length];

        for (int j = 0; j < data.length; j++)
        {
            data[j] = init[j];
        }
    }

    /**
     * TODO Description
     */
    public int average()
    {
    	int average = 0;
    	for(int j = 0; j < data.length; j++) {
    		average += data[j];
    	}
    	average /= data.length;
        return average;
    }

    /**
     * TODO Description
     */
    public int subAverage( int start, int end )
    {
    	int subAverage = 0;
        for(int j = start; j <= end; j++) {
        	subAverage += data[j];
        }
        subAverage /= (end - start + 1);
    	
        return subAverage;
    }

    /**
     * TODO Description
     */
    public void print()
    {	
    	boolean exit = false;
    	int i = 0;
    	int count = 1;
    	while ( exit == false ) {
    		for(; i < 7 * count; i++) {
    			System.out.print(data[i] + " ");
    			if(i == data.length-1) {
    				exit = true;
    				break;
    			}
    		}
    		System.out.println();
    		count++;
    		
    	}
        
    }

    /**
     * Testing method: instantiates a Weight object and then invokes
     * each method.
     * 
     * @param args  command line parameters (not used)
     */
    public static void main( String[] args )
    {
        int[] values = { 98, 99, 98, 99, 100, 101, 102, 100, 104, 105, 105, 106,
            105, 103, 104, 103, 105, 106, 107, 106, 105, 105, 104, 104, 103,
            102, 102, 101, 100, 102 };

        Weight june = new Weight( values );
        june.print();
        
        int avg = june.average();
        System.out.println( "average = " + avg );
        
        int avg1stHalf = june.subAverage(0, ( values.length - 1) / 2 );
        System.out.println( "average of first half of month = " + avg1stHalf );
        
        int avg2ndHalf = june.subAverage(values.length / 2 , values.length - 1);
        System.out.println( "average of second half of month = " + avg2ndHalf );
    }
}
