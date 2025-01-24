public class IndexOfLastWord{

    public int getIndexOfLastWord(String letters) {
        String[] words = letters.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {

 	IndexOfLastWord  IndexOfLastWord = new  IndexOfLastWord();

        String list = "Hello World";

        System.out.print(IndexOfLastWord.getIndexOfLastWord(list));  
    }
}
 