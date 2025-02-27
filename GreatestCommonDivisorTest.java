import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest{

	GreatestCommonDivisor divisor = new GreatestCommonDivisor();

	@Test
	public void testMyFunctionIsValid1(){
	int actual = divisor.findGreatestCommonDivisor(4, 2);
	int result = 2;
	assertEquals(result, actual);
	}

	@Test
	public void testMyFunctionIsValid2(){
	int actual = divisor.findGreatestCommonDivisor(16, 24);
	int result = 8;
	assertEquals(result, actual);
	}

	@Test
	public void testMyFunctionIsValid3(){
	int actual = divisor.findGreatestCommonDivisor(125, 2525);
	int result = 25;
	assertEquals(result, actual);
	}

   }