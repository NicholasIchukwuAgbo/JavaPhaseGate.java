import java.security.SecureRandom;
import java.util.*;

public class ArcheryGame{

public static void main(String[] args){

SecureRandom generateRandomNumber = new SecureRandom();

int highestScore = Integer.MIN_VALUE;
int players = 4;
int chances = 3;
int[][] scoreTracker = new int[players][chances];
int[] totalScores = new int[players];
int winnerIndexNumber = 0;

for(int playerIndex = 0; playerIndex < players; playerIndex++){

  for(int chanceIndex = 0; chanceIndex < chances; chanceIndex++){

  int randomScore = generateRandomNumber.nextInt(10);

  scoreTracker[playerIndex][chanceIndex] = randomScore;

  totalScores[playerIndex] += scoreTracker[playerIndex][chanceIndex];

  if(totalScores[playerIndex] > highestScore){

   highestScore = totalScores[playerIndex];

   winnerIndexNumber = playerIndex;
   }  
  }

}

System.out.printf("%-18s", " ");

for(int count = 1; count < players; count++){
System.out.printf("%-10s", "Chance"+count);
}

System.out.printf("%-10s%n", "TOTAL");

for(int counter = 0; counter < players; counter++){
System.out.printf("\t%s", "Player " + (counter + 1));
 for(int count = 0; count < chances; count++){
  System.out.printf("\t%d", scoreTracker[counter][count]);
				
  }
System.out.printf("\t%d %n", totalScores[counter]);
}
System.out.println("Player " + (winnerIndexNumber + 1) +" wins the game, with the highest score of " + highestScore);

   }

}