import java.util.Arrays;
import java.util.Collections;

public class DescendingOder{

	public static void main(String[] args){

	int[] list = {3, 1, 5, 8, 6, 4};
	int[] array = {3, 5, 7, 2};

	int[] backward = reverse(list);

	System.out.println(Arrays.toString(backward));
 }


public static int[] reverse(int[] arrays){

Arrays.sort(arrays);

int[] arr = new int[arrays.length];

for(int i = 0; i < arrays.length; i++){

arr[i] = arrays[arrays.length - 1 -i];
}
return arr;
}

}