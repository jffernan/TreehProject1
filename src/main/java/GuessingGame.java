import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
               
      Scanner scanner = new Scanner(System.in);
      System.out.println("Administrator----------:");
      System.out.println("What type of item is in the jar? ");
      String item = scanner.nextLine();
      System.out.printf("What is the maximum amount of %s in the jar?\n", item);
      int maxItem = scanner.nextInt();
      
      Jar jar = new Jar(item, maxItem);
      int numberToGuess = jar.fill();
      
      int numberOfTries = 0;
    System.out.println("Player------------");
    System.out.printf("Please guess how many %s are in the jar.%nYour guess must be a number between 1 and " + (maxItem) + ". \n", 
                     item, maxItem);
    
     boolean win = false;
      
    while (win == false) {
        
      System.out.println("Guess:");
        int guess = scanner.nextInt();
        numberOfTries++;
        
        if (guess == numberToGuess) {
            win = true;
      }
      
      else if (guess == 0) {
      System.out.println("Your guess cannot be equal to zero. Try again. ");
      numberOfTries--;
    }
      
      else if (guess != numberToGuess) {
        System.out.println("Wrong guess. Try again. ");
      }
      
    }
      System.out.printf("Congratulations, you correctly guessed that there are " + numberToGuess + " %s in the jar. ", item);
        System.out.printf("It took you " + numberOfTries + " attempt(s) to get it right. \n");
       }
}