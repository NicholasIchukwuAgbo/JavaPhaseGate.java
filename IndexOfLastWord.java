
public class IndexOfLastWord{

    public static int getIndexOfLastWord(String letters) {
        String[] words = letters.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) 

        String list = "Hello World";

        System.out.print(getIndexOfLastWord(list));  
    }
}
 
