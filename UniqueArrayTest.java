import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class UniqueArrayTest{

	UniqueArray sumOfUnique = new UniqueArray();

	@Test
	public void testMyFunctionIsValid1(){
	int[] arrays = {1,2,2};
	int[] actual = sumOfUnique.uniqueNumber(arrays);
	int[] result = {2,3,4,4,3};
	assertArrayEquals(result, actual);
	}
   }