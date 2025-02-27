public class Revision7{

public static boolean subString(String one, String two){

return one.contains(two);

}

public static void main(String[] args){

System.out.println(subString("ABCD", "AB"));
System.out.println(subString("ABCD", "BCA"));

  }

}