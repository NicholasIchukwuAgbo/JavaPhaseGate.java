public class Revision3{

	public static int smallestNum(int[] arrays){
	int smallest = arrays[0];
	for(int i = 0; i < arrays.length; i++){
	if(arrays[i] < smallest){
	smallest = arrays[i];
	 }
	}
return smallest;
	}


public static void main(String[] args){
int[] nums = {9, 2, 2, 3, 7};
System.out.print(smallestNum(nums));


  }

}




















