import java.util.Arrays;

public class DescendingArray{


public static int[] reverse(int[] arrays){

int[] num = new int[arrays.length];

for(int count = 0; count < arrays.length; count++){

num[count] = arrays[arrays.length -1 -count];
}
return num;
}



public static void main(String[] args){

int[] num2 = {1, 2, 3, 4, 5, 6};
int[] desecneding = reverse(num2);

System.out.println(Arrays.toString(desecneding));
 }

}
