/* :::::PSEUDOCODE:::::

	Question 4:


     :::STAGE 1:::

     1) Write a program.

     2) Collect a list of number.

     3) Display result.


     :::STAGE 3:::

     1) Prompt user to enter a list of number.

     2) Collect number.

     3) Store the value as "arrays".
      
     4) Check for the highest integer in the list.

     5) Store the value as "highest".

     6) Check for the smallest integer in the list.
     
     7) Store the value as "smallest".
    
     8)Display final resut. */


import java.util.Arrays;

public class HighestAndLowest{

public static int[] findHighestAndSmallest(int[] array) {

int highest = array[0];

int lowest = array[0];

for (int count = 0; count < array.length; count++) {

if (array[count] < lowest) {
highest = lowest;
lowest = array[count];

}

if (array[count] > highest) {
highest = array[count];
  }
  }

 return new int[] {highest, lowest};
   }



public static void main(String[] args) {

int[] array = {2, 5, 7, -1, 7, 10000, 0};

int[] highestAndSmallest = findHighestAndSmallest(array);

System.out.print(Arrays.toString(highestAndSmallest));

}
}


