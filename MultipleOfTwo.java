import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleOfTwo{


public static Boolean getMultiples(int number){

if(number % 2 == 0 || number == 1 ){

return true;

} else{

return false;

}
}


public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number to check if is multiples of two: ");
int userInput = input.nextInt();

System.out.print(getMultiples(userInput));



  }

}