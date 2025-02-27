import java.util.Arrays;

public class DuplicateNumber{

public static int[] isDuplicate(int[] arrays){

int[] numbers = new int[arrays.length];

for(int counter = 0; counter < arrays.length; counter++){

for(int count = 0; count < arrays.length; count++){

if(arrays[counter] == arrays[count]){

numbers++;
  }

 }
}
return new int[] {numbers};
}

public static void main(String[] args){

int[] arrays = {1,2,3,5,6,6,5,4,2};

System.out.print(Arrays.toString(isDuplicate(arrays)));

   }


}