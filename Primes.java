import java.util.Scanner;

public class Primes{


public static int  getPrime(int number){

int sum = 0;

for(int count = 0; count < number; count++){
if(count % 3 == 0){
sum += 1;
}
}
return sum;
}


public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int userInput = input.nextInt();

System.out.print(getPrime(userInput));

 }

}
