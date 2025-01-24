import java.util.Arrays;

public class Palindrome{


public static Boolean isPalindrome(int num){

int backward = 0;
int original = 0;

while(num > 0){
int number = num % 10;

backward *= 10 + number;

num /= 10;

}

return original == backward;

}







public static void main(String[] args){

int numbers = 1111;

System.out.print(isPalindrome(numbers));


 }

}
