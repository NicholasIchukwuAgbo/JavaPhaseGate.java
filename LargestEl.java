public class LargestEl{


public static int largestNum(int num){
int[] number = {2, 4, 9};
int largest = number[0];
for(int i = 0; i < number.length; i++){
if(number[i] > largest){
largest = number[i];
}
}
return largest;
}



	public static void main(String[] args){

System.out.print("largest index is: " + largestNum(2));

  }
}