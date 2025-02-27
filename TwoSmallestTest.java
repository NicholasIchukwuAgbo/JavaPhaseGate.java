import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class TwoSmallestTest{

	TwoSmallest getTwoSmallest = new TwoSmallest();

	@Test
	public void testMyFunctionIsValid1(){
	int[] arrays = {1,2,3,4,5};
	int[] actual = getTwoSmallest.findTwoSmallest(arrays);
	int[] result = {1,1};
	assertArrayEquals(actual, result);
	}
   }