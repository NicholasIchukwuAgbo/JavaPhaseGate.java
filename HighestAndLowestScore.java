import java.util.Arrays;

public class HighestAndLowestScore {

public static int[] scores(int[][] score) {

int[] numbers = new int[score[0].length];

for(int count = 0; count < score.length; count++){
  
   for(int counter = 0; counter < score[count].length; counter++){

 	numbers[counter] += score[count][counter];

  }
  
 }

int highestScore = numbers[0];
int lowestScore = numbers[0];
int first = 0;
int second = 0;

for(int num = 1; num < numbers.length; num++){

if(numbers[num] > highestScore){

highestScore = numbers[num];
first = num;
}

if(numbers[num] < lowestScore){
lowestScore = numbers[num];
second = num;
}
}

return new int[] {second, first};
}

public static void main(String[] args) {

int[][] arrays = {{30,40,50}, {10,20,50}};

int[] result = scores(arrays);

System.out.print(Arrays.toString(result));

}
}


