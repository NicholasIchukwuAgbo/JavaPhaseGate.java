public class ManipulateString{


public static String[] letters(String[] list){

String[] letter = new String[list.length];

for(int i = 0; i < letter.length; i++){

letter[i] = list.length -i;

}
return letter;
}

public static void main(String[] args){

String[] list = {"how", "are", "you"};

System.out.print(letters(list));
   }


}