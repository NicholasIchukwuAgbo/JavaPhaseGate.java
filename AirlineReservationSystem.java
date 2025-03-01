import java.util.Scanner;
import java.util.InputMismatchException;

public class AirlineReservationSystem{

    static boolean[] seatNumbers = new boolean[10];

    public static void main(String[] args){

        Scanner userInputCollection = new Scanner(System.in);

        while (true){
	  try{
            System.out.println("\n1. Enter 1 for First Class");

            System.out.println("2. Enter 2 for Economy");

            System.out.print("\nEnter your choice (1 and 2): ");
	
            int choice = userInputCollection.nextInt();
	  
            if (choice == 1){
                firstClassSeat();

            } else if (choice == 2){
                economySeat();

            } else {
                System.out.println("Invalid choice.");
            }

	  } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            userInputCollection.next(); 
	  }
        }
    }

    public static int firstClassSeat() {

        for (int count = 0; count < 5; count++) {
            if (!seatNumbers[count]) {
                seatNumbers[count] = true;
                System.out.println("\nYour first-class seat number is: " + (count + 1));
                return count + 1;
            }
        }
        System.out.println("Firstclass seats are full.");
        return 0;
    }

    public static int economySeat() {
        for (int counter = 5; counter < 10; counter++) {
            if (!seatNumbers[counter]) {
                seatNumbers[counter] = true;
                System.out.println("\nYour economy seat number is: " + (counter + 1));
                return counter + 1;
            }
        }
        System.out.println("Economy seats are full.");
	return 0;
     }

}