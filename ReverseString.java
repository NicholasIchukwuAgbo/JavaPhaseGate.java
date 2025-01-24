import java.util.Arrays;

public class ReverseString{


public static String[] isReverse(String[] arrays){

String[] letters = new String[arrays.length];

for(int counter = 0; counter < arrays.length; counter++){

letters[counter] = arrays[arrays.length  -1 -counter];
}
return letters;
}



public static void main(String[] args){

String[] letter = {"A", "B", "C", "D"};

String[] desecneding = isReverse(letter);

System.out.println(Arrays.toString(desecneding));
 }

}
