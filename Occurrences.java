import java.util.Arrays;

public class Occurrences{

public static void main(String[] args){
	int[] num = {1, 6, 2, 2};
	int sum = 0;
	for(int i = 0; i < num.length; i++ ){
	if(num[i] != num[1]){
	sum++;
	 }
	}
System.out.print("The sum of unique numbers is: " + sum);


  }

}