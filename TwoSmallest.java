/* :::::PSEUDOCODE:::::

	Question 3:


     :::STAGE 1:::

     1) Write a program.

     2) Collect a list of number.

     3) Display result.


     :::STAGE 2:::

     1) Prompt user to enter a list of number.

     2) Collect number.

     3) Store the value as "arrays".
      
     4) Check for the smallest integer in the list.

     5) Store the value as "smallestOne".

     6) Check for the second smallest integer in the list.
     
     7) Store the value as "smallestTwo".
    
     8)Display final resut. */


import java.util.Arrays;

public class TwoSmallest {

public static int[] findTwoSmallest(int[] array) {

int smallestOne = array[0];

int smallestTwo = array[0];

for (int count = 0; count < array.length; count++) {

if (array[count] <  smallestOne) {
smallestTwo =  smallestOne;
smallestOne = array[count];
} 

if (array[count] < smallestTwo && array[count] < smallestOne) {
smallestTwo = array[count];
  }
  }

 return new int[] {smallestOne, smallestTwo};
   }



public static void main(String[] args) {

int[] array = {2, 5, 7, 1, 7, -1};

int[] smallest = findTwoSmallest(array);

System.out.print(Arrays.toString(smallest));

}
}


