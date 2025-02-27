import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class TwoLargestTest{

	TwoLargest getTwoLargest = new TwoLargest();

	@Test
	public void testMyFunctionIsValid1(){
	int[] arrays = {1,2,3,4,5};
	int[] actual = getTwoLargest.findTwoLargest(arrays);
	int[] result = {5,4};
	assertArrayEquals(result, actual);
	}
   }