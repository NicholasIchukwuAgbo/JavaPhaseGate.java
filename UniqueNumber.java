public class UniqueNumber {

public static void main(String [] args){

int[] array = {1,2,7,1};

System.out.println(isUnique(array));

}

public static int isUnique(int[] arrays){

int[] numbers = new int[arrays.length];
	
for(int count = 0; count < arrays.length; count++){	

int sumOfUnique = 0;

for(int counter = 0; counter < arrays.length; counter++){

if(arrays[count] == arrays[counter]){

sumOfUnique++;
}
}

numbers[count] = sumOfUnique;

}

int result = 0;

for(int num =0; num < arrays.length; num++){

if(numbers[num] == 1){

result = result + arrays[num];
}
}

return result;	
}

}