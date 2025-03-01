public class NumberDivisibleByThree{


public static int isDivisible(int num){

int sum = 0;

for(int count = 1; count <= num; count++){

if(count % 3 == 0){

sum += count;
 }
}

return sum;
}



public static void main(String[] args){

int num = 30;

System.out.print("Sum: " + isDivisible(num));

  }
}