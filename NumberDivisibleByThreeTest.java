import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.*;

public class NumberDivisibleByThreeTest{

	NumberDivisibleByThree getDivisible = new NumberDivisibleByThree();

	@Test
	public void testMyFunctionIsValid1(){
	int actual = getDivisible.isDivisible(30);
	int result = 165;
	assertEquals(result, actual);
	}
   }