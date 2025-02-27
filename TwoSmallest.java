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

if (array[count] < smallestTwo && array[count] > smallestOne) {
smallestTwo = array[count];
  }
  }

 return new int[] {smallestOne, smallestTwo};
   }



public static void main(String[] args) {

int[] array = {2, 5, 7, 7, -1};

int[] smallest = findTwoSmallest(array);

System.out.print(Arrays.toString(smallest));

}
}


