public class AsterisksLoop{

public static void main(String[] args){

for(int count = 1; count <= 10; count++){
for(int counter = count; counter >= 0; counter--){
System.out.print("*");
}

for(int count2 = 10; count2 >= count; count2--){
System.out.print(" ");
}

for(int count2 = 10; count2 >= count; count2--){
System.out.print("*");
}

for(int count3 = 10; count3 >= count; count3--){
System.out.print(" ");
}

for(int count3 = 10; count3 >= count; count3--){
System.out.print("*");
}




System.out.println();
    }
  }
}