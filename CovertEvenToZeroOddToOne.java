public class CovertEvenToZeroOddToOne{


public static int[] indexConverter(int[] number){

for(int count = 0; count < number.length; count++){

if(number[count] % 2 == 0){

number[count] = 0;

}else{

number[count] = 1;
}
}

return number;

}

public static void main(String[] args){

int[] arrays = {1, 44, 15, 72, 18, 21};

int[] result = indexConverter(arrays);

for(int counter : result){

System.out.print(counter + "  ");

}

  }


}