import java.util.Arrays;

public class Occurrences{

public static void main(String[] args){
	int[] num = {1, 2, 3, 2};
	int sum = 0;
	for(int i = 0; i < num.length; i++ ){
	if(num[i] != num[0]){
	sum++;
	 }
	}
System.out.print("The sum of unique numbers is: " + sum);


  }

}