/**
 * The ASCIIArt program prints the name "Richard", the initials GKP and a some
 * fish to standard output using ascii characters to make a picture.
 * 
 * @author TODO Name: Richard
 * @version TODO Date: 3/11
 * @author TODO Period: 6
 * 
 * @author Assignment:  ASCIIArt
 * 
 * @author Sources: TODO: list collaborators
 */
public class ASCIIArt
{
    public ASCIIArt()
    {
        System.out.println( "Richard's ASCII Art" );
        System.out.println();
    }

    public void firstName()
    {
        // print out Richard using letters
        System.out.println( "RRR              h                                   d");
        System.out.println( "R  R             h                                   d");
        System.out.println( "R   R            h                                   d");
        System.out.println( "R   R  i         h                                   d");
        System.out.println( "R RR             h hhh      aaaa      r rrrr     ddd d");
        System.out.println( "RR     i   cccc  hh   h    a    a     rr    r   d   dd");
        System.out.println( "R R    i  c      h     h  a     aa    r        d     d");
        System.out.println( "R  R   i  c      h     h   a    a a   r         d    d");
        System.out.println( "R   R  i   cccc  h     h    aaaa   a  r          ddddd");
    }

    public void initials()
    {
        // System.out.print doesn't attach a trailing newline character. We can
        // do this on our own with \n. The \t's are used for inserting tabs
        System.out.print( "\n\t\tor...\n\n" );

        // print out GKP using "tiles"
        System.out.println( "_/_/        _/_/_/  " );
        System.out.println( "_/  _/    _/        " );
        System.out.println( "_/_/     _/         " );
        System.out.println( "_/ _/     _/        " );
        System.out.println( "_/   _/     _/_/_/  " );

        System.out.print( "\n\t\tor...\n" );
        // print out GKP using brackets
        System.out.println( "  _______________________" );
        // Java uses a double back slash (\\) to denote an actual backslash
        // character. The reason for this is because \ is an escape sequence for
        // special ascii characters
        System.out.println( " /                   \\" );
        System.out.println( "| [][]        [][][] |" );
        System.out.println( "| []  []    []       |" );
        System.out.println( "| [][]     []        |" );
        System.out.println( "| [] []     []       |" );
        System.out.println( "| []   []     [][][] |" );
        System.out.println( " \\_________________ /" );
    }

    public void fish()
    {
        System.out.print( "\n\t\tor...\n" );
        // print out some ascii fish...just because
        System.out.println( "                          ,     " );
        System.out.println( "               ()       _/{     " );
        System.out.println( "        ,_         o  .'   './`>" );
        System.out.println( "        _}\\_ O       / a ((  =< " );
        System.out.println( "   <`\\.'    '. o     '.,__,.'\\_>" );
        System.out.println( "    >    )) e \\           \\)    " );
        System.out.println( "   <_/'.,___,.'                 " );

        System.out.println();
    }

    public static void main( String[] args )
    {
        ASCIIArt asciiArtist = new ASCIIArt();
        asciiArtist.firstName();
        asciiArtist.initials();
        asciiArtist.fish();
    } // main
} // ASCIIArt
