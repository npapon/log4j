package log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger( Main.class.getName() );
    // log4j.Main

    // on peut faire aussi
    // private static final Logger LOGGER = LogManager.getLogger(
    // Main.class.getName() );

    // class log4j.Main
    public static void main( String[] args ) {
        System.out.println( Main.class.getName() );
        LOGGER.log( Level.INFO, "info" );
        LOGGER.log( Level.ERROR, "erreur" );

        LOGGER.info( "info 2" );
        LOGGER.error( "erreur 2" );

        Utilisateur npapon = new Utilisateur( "Nicolas", "Papon" );

        LOGGER.log( Level.ERROR, "Connection réussi pour {} - {}", npapon.getPrenom(), npapon.getNom() );

        try {
            int result = 3 / 0;
        } catch ( Exception exception ) {
            LOGGER.log( Level.ERROR, exception );
        }
    }

}
