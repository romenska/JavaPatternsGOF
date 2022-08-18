package romenska.patterns.structura.proxy.lazyload;


import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ProxyTest {
	
	IMath math;
	@ParameterizedTest
	@CsvSource({"2,2","1,1","0,0"})
	public void testMath(double x, double y) {
		
		assertTimeout(Duration.ofMillis(15), ()->math = new Math());

		math.add(x, y);
		math.sub(x, y);
		math.mul(x, y);
		math.div(x, y);
	}
	
	@ParameterizedTest
	@CsvSource({"2,2","1,1","0,0"})
	public void testMathProxy(double x, double y) {
		
		assertTimeout(Duration.ofMillis(15), ()->math = new MathProxy());
		
		math.add(x, y);
		math.sub(x, y);
		math.mul(x, y);
		math.div(x, y);
	}

}
