import java.util.Arrays;

public class TwoLargest{

public static int[] findTwoLargest(int[] array) {

int largestOne = array[0];

int largestTwo = array[0];

for (int count = 0; count < array.length; count++) {

if (array[count] > largestOne) {
largestTwo = largestOne;
largestOne = array[count];
}

if (array[count] > largestTwo && array[count] < largestOne) {
largestTwo = array[count];

  }
  }

 return new int[] {largestOne, largestTwo};
   }



public static void main(String[] args) {

int[] array = {};

int[] largest = findTwoLargest(array);

System.out.print(Arrays.toString(largest));

}
}