import java.util.Arrays;

public class Revision4{

public static Boolean isPalindrome(int num){

int backward = 0;

int original = num;

while(num > 0){

int number = num % 10;

backward = backward * 10 + number;

num = num / 10;
}

return original == backward;

}

public static void main(String[] args){

int numbers = 009091;

System.out.print(isPalindrome(numbers));


 }

}
