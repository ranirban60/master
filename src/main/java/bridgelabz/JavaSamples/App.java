package bridgelabz.JavaSamples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
       String message = "Hello World !";
       LOG.debug(message + " Will Be Printed On Debug 2");
       LOG.info(message + " Will Be Printed On Info 2");
       LOG.warn(message + " Will Be Printed On Warn 2");
       LOG.error(message + " Will Be Printed On Error 2");
       LOG.fatal(message + " Will Be Printed On Fatal 1");
       LOG.info("Appending string: {}.", message);
       System.out.println( "Hello " );
    }
}
