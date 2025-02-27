public class GreatestCommonDivisor{


public static int findGreatestCommonDivisor(int firstNumber, int secoundNumber){

        if(secoundNumber == 0){
     
           return firstNumber;
	}else {

	return findGreatestCommonDivisor(secoundNumber, firstNumber % secoundNumber);
     }
 }

public static void main(String[] args){

	int number1 = findGreatestCommonDivisor(4,2);
	int number2 = findGreatestCommonDivisor(16,24);
	int number3 = findGreatestCommonDivisor(125,2525);

	System.out.println(number1);
	System.out.println(number2);
	System.out.println(number3);

 }
}