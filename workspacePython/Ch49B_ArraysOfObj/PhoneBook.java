/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO Richard Cao
   @version TODO 4/12

   @author  Period - TODO 6
   @author  Assignment - Ch49B_PhoneBook

   @author  Sources - TODO list collaborators
 */
public class PhoneBook
{ 
    private PhoneEntry[] phoneBook;
    private int nextEntry;

    /**
     * Constructs a phonebook with a capacity of 25 entries and initializes
     * the first 10 entries.
     */
    public PhoneBook() // constructor
    {
        phoneBook = new PhoneEntry[25];

        phoneBook[0] = new PhoneEntry( "Jenny", "Java", "(555)555-5555" );
        phoneBook[1] = new PhoneEntry( "Bob", "Binary", "(101)010-1010" );
        phoneBook[2] = new PhoneEntry( "Olive", "Oyl", "(555)123-4567" );
        phoneBook[3] = new PhoneEntry( "Mycroft", "Holmes", "(555)123-4321" );
        phoneBook[4] = new PhoneEntry( "Lynne", "Brook", "(408)366-7700" );
        phoneBook[5] = new PhoneEntry( "Monty", "Vista", "(408)366-7600" );
        phoneBook[6] = new PhoneEntry( "Cooper", "Tino", "(408)366-7300" );
        phoneBook[7] = new PhoneEntry( "Bertha", "Binary", "(111)111-1111" );
        phoneBook[8] = new PhoneEntry( "Betty", "Binary", "(011)100-0000" );
        phoneBook[9] = new PhoneEntry( "Sara", "Toga", "(408)867-3411 " );

        nextEntry = 10;
    }

    /**
     * TODO Write your method description here.
     */
    public void print()
    {
        if ( nextEntry <= 0 )
        {
            System.out.println( "Phonebook empty!!" );
        }
        else
        {
            for ( int i = 0; i < nextEntry; i++ )
            {
                System.out.println(phoneBook[i].firstName + " " +
                    phoneBook[i].lastName + " " +
                    phoneBook[i].phoneNum);
            }
        }
    }

    /**
     * TODO Write your method description here.
     * 
     * @param pEntry
     * @return
     */
    public PhoneEntry add( PhoneEntry pEntry )
    {
    	if(nextEntry == phoneBook.length) {
    		return null;
    	} else {
    		phoneBook[nextEntry] = pEntry;
    		nextEntry++;
    		return pEntry;
    	}
    }

    /**
     * TODO Write your method description here.
     * 
     * @param pEntry
     * @return
     */
    public PhoneEntry delete( PhoneEntry pEntry )
    {
    	for(int i = 0; i < nextEntry; i++) {
    		if(phoneBook[i].firstName.equalsIgnoreCase(pEntry.firstName) && phoneBook[i].lastName.equalsIgnoreCase(pEntry.lastName)) {
    			phoneBook[i] = phoneBook[nextEntry-1];
    			phoneBook[nextEntry-1] = null;
    			nextEntry--;
    			return pEntry;
    		}
    	}
        return null;
    }

    /**
     * TODO Write your method description here.
     * 
     * @param pEntry
     * @return
     */
    public PhoneEntry[] search( PhoneEntry pEntry )
    {
    	PhoneEntry[] match = new PhoneEntry[nextEntry];
    	int matches = 0;
    	if(!pEntry.firstName.equals("") && !pEntry.lastName.equals("")) {
    		for(int i = 0; i < nextEntry; i++) { 
    			if(phoneBook[i].firstName.equalsIgnoreCase(pEntry.firstName) && phoneBook[i].lastName.equalsIgnoreCase(pEntry.lastName)) {
    				match[0] = phoneBook[i];
    				break;
    			}
    		}
    	} else if(pEntry.firstName.equals("") && !pEntry.lastName.equals("")) {
    		for(int i = 0; i < nextEntry; i++) {
    			if(phoneBook[i].lastName.equalsIgnoreCase(pEntry.lastName)) {
    				match[matches] = phoneBook[i];
    				matches++;
    			}
    		}
    	}
    	return match;
    }
    
    //////////////////////////////////////////
    // Methods used for testing purposes only
    
    /**
     * For testing only
     * 
     * @return the PhoneEntry[] that represents this phoneBook
     */
    public PhoneEntry[] getPhoneBook()
    {
        return phoneBook;
    }
    
    /**
     * For testing only
     * @return the next entry field
     */
    public int getNextEntry()
    {
        return nextEntry;
    }
}