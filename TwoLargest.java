/* :::::PSEUDOCODE:::::

	Question 2:


     :::STAGE 1::: 

     1) Write a program.

     2) Collect a list of number.

     3) Display result.


     :::STAGE 2:::

     1) Prompt user to enter a list of number.

     2) Collect number.

     3) Store the value as "arrays".
      
     4) Check for the largest integer in the list.

     5) Store the value as "largestOne".

     6) Check for the second largest integer in the list.
     
     7) Store the value as "largestTwo".
    
     8)Display final resut. */


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

int[] array = {2, 7, -10000, 5, 1000};

int[] largest = findTwoLargest(array);

System.out.print(Arrays.toString(largest));

}
}