import java.util.Arrays;

public class UniqueArray{

	public static int unique(int[] arrays){
	int[] num = {1, 2, 3, 2};
	int sum = 0;
	for(int i = 0; i < num.length; i++ ){
	if(num[i] != num[0]){
	sum += num[0];
	 }
	}
return sum;
	}


public static void main(String[] args){
int[] nums = {1, 2, 3, 2};
System.out.print("The sum of unique numbers is: " + unique(nums));


  }

}