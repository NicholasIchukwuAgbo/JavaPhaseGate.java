public class ReverseIndex{

public static String letter(String alpha){

String reversal = "";

for(int count = alpha.length() -1; count >= 0; count--){

reversal += alpha.charAt(count);

}

return reversal;

}

public static void main(String[] args){

String letters = "how are you";

System.out.print(letter(letters));

  }
}