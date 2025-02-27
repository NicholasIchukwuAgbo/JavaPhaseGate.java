public class revision2{

	public static int unique(int[] arrays){
	int[] num = new int[arrays.length];
	int sum = 0;
	for(int i = 0; i < num.length; i++ ){
	if(num[i] == num[0]){
	sum ++;
	 }
	}
return sum;
	}


public static void main(String[] args){
int[] nums = {1, 2, 3, 3, 7};
System.out.print(unique(nums));


  }

}
