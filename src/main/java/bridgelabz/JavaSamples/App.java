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
<<<<<<< HEAD
       LOG.debug(message + " Will Be Printed On Debug 2");
       LOG.info(message + " Will Be Printed On Info 2");
       LOG.warn(message + " Will Be Printed On Warn 2");
       LOG.error(message + " Will Be Printed On Error 2");
=======
       LOG.debug(message + " Will Be Printed On Debug 3");
       LOG.info(message + " Will Be Printed On Info 3");
       LOG.warn(message + " Will Be Printed On Warn 3");
       LOG.error(message + " Will Be Printed On Error 3");
>>>>>>> 005f7413e36d50d4099e8e29536223108ac0f1a2
       LOG.fatal(message + " Will Be Printed On Fatal 1");
       LOG.info("Appending string: {}.", message);
       System.out.println( "Hello " );
    }
}
