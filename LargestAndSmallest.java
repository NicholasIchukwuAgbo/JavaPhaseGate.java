import java.util.Arrays;

public class LargestAndSmallest {

public static int[] findLargestAndSmallest(int[] array) {

int largest = array[0];

int smallest = array[0];

for (int count = 0; count < array.length; count++) {

if (array[count] >  largest) {
largest = array[count];
} 

if (array[count] < smallest) {
smallest = array[count];
  }
  }

 return new int[] {largest, smallest};
   }



public static void main(String[] args) {

int[] array = {2, 5, 7, 1, 7, -1};

int[] nums = findLargestAndSmallest(array);

System.out.print(Arrays.toString(nums));

}
}


