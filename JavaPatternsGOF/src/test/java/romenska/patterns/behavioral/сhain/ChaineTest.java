package romenska.patterns.behavioral.сhain;

import org.junit.jupiter.api.Test;

public class ChaineTest {
	
	@Test
	public void testLogger() {

		Logger smsLogger = new SmsLogger(Logger.LEVEL_ONE);
		Logger emailLogger = new EmailLogger(Logger.LEVEL_TWO);
		Logger fileLogger = new FileLogger(Logger.LEVEL_THREE);
		
		smsLogger.setNext(emailLogger);
		emailLogger.setNext(fileLogger);
		
		smsLogger.message("Hello", Logger.LEVEL_THREE);
	}

}
