import java.util.Arrays;

public class Median{


public static int[] getMedian(int[] number){

Arrays.sort(number);

int[] num =  new int[number.length];

if(num % 2 == 1){

return num / 2 ;

}else{

return num;
}

}

public static void main(String[] args){

int[] arrayOne = {1, 2, 3};

System.out.print(getMedian(arrayOne));
     }



}