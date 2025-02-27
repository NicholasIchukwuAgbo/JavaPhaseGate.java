import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class LargestAndSmallestTest{

	LargestAndSmallest getLargetAndSmallest = new LargestAndSmallest();

	@Test
	public void testMyFunctionIsValid1(){
	int[] arrays = {1,2,3,4,5};
	int[] actual = getLargetAndSmallest.findLargestAndSmallest(arrays);
	int[] result = {5,1};
	assertArrayEquals(actual, result);
	}
   }